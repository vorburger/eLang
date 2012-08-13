package ch.vorburger.el.typing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.common.types.access.impl.URIHelperConstants;

import ch.vorburger.el.engine.DynamicExpressionContext;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

/**
 * This class makes dynamic types (i.e. {@link EClassifier}s) available as jvm types to be used in expressions/Xbase.
 * 
 * @author Kai Kreuzer
 *
 */
@SuppressWarnings("restriction")
public class ELJvmTypeProvider extends ClasspathTypeProvider {
	
	public static final String PROTOCOL = "dynecore";
	
	private ResourceSet resourceSet;
	private Ecore2JvmTypeMapper ecoreMapper;
	
	public ELJvmTypeProvider(Ecore2JvmTypeMapper ecoreMapper, ResourceSet resourceSet) {
		super(ELTypeProvider.class.getClassLoader(), resourceSet, null);
		this.resourceSet = resourceSet;
		this.ecoreMapper = ecoreMapper;
	}

	protected ELJvmTypeProvider(ClassLoader cl, Ecore2JvmTypeMapper ecoreMapper, ResourceSet resourceSet) {
		super(cl, resourceSet, null);
		this.resourceSet = resourceSet;
		this.ecoreMapper = ecoreMapper;
	}

	@Override
	protected void registerProtocol(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(URIHelperConstants.PROTOCOL, this);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(ELJvmTypeProvider.PROTOCOL, this);
	}

	@Override
	public JvmType findTypeByName(String name) {

		// first replace ecore primitive types by their Java representation
		name = ecoreMapper.mapType(name);
		
		JvmType type = super.findTypeByName(name);		
		
		if(type==null) {
			EClassifier dynType = findDynType(name);
			if(dynType!=null) {
				type = findTypeByEclassifier(dynType);
			}			
		}
		return type;
	}
	
	public JvmType findTypeByEclassifier(EClassifier type) {
		if(type.getEPackage()==EcorePackage.eINSTANCE) {
			String mappedType = ecoreMapper.mapType("ecore." + type.getName());
			return findTypeByName(mappedType);
		}
		URI resourceURI = getTypeURI(type);
		Resource resource = getResourceSet().getResource(resourceURI, true);
		String fragment = type.getName();
		JvmType result = (JvmType) resource.getEObject(fragment);
		if (result == null) {
			InternalEObject proxy = (InternalEObject) TypesFactory.eINSTANCE.createJvmVoid();
			proxy.eSetProxyURI(resourceURI.appendFragment(fragment));
			return (JvmType) proxy;
		} 
		return result;
	}

	private URI getTypeURI(EClassifier type) {
		return URI.createURI(PROTOCOL + ":" + URIHelperConstants.OBJECTS + getFQN(type));
	}

	@Override
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	static public URI getFullURI(String fullyQualifiedName) {
		return URI.createURI(PROTOCOL + ":" + URIHelperConstants.OBJECTS + fullyQualifiedName);
	}
	
	@Override
	protected IMirror createMirrorForFQN(String name) {
		EClassifier type = findDynType(name);
		if(type!=null) {
			return new DynTypeMirror(type, ecoreMapper);
		} else {
			return super.createMirrorForFQN(name);
		}
	}

	protected EClassifier findDynType(String name) {
		for(DynamicExpressionContext context : getContexts()) {
			for(EClassifier eclassifier : context.getDeclaredDynTypes()) {
				if(getFQN(eclassifier).endsWith(name)) {
					return eclassifier;
				}
			}
		}
		return null;
	}

	private Iterable<DynamicExpressionContext> getContexts() {
		Iterable<DynamicExpressionContext> contexts = 
			Iterables.filter(
				Iterables.concat(
						Iterables.transform(resourceSet.getResources(), new Function<Resource, EList<Adapter>>() {
							@Override
							public EList<Adapter> apply(Resource from) {
								return from.eAdapters();
							}
						})
				),
				DynamicExpressionContext.class
			);
		return contexts;
	}
	
	public static String getFQN(EClassifier type) {
		String prefix = type.getEPackage()==null ? "ecore" : type.getEPackage().getName();
		return prefix + "." + type.getName();
	}

}

package ch.vorburger.el.typing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.TypeResource;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.common.types.access.impl.URIHelperConstants;

import ch.vorburger.el.engine.DynamicExpressionContext;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

@SuppressWarnings("restriction")
public class ELJvmTypeProvider extends ClasspathTypeProvider {

	private static final String DYN_PREFIX = "ch.vorburger.el.dyn";
	
	private ResourceSet resourceSet;
	private Ecore2JvmTypeMapper ecoreMapper;
	
	public ELJvmTypeProvider(Ecore2JvmTypeMapper ecoreMapper, ResourceSet resourceSet) {
		super(ELTypeProvider.class.getClassLoader(), resourceSet);
		this.resourceSet = resourceSet;
		this.ecoreMapper = ecoreMapper;
	}

	protected ELJvmTypeProvider(ClassLoader cl, Ecore2JvmTypeMapper ecoreMapper, ResourceSet resourceSet) {
		super(cl, resourceSet);
		this.resourceSet = resourceSet;
	}

	@Override
	public JvmType findTypeByName(String name) {
		JvmType type = super.findTypeByName(name);
		if(type==null) {
			URI uri = getFullURI(name);
			InternalEObject proxy = (InternalEObject) TypesFactory.eINSTANCE.createJvmVoid();
			proxy.eSetProxyURI(uri);
			type = (JvmType) proxy;
		}
		return type;
	}
	
	public JvmType findTypeByEclass(EClass eClass) {
		URI resourceURI = getTypeURI(eClass);
		TypeResource resource = (TypeResource) getResourceSet().getResource(resourceURI, true);
		String fragment = eClass.getName();
		JvmType result = (JvmType) resource.getEObject(fragment);
		if (result == null) {
			throw new IllegalStateException("Resource has not been loaded");
		} 
		return result;
	}

	private URI getTypeURI(EClass eClass) {
		return URI.createURI(URIHelperConstants.PROTOCOL + ":" + URIHelperConstants.OBJECTS + DYN_PREFIX + "." + eClass.getEPackage().getName() + "." + eClass.getName());
	}

	@Override
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public URI getFullURI(String fullyQualifiedName) {
		return URI.createURI(URIHelperConstants.PROTOCOL + ":" + URIHelperConstants.OBJECTS + DYN_PREFIX + "." + fullyQualifiedName);
	}
	
	@Override
	protected IMirror createMirrorForFQN(String name) {
		if(name.startsWith(DYN_PREFIX)) {
			EClass type = findDynType(name);
			if(type!=null) {
				return new DynTypeMirror(type, ecoreMapper);
			} else {
				return null;
			}
		} else {
			return super.createMirrorForFQN(name);
		}
	}

	private EClass findDynType(String name) {
		for(DynamicExpressionContext context : getContexts()) {
			for(String elementName : context.getElementNames()) {
				String typeName = context.getDynType(elementName).getName();
				if(name.endsWith(typeName)) {
					return context.getDynType(elementName);
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
							public EList<Adapter> apply(Resource from) {
								return from.eAdapters();
							}
						})
				),
				DynamicExpressionContext.class
			);
		return contexts;
	}

}

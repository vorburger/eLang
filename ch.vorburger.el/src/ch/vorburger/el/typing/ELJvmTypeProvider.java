package ch.vorburger.el.typing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.TypeResource;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.common.types.access.impl.URIHelperConstants;

import ch.vorburger.el.engine.DynamicExpressionContext;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

@SuppressWarnings("restriction")
public class ELJvmTypeProvider extends ClasspathTypeProvider {
	
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
			EClass dynType = findDynType(name);
			type = findTypeByEclass(dynType);
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
		return URI.createURI(URIHelperConstants.PROTOCOL + ":" + URIHelperConstants.OBJECTS + getFQN(eClass));
	}

	@Override
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	static public URI getFullURI(String fullyQualifiedName) {
		return URI.createURI(URIHelperConstants.PROTOCOL + ":" + URIHelperConstants.OBJECTS + fullyQualifiedName);
	}
	
	@Override
	protected IMirror createMirrorForFQN(String name) {
		EClass type = findDynType(name);
		if(type!=null) {
			return new DynTypeMirror(type, ecoreMapper);
		} else {
			return super.createMirrorForFQN(name);
		}
	}

	private EClass findDynType(String name) {
		for(DynamicExpressionContext context : getContexts()) {
			for(EClass eclass : context.getDeclaredDynTypes()) {
				if(getFQN(eclass).endsWith(name)) {
					return eclass;
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
	
	private String getFQN(EClass eclass) {
		return eclass.getEPackage().getName() + "." + eclass.getName();
	}

}

package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;

@SuppressWarnings("restriction")
public class ELJvmTypeProvider extends ClasspathTypeProvider {

	private ResourceSet resourceSet;
	private TypesFactory typesFactory;
	private Ecore2JvmTypeMapper ecoreMapper;
	
	public ELJvmTypeProvider(TypesFactory typesFactory, ResourceSet resourceSet) {
		super(ELTypeProvider.class.getClassLoader(), resourceSet);
		this.typesFactory = typesFactory;
		this.resourceSet = resourceSet;
	}

	protected ELJvmTypeProvider(ClassLoader cl, TypesFactory typesFactory, ResourceSet resourceSet) {
		super(cl, resourceSet);
		this.typesFactory = typesFactory;
		this.resourceSet = resourceSet;
	}

	@Override
	public JvmType findTypeByName(String name) {
		JvmType type = super.findTypeByName(name);
		if(type==null) {
			type = super.findTypeByName("java.lang.Comparable");
		}
		return type;
	}
	
	public JvmType findTypeByEclass(EClass eClass) {
		JvmGenericType jvmType = ecoreMapper.map(eClass);
		return jvmType;
	}

	@Override
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

}

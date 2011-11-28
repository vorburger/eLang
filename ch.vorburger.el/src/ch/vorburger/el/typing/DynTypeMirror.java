package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.TypeResource;

@SuppressWarnings("restriction")
public class DynTypeMirror implements IMirror {

	final private EClass type;
	final private Ecore2JvmTypeMapper ecoreMapper;

	public DynTypeMirror(EClass type, Ecore2JvmTypeMapper ecoreMapper) {
		this.type = type;
		this.ecoreMapper = ecoreMapper;
	}
	
	@Override
	public String getFragment(EObject obj, Fallback fallback) {
		if(obj instanceof EClass) {
			return ((EClass)obj).getName();
		} else {
			return fallback.getFragment(obj);
		}
	}

	@Override
	public EObject getEObject(Resource resource, String fragment,
			Fallback fallback) {
		if(fragment.equals(getTypeName())) {
			if (resource.getContents().isEmpty()) {
				return null;
			}
			return resource.getContents().get(0);
		}
		return fallback.getEObject(fragment);
	}

	@Override
	public void initialize(TypeResource typeResource) {
		JvmGenericType jvmType = ecoreMapper.map(type, typeResource.getResourceSet());
		typeResource.getContents().add(jvmType);
	}

	protected String getTypeName() {
		return type.getName();
	}

}

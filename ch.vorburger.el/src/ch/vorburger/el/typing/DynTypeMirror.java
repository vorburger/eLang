package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.TypeResource;

/**
 * This class serves as a proxy for dynamic types (i.e. {@link EClassifier}s).
 * The according jvm type (which must be in an EMF resource) is only lazily created once the
 * resource is loaded.
 * 
 * @author Kai Kreuzer
 *
 */
@SuppressWarnings("restriction")
public class DynTypeMirror implements IMirror {

	final private EClassifier type;
	final private Ecore2JvmTypeMapper ecoreMapper;

	public DynTypeMirror(EClassifier type2, Ecore2JvmTypeMapper ecoreMapper) {
		this.type = type2;
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
		if(fragment.equals(type.getName())) {
			if (resource.getContents().isEmpty()) {
				return null;
			}
			return resource.getContents().get(0);
		}
		return fallback.getEObject(fragment);
	}

	@Override
	public void initialize(TypeResource typeResource) {
		JvmDeclaredType jvmType = ecoreMapper.map(type, typeResource.getResourceSet());
		typeResource.getContents().add(jvmType);
	}

}

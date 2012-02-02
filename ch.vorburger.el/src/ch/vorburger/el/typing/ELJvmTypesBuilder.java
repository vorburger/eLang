package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.DocumentationAdapter;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ELJvmTypesBuilder extends JvmTypesBuilder {

	@Inject
	private TypeReferences references;

	public JvmGenericType toClass(EObject sourceElement, ResourceSet rs, String name, Procedure1<JvmGenericType> initializer) {
		final JvmGenericType result = createJvmGenericType(sourceElement, name);
		if (result == null)
			return null;
		if(initializer != null) 
			initializer.apply(result);

		// if no super type add Object
		if (result.getSuperTypes().isEmpty()) {
			JvmTypeReference objectType = references.getTypeForName(Object.class.getCanonicalName(), rs);
			if (objectType != null)
				result.getSuperTypes().add(objectType);
		}

		return associate(sourceElement, result);
	}

	public JvmTypeReference newTypeRef(ResourceSet resourceSet, String typeName, JvmTypeReference... typeArgs) {
		JvmTypeReference ref = references.getTypeForName(typeName, resourceSet, typeArgs);
		return ref;
	}

	public String getDocumentation(EObject source) {
		if (source == null)
			return null;
		if (source instanceof ENamedElement) {
			DocumentationAdapter adapter = (DocumentationAdapter) EcoreUtil.getAdapter(source.eAdapters(), DocumentationAdapter.class);
			if (adapter != null)
				return adapter.getDocumentation();
		}
		return super.getDocumentation(source);
	}

}

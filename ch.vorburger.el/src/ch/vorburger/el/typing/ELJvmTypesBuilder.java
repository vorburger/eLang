package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.DocumentationAdapter;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.inject.Inject;

/**
 * Class with helper methods to build the jvm type model.
 * Intended to be used as an extension inside xtend files.
 * 
 * @author Kai Kreuzer
 *
 */
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

	/**
	 * Creates an enum literal declaration, associated to the given sourceElement.
	 * 
	 * @param sourceElement
	 *            the sourceElement the resulting element is associated with.
	 * @param name
	 *            the name of the resulting literal.
	 * @param initializer
	 *            the initializer to apply on the created enumeration literal
	 * 
	 * @return a {@link result} representing a Java class of the given name.
	 */
	public JvmEnumerationLiteral toEnumerationLiteral(EObject sourceElement, String name, Procedure1<JvmEnumerationLiteral> initializer) {
		if (sourceElement == null)
			return null;
		if (name == null)
			return null;
		JvmEnumerationLiteral result = TypesFactory.eINSTANCE.createJvmEnumerationLiteral();
		result.setSimpleName(name);
		if(initializer != null) 
			initializer.apply(result);

		return associate(sourceElement, result);
	}

}

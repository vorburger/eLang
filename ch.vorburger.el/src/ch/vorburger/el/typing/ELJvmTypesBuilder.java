package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ELJvmTypesBuilder extends JvmTypesBuilder {

	@Inject
	private TypeReferences references;

	@Override
	public JvmGenericType toClass(EObject sourceElement, String name, Procedure1<JvmGenericType> initializer) {
		final JvmGenericType result = createJvmGenericType(sourceElement, name);
		if (result == null)
			return null;
		if(initializer != null) 
			initializer.apply(result);

		return associate(sourceElement, result);
	}

	public JvmTypeReference newTypeRef(ResourceSet resourceSet, String typeName, JvmTypeReference... typeArgs) {
		JvmTypeReference ref = references.getTypeForName(typeName, resourceSet, typeArgs);
		return ref;
	}

}

package ch.vorburger.el.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("restriction")
public class ELJvmTypesBuilder extends JvmTypesBuilder {

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
		InternalEObject proxy = (InternalEObject) TypesFactory.eINSTANCE.createJvmVoid();
		URI uri = ELJvmTypeProvider.getFullURI(typeName).appendFragment(typeName.substring(typeName.indexOf('.')+1));
		proxy.eSetProxyURI(uri);
		JvmParameterizedTypeReference result = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
		result.setType((JvmType) proxy);

		return result;
	}

}

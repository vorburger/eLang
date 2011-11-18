package ch.vorburger.el.typing;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.AbstractTypeProviderFactory;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ELJvmTypeProviderFactory extends AbstractTypeProviderFactory {

	@Inject
	private TypesFactory typesFactory;
	
	@Override
	public IJvmTypeProvider createTypeProvider(ResourceSet resourceSet) {
		return new ELJvmTypeProvider(typesFactory, resourceSet);
	}

}

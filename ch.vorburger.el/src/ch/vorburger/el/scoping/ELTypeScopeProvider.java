package ch.vorburger.el.scoping;

import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.eclipse.xtext.common.types.xtext.AbstractConstructorScope;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScope;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;

import ch.vorburger.el.typing.ELJvmTypeProviderFactory;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ELTypeScopeProvider extends AbstractTypeScopeProvider {

	@Inject
	private ELJvmTypeProviderFactory typeProviderFactory;
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public AbstractTypeScope createTypeScope(IJvmTypeProvider typeProvider,
			Predicate<IEObjectDescription> filter) {
		return new ELTypeScope(typeProvider, qualifiedNameConverter, filter);
	}

	@Override
	public AbstractConstructorScope createConstructorScope(
			IJvmTypeProvider typeProvider, Predicate<IEObjectDescription> filter) {
		return null;
	}

	@Override
	public Factory getTypeProviderFactory() {
		return typeProviderFactory;
	}

}

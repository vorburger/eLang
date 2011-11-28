package ch.vorburger.el.naming;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

public class ELQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter;
	
	QualifiedName qualifiedName(JvmGenericType type) {
		return converter.toQualifiedName(type.getQualifiedName());
	}
}

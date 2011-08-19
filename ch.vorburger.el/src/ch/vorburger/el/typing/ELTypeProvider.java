package ch.vorburger.el.typing;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ELTypeProvider extends XbaseTypeProvider {

	@Inject
	private TypeReferences typeReferences;

	protected JvmTypeReference _type(DecimalLiteral literal, boolean rawType) {
		return typeReferences.getTypeForName(BigDecimal.class, literal);
	}
	
	protected JvmTypeReference _type(DateLiteral literal, boolean rawType) {
		return typeReferences.getTypeForName(GregorianCalendar.class, literal);
	}

	protected JvmTypeReference _type(DateTimeLiteral literal, boolean rawType) {
		return typeReferences.getTypeForName(GregorianCalendar.class, literal);
	}

}

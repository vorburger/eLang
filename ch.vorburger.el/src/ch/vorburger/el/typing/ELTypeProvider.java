package ch.vorburger.el.typing;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * This class extends the {@link XbaseTypeProvider} to also handle our own DSL literals for 
 * decimals and dates.
 * 
 * @author Kai Kreuzer
 *
 */
@SuppressWarnings("restriction")
@Singleton
public class ELTypeProvider extends XbaseTypeProvider {

	@Inject
	private TypeReferences typeReferences;

	@Override
	protected JvmTypeReference type(XExpression expression,
			JvmTypeReference rawExpectation, boolean rawType) {
		if(expression instanceof DecimalLiteral) {
			return typeReferences.getTypeForName(BigDecimal.class, expression);
		} else if(expression instanceof DateLiteral) {
			return typeReferences.getTypeForName(GregorianCalendar.class, expression);
		} else if(expression instanceof DateTimeLiteral) {
			return typeReferences.getTypeForName(GregorianCalendar.class, expression);
		} else {
			return super.type(expression, rawExpectation, rawType);
		}
	}
}

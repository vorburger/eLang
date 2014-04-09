package ch.vorburger.el.typesystem.computation

import ch.vorburger.el.eL.DateLiteral
import ch.vorburger.el.eL.DateTimeLiteral
import ch.vorburger.el.eL.DecimalLiteral
import java.math.BigDecimal
import java.util.GregorianCalendar
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer

class ELTypeComputer extends XbaseTypeComputer {

	override computeTypes(XExpression expression, extension ITypeComputationState state) {
		switch expression {
			DecimalLiteral: BigDecimal.getTypeForName(state).acceptActualType
			DateLiteral: GregorianCalendar.getTypeForName(state).acceptActualType
			DateTimeLiteral: GregorianCalendar.getTypeForName(state).acceptActualType
			default: super.computeTypes(expression, state)
		}
	}

}

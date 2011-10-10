package ch.vorburger.el.generator;

import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;
import ch.vorburger.el.lib.DateExtensions;

public class ELCompiler extends XbaseCompiler {

	public String compile(XExpression expression, ImportManager importManager) {
		StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(
				importManager);
		return compile(expression, appendable,
				TypesFactory.eINSTANCE.createJvmAnyTypeReference()).toString();
	}

	protected void _toJavaExpression(DecimalLiteral expr, IAppendable b) {
		b.append("new BigDecimal(\"" + expr.getValue() + "\")");
	}

	protected void _toJavaExpression(DateLiteral expr, IAppendable b) {
		int[] args = DateExtensions.getGregorianCalendarConstructorArgs(expr.getValue());
		b.append("new GregorianCalendar(");
		for(int i=0; i<6; i++) {
			b.append(args[i]);
			if(i<5) b.append(", ");
		}
		b.append(")");
	}

	protected void _toJavaExpression(DateTimeLiteral expr, IAppendable b) {
		int[] args = DateExtensions.getGregorianCalendarConstructorArgs(expr.getValue());
		b.append("new GregorianCalendar(");
		for(int i=0; i<6; i++) {
			b.append(args[i]);
			if(i<5) b.append(", ");
		}
		b.append(")");
	}

//	protected void _toJavaStatement(DateLiteral expr, IAppendable b,
//			boolean isReferenced) {
//		generateComment(expr, b, isReferenced);
//	}
//
//	protected void _toJavaStatement(DateTimeLiteral expr, IAppendable b,
//			boolean isReferenced) {
//		generateComment(expr, b, isReferenced);
//	}
//
//	protected void _toJavaStatement(DecimalLiteral expr, IAppendable b,
//			boolean isReferenced) {
//		generateComment(expr, b, isReferenced);
//	}
}

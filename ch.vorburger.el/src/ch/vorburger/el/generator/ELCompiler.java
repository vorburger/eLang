package ch.vorburger.el.generator;

import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;

import ch.vorburger.el.eL.DecimalLiteral;

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

	protected void _toJavaStatement(DecimalLiteral expr, IAppendable b,
			boolean isReferenced) {
		generateComment(expr, b, isReferenced);
	}
}

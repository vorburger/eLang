package ch.vorburger.el.engine;

import org.eclipse.xtext.xbase.XExpression;

class ExpressionImpl implements Expression {

	private XExpression xBaseExpression;

	public ExpressionImpl(XExpression xBaseExpression/*, String expressionAsString*/) {
		this.xBaseExpression = xBaseExpression;
	}

	/* package-local */
	XExpression getXExpression() {
		return xBaseExpression;
	}
	
}

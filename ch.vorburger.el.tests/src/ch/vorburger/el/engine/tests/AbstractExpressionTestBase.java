package ch.vorburger.el.engine.tests;

import ch.vorburger.el.engine.ExpressionFactory;

/**
 * Tests for EL.
 * 
 * @author Michael Vorburger
 */
public abstract class AbstractExpressionTestBase {

	protected final ExpressionFactory expressionFactory;

	public AbstractExpressionTestBase(ExpressionFactory expressionFactory) {
		super();
		this.expressionFactory = expressionFactory;
	}

}

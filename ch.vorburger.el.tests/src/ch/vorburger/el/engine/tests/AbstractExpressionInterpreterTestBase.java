package ch.vorburger.el.engine.tests;


import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.junit.Assert;

import ch.vorburger.el.engine.Expression;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionException;
import ch.vorburger.el.engine.ExpressionFactory;


public abstract class AbstractExpressionInterpreterTestBase extends AbstractExpressionTestBase {

	public AbstractExpressionInterpreterTestBase(ExpressionFactory expressionFactory) {
		super(expressionFactory);
	}
	
	protected void checkNumericExpression(String expressionText, Number expectedNumber) throws ExpressionException {
		checkNumericExpression(expressionText, null, expectedNumber);
	}
	protected void checkNumericExpression(String expressionText, ExpressionContext context, Number expectedNumber) throws ExpressionException {
		if(expectedNumber instanceof Integer) {
			expectedNumber = new BigDecimal((Integer)expectedNumber);
		}
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		BigDecimal numericResult = expression.evaluateExpectingNumber(context);
		if(numericResult==null && numericResult==null) return;
		Assert.assertEquals(0, numericResult.compareTo((BigDecimal) expectedNumber));
	}
	
	protected void checkStringExpression(String expressionText, String expectedText) throws ExpressionException {
		checkStringExpression(expressionText, null, expectedText);
	}
	protected void checkStringExpression(String expressionText, ExpressionContext context, String expectedText) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		String stringResult = expression.evaluateExpectingString(context);
		Assert.assertEquals(expectedText, stringResult);
	}

	protected void checkDateExpression(String expressionText, GregorianCalendar expectedDateTime) throws ExpressionException {
		checkDateExpression(expressionText, null, expectedDateTime);
	}
	protected void checkDateExpression(String expressionText, ExpressionContext context, GregorianCalendar expectedDateTime) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		GregorianCalendar dateResult = expression.evaluateExpectingGregorianCalendar(context);
		Assert.assertEquals(expectedDateTime, dateResult);
	}

	protected void checkBooleanExpression(String expressionText, Boolean expectedBoolean) throws ExpressionException {
		checkBooleanExpression(expressionText, null, expectedBoolean);
	}
	protected void checkBooleanExpression(String expressionText, ExpressionContext context, Boolean expectedBoolean) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		Boolean boolResult = expression.evaluateExpectingBoolean(context);
		Assert.assertEquals(expectedBoolean, boolResult);
	}

}
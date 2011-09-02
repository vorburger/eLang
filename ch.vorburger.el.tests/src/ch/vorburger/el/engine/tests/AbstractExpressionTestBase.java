package ch.vorburger.el.engine.tests;


import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.junit.Assert;

import ch.vorburger.el.engine.Expression;
import ch.vorburger.el.engine.ExpressionException;
import ch.vorburger.el.engine.ExpressionFactory;


public abstract class AbstractExpressionTestBase {

	protected final ExpressionFactory expressionFactory;

	public AbstractExpressionTestBase(ExpressionFactory expressionFactory) {
		super();
		this.expressionFactory = expressionFactory;
	}

	protected void checkNumericExpression(String expressionText, Number expectedNumber) throws ExpressionException {
		checkNumericExpression(expressionText, null, expectedNumber);
	}
	protected void checkNumericExpression(String expressionText, Object rootObj, Number expectedNumber) throws ExpressionException {
		if(expectedNumber instanceof Integer) {
			expectedNumber = new BigDecimal((Integer)expectedNumber);
		}
		Expression expression = expressionFactory.newExpressionFromString(expressionText);
		BigDecimal numericResult = expression.evaluateExpectingNumber();
		if(numericResult==null && numericResult==null) return;
		Assert.assertEquals(0, numericResult.compareTo((BigDecimal) expectedNumber));
	}
	
	protected void checkStringExpression(String expressionText, String expectedText) throws ExpressionException {
		checkStringExpression(expressionText, null, expectedText);
	}
	protected void checkStringExpression(String expressionText, Object rootObj, String expectedText) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText);
		String stringResult = expression.evaluateExpectingString(rootObj);
		Assert.assertEquals(expectedText, stringResult);
	}

	protected void checkDateExpression(String expressionText, GregorianCalendar expectedDateTime) throws ExpressionException {
		checkDateExpression(expressionText, null, expectedDateTime);
	}
	protected void checkDateExpression(String expressionText, Object rootObj, GregorianCalendar expectedDateTime) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText);
		GregorianCalendar dateResult = expression.evaluateExpectingGregorianCalendar(rootObj);
		Assert.assertEquals(expectedDateTime, dateResult);
	}

	protected void checkBooleanExpression(String expressionText, Boolean expectedBoolean) throws ExpressionException {
		checkBooleanExpression(expressionText, null, expectedBoolean);
	}
	protected void checkBooleanExpression(String expressionText, Object rootObj, Boolean expectedBoolean) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText);
		Boolean boolResult = expression.evaluateExpectingBoolean(rootObj);
		Assert.assertEquals(expectedBoolean, boolResult);
	}
}
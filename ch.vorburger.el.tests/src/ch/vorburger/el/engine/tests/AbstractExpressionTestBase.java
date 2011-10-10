package ch.vorburger.el.engine.tests;


import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

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
	protected void checkNumericExpression(String expressionText, Map<String, Object> context, Number expectedNumber) throws ExpressionException {
		if(expectedNumber instanceof Integer) {
			expectedNumber = new BigDecimal((Integer)expectedNumber);
		}
		Expression expression = expressionFactory.newExpressionFromString(expressionText, extractVarTypes(context));
		BigDecimal numericResult = expression.evaluateExpectingNumber(context);
		if(numericResult==null && numericResult==null) return;
		Assert.assertEquals(0, numericResult.compareTo((BigDecimal) expectedNumber));
	}
	
	protected void checkStringExpression(String expressionText, String expectedText) throws ExpressionException {
		checkStringExpression(expressionText, null, expectedText);
	}
	protected void checkStringExpression(String expressionText, Map<String, Object> context, String expectedText) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, extractVarTypes(context));
		String stringResult = expression.evaluateExpectingString();
		Assert.assertEquals(expectedText, stringResult);
	}

	protected void checkDateExpression(String expressionText, GregorianCalendar expectedDateTime) throws ExpressionException {
		checkDateExpression(expressionText, null, expectedDateTime);
	}
	protected void checkDateExpression(String expressionText, Map<String, Object> context, GregorianCalendar expectedDateTime) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, extractVarTypes(context));
		GregorianCalendar dateResult = expression.evaluateExpectingGregorianCalendar();
		Assert.assertEquals(expectedDateTime, dateResult);
	}

	protected void checkBooleanExpression(String expressionText, Boolean expectedBoolean) throws ExpressionException {
		checkBooleanExpression(expressionText, null, expectedBoolean);
	}
	protected void checkBooleanExpression(String expressionText, Map<String, Object> context, Boolean expectedBoolean) throws ExpressionException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, extractVarTypes(context));
		Boolean boolResult = expression.evaluateExpectingBoolean();
		Assert.assertEquals(expectedBoolean, boolResult);
	}

	private Map<String, Class<? extends Object>> extractVarTypes(Map<String, Object> context) {
		if(context==null) return null;
		
		Map<String, Class<? extends Object>> varTypes = new HashMap<String, Class<? extends Object>>();
		for(Map.Entry<String, Object> entry : context.entrySet()) {
			varTypes.put(entry.getKey(), convertToExpressionType(entry.getValue().getClass()));
		}
		return varTypes;
	}

	private Class<? extends Object> convertToExpressionType(Class<? extends Object> type) {
		if(Number.class.isAssignableFrom(type)) {
			return BigDecimal.class;
		}
		return type;
	}
}
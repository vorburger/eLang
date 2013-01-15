package ch.vorburger.el.engine;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;



/**
 * Expression.
 *
 * @see ExpressionFactory
 * @author Michael Vorburger
 * @author Kai Kreuzer
 */
public interface Expression {

	Object evaluate() throws ExpressionExecutionException;

	Object evaluate(ExpressionContext context) throws ExpressionExecutionException;

	BigDecimal evaluateExpectingNumber() throws ExpressionExecutionException;
	BigDecimal evaluateExpectingNumber(ExpressionContext context) throws ExpressionExecutionException;

	GregorianCalendar evaluateExpectingGregorianCalendar() throws ExpressionExecutionException;
	GregorianCalendar evaluateExpectingGregorianCalendar(ExpressionContext context) throws ExpressionExecutionException;

	Date evaluateExpectingDate() throws ExpressionExecutionException;
	Date evaluateExpectingDate(ExpressionContext context) throws ExpressionExecutionException;

	String evaluateExpectingString() throws ExpressionExecutionException;
	String evaluateExpectingString(ExpressionContext context) throws ExpressionExecutionException;

	Boolean evaluateExpectingBoolean() throws ExpressionExecutionException;
	Boolean evaluateExpectingBoolean(ExpressionContext context) throws ExpressionExecutionException;
	
	String generateJavaCode(Class<?> expectedType);
	
}

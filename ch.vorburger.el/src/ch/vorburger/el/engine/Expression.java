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

	public Object evaluate() throws ExpressionExecutionException;

	public Object evaluate(ExpressionContext context) throws ExpressionExecutionException;

	public BigDecimal evaluateExpectingNumber() throws ExpressionExecutionException;
	public BigDecimal evaluateExpectingNumber(ExpressionContext context) throws ExpressionExecutionException;

	public GregorianCalendar evaluateExpectingGregorianCalendar() throws ExpressionExecutionException;
	public GregorianCalendar evaluateExpectingGregorianCalendar(ExpressionContext context) throws ExpressionExecutionException;

	public Date evaluateExpectingDate() throws ExpressionExecutionException;
	public Date evaluateExpectingDate(ExpressionContext context) throws ExpressionExecutionException;

	public String evaluateExpectingString() throws ExpressionExecutionException;
	public String evaluateExpectingString(ExpressionContext context) throws ExpressionExecutionException;

	public Boolean evaluateExpectingBoolean() throws ExpressionExecutionException;
	public Boolean evaluateExpectingBoolean(ExpressionContext context) throws ExpressionExecutionException;
	
	public String generateJavaCode();
	
}

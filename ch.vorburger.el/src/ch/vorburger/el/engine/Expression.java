package ch.vorburger.el.engine;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;



/**
 * Expression.
 *
 * @see ExpressionFactory
 * @author Michael Vorburger
 * @author Kai Kreuzer
 */
public interface Expression {

	public Object evaluate() throws ExpressionExecutionException;

	public Object evaluate(Map<String, Object> context) throws ExpressionExecutionException;

	public BigDecimal evaluateExpectingNumber(Map<String, Object> context)	throws ExpressionExecutionException;

	public GregorianCalendar evaluateExpectingGregorianCalendar() throws ExpressionExecutionException;

	public Date evaluateExpectingDate() throws ExpressionExecutionException;

	public String evaluateExpectingString() throws ExpressionExecutionException;

	public Boolean evaluateExpectingBoolean() throws ExpressionExecutionException;
	
	public Expression compile() throws ExpressionCompilationException;
	
}

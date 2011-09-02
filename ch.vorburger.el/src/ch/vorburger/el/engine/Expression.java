package ch.vorburger.el.engine;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;



/**
 * Expression.
 *
 * @see ExpressionFactory
 * @author Michael Vorburger
 */
public interface Expression {

	public Object evaluate()
			throws ExpressionExecutionException;
			
	public BigDecimal evaluateExpectingNumber(/* final DataObject rootObj*/)
			throws ExpressionExecutionException;

	public GregorianCalendar evaluateExpectingGregorianCalendar(
			final Object rootObj) throws ExpressionExecutionException;

	public Date evaluateExpectingDate(final Object rootObj)
			throws ExpressionExecutionException;

	public String evaluateExpectingString(
			final Object rootObj) throws ExpressionExecutionException;

	public Boolean evaluateExpectingBoolean(
			final Object rootObj) throws ExpressionExecutionException;
	
	public Expression compile() throws ExpressionCompilationException;
	
}

package ch.vorburger.el.engine;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * This is an abstract implementation of the {@link Expression} interface, which brings default
 * implementations of all evaluate functions.
 * 
 * @author Kai Kreuzer
 *
 */
public abstract class AbstractExpression implements Expression {

	public AbstractExpression() {
		super();
	}

	@Override
	public BigDecimal evaluateExpectingNumber() throws ExpressionExecutionException {
		return evaluateExpectingNumber(null);
	}

	@Override
	public BigDecimal evaluateExpectingNumber(ExpressionContext context)
			throws ExpressionExecutionException {
		try {
			return (BigDecimal) evaluate(context);
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a Number.");
		}
	}

	@Override
	public GregorianCalendar evaluateExpectingGregorianCalendar() throws ExpressionExecutionException {
		return evaluateExpectingGregorianCalendar(null);
	}

	@Override
	public GregorianCalendar evaluateExpectingGregorianCalendar(ExpressionContext context) throws ExpressionExecutionException {
		try {
			return (GregorianCalendar) evaluate(context);
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a GregorianCalendar.");
		}
	}

	@Override
	public Date evaluateExpectingDate() throws ExpressionExecutionException {
		return evaluateExpectingDate(null);
	}

	@Override
	public Date evaluateExpectingDate(ExpressionContext context)
			throws ExpressionExecutionException {
		// Implementation may change; clients should use method with most
		// appropriate return type for client
		try {
			GregorianCalendar result = (GregorianCalendar) evaluate(context);
			return result.getTime();
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a Date.");
		}
	}

	@Override
	public String evaluateExpectingString() throws ExpressionExecutionException {
		return evaluateExpectingString(null);
	}

	@Override
	public String evaluateExpectingString(ExpressionContext context)
			throws ExpressionExecutionException {
		Object result = evaluate(context);
		if (result == null) {
			return null;
		} else {
			return result.toString();
		}
	}

	@Override
	public Boolean evaluateExpectingBoolean() throws ExpressionExecutionException {
		return evaluateExpectingBoolean(null);
	}
	
	@Override
	public Boolean evaluateExpectingBoolean(ExpressionContext context)
			throws ExpressionExecutionException {
		try {
			Object result = evaluate(context);
			if (result instanceof BigDecimal) {
				return ((BigDecimal) result).intValue() != 0;
			} else {
				return (Boolean) result;
			}
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a Boolean.");
		}
	}

}
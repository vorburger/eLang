package ch.vorburger.el.engine;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

public abstract class AbstractExpression implements Expression {

	public AbstractExpression() {
		super();
	}

	@Override
	public BigDecimal evaluateExpectingNumber(Map<String, Object> context)
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
		try {
			return (GregorianCalendar) evaluate();
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a GregorianCalendar.");
		}
	}

	@Override
	public Date evaluateExpectingDate()
			throws ExpressionExecutionException {
		// Implementation may change; clients should use method with most
		// appropriate return type for client
		try {
			GregorianCalendar result = (GregorianCalendar) evaluate();
			return result.getTime();
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a Date.");
		}
	}

	@Override
	public String evaluateExpectingString()
			throws ExpressionExecutionException {
		Object result = evaluate();
		if (result == null) {
			return null;
		} else {
			return evaluate().toString();
		}
	}

	@Override
	public Boolean evaluateExpectingBoolean()
			throws ExpressionExecutionException {
		try {
			Object result = evaluate();
			if (result instanceof BigDecimal) {
				return ((BigDecimal) result).intValue() != 0;
			} else {
				return (Boolean) evaluate();
			}
		} catch (ClassCastException e) {
			throw new ExpressionExecutionException(
					"Expression does not evaluate to a Boolean.");
		}
	}

	// TODO Return Any (ex-NodeEvalResult) instead of 4-5 different signatures?

	// public DataObject evaluateExpectingDataObject(/* DataObject rootObj*/)
	// throws ExpressionExcecutionException {
	// return ((ExpressionImpl)expression).evaluateExpectingDataObject(null
	// /*rootObj*/);
	// }
	
	@Override
	public Expression compile() throws ExpressionCompilationException {
		return this;
	}

}
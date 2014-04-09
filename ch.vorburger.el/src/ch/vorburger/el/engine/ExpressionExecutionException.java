package ch.vorburger.el.engine;

/**
 * Error occurring during the execution (evaluation) of an expression.
 * 
 * @author Michael Vorburger
 */
public class ExpressionExecutionException extends ExpressionException {
	private static final long serialVersionUID = -4071745836248750365L;

	public ExpressionExecutionException(final String message, final int line, final int offset, final int length) {
		super(message, null, line, offset, length);
	}

	public ExpressionExecutionException(final String message, final Throwable cause, final int line, final int offset, final int length) {
		super(cause, message, null, line, offset, length);
	}

	public ExpressionExecutionException(final String message) {
		super(message);
	}

	public ExpressionExecutionException(String message, Throwable exception) {
		super(message, exception);
	}
}

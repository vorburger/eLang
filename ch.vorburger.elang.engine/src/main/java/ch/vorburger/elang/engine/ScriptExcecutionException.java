package ch.vorburger.elang.engine;

/**
 * Error occurring during the execution (evaluation) of a script.
 * 
 * @author Michael Vorburger
 */
public class ScriptExcecutionException extends ScriptException {
	private static final long serialVersionUID = -4071745836248750365L;

	public ScriptExcecutionException(final String message, final int line, final int column, final int length) {
		super(message, null, line, column, length);
	}

	public ScriptExcecutionException(final Throwable cause, final String message, final int line, final int column, final int length) {
		super(cause, message, null, line, column, length);
	}

	public ScriptExcecutionException(final String message) {
		super(message);
	}
}

package ch.vorburger.el.engine;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Error occurring in some expression related stuff.
 *
 * @author Michael Vorburger
 */
public abstract class ExpressionException extends Exception {
	private static final long serialVersionUID = -4155948282895039148L;
	
	private String expressionText;
	private final List<ExpressionError> errors; 

	protected ExpressionException(String message) {
		super(message);
		this.errors = new ArrayList<ExpressionError>(1);
		errors.add(new ExpressionError(message, 0, 0, -1));
	}

	/**
	 * @param message
	 * @param cause
	 */
	protected ExpressionException(final String message, final String expressionText, final Throwable cause) {
		super(message, cause);
		this.expressionText = expressionText;
		this.errors = new LinkedList<ExpressionError>();
	}

	protected ExpressionException(final String message, final String expressionText) {
		super(message);
		this.expressionText = expressionText;
		this.errors = new LinkedList<ExpressionError>();
	}

	public ExpressionException(final String message, final String expressionText, final int line, final int offset, final int length) {
		this(expressionText, new ExpressionError(message, line, offset, length));
	}
	
	public ExpressionException(final Throwable cause, final String message, final String expressionText, final int line, final int offset, final int length) {
		this(cause, expressionText, new ExpressionError(message, line, offset, length));
	}

	private ExpressionException(final Throwable cause, final String expressionText, final ExpressionError error) {
		super(error.getMessage(), cause); // ?
		this.expressionText = expressionText;
		this.errors = new ArrayList<ExpressionError>(1);
		errors.add(error);
	}
	
	/**
	 * Creates a ExpressionException with one Error.
	 * @param errors
	 */
	private ExpressionException(final String expressionText, final ExpressionError error) {
		super(error.getMessage()); // ?
		this.expressionText = expressionText;
		this.errors = new ArrayList<ExpressionError>(1);
		errors.add(error);
	}
	
	public ExpressionException(String message, Throwable cause) {
		super(message, cause);
		this.errors = new ArrayList<ExpressionError>(0);
	}

	/**
	 * All Errors that lead to this Exception.
	 * @return List of Error.  Size >= 1, there is at last one ExpressionError.
	 */
	public List<ExpressionError> getErrors() {
		return errors;
	}
	
	public void setExpressionText(final String expressionText) {
		this.expressionText = expressionText;
	}
	
	/**
	 * Returns a concatenation of all errors in contained ExpressionError instances.
	 * Separated by newline, except for last error; no \n if only one error.
	 * 
	 * @return The Message.
	 * 
	 * @see ExpressionError#getMessage()
	 */
	@Override
	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.getMessage());
		if(expressionText!=null) {
			sb.append('\n');
			int l = 1;
			int c = 0;
			for (int x = 0; x < expressionText.length(); x++) {
				if (hasMatchingError(l, c)) {
					sb.append(" ___ ");
				}
				sb.append(expressionText.charAt(x));
				if (expressionText.charAt(x) == '\n') {
					++l;
					c = 0;
				} else {
					++c;
				}
			}
		}
		
		int i = 1;
		for (ExpressionError e : getErrors()) {
			if (sb.length() > 0) {
				sb.append('\n');
			}
			sb.append("   ");
			if (getErrors().size() > 1) {
				sb.append(i++);
				sb.append(". ");
			}
			sb.append(e.getMessage());
			if (e.getException() != null) {
				sb.append("\n      ");
				final Writer stackTrace = new StringWriter();
			    final PrintWriter printWriter = new PrintWriter(stackTrace);
			    e.getException().printStackTrace(printWriter);
			    sb.append(stackTrace.toString());
			}
		}
		return sb.toString();
	}

	private boolean hasMatchingError(int l, int c) {
		for (ExpressionError e : getErrors()) {
			if (e.getLineNumber() == l && e.getColumnNumber() == c) {
				return true;
			}
		}
		return false;
	}
}

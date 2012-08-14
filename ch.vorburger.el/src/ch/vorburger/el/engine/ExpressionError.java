package ch.vorburger.el.engine;


/**
 * An Error that occurred during Expression evaluation.
 * 
 * @see ExpressionException
 * @see ExpressionExecutionException
 * @see ExpressionParsingException
 *
 * @author Michael Vorburger
 */
public final class ExpressionError {
	
	private final int offset;
	private final int length;
	private final int line;
	
	private final String message;
	private Exception exception;
	
	/**
	 * Creates new ExpressionError.
	 * 
	 * @param message Error Message
	 * @param line Line number, or -1 if unknown
	 * @param offset Column number, or -1 if unknown 
	 * @param length Length, or -1 if unknown
	 */
	public ExpressionError(final String message, final int line, final int offset, final int length) {
		this.message = message;
		this.line = line;
		this.offset = offset;
		this.length = length;
	}

	
	public ExpressionError(String message, int line, int offset, int length, Exception exception) {
		this(message, line, offset, length);
		this.exception = exception;
	}


	/**
	 * Returns a message containing the String passed to a constructor as well as line and column numbers if any of these are known.
	 * @return The error message.
	 */
	public String getMessage() {
		StringBuilder sb = new StringBuilder(message);
		if (line != -1) {
			sb.append("; line ");
			sb.append(line);
		}
		if (offset != -1) {
			sb.append(", column ");
			sb.append(offset);
		}
		if (length != -1) {
			sb.append(", length ");
			sb.append(length);
		}
		return sb.toString();
	}

	/**
	 * Get the line number on which an error occurred.
	 * @return The line number. Returns -1 if a line number is unavailable.
	 */
	public int getLineNumber() {
		return line;
	}

	/**
	 * Get the column number on which an error occurred.
	 * @return The column number. Returns -1 if a column number is unavailable.
	 */
	public int getColumnNumber() {
		return offset;
	}
    
    /**
     * Get the number of columns affected by the error.
     * @return The number of columns. Returns -1 if unavailable.
     */
	public int getLength() {
		return length;
	}
	
	public Exception getException() {
		return exception;
	}
}

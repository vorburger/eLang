package ch.vorburger.el.engine;



/**
 * Error occurring during the compilation of an expression.
 * 
 * @author Kai Kreuzer
 */
public class ExpressionCompilationException extends ExpressionException {

	private static final long serialVersionUID = 7230659368777056322L;

	public ExpressionCompilationException(String message, Throwable t) {
		super(message, t);
	}
}

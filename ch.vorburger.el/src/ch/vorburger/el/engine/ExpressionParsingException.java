package ch.vorburger.el.engine;


import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.diagnostics.ExceptionDiagnostic;
import org.eclipse.xtext.validation.Issue;

/**
 * Error occurring during the loading/parsing of an expression.
 * 
 * @author Michael Vorburger
 */
public class ExpressionParsingException extends ExpressionException {
	private static final long serialVersionUID = 4478847668512127612L;

	public ExpressionParsingException(String message, String expressionAsString) {
		super(message, expressionAsString);
	}

	public ExpressionParsingException(String message, String expressionAsString, Throwable t) {
		super(message, expressionAsString, t);
	}

	public ExpressionParsingException addDiagnosticErrors(List<Diagnostic> errors) {
		for (Diagnostic emfDiagnosticError : errors) {
			if (emfDiagnosticError instanceof AbstractDiagnostic) {
				AbstractDiagnostic e = (AbstractDiagnostic) emfDiagnosticError;
				this.getErrors().add(new ExpressionError(e.getMessage(), e.getLine(), e.getOffset(), e.getLength()));				
			} else if (emfDiagnosticError instanceof ExceptionDiagnostic) {
				ExceptionDiagnostic e = (ExceptionDiagnostic) emfDiagnosticError;
				this.getErrors().add(new ExpressionError(e.getMessage(), e.getLine(), e.getOffset(), e.getLength()));				
			} else {
				this.getErrors().add(new ExpressionError(emfDiagnosticError.getMessage(), -1, -1, -1));				
			}
		}
		return this;
	}

	public ExpressionParsingException addValidationIssues(Iterable<Issue> validationErrors) {
		for (Issue validationError : validationErrors) {
			this.getErrors().add(new ExpressionError(validationError.getMessage(), validationError.getLineNumber(), validationError.getOffset(), validationError.getLength()));				
		}
		return this;
	}
}

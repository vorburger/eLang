package ch.vorburger.elang.engine;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
//import org.eclipse.xtext.parsetree.AbstractNode;
//import org.eclipse.xtext.parsetree.SyntaxError;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;

/**
 * Error occurring during the loading/parsing of a script.
 * 
 * @author Michael Vorburger
 */
public class ScriptParsingException extends ScriptException {
	private static final long serialVersionUID = 4478847668512127612L;

	public ScriptParsingException(String message, String scriptAsString) {
		super(message, scriptAsString);
	}

	public ScriptParsingException(String message, String scriptAsString, Throwable t) {
		super(message, scriptAsString, t);
	}

	public ScriptParsingException addDiagnosticErrors(List<Diagnostic> errors) {
		for (Diagnostic emfDiagnosticError : errors) {
			XtextSyntaxDiagnostic e = (XtextSyntaxDiagnostic) emfDiagnosticError;
			// AbstractNode node = xTextSyntaxError.getNode(); -- "not visible"
			this.getErrors().add(new ScriptError(e.getMessage(), e.getLine(), e.getOffset(), e.getLength()));
		}
		return this;
	}
}

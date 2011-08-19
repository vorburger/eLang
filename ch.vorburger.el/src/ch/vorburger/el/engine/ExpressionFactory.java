package ch.vorburger.el.engine;


import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.XExpression;

import ch.vorburger.el.ELStandaloneSetup;

import com.google.inject.Injector;

/**
 * Expression Factory which can create new Expression objects from some textual representation.
 * 
 * Initialization of this thing is probably expensive, so create only one and keep it around (Singleton) !
 *  
 * @see Expression
 * @author Michael Vorburger
 */
public class ExpressionFactory {

	private final Injector guiceInjector;
	private final XtextResourceSet resourceSet;
	private final ExpressionEngine expressionEngine;
	// private final IParser parser;

	public ExpressionFactory() {
		super();
		// http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		this.guiceInjector = new ELStandaloneSetup().createInjectorAndDoEMFRegistration();
		// this.parser = guiceInjector.getInstance(IAntlrParser.class);
		this.resourceSet = guiceInjector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		this.expressionEngine = guiceInjector.getInstance(ExpressionEngine.class);
	}

	public ExpressionEngine getEngine() {
		return expressionEngine;
	}
	
	/**
	 * Parse text expression and return a parsed expression object.
	 * 
	 * @see ExpressionEngine
	 * 
	 * @param expressionAsString Expression expression
	 * @return expression object, which the ExpressionEngine can evaluate 
	 * @throws ExpressionParsingException
	 */
	public Expression newExpressionFromString(final String expressionAsString) throws ExpressionParsingException {
		return new ExpressionImpl(parseExpressionIntoXTextEObject(expressionAsString)/*, expressionAsString*/);
	}

	/**
	 * @see http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=287413
	 */
	private XExpression parseExpressionIntoXTextEObject(final String expressionAsString) throws ExpressionParsingException {
		// NOTE: The "filename extension" ("expr") must match the file.extensions in the *.mwe2

		Resource resource = resourceSet.createResource(URI.createURI("dummy:/dummy" + Math.random() + ".expr")); // IS-A XtextResource
		try {
			resource.load(new StringInputStream(expressionAsString), resourceSet.getLoadOptions());
		} catch (IOException e) {
			throw new ExpressionParsingException("Unexpected IOException; from close() of a String-based ByteArrayInputStream, no real I/O; how is that possible???", expressionAsString, e);
		}
		
		List<Diagnostic> errors = resource.getErrors();
		if (errors.size() != 0) {
			throw new ExpressionParsingException("Failed to parse expression (due to managed SyntaxError/s)", expressionAsString).addDiagnosticErrors(errors);
		}
		
		EList<EObject> contents = resource.getContents();
		if (!contents.isEmpty()) {
			return (XExpression) contents.get(0);
		} else {
			return null;
		}
	}
}

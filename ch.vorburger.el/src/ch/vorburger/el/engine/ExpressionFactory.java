package ch.vorburger.el.engine;


import static com.google.common.collect.Iterables.filter;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XExpression;

import ch.vorburger.el.ELStandaloneSetup;

import com.google.common.base.Predicate;
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

	protected Injector guiceInjector;
	protected XtextResourceSet resourceSet;

	private boolean alwaysCompile = false;

	public ExpressionFactory() {
		super();
		// http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		this.guiceInjector = new ELStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.resourceSet = guiceInjector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}
	
	/**
	 * Parse text expression and return a parsed expression object.
	 * 
	 * @see ExpressionEngine
	 * 
	 * @param expressionAsString Expression expression
	 * @return expression object, which can be evaluated 
	 * @throws ExpressionParsingException
	 * @throws ExpressionCompilationException 
	 */
	public Expression newExpressionFromString(final String expressionAsString) throws ExpressionParsingException, ExpressionCompilationException {
		if(alwaysCompile) return newCompiledExpressionFromString(expressionAsString);
		ExpressionImpl expression = guiceInjector.getInstance(ExpressionImpl.class);
		expression.setXExpression(parseExpressionIntoXTextEObject(expressionAsString));
		return expression;
	}

	/**
	 * Parse text expression and return a parsed expression object.
	 * 
	 * @see ExpressionEngine
	 * 
	 * @param expressionAsString Expression expression
	 * @return expression object, which can be evaluated 
	 * @throws ExpressionCompilationException 
	 */
	public Expression newCompiledExpressionFromString(final String expressionAsString) throws ExpressionParsingException, ExpressionCompilationException {
		ExpressionImpl expression = guiceInjector.getInstance(ExpressionImpl.class);
		expression.setXExpression(parseExpressionIntoXTextEObject(expressionAsString));
		return expression.compile();
	}

	/**
	 * Determines whether the factory pre-compiles all parsed expressions.
	 * 
	 * @return true, if pre-compilation is activated
	 */
	public boolean isAlwaysCompile() {
		return alwaysCompile;
	}

	/**
	 * Sets the pre-compilation behaviour of the factory.
	 * 
	 * @param alwaysCompile if true, newExpressionFromString will behave just like newCompiledExpressionFromString 
	 */
	public void setAlwaysCompile(boolean alwaysCompile) {
		this.alwaysCompile = alwaysCompile;
	}

	/**
	 * @see http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=287413
	 */
	private XExpression parseExpressionIntoXTextEObject(final String expressionAsString) throws ExpressionParsingException {

		Resource resource = resourceSet.createResource(computeUnusedUri(resourceSet)); // IS-A XtextResource
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
			Iterable<Issue> validationErrors = getValidationErrors(contents.get(0));
			if(!validationErrors.iterator().hasNext()) {
				return (XExpression) contents.get(0);
			} else {
				throw new ExpressionParsingException("Failed to parse expression (due to managed ValidationError/s)", expressionAsString).addValidationIssues(validationErrors);
			}
		} else {
			return null;
		}
	}
	
	protected URI computeUnusedUri(ResourceSet resourceSet) {
		String name = "__synthetic";
		final int MAX_TRIES=1000;
		for(int i=0; i<MAX_TRIES; i++) {
			// NOTE: The "filename extension" ("expr") must match the file.extensions in the *.mwe2
			URI syntheticUri = URI.createURI(name+Math.random()+ "." + getFileExtension());
			if (resourceSet.getResource(syntheticUri, false)==null)
				return syntheticUri;
		} 
		throw new IllegalStateException();
	}

	protected List<Issue> validate(EObject model) {
		IResourceValidator validator = ((XtextResource) model.eResource()).getResourceServiceProvider().getResourceValidator();
		return validator.validate(model.eResource(), CheckMode.ALL, CancelIndicator.NullImpl);
	}
	
	protected Iterable<Issue> getValidationErrors(final EObject model) {
		final List<Issue> validate = validate(model);
		Iterable<Issue> issues = filter(validate, new Predicate<Issue>() {
			public boolean apply(Issue input) {
				return Severity.ERROR == input.getSeverity();
			}
		});
		return issues;
	}

	protected String getFileExtension() {
		return "expr";
	}

}

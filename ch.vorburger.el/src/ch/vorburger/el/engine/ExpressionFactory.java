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
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XExpression;

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
@SuppressWarnings("restriction")
public class ExpressionFactory {

	private static final URI exprURI = URI.createURI("ExpressionFactory.expr");
	protected Injector guiceInjector;

	public ExpressionFactory() {
		super();
		IResourceServiceProvider rsp = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(exprURI);
		this.guiceInjector = rsp.get(Injector.class); // NOT ELStandaloneSetup.getInjector(); // NOT new ELStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public Injector getInjector() {
		return guiceInjector;
	}
	
	public Expression newExpressionFromString(final String expressionAsString) throws ExpressionParsingException {
		return newExpressionFromString(expressionAsString, true);
	}
	
	public Expression newExpressionFromString(final String expressionAsString, ExpressionContext context) throws ExpressionParsingException {
		return newExpressionFromString(expressionAsString, context, true);
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
	public Expression newExpressionFromString(final String expressionAsString, boolean validate) throws ExpressionParsingException {
		return newExpressionFromString(expressionAsString, null, validate);
	}

	public Expression newExpressionFromString(final String expressionAsString, ExpressionContext context, boolean validate) throws ExpressionParsingException {
		ExpressionImpl expression = (ExpressionImpl) guiceInjector.getInstance(Expression.class);
		expression.setXExpression(parseExpressionIntoXTextEObject(expressionAsString, context, validate));
		return expression;
	}

	/**
	 * @param validate 
	 * @param varTypes 
	 * @see http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=287413
	 */
	protected XExpression parseExpressionIntoXTextEObject(final String expressionAsString, ExpressionContext context, boolean validate) throws ExpressionParsingException {
		final ResourceSet resourceSet = context.getResourceSet();
		Resource resource = resourceSet.createResource(computeUnusedUri(resourceSet)); // IS-A XtextResource
		if(context!=null) {
			resource.eAdapters().add(context);
		}
		
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
			if (validate) {
				Iterable<Issue> validationErrors = getValidationErrors(contents.get(0));
				if(validationErrors.iterator().hasNext()) {
					throw new ExpressionParsingException("Failed to parse expression (due to managed ValidationError/s)", expressionAsString).addValidationIssues(validationErrors);
				}
			}
			return (XExpression) contents.get(0);
		} else {
			return null;
		}
	}
	
	/**
	 * This code is copy/pasted from org.eclipse.xtext.junit4.util.ParseHelper.computeUnusedUri(ResourceSet).
	 * We have only change the String concatenation to use StringBuilder.
	 */
	protected URI computeUnusedUri(ResourceSet resourceSet) {
		StringBuilder name = new StringBuilder("__synthetic");
		for(int i=0; i < Integer.MAX_VALUE; i++) {
			// NOTE: The "filename extension" ("expr") must match the file.extensions in the *.mwe2
			URI syntheticUri = URI.createURI(name.append(i).append('.').append(getFileExtension()).toString());
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
			@Override
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

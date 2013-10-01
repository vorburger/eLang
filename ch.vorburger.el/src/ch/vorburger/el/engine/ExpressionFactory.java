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
import org.eclipse.xtext.resource.IResourceFactory;
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
@SuppressWarnings("restriction")
public class ExpressionFactory {

	// TODO use @Inject here (see also below)
	protected Injector guiceInjector;
	protected XtextResourceSet resourceSet;
	protected IResourceFactory resourceFactory;
	
	public ExpressionFactory() {
		super();
		// http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
		// new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		/*
		 *  HARD CODING THIS TO DS EL IS CONFUSING, AS IT means subclasses such as ALLOW DS EL change it via their constructor :-(
		 */
		this.guiceInjector = new ELStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.resourceSet = guiceInjector.getInstance(XtextResourceSet.class);
		this.resourceFactory = guiceInjector.getInstance(IResourceFactory.class);
		
		// Do NOT do this, see below and http://www.eclipse.org/forums/index.php/m/1118458/#msg_1118458
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
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
	 * Parsing Helper.
	 * 
	 * @see org.eclipse.xtext.junit4.util.ParseHelper<T>
	 * @see http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=287413
	 */
	protected XExpression parseExpressionIntoXTextEObject(final String expressionAsString, ExpressionContext context, boolean validate) throws ExpressionParsingException {
		// USED TO BE: Resource resource = resourceSet.createResource(computeUnusedUri(resourceSet)); // IS-A XtextResource
		Resource resource = resourceFactory.createResource(computeUnusedUri(resourceSet)); // IS-A XtextResource
		
		resourceSet.getResources().add(resource);
		if(context!=null) {
			resource.eAdapters().add(context);
		}
		
		try {
			// @see http://www.eclipse.org/forums/index.php/m/1118458/#msg_1118458
			// resourceSet.getLoadOptions() == org.eclipse.xtext.resource.XtextResource.RESOLVE_ALL=true
			resource.load(new StringInputStream(expressionAsString), null /* NOT resourceSet.getLoadOptions() !!!!!!!!!!!!! */);
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
		// NOTE: The "filename extension" ("expr") must match the file.extensions in the *.mwe2
		return "expr";
	}
}

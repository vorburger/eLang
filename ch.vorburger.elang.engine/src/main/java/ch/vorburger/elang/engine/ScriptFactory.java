package ch.vorburger.elang.engine;

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

import ch.vorburger.elang.ELangDslStandaloneSetup;
import ch.vorburger.elang.eLangDsl.Expression;
import ch.vorburger.elang.engine.ast.ASTTranslator;

import com.google.inject.Injector;

/**
 * Script Factory which can create new Script objects from some textual representation.
 * 
 * Initialization of this thing is probably expensive, so create only one and keep it around (Singleton) !
 *  
 * @see Script
 * @author Michael Vorburger
 */
public class ScriptFactory {

	private final Injector guiceInjector;
	private final XtextResourceSet resourceSet;
	// private final IParser parser;

	public ScriptFactory() {
		super();
		// http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		this.guiceInjector = new ELangDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		// this.parser = guiceInjector.getInstance(IAntlrParser.class);
		this.resourceSet = guiceInjector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}

	/**
	 * Parse text script and return a parsed script object.
	 * 
	 * @see ScriptEngine
	 * 
	 * @param scriptAsString Script expression
	 * @return script object, which the ScriptEngine can evaluate 
	 * @throws ScriptParsingException
	 */
	public Script newScriptFromString(final String scriptAsString) throws ScriptParsingException {
		return ASTTranslator.newScript(parseScriptIntoXTextEObject(scriptAsString), scriptAsString);
	}

	/**
	 * @see http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=287413
	 */
	private Expression /*Scpt*/ parseScriptIntoXTextEObject(final String scriptAsString) throws ScriptParsingException {
		// NOTE: The "filename extension" ("elang") must match the file.extensions in the *.mwe2

		Resource resource = resourceSet.createResource(URI.createURI("dummy:/script.elang")); // IS-A XtextResource
		try {
			resource.load(new StringInputStream(scriptAsString), resourceSet.getLoadOptions());
		} catch (IOException e) {
			throw new ScriptParsingException("Unexpected IOException; from close() of a String-based ByteArrayInputStream, no real I/O; how is that possible???", scriptAsString, e);
		}
		
		List<Diagnostic> errors = resource.getErrors();
		if (errors.size() != 0) {
			throw new ScriptParsingException("Failed to parse script (due to managed SyntaxError/s)", scriptAsString).addDiagnosticErrors(errors);
		}
		
		EList<EObject> contents = resource.getContents();
		if (!contents.isEmpty()) {
			return (/*Scpt*/ Expression) contents.get(0);
		} else {
			return null;
		}
/*
 * This previous implementation is using API's which "We don't consider these API's
 * as public or stable. Therefore we don't want to push their use.", according to https://bugs.eclipse.org/bugs/show_bug.cgi?id=287413.
 * Leaving this code in here, just in case we ever have trouble with the EMF Resource stuff...
 * (which does seem to be a lot more memory intensive, may be a problem, later?)
 * 
		IParseResult result;
		try {
			 result = parser.parse(new StringInputStream(scriptAsString));
		} catch (Throwable t) {
			throw new ParsingException("Failed to parse script (due to unexpected nested Throwable/Exception)", scriptAsString, t);
		}
		
		List<SyntaxError> errors = result.getParseErrors();
		if (errors.size() != 0) {
			throw new ParsingException("Failed to parse script (due to managed SyntaxError/s)", scriptAsString).addSyntaxErrors(errors);
		}
			
		EObject emfASTRootElement = result.getRootASTElement();
		Scpt scptRoot = (Scpt) emfASTRootElement;
		return scptRoot;
 */	
	}
}

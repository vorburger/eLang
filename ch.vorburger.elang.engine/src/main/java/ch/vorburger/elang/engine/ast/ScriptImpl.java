package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.Script;
import ch.vorburger.elang.engine.data.DataObject;


/**
 * Internal implementation of Script.
 * 
 * @author Michael Vorburger
 */
public class ScriptImpl implements Script {

	private final String scriptText;
	private final Node rootNode;

	/* package-local */ ScriptImpl(Node root, String scriptText) {
		this.rootNode = root;
		this.scriptText = scriptText;
	}
	
	// TODO Return Any (ex-NodeEvalResult) instead of 4-5 different signatures?
	
	public Number evaluateExpressionScriptExpectingNumber(DataObject rootObj) throws ScriptExcecutionException {
		try {
			return rootNode.evaluate(rootObj).asDouble();
		} catch (ScriptExcecutionException e) {
			e.setScriptText(scriptText);
			throw e;
		}
	}

	public GregorianCalendar evaluateExpressionScriptExpectingGregorianCalendar(DataObject rootObj) throws ScriptExcecutionException {
		try {
			return rootNode.evaluate(rootObj).asGregorianCalendar();
		} catch (ScriptExcecutionException e) {
			e.setScriptText(scriptText);
			throw e;
		}
	}

	public String evaluateExpressionScriptExpectingString(DataObject rootObj) throws ScriptExcecutionException {
		try {
			return rootNode.evaluate(rootObj).asString();
		} catch (ScriptExcecutionException e) {
			e.setScriptText(scriptText);
			throw e;
		}
	} 

	public Boolean evaluateExpressionScriptExpectingBoolean(DataObject rootObj) throws ScriptExcecutionException {
		try {
			return rootNode.evaluate(rootObj).asBoolean();
		} catch (ScriptExcecutionException e) {
			e.setScriptText(scriptText);
			throw e;
		}
	}

	public DataObject evaluateExpressionScriptExpectingDataObject(DataObject rootObj) throws ScriptExcecutionException {
		try {
			return rootNode.evaluate(rootObj).asDataObject();
		} catch (ScriptExcecutionException e) {
			e.setScriptText(scriptText);
			throw e;
		}
	}
}

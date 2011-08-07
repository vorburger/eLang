package ch.vorburger.elang.engine;

import java.util.Date;
import java.util.GregorianCalendar;

import ch.vorburger.elang.engine.ast.ScriptImpl;
import ch.vorburger.elang.engine.data.DataObject;


/**
 * Script Engine, can "run" (execute) Script.
 *  
 * @see Script
 * @author Michael Vorburger
 */
public class ScriptEngine {

	// TODO The ScriptEngine and Script/ScriptImpl class so far have little difference/reason for being different, will they later have, or merge them?
	
	public ScriptEngine(/* Need anything here?? */) {
		
	}

	// TODO Better use some kind of scriptID in signatures, and new additional some ScriptRepository?  
	// Actually probably NO, a future new ScriptRepository would be additional..  on top of the existing, not modifying it.
	
	// TODO Return Any (ex-NodeEvalResult) instead of 4-5 different signatures?
	
	// TODO Is returning java.lang.Number a good idea here, or should it be Double (or Big* or something else?)
	public Number evaluateExpressionScriptExpectingNumber(final Script script, final DataObject rootObj) throws ScriptExcecutionException {
		return ((ScriptImpl)script).evaluateExpressionScriptExpectingNumber(rootObj);
	}

	public GregorianCalendar evaluateExpressionScriptExpectingGregorianCalendar(final Script script, final DataObject rootObj) throws ScriptExcecutionException {
		return ((ScriptImpl)script).evaluateExpressionScriptExpectingGregorianCalendar(rootObj); 
	}

	public Date evaluateExpressionScriptExpectingDate(final Script script, final DataObject rootObj) throws ScriptExcecutionException {
		// Implementation may change; clients should use method with most appropriate return type for client 
		return this.evaluateExpressionScriptExpectingGregorianCalendar(script, rootObj).getTime(); 
	}

	public String evaluateExpressionScriptExpectingString(final Script script, final DataObject rootObj) throws ScriptExcecutionException {
		return ((ScriptImpl)script).evaluateExpressionScriptExpectingString(rootObj);
	}

	public Boolean evaluateExpressionScriptExpectingBoolean(final Script script, final DataObject rootObj) throws ScriptExcecutionException {
		return ((ScriptImpl)script).evaluateExpressionScriptExpectingBoolean(rootObj);
	}

	public DataObject evaluateExpressionScriptExpectingDataObject(Script script, DataObject rootObj) throws ScriptExcecutionException {
		return ((ScriptImpl)script).evaluateExpressionScriptExpectingDataObject(rootObj);
	}
}

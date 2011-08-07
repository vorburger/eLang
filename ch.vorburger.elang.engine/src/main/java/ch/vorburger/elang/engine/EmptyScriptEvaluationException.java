package ch.vorburger.elang.engine;

/**
 * Error thrown is somehow an "empty script" (with no actual executable content) was evaluated.
 * 
 * @author Michael Vorburger
 */
public class EmptyScriptEvaluationException extends ScriptExcecutionException {
	private static final long serialVersionUID = -6190948846446240611L;
	
	private static final String MSG = "Empty Script can not be evaluated";

	public EmptyScriptEvaluationException() {
		super(MSG);
	}
}

/**
 * 
 */
package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.EmptyScriptEvaluationException;
import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * This Special Node node represents an Empty Script - e.g. one consisting only of blank or comment content. 
 * It should normally only appear once (or not at all), and directly under the root.
 *  
 * @author Michael Vorburger
 */
/* package-local */ final class EmptyScriptNode extends Node {

	EmptyScriptNode(EObject emfASTNode) {
		super(emfASTNode);
	}

	EmptyScriptNode() {
		super();
	}

	@Override
	public NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public Double asDouble() throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public String asString() throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public DataObject asDataObject() throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		throw new EmptyScriptEvaluationException();
	}
}

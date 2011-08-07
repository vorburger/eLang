package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * @author Michael Vorburger
 */
public abstract class AbstractOperationNode extends Node {

	// TODO Remove these two, this stuff should not depend on EMF..
	public AbstractOperationNode(EObject emfASTNode) {
		super(emfASTNode);
	}
	public AbstractOperationNode(EObject emfASTNode, String tokenText) {
		super(emfASTNode, tokenText);
	}

	protected AbstractOperationNode(Location loc) {
		super(loc);
	}

	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).asBoolean();
	}

	@Override
	public Double asDouble() throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).asDouble();
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).asGregorianCalendar();
	}

	@Override
	public String asString() throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).asString();
	}

	@Override
	public DataObject asDataObject() throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).asDataObject();
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).compare(o);
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return this.evaluate(null /* ??? */).isEqual(y);
	}
}

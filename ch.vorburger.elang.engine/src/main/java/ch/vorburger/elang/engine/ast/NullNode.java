package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * A NULL result produced by an operation node, or the NULL keyword.
 * 
 * @author Michael Vorburger
 */
/* package-local */ final class NullNode extends AbstractFixedValueNode {

	public static final Node NULL = new NullNode();

	private NullNode() {
	}
	
	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		return null;
	}

	@Override
	public Double asDouble() throws ScriptExcecutionException {
		return null;
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		return null;
	}

	@Override
	public String asString() throws ScriptExcecutionException {
		return null;
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		return this.isEqual(o) ? 0 : 1; 
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return NULL.equals(y);
	}

}

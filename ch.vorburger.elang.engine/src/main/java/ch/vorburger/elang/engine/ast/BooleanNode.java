package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * A boolean result produced by an operation node, or TRUE or FALSE keyword.
 * 
 * @author Michael Vorburger
 */
//TODO /* package-local */ this shouldn't have to be public, it only temporarily is, for TestBeanDataObjectWrapper 
public final class BooleanNode extends AbstractFixedValueNode {

	// TODO Strictly seen, this wouldn't have to be an AbstractFixedValueNode, ONLY a NodeEvalResult - like that new DataObjectNodeEvalResult.   Adapt?
	
	private final boolean b;

	static final BooleanNode FALSE = new BooleanNode(false);
	static final BooleanNode TRUE = new BooleanNode(true);

	// TODO /* package-local */ this shouldn't have to be public, it only temporarily is, for TestBeanDataObjectWrapper 
	public static final BooleanNode valueOf(boolean b) {
		return b ? BooleanNode.TRUE : BooleanNode.FALSE;
	}
	
	private BooleanNode(boolean b) {
		this.b = b;
	}
	
	@Override
	public final Double asDouble() {
		return b ? Double.valueOf(1) : 0;
	}

	@Override
	public final Boolean asBoolean() {
		return b;
	}

	@Override
	public final GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		throw newExcecutionException("Can not convert boolean value (" + b + ") into a Date/Time");
	}

	@Override
	public final String asString() {
		return Boolean.toString(b);
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		return this.asBoolean().compareTo(o.asBoolean());
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return b == y.asBoolean().booleanValue();
	}
}

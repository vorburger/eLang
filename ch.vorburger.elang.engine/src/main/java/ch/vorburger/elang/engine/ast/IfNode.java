package ch.vorburger.elang.engine.ast;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * IF Function.
 * 
 * @author Michael Vorburger (MVO)
 */
/* package-local */ final class IfNode extends AbstractFunctionNode {

	private final Node ifCondition;
	private final Node thenEvaluate;
	private final Node elseEvaluate;

	protected IfNode(Location location, Node condition, Node thenNode, Node elseNode) {
		super(location);
		this.ifCondition = condition;
		this.thenEvaluate = thenNode;
		this.elseEvaluate = elseNode;
	}

	@Override
	NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		if (ifCondition.evaluate(root).asBoolean()) {
			return thenEvaluate.evaluate(root);
		} else {
			return elseEvaluate.evaluate(root);
		}
	}
}

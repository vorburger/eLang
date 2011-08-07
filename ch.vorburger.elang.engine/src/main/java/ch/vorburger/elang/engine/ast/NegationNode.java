package ch.vorburger.elang.engine.ast;


import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Node type for "negated" expressions, like e.g. "-(1+1)", or "-variable".
 * This is NOT used for e.g. "2-1" or "3-variable" (that would be an AdditionSubtractionMultiplyingDividingExpressionNode).
 *
 * @author Michael Vorburger
 */
/* package-local */ final class NegationNode extends AbstractOperationNode {

	private final Node node;

	NegationNode(EObject emfASTNode, Node node) {
		// NOT super(emfASTNode); BUT:
		super(node);
		this.node = node;
	}

	@Override
	public NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		NodeEvalResult nodeResult = node.evaluate(root);
		// How dumb of Java that there is no Number.negative(Number) !  Could be optimized, e.g. if both Integer..
		Double numericNodeResultAsDouble = nodeResult.asDouble();
		return new NumberNode(this, -numericNodeResultAsDouble);
	}
}

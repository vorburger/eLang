package ch.vorburger.elang.engine.ast;


import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Node for a NOT expression.
 *
 * @author Michael Vorburger
 */
/* package-local */ final class RelationalNOTExpressionNode extends AbstractOperationNode {

	private final Node node;

	/* package-local */ 
	RelationalNOTExpressionNode(EObject emfASTNode, Node node) {
		super(emfASTNode);
		this.node = node;
	}

	@Override
	public NodeEvalResult evaluate(final DataObject root) throws ScriptExcecutionException {
		NodeEvalResult o = node.evaluate(root);
		Boolean b = o.asBoolean();
		return BooleanNode.valueOf(!b);
	}
}

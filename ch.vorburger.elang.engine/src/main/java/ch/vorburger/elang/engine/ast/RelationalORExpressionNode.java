package ch.vorburger.elang.engine.ast;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Node for lists of OR expressions.
 *
 * @see RelationalANDExpressionNode
 * 
 * @author Michael Vorburger
 */
/* package-local */ final class RelationalORExpressionNode extends AbstractExpressionListNode {

	/* package-local */ RelationalORExpressionNode(EObject emfASTNode, List<Node> nodes) {
		super(emfASTNode, nodes);
	}

	@Override
	public NodeEvalResult evaluate(final DataObject root) throws ScriptExcecutionException {
		Iterator<Node> it = elements.iterator();
		Boolean result = it.next().evaluate(root).asBoolean();
		if (result) {
			// Short Circuiting!  If the first node already evaluates to true, stop and return true!
			return BooleanNode.TRUE;
		}
		while (it.hasNext()) {
			result |= it.next().evaluate(root).asBoolean();
			if (result) {
				return BooleanNode.TRUE;  // Short Circuiting again
			}
		}
		return BooleanNode.valueOf(result);
	}
}

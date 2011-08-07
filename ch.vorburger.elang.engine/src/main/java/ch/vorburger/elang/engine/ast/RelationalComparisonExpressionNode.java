package ch.vorburger.elang.engine.ast;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * AST Node holding Equals, NotEquals, Greater Than, Less Than, etc. Expressions.
 * 
 * @see AdditionSubtractionMultiplyingDividingExpressionNode
 *  
 * @author Michael Vorburger
 */
/* package-local */ final class RelationalComparisonExpressionNode extends AbstractOperationNode {

	// Note to Code readers: As the JavaDoc above says, @see AdditionSubtractionMultiplyingDividingExpressionNode !

	private enum Operation /* implements OperationWithEval */ {
		  EQUALS { boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException { return x.isEqual(y); } },
		  NOT_EQ { boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException { return !x.isEqual(y); } },
		  LT     { boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException { return x.compare(y) < 0; } },
		  GT     { boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException { return x.compare(y) > 0; } },
		  LTE    { boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException { return x.compare(y) < 1; } },
		  GTE    { boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException { return x.compare(y) > -1; } };

		  abstract boolean eval(NodeEvalResult x, NodeEvalResult y) throws ScriptExcecutionException;
		}
	
	static private final Map<String, Operation> mappings = new HashMap<String, Operation>();
	static {
		mappings.put("=", Operation.EQUALS);
		mappings.put("==", Operation.EQUALS);
		mappings.put("!=", Operation.NOT_EQ);
		mappings.put("<>", Operation.NOT_EQ);
		mappings.put("<", Operation.LT);
		mappings.put(">", Operation.GT);
		mappings.put("<=", Operation.LTE);
		mappings.put(">=", Operation.GTE);
		mappings.put("!>", Operation.LTE);
		mappings.put("!<", Operation.GTE);
	}

	private final Operation operation;
	private final Node lnode;
	private final Node rnode;

	
	public RelationalComparisonExpressionNode(EObject emfASTNode, Node lnode, String operator, Node rnode) {
		super(emfASTNode);
		
		operation = mappings.get(operator);
		if ( operation == null ) {
			throw new AssertionError("Grammer Programming Error; the parser gave me an operator that I don't know what to do with: " + operator);
		}
		this.lnode = lnode;
		this.rnode = rnode;
	}

	@Override
	public NodeEvalResult evaluate(final DataObject root) throws ScriptExcecutionException {
		NodeEvalResult l = lnode.evaluate(root);
		NodeEvalResult r = rnode.evaluate(root);
		boolean result = operation.eval(l,r);
		return BooleanNode.valueOf(result);
		// TODO Short Circuiting is not possible here - or is it?!
	}

}

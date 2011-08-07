package ch.vorburger.elang.engine.ast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * AST Node holding an Addition, Subtraction, Multiplication or Division Expression.
 * The implementation is actually not a binary tree with Nodes of two other nodes, but holding a List (of Terms).
 * 
 * <p>Note that "operator precendence" WILL be respected; an expression like "1+1/2" will lead be broken
 * up into TWO AdditionSubtractionMultiplyingDividingExpressionNode instances by the parser, one for the
 * addition(s) and another one for division(s).</p>
 * @see ASTTranslator
 *  
 * @author Michael Vorburger
 */
/* package-local */ class AdditionSubtractionMultiplyingDividingExpressionNode extends AbstractExpressionListWithOperatorsNode {
	
	// @see http://java.sun.com/j2se/1.5.0/docs/guide/language/enums.html
	private enum Operation /* implements OperationWithEval */ {
		  PLUS   { public double eval(double x, double y) { return x + y; } },
		  MINUS  { public double eval(double x, double y) { return x - y; } },
		  TIMES  { public double eval(double x, double y) { return x * y; } },
		  DIVIDE { public double eval(double x, double y) { return x / y; } };
		  
		  abstract double eval(double x, double y);
		}
	
	static private final Map<String, Object> mappings = new HashMap<String, Object /* Operation ? OperationWithEval*/>();
	static {
		mappings.put("+", Operation.PLUS);
		mappings.put("-", Operation.MINUS);
		mappings.put("*", Operation.TIMES);
		mappings.put("/", Operation.DIVIDE);
	}
	
	private final List<Operation /*OperationWithEval*/> operations;

	/* package-local */ @SuppressWarnings("unchecked")
	AdditionSubtractionMultiplyingDividingExpressionNode(EObject emfASTNode, List<Node> terms, List<String> operators) {
		super(emfASTNode, terms);
		operations = initializeOperations(terms.size(), operators, mappings);
	}

	@Override
	public NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		Iterator<Node> it = elements.iterator();
		Double result = it.next().evaluate(root).asDouble();
		int i = 0;
		while (it.hasNext()) {
			// How dumb of Java that there is no Number.add(Number) !  Could be optimized, e.g. if both Integer..
			result = operations.get(i++).eval(result, it.next().evaluate(root).asDouble());
		}
		return new NumberNode(this, result);
	}
}

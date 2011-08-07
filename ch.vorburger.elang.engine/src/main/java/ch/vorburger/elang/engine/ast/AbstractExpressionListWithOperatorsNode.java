package ch.vorburger.elang.engine.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * Abstract Node for expressions of lists of things with operators between them.
 *
 * @author Michael Vorburger
 */
/* package-local */ abstract class AbstractExpressionListWithOperatorsNode extends AbstractExpressionListNode {

//	protected interface OperationWithEval {
//		double eval(double x, double y);
//	}

	protected AbstractExpressionListWithOperatorsNode(EObject emfASTNode, List<Node> expressionElements) {
		super(emfASTNode, expressionElements);
	}

	@SuppressWarnings("unchecked")
	protected List/*<OperationWithEval>*/ initializeOperations(int sizeOfTerms, List<String> operators, Map<String, Object /*OperationWithEval*/> mapping) {
		if ( !(sizeOfTerms == operators.size() + 1) ) {
			throw new AssertionError("Grammer Programming Error; this ExpressionNode has " + sizeOfTerms + " expressions but " + operators.size() + " operators between them; that can't be!?");
		}
		List/*<OperationWithEval>*/ ops = new ArrayList/*<OperationWithEval>*/(sizeOfTerms - 1);
		for (String operatorString : operators) {
			Object /*OperationWithEval*/ op = mapping.get(operatorString);
			if (op==null) {
				throw new AssertionError("Grammer Programming Error; the parser gave me an operator that's not a '+' or a '-', but a " + operatorString);
			}
			ops.add(op);
		}
		return ops;
	}

}
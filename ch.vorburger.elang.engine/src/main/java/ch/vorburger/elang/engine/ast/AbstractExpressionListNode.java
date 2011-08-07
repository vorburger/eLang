package ch.vorburger.elang.engine.ast;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Abstract Node for expressions of lists of things.
 *
 * @see AdditionSubtractionMultiplyingDividingExpressionNode
 * @see MultiplyOrDivideExpressionNode
 * 
 * @author Michael Vorburger
 */
/* package-local */ abstract class AbstractExpressionListNode extends AbstractOperationNode {

	protected final List<Node> elements;

	/* package-local */ AbstractExpressionListNode(EObject emfASTNode, List<Node> expressionElements) {
		super(emfASTNode);
		this.elements = expressionElements;
	}
}
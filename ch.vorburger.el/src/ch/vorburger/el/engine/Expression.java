package ch.vorburger.el.engine;

import org.eclipse.xtext.xbase.XExpression;

/**
 * Expression.
 *
 * @see ExpressionFactory
 * @author Michael Vorburger
 * @author Kai Kreuzer
 */
public interface Expression {

	XExpression getXExpression();
	
	String generateJavaCode(Class<?> expectedType);
	
	/**
	 * Disposes "resources" held if Expression no longer needed.
	 * For EObject/Resource, which will not get automatically garbage collected
	 * as long as the global EMF ResourceSet which created it is still around. 
	 */
	void dispose();
}

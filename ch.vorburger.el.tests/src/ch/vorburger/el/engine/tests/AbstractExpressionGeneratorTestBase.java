package ch.vorburger.el.engine.tests;

import static org.junit.Assert.assertEquals;
import ch.vorburger.el.engine.Expression;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.ExpressionParsingException;

/**
 * Abstract base class for testing EL code generation.
 *
 * @author Michael Vorburger
 */
public abstract class AbstractExpressionGeneratorTestBase extends AbstractExpressionTestBase {

	public AbstractExpressionGeneratorTestBase(ExpressionFactory expressionFactory) {
		super(expressionFactory);
	}

	protected void checkGeneration(String expressionText, Class<?> expectedType, ExpressionContext context, String expectedGeneratedJavaCode) throws ExpressionParsingException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		String genJavaCode = expression.generateJavaCode(expectedType);
		expression.dispose();
		assertEquals(expectedGeneratedJavaCode, genJavaCode.trim());
	}

}

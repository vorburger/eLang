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

	protected void checkGeneration(String expressionText, String expectedGeneratedJavaCode) throws ExpressionParsingException {
		checkGeneration(expressionText, null, expectedGeneratedJavaCode);
	}

	protected void checkGeneration(String expressionText, ExpressionContext context, String expectedGeneratedJavaCode) throws ExpressionParsingException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		String genJavaCode = expression.generateJavaCode();
		assertEquals(expectedGeneratedJavaCode, genJavaCode.trim());
	}

}

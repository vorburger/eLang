package ch.vorburger.el.engine.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.vorburger.el.engine.Expression;
import ch.vorburger.el.engine.ExpressionCompilationException;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.ExpressionParsingException;

/**
 * Basic Tests for the Expression Engine.
 * This tests will "generate" expressions.
 * 
 * @author Michael Vorburger
 */
public class BasicExpressionGeneratorTest {

	protected final ExpressionFactory expressionFactory;

	public BasicExpressionGeneratorTest() {
		super();
		this.expressionFactory = new ExpressionFactory();
	}
	
	protected void checkGeneration(String expressionText, String expectedGeneratedJavaCode) throws ExpressionParsingException, ExpressionCompilationException {
		checkGeneration(expressionText, null, expectedGeneratedJavaCode);
	}

	protected void checkGeneration(String expressionText, ExpressionContext context, String expectedGeneratedJavaCode) throws ExpressionParsingException, ExpressionCompilationException {
		Expression expression = expressionFactory.newExpressionFromString(expressionText, context);
		String genJavaCode = expression.generateJavaCode();
		assertEquals(expectedGeneratedJavaCode, genJavaCode.trim());
	}

	@Test
	public void testNumberLiteral() throws Exception {
		checkGeneration("23.7", "return new java.math.BigDecimal(\"23.7\");");
	}

}

package ch.vorburger.el.engine.tests;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;


/**
 * Basic Tests for the Expression Engine which use variables.
 * 
 * @author Kai Kreuzer
*/
public class ExpressionWithContextTest extends AbstractExpressionTestBase {
	
	public ExpressionWithContextTest() {
		super(new ExpressionFactory());
	}

	protected ExpressionWithContextTest(ExpressionFactory expressionFactory) {
		super(expressionFactory);
	}

	@Test
	public void testVariableNumericLiterals() throws Exception {
		ExpressionContext context = new ExpressionContext();
		context.putInstance("a", 1);
		context.putInstance("b", 2);
		
		checkNumericExpression("a", context, 1);
		checkNumericExpression("b", context, 2);
		checkNumericExpression("a+b", context, 3);
		checkNumericExpression("a-b", context, -1);
		checkNumericExpression("a/b", context, new BigDecimal(0.5));
	}

}

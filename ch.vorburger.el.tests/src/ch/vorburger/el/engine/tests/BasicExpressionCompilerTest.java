package ch.vorburger.el.engine.tests;

/**
 * Basic Tests for the Expression Engine, using the expression compilation
 * 
 * @author Kai Kreuzer
 */
public class BasicExpressionCompilerTest extends BasicExpressionTest {

		public BasicExpressionCompilerTest() {
			expressionFactory.setAlwaysCompile(true);
		}
}

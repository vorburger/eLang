package ch.vorburger.el.engine.tests;

import java.math.BigDecimal;

import org.junit.Test;

import ch.vorburger.el.engine.ExpressionFactory;

/**
 * Basic Tests for the Expression Engine.
 * These tests will assert corrected of Java Code generated from EL expressions.
 * 
 * @author Michael Vorburger
 */
public class BasicExpressionGeneratorTest extends AbstractExpressionGeneratorTestBase {

	public static final String testNumberLiteral = "new org.eclipse.xtext.xbase.lib.Functions.Function0<java.math.BigDecimal>() {\n  public java.math.BigDecimal apply() {\n    return new java.math.BigDecimal(\"23.7\");\n  }\n}.apply()";
	public static final String testNotNull = "new org.eclipse.xtext.xbase.lib.Functions.Function0<Boolean>() {\n  public Boolean apply() {\n    boolean _equals = com.google.common.base.Objects.equal(\"Saluton\", null);\n    return _equals;\n  }\n}.apply()";
	public static final String testIfExpression = "new org.eclipse.xtext.xbase.lib.Functions.Function0<Boolean>() {\n  public Boolean apply() {\n    boolean _xifexpression = false;\n    if (true) {\n      _xifexpression = true;\n    } else {\n      _xifexpression = false;\n    }\n    return _xifexpression;\n  }\n}.apply()";
	
	public BasicExpressionGeneratorTest() {
		super(new ExpressionFactory());
	}

	@Test
	public void testNumberLiteral() throws Exception {
		checkGeneration("23.7", BigDecimal.class, testNumberLiteral);
	}

	@Test
	public void testNotNull() throws Exception {
		checkGeneration("\"Saluton\" == null", Boolean.class, testNotNull);
	}

	@Test
	public void testIfExpression() throws Exception {
		checkGeneration("if (true) true else false", Boolean.class, testIfExpression);
	}

}

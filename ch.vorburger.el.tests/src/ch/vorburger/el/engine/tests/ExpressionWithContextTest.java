package ch.vorburger.el.engine.tests;



import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Ignore;
import org.junit.Test;

import ch.vorburger.el.engine.DynamicExpressionContext;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.tests.helper.ECoreHelper;


/**
 * Basic Tests for the Expression Engine which use variables.
 * 
 * @author Kai Kreuzer
*/
public class ExpressionWithContextTest extends AbstractExpressionTestBase {
	
	private static ECoreHelper helper = new ECoreHelper();
	
	public ExpressionWithContextTest() {
		super(new ExpressionFactory());
	}

	protected ExpressionWithContextTest(ExpressionFactory expressionFactory) {
		super(expressionFactory);
	}

	@Test
	@Ignore
	public void testNumericVariableTypes() throws Exception {
		ExpressionContext context = new ExpressionContext();
		context.putInstance("a", 1);
		context.putInstance("b", 2);
		
		checkNumericExpression("a", context, 1);
		checkNumericExpression("b", context, 2);
		checkNumericExpression("a+b", context, 3);
		checkNumericExpression("a-b", context, -1);
		checkNumericExpression("a*b", context, 2);
		checkNumericExpression("a/b", context, new BigDecimal(0.5));
	}

	@Test
	public void testNumericVariableDynTypes() throws Exception {
		EDataType intType = EcorePackage.eINSTANCE.getEInt();

		EPackage pkg = helper.createPackage("tests");
		EClass clazz = helper.createClass(pkg, "NumericTests");
		
		helper.addAttribute(clazz, intType, "a");
		helper.addAttribute(clazz, intType, "b");

		EObject instance = helper.createInstance(clazz);
		helper.setProperty(instance, "a", 5);
		helper.setProperty(instance, "b", 2);

		DynamicExpressionContext context = new DynamicExpressionContext();
		context.putInstance("x", instance);
		
		checkNumericExpression("x.a", context, 5);
		checkNumericExpression("x.b", context, 2);
		checkNumericExpression("x.a+x.b", context, 7);
		checkNumericExpression("x.a-x.b", context, 3);
		checkNumericExpression("x.a*x.b", context, 10);
		checkNumericExpression("x.a/x.b", context, new BigDecimal(2.5));
	}
}

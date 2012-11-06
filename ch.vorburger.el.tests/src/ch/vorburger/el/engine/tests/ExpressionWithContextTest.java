package ch.vorburger.el.engine.tests;



import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.Test;

import ch.vorburger.el.engine.DynamicExpressionContext;
import ch.vorburger.el.engine.Expression;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.tests.helper.ECoreHelper;


/**
 * Basic Tests for the Expression Engine which use variables.
 * 
 * @author Kai Kreuzer
*/
public class ExpressionWithContextTest extends AbstractExpressionInterpreterTestBase {
	
	private static ECoreHelper helper = new ECoreHelper();
	
	public ExpressionWithContextTest() {
		super(new ExpressionFactory());
	}

	protected ExpressionWithContextTest(ExpressionFactory expressionFactory) {
		super(expressionFactory);
	}

	@Test
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
		EClass embeddedClass = helper.createClass(pkg, "EmbeddedClass");
		helper.addAttribute(embeddedClass, intType, "x");
		helper.addAttribute(embeddedClass, embeddedClass, "y");
		
		helper.addAttribute(clazz, intType, "a");
		helper.addAttribute(clazz, intType, "b");
		helper.addAttribute(clazz, embeddedClass, "c");

		EObject instance = helper.createInstance(clazz);
		EObject c = helper.createInstance(embeddedClass);
		helper.setProperty(instance, "a", 5);
		helper.setProperty(instance, "b", 2);
		helper.setProperty(instance, "c", c);
		helper.setProperty(c, "x", 3);
		helper.setProperty(c, "y", EcoreUtil2.clone(c));

		DynamicExpressionContext context = new DynamicExpressionContext();
		context.putInstance("t", instance);
		
		checkNumericExpression("t.a", context, 5);
		checkNumericExpression("t.b", context, 2);
		checkNumericExpression("t.c.x", context, 3);
		checkNumericExpression("t.c.y.x", context, 3);
		checkNumericExpression("t.a+t.b", context, 7);
		checkNumericExpression("t.a-t.b", context, 3);
		checkNumericExpression("t.a*t.b", context, 10);
		checkNumericExpression("t.a/t.b", context, new BigDecimal(2.5));
		checkNumericExpression("t.c.x+t.c.x*t.b", context, 9);
	}

	@Test
	public void testCompareDynTypes() throws Exception {
		EDataType intType = EcorePackage.eINSTANCE.getEInt();

		EPackage pkg = helper.createPackage("tests");
		EClass clazzA = helper.createClass(pkg, "TestA");
		EClass clazzB = helper.createClass(pkg, "TestB");
		helper.addAttribute(clazzA, intType, "p");
		helper.addAttribute(clazzB, intType, "p");
		
		EObject instanceA = helper.createInstance(clazzA);
		EObject instanceB = helper.createInstance(clazzB);

		helper.setProperty(instanceA, "p", 1);
		helper.setProperty(instanceB, "p", 2);

		DynamicExpressionContext context = new DynamicExpressionContext();
		context.putInstance("a", instanceA);
		context.putInstance("b", instanceB);
		
		checkBooleanExpression("a.p>b.p", context, false);
	}
	
	@Test
	public void testDynEnums() throws Exception {
		EPackage pkg = helper.createPackage("tests");
		EEnum enumType = helper.createEnum(pkg, "TestEnum");
		EEnumLiteral enumLiteral = helper.addEnumLiteral(enumType, "YES");
		EClass clazz = helper.createClass(pkg, "ClassWithEnumAttribute");
		helper.addAttribute(clazz, enumType, "p");

		EObject instance1 = helper.createInstance(clazz);
		helper.setProperty(instance1, "p", enumLiteral);
		
		DynamicExpressionContext context = new DynamicExpressionContext();
		context.addDeclaredType(enumType);
		context.putInstance("a", instance1);
		
		checkBooleanExpression("a.p==tests::TestEnum::YES", context, true);
		checkBooleanExpression("a.p==TestEnum::YES", context, true);
	}
	
	@Test
	public void testExpressionParsingWithDynTypes() throws Exception {
		EPackage pkg = helper.createPackage("tests");
		EClass clazz = helper.createClass(pkg, "DynamicClass");
		
		ExpressionFactory factory = new ExpressionFactory();

		DynamicExpressionContext parsingContext = new DynamicExpressionContext();
		parsingContext.putType("a", clazz);
		Expression expression = factory.newExpressionFromString("a", parsingContext);

		DynamicExpressionContext executingContext = new DynamicExpressionContext();
		EObject a = helper.createInstance(clazz);
		executingContext.putInstance("a", a);
		EObject aa = (EObject) expression.evaluate(executingContext);
		assertEquals(a, aa);
	}
	
	// TODO More tests using static Java classes instead of dyn types - which should also still work... (but probably wont yet) 
}

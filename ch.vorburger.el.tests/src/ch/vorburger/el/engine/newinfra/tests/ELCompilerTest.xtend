package ch.vorburger.el.engine.newinfra.tests

import ch.vorburger.el.ELInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.*
import java.math.BigDecimal
import ch.vorburger.el.engine.tests.BasicExpressionGeneratorTest

/**
 * This tests exactly the same as the BasicExpressionGeneratorTest,
 * but is using the standard Xtext JUnit helper utils, instead of
 * the EL wrapper code. - This helped to find a discrepancy
 * during the upgrade from Xtext v2.3.1 to v2.4.3. 
 * 
 * @author Michael Vorburger
 */
@RunWith(XtextRunner)
@InjectWith(ELInjectorProvider)
class ELCompilerTest {
	
	// TODO double check make to make sure this compiles on build... 
	// TODO split this into 2 tests.. one to verify the .java class generator..
	
	@Inject extension CompilationTestHelper
	
	@Inject JvmTypesBuilder jvmTypesBuilder;
	@Inject extension ParseHelper<XExpression>
	@Inject extension ValidationTestHelper
	@Inject XbaseCompiler compiler
	
	def void checkCompilation(String expression, Class<?> expectedType, String expectedJava) {
		checkCompilationViaDirectCompilerCall(expression, expectedType, expectedJava)
		// TODO checkCompilationViaGenerator(expression, expectedType, expectedJava)
	}

	def void checkCompilationViaGenerator(String expression, Class<?> expectedType, String expectedJava) {
		expression.compile [ assertEquals(expectedJava, getSingleGeneratedCode) ]		
	}

	def void checkCompilationViaDirectCompilerCall(String expression, Class<?> expectedJavaType, String expectedJava) {
		val xExpression = expression.parse
		xExpression.assertNoErrors
		
		val expectedJvmType = jvmTypesBuilder.newTypeRef(xExpression, expectedJavaType)		
		
		// ch.vorburger.el.engine.ExpressionImpl.generateJavaCode(Class<?>)
		val ImportManager importManager = new ImportManager(false);
		val FakeTreeAppendable appendable = new FakeTreeAppendable(importManager);
		val actualJava = compiler.compileAsJavaExpression(xExpression, appendable, expectedJvmType).toString();
		
		assertEquals(expectedJava, actualJava)
	}
	
	@Test
	def void testNumberLiteral() {
		checkCompilation('''23.7''', BigDecimal, BasicExpressionGeneratorTest.testNumberLiteral);
	}

	@Test
	def void testNotNull() {
		checkCompilation('''"Saluton" == null''', Boolean, BasicExpressionGeneratorTest.testNotNull)
	}

	@Test
	def void testIfExpression() {
		checkCompilation('''if (true) true else false''', Boolean, BasicExpressionGeneratorTest.testIfExpression);
	}
}
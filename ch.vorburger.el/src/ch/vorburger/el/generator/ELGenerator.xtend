/*
 * generated by Xtext
 */
package ch.vorburger.el.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.ImportManager

class ELGenerator implements IGenerator {
		
	@Inject ELCompiler elCompiler
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val XExpression expr = resource.contents.filter(typeof(XExpression)).head;
		fsa.generateFile("CompiledExpression.java",	expr.compile);
	}
	
	def compile(XExpression e) ''' 
		�val importManager = new ImportManager(true)�
		import ch.vorburger.el.engine.*;
		import ch.vorburger.el.lib.*;
		import org.eclipse.xtext.xbase.lib.*;
		import java.math.BigDecimal;
		import java.util.GregorianCalendar;
		import java.util.Calendar;
		�FOR i:importManager.imports�
			import �i�;
		�ENDFOR�
		
		public class CompiledExpression extends AbstractExpression {
			public Object evaluate() throws ExpressionExecutionException {
				�elCompiler.compile(e, importManager)�
			}
		}
	'''	
}

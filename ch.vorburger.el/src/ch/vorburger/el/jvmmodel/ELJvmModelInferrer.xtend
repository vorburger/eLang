package ch.vorburger.el.jvmmodel

import ch.vorburger.el.engine.ExpressionContext
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class ELJvmModelInferrer implements IJvmModelInferrer {

	@Inject extension TypeReferences

	@Inject extension JvmTypesBuilder

	override infer(EObject rootExpression, extension IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (rootExpression instanceof XExpression) {
			val expressionContext = rootExpression.eAdapters.filter(ExpressionContext).head
			rootExpression.toClass('ch.vorburger.el.jvmmodel.Dummy').accept.initializeLater [
				members += rootExpression.toMethod('dummy', expressionContext?.type?.createTypeRef) [
					if (expressionContext != null) {
						for (variableName : expressionContext.variableNames) {
							val variableType = expressionContext.getVariableType(variableName).createTypeRef
							parameters += rootExpression.toParameter(variableName, variableType)
						}
					}
					body = rootExpression
				]
			]
		}
	}

}

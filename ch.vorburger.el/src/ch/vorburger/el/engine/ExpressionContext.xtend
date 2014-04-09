package ch.vorburger.el.engine

import org.eclipse.emf.ecore.util.EContentAdapter
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference

/**
 * <p>An {@link ExpressionContext} provides variables that should be available during the expression
 * parsing and/or execution.</p>
 * 
 * <p>These variables are put into the context as {@link JvmType}s.</p>
 * 
 * <p>Furthermore, the valid type of an expression can be constrained. 
 * This constraint is already checked at parsing time, not merely during execution.</p>
 */
class ExpressionContext extends EContentAdapter {

	@Property JvmTypeReference type

	val variables = <String, JvmTypeReference>newHashMap

	def addVariable(String name, JvmTypeReference type) {
		variables.put(name, type)
	}

	def getVariableNames() {
		variables.keySet
	}

	def getVariableType(String name) {
		variables.get(name)
	}

	def removeVariable(String name) {
		variables.remove(name)
	}

	def removeVaraibles() {
		variables.clear
	}

	override isAdapterForType(Object type) {
		type == ExpressionContext
	}

}

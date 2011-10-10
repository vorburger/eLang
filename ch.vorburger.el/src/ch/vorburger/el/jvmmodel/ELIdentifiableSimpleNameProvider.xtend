package ch.vorburger.el.jvmmodel

import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmIdentifiableElement

class ELIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
	
//	def dispatch getSimpleName(JvmType element) {
//		return "this";
//	}
	
	override getSimpleName(JvmIdentifiableElement element) {
		return super.getSimpleName(element);
	}
}
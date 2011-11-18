package ch.vorburger.el.jvmmodel

import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider

class ELIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
	
//	def dispatch getSimpleName(JvmType element) {
//		return "this";
//	}
	
	override getSimpleName(JvmIdentifiableElement element) {
		return super.getSimpleName(element);
	}
}
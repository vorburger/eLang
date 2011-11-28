package ch.vorburger.el.typing

import com.google.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.naming.IQualifiedNameProvider

class Ecore2JvmTypeMapper {
	
	@Inject extension ELJvmTypesBuilder jvmTypesBuilder
	@Inject extension IQualifiedNameProvider

	def map(EClass eClass, ResourceSet rs) {
		eClass.toClass(eClass.fullyQualifiedName) [
			for(feature : eClass.EStructuralFeatures) {
				members += mapFeature(feature, rs)
			}
		]
	}

	def dispatch mapFeature(EAttribute eAttr, ResourceSet rs) {
		eAttr.toField(eAttr.name, newTypeRef(rs, mapType(eAttr.EType.fullyQualifiedName.toString))) [
			visibility = JvmVisibility::PUBLIC
		]
	}

	def dispatch mapFeature(EReference eRef, ResourceSet rs) {
		eRef.toField(eRef.name, newTypeRef(rs, mapType(eRef.EType.fullyQualifiedName.toString))) [
			visibility = JvmVisibility::PUBLIC
		]
	}

	def mapType(String typeName) {
		switch(typeName) {
			case "ecore.EInt" : "java.math.BigDecimal" 
			default: typeName			
		}
	}
}
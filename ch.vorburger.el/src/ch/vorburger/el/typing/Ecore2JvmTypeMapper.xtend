package ch.vorburger.el.typing

import com.google.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.EDataType

class Ecore2JvmTypeMapper {
	
	@Inject extension ELJvmTypesBuilder jvmTypesBuilder
	@Inject extension IQualifiedNameProvider

	def dispatch map(EClass eClass, ResourceSet rs) {
		eClass.toClass(rs, eClass.fullyQualifiedName.toString) [
			for(feature : eClass.EStructuralFeatures) {
				members += mapFeature(feature, rs)
			}
			documentation = "Dynamic Type " + eClass.name
			for(superType : eClass.ESuperTypes) {
				superTypes += newTypeRef(rs, superType.fullyQualifiedName.toString)
			}
		]
	}

	def dispatch map(EDataType eDatatype, ResourceSet rs) {
		eDatatype.toClass(rs, eDatatype.fullyQualifiedName.toString) []
	}

	def dispatch mapFeature(EAttribute eAttr, ResourceSet rs) {
		eAttr.toField(eAttr.name, newTypeRef(rs, mapType(eAttr.EType.fullyQualifiedName.toString))) [
			visibility = JvmVisibility::PUBLIC
			documentation = "Dynamic Property " + eClass.name
		]
	}

	def dispatch mapFeature(EReference eRef, ResourceSet rs) {
		eRef.toField(eRef.name, newTypeRef(rs, mapType(eRef.EType.fullyQualifiedName.toString))) [
			visibility = JvmVisibility::PUBLIC
			documentation = "Dynamic Property " + eClass.name
		]
	}

	def mapType(String typeName) {
		switch(typeName) {
			case "ecore.EInt"           : "java.math.BigDecimal" 
			case "ecore.EShort"         : "java.math.BigDecimal" 
			case "ecore.ELong"          : "java.math.BigDecimal" 
			case "ecore.EFloat"         : "java.math.BigDecimal" 
			case "ecore.EDouble"        : "java.math.BigDecimal" 
			case "ecore.EIntegerObject" : "java.math.BigDecimal" 
			case "ecore.EShortObject"   : "java.math.BigDecimal" 
			case "ecore.ELongObject"    : "java.math.BigDecimal" 
			case "ecore.EFloatObject"   : "java.math.BigDecimal" 
			case "ecore.EDoubleObject"  : "java.math.BigDecimal" 
			case "ecore.EDate"          : "java.util.GregorianCalendar" 
			case "ecore.EBoolean"       : "java.lang.Boolean" 
			case "ecore.EBooleanObject" : "java.lang.Boolean"
			case "ecore.EString"        : "java.lang.String"
			default: typeName			
		}
	}
}
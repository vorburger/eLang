package ch.vorburger.el.typing

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider

class Ecore2JvmTypeMapper {
	
	@Inject extension JvmTypesBuilder jvmTypesBuilder
	@Inject extension IQualifiedNameProvider

	def dispatch map(EClass eClass) {
		eClass.toClass(eClass.fullyQualifiedName) [
			for(feature : eClass.EStructuralFeatures) {
				members += mapFeature(feature)
			}
		]
	}

	def dispatch mapFeature(EAttribute eAttr) {
		eAttr.toField(eAttr.name, newTypeRef(eAttr.EType, eAttr.EType.fullyQualifiedName.toString))
	}

	def dispatch mapFeature(EReference eRef) {
		eRef.toField(eRef.name, newTypeRef(eRef.EType, eRef.EType.fullyQualifiedName.toString))
	}

	def dispatch mapFeature(EStructuralFeature eFeature) {
		null
	}
	
	def dispatch map(EClassifier eClassifier) {
		null
	}
	
	def createTypeRef(EClassifier eClassifier) {
		
	}

}
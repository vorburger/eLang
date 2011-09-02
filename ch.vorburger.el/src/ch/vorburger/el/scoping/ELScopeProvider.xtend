package ch.vorburger.el.scoping

import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.resource.EObjectDescription
import java.util.Collections
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.MapBasedScope
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.EcoreUtil2
import com.google.inject.Inject
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext
import org.eclipse.xtext.common.types.TypesFactory

class ELScopeProvider extends XbaseScopeProvider {

	@Inject extension IJvmModelAssociations associations
	
	@Inject TypesFactory typesFactory
	
	
	override IScope createLocalVarScope(IScope parent, LocalVariableScopeContext scopeContext) {
		return super.createLocalVarScope(parent, scopeContext)
	}

}
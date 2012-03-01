package ch.vorburger.el.scoping;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import ch.vorburger.el.engine.DynamicExpressionContext;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.typing.ELJvmTypeProvider;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class ELScopeProvider extends XbaseScopeProvider {

	@Inject
	private IJvmTypeProvider.Factory typeProviderFactory;

	@Override
	protected IScope createTypeScope(EObject obj, EReference reference) {
		IScope superScope =  super.createTypeScope(obj, reference);
		
		// get the jvm type provider
		Resource resource = obj.eResource();
		IJvmTypeProvider provider = typeProviderFactory.findOrCreateTypeProvider(resource.getResourceSet());

		// get the expression context
		ExpressionContext context = getExpressionContext(resource);
		
		Collection<IEObjectDescription> varDescs = new HashSet<IEObjectDescription>();
		
		// add types to scope
		if (context != null) {
			// first scan the declared static (Java) types
			for(Type type : context.getDeclaredTypes()) {
				String typeName = ((Class)type).getCanonicalName();
				JvmType varType = provider.findTypeByName(typeName);
				if(varType!=null) {
					QualifiedName qname = QualifiedName.create(typeName.split("\\."));
					varDescs.add(EObjectDescription.create(qname, varType));
				}
			}
			if(context instanceof DynamicExpressionContext && provider instanceof ELJvmTypeProvider) {
				DynamicExpressionContext dynContext = (DynamicExpressionContext) context;
				for(EClassifier classifier : dynContext.getDeclaredDynTypes()) {
					JvmType varType = ((ELJvmTypeProvider)provider).findTypeByEclassifier(classifier);
					if(varType!=null) {
						QualifiedName qname = QualifiedName.create(varType.getQualifiedName().split("\\."));
						varDescs.add(EObjectDescription.create(qname, varType));
					}
				}
			}
		}
		return MapBasedScope.createScope(superScope, varDescs);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public IScope createSimpleFeatureCallScope(EObject callContext,
			EReference reference, Resource resource,
			boolean includeCurrentBlock, int idx) {
		IScope scope = super.createSimpleFeatureCallScope(callContext, reference, resource,
				includeCurrentBlock, idx);

		// we only provide root targets as features, but no member feature calls
		if(callContext instanceof XMemberFeatureCall) {
			return scope;
		}

		// do not care about calls that are done on some declared type
		if(callContext instanceof XFeatureCall) {
			XFeatureCall featureCall = (XFeatureCall) callContext;
			if(featureCall.getDeclaringType()!=null) {
				return scope;
			}
		}

		IJvmTypeProvider provider = typeProviderFactory.findOrCreateTypeProvider(resource.getResourceSet());
		
		// get the expression context
		ExpressionContext context = getExpressionContext(resource);
		
		Collection<IEObjectDescription> varDescs = new HashSet<IEObjectDescription>();
		
		if (context != null) {
			// iterate over all instances
			for (String elementName : context.getVariableNames()) {
				QualifiedName varName = QualifiedName.create(elementName);
				JvmType varType = null;
				Type staticType = context.getType(elementName);
				if(staticType!=null) {
					String typeName = ((Class)staticType).getCanonicalName();
					varType = provider.findTypeByName(typeName);
				} else if(context instanceof DynamicExpressionContext && provider instanceof ELJvmTypeProvider) {
					DynamicExpressionContext dynContext = (DynamicExpressionContext) context;
					EClassifier dynType = dynContext.getDynType(elementName);
					varType = ((ELJvmTypeProvider)provider).findTypeByEclassifier(dynType);
				}
				if(varType!=null) {
					varDescs.add(EObjectDescription.create(varName, varType));
				}
			}
		}

		scope = MapBasedScope.createScope(scope, varDescs);

		return scope;
	}

	public static ExpressionContext getExpressionContext(Resource resource) {
		ExpressionContext context = null;
		for(Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof ExpressionContext) {
				context = (ExpressionContext) adapter;
				break;
			}
		}
		return context;
	}
}
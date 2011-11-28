package ch.vorburger.el.scoping;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
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
	protected IScope createFeatureCallScope(XAbstractFeatureCall call,
			EReference reference) {
		IScope superScope =  super.createFeatureCallScope(call, reference);
		Resource resource = call.eResource();
		IJvmTypeProvider provider = typeProviderFactory
				.findOrCreateTypeProvider(resource.getResourceSet());

		ExpressionContext context = null;
		for(Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof ExpressionContext) {
				context = (ExpressionContext) adapter;
			}
		}
		
		Collection<IEObjectDescription> varDescs = new HashSet<IEObjectDescription>();
		if (context != null) {
			for (String elementName : context.getElementNames()) {
				QualifiedName varName = QualifiedName.create(elementName);
				JvmType varType = null;
				Class<? extends Object> staticType = context.getType(elementName);
				if(staticType!=null) {
					String typeName = staticType.getCanonicalName();
					varType = provider.findTypeByName(typeName);
				} else if(context instanceof DynamicExpressionContext && provider instanceof ELJvmTypeProvider) {
					DynamicExpressionContext dynContext = (DynamicExpressionContext) context;
					EClass dynType = dynContext.getDynType(elementName);
					varType = ((ELJvmTypeProvider)provider).findTypeByEclass(dynType);
				}
				if(varType!=null) {
					varDescs.add(EObjectDescription.create(varName, varType));
				}
			}
		}

		return MapBasedScope.createScope(superScope, varDescs);
	}
}
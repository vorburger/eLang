package ch.vorburger.el.scoping;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import ch.vorburger.el.engine.VarTypeAdapter;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class ELScopeProvider extends XbaseScopeProvider {

	@Inject
	private IJvmTypeProvider.Factory typeProviderFactory;

	@Override
	protected IScope createStaticScope(EObject context, Resource resource,
			IScope parent) {
		IScope superScope = super.createStaticScope(context, resource, parent);

		IJvmTypeProvider provider = typeProviderFactory
				.findOrCreateTypeProvider(resource.getResourceSet());

		Map<String, Class<? extends Object>> varTypes = new HashMap<String, Class<? extends Object>>();
		for(Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof VarTypeAdapter) {
				varTypes = ((VarTypeAdapter) adapter).getVarTypes();
			}
		}
		
		Collection<IEObjectDescription> varDescs = new HashSet<IEObjectDescription>();
		if (varTypes != null) {
			for (Map.Entry<String, Class<? extends Object>> entry : varTypes.entrySet()) {
				QualifiedName varName = QualifiedName.create(entry.getKey());
				JvmType varType = provider.findTypeByName(entry.getValue()
						.getCanonicalName());
				varDescs.add(EObjectDescription.create(varName, varType));
			}
		}

		return MapBasedScope.createScope(superScope, varDescs);
	}
}
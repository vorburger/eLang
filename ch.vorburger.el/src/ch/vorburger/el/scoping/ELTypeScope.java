package ch.vorburger.el.scoping;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScope;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import ch.vorburger.el.engine.DynamicExpressionContext;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.typing.ELJvmTypeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class ELTypeScope extends AbstractTypeScope {

	public ELTypeScope(IJvmTypeProvider typeProvider,
			IQualifiedNameConverter qualifiedNameConverter,
			Predicate<IEObjectDescription> filter) {
		super(typeProvider, qualifiedNameConverter, filter);
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetAllElements() {
		ResourceSet rs = getTypeProvider().getResourceSet();
		if (rs == null)
			return Collections.emptyList();
		final List<IEObjectDescription> allScopedElements = Lists.newArrayListWithExpectedSize(1000);
		for(Adapter adapter : rs.eAdapters()) {
			if (adapter instanceof ExpressionContext) {
				ExpressionContext context = (ExpressionContext) adapter;
				for(String elementName : context.getElementNames()) {
					Type type = context.getType(elementName);
					IEObjectDescription primitive = null;
					if(type!=null) {
						primitive = createScopedElement(((Class<?>)type).getCanonicalName());
					} else if(context instanceof DynamicExpressionContext) {
						EClass dynType = ((DynamicExpressionContext) context).getDynType(elementName);
						primitive = createScopedElement(dynType.getEPackage() + "." + dynType.getName());
					}
					if (primitive != null)
						allScopedElements.add(primitive);
				}
			}
		}
		return allScopedElements;
	}
			
	public IEObjectDescription createScopedElement(String fullyQualifiedName) {
		InternalEObject proxy = createProxy(fullyQualifiedName);
		IEObjectDescription eObjectDescription = EObjectDescription.create(getQualifiedNameConverter().toQualifiedName(fullyQualifiedName), proxy);
		return eObjectDescription;
	}

	protected InternalEObject createProxy(String fullyQualifiedName) {
		URI uri = ELJvmTypeProvider.getFullURI(fullyQualifiedName);
		InternalEObject proxy = (InternalEObject) TypesFactory.eINSTANCE.createJvmVoid();
		proxy.eSetProxyURI(uri);
		return proxy;
	}
	
	@Override
	public ELJvmTypeProvider getTypeProvider() {
		return (ELJvmTypeProvider) super.getTypeProvider();
	}

}

package ch.vorburger.el.engine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.collect.Iterables;

public class DynamicExpressionContext extends ExpressionContext {

	protected Map<String, EClass> dynTypes = new HashMap<String, EClass>();
	protected Map<String, EObject> dynElements = new HashMap<String, EObject>();
	protected Set<EClass> declaredTypes = new HashSet<EClass>();
	protected EClass returnType = null;
	
	public void putInstance(String name, EObject instance) {
		dynElements.put(name, instance);
		if(instance!=null) {
			putType(name, instance.eClass());
		}
	}

	public void putType(String name, EClass eclass) {
		dynTypes.put(name, eclass);
		addDeclaredType(eclass);
	}
	
	public void addDeclaredType(EClass eclass) {
		declaredTypes.add(eclass);
		
		for(EStructuralFeature feature : eclass.getEAllStructuralFeatures()) {
			EClassifier eType = feature.getEType();
			if(eType instanceof EClass && !declaredTypes.contains(eType)) {
				addDeclaredType((EClass) eType);
			}
		}
	}
	
	public EObject getDynInstance(String name) {
		return dynElements.get(name);
	}
	
	public EClass getDynType(String name) {
		return dynTypes.get(name);
	}
	
	public void setExpectedReturnType(EClass returnType) {
		this.returnType = returnType;
	}
	
	@Override
	public Object getExpectedReturnType() {
		if(returnType!=null) {
			return returnType;
		} else {
			return super.getExpectedReturnType();
		}
	}
	
	@Override
	public Iterable<String> getElementNames() {
		return Iterables.concat(super.getElementNames(), dynElements.keySet());
	}
	
	public Iterable<EClass> getDeclaredDynTypes() {
		return declaredTypes;		
	}
}

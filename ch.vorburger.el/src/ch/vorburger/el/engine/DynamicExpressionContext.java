package ch.vorburger.el.engine;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Iterables;

public class DynamicExpressionContext extends ExpressionContext {

	protected Map<String, EClass> dynTypes = new HashMap<String, EClass>();
	protected Map<String, EObject> dynElements = new HashMap<String, EObject>();
	
	public void putInstance(String name, EObject instance) {
		dynElements.put(name, instance);
	}

	public void putType(String name, EClass clazz) {
		dynTypes.put(name, clazz);
	}
	
	public EObject getDynInstance(String name) {
		return dynElements.get(name);
	}
	
	public EClass getDynType(String name) {
		EClass type = dynTypes.get(name);
		if(type==null) {
			EObject obj = getDynInstance(name);
			if(obj!=null) type = obj.eClass();
			if(type!=null) {
				putType(name, type);
			}
		}
		return type;
	}
	
	@Override
	public Iterable<String> getElementNames() {
		return Iterables.concat(super.getElementNames(), dynElements.keySet());
	}
}

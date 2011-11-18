package ch.vorburger.el.engine;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class DynamicExpressionContext extends ExpressionContext {

	protected Map<String, EClass> types = new HashMap<String, EClass>();
	protected Map<String, EObject> elements = new HashMap<String, EObject>();
	
	public void putInstance(String name, EObject instance) {
		elements.put(name, instance);
	}

	public void putType(String name, EClass clazz) {
		elements.put(name, clazz);
	}
	
	public EObject getDynInstance(String name) {
		return elements.get(name);
	}
	
	public EClass getDynType(String name) {
		EClass type = types.get(name);
		if(type==null) {
			EObject obj = getDynInstance(name);
			if(obj!=null) type = obj.eClass();
		}
		return type;

	}
}

package ch.vorburger.el.engine;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EContentAdapter;

public class ExpressionContext extends EContentAdapter {

	protected Map<String, Class<? extends Object>> types = new HashMap<String, Class<? extends Object>>();
	protected Map<String, Object> elements = new HashMap<String, Object>();
	
	public void putInstance(String name, Object instance) {
		Object mappedInstance = mapToExpressionType(instance);
		elements.put(name, mappedInstance);
	}

	public void putType(String name, Class<? extends Object> clazz) {
		Class<? extends Object> mappedType = mapToExpressionType(clazz);
		elements.put(name, mappedType);
	}
	
	public Object getInstance(String name) {
		return elements.get(name);
	}
	
	public Class<? extends Object> getType(String name) {
		Class<? extends Object> type = types.get(name);
		if(type==null) {
			Object obj = getInstance(name);
			if(obj!=null) type = obj.getClass();
		}
		return type;
	}
	
	public Iterable<String> getElementNames() {
		return elements.keySet();
	}

	private Object mapToExpressionType(Object instance) {
		if(instance instanceof Number) {
			return new BigDecimal(instance.toString());
		}
		return instance;
	}

	private Class<? extends Object> mapToExpressionType(Class<? extends Object> clazz) {
		if(Number.class.isAssignableFrom(clazz)) {
			return BigDecimal.class;
		}
		return clazz;
	}
}

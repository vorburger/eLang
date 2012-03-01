package ch.vorburger.el.engine;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.util.EContentAdapter;

import com.google.common.collect.Sets;

/**
 * An {@link ExpressionContext} provides types and instances that should be available during the expression
 * parsing and/or execution. 
 * These types and instances are put into the context as Java {@link Type}s and Java {@link Object}s.
 * 
 * Furthermore, the valid return type of an expression can be constrained. In contrast to using the "evaluateExpectingX" methods on
 * the {@link Expression} interface, this constraint is already checked at parsing time, not merely during execution.
 * 
 * @author Kai Kreuzer
 *
 */
public class ExpressionContext extends EContentAdapter {

	protected Map<String, Type> types = new HashMap<String, Type>();
	protected Map<String, Object> instances = new HashMap<String, Object>();
	protected Type returnType;
	
	public void putInstance(String name, Object instance) {
		Object mappedInstance = instance!=null ? mapToExpressionType(instance) : null;
		instances.put(name, mappedInstance);
		if(mappedInstance!=null) {
			putType(name, mappedInstance.getClass());
		}
	}

	public void putType(String name, Type type) {
		Type mappedType = mapToExpressionType(type);
		types.put(name, mappedType);
	}
	
	public Object getInstance(String name) {
		return instances.get(name);
	}
	
	public Type getType(String name) {
		return types.get(name);
	}
	
	public Set<String> getVariableNames() {
		return Sets.union(instances.keySet(), types.keySet());
	}
	
	public Iterable<Type> getDeclaredTypes() {
		return types.values();
	}
	
	public void setExpectedReturnType(Type returnType) {
		this.returnType = returnType;
	}

	public Object getExpectedReturnType() {
		return returnType;
	}

	private Object mapToExpressionType(Object instance) {
		if(instance instanceof Number) {
			return new BigDecimal(instance.toString());
		}
		return instance;
	}

	private Type mapToExpressionType(Type type) {
		if(Number.class.isAssignableFrom(type.getClass())) {
			return BigDecimal.class;
		}
		return type;
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type==ExpressionContext.class;
	}
}

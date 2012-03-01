package ch.vorburger.el.engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import ch.vorburger.el.typing.ELJvmTypeProvider;

import com.google.common.collect.Sets;

/**
 * A {@link DynamicExpressionContext} is an enhanced {@link ExpressionContext} which additionally
 * provides support for dynamic types and instances.
 * 
 * These dynamic types are defined through dynamic EMF/ecore. Types can be put into the context as {@link EClassifier}s 
 * and instances are simply {@link EObject}s.  
 * 
 * @author Kai Kreuzer
 *
 */
public class DynamicExpressionContext extends ExpressionContext {

	/**
	 * Map of Variable Names to their Dynamic Types.
	 */
	protected Map<String, EClassifier> dynTypes = new HashMap<String, EClassifier>();
	
	/**
	 * Map of Variable Names to their Dynamic Instance Values.
	 */
	protected Map<String, EObject> dynInstances = new HashMap<String, EObject>();
	
	/**
	 * Map of Type Names to their Dynamic Types.
	 * These Types are not Variables, but include the Types of all Properties of all Dynamic Types,
	 * as well as the Dynamic Enumeration Types.
	 */
	protected Map<String, EClassifier> declaredTypes = new HashMap<String, EClassifier>();
	
	protected EClass returnType = null;
	
	public void putInstance(String variableName, EObject instance) {
		dynInstances.put(variableName, instance);
		if(instance!=null) {
			putType(variableName, instance.eClass());
		}
	}

	public void putType(String variableName, EClassifier eclassifier) {
		dynTypes.put(variableName, eclassifier);
		addDeclaredType(eclassifier);
	}
	
	public void addDeclaredType(EClassifier eclassifier) {
		declaredTypes.put(ELJvmTypeProvider.getFQN(eclassifier), eclassifier);
		
		if(eclassifier instanceof EClass) {
			EClass eclass = (EClass) eclassifier;
			for(EStructuralFeature feature : eclass.getEAllStructuralFeatures()) {
				EClassifier eType = feature.getEType();
				if(eType instanceof EClass && !declaredTypes.containsValue(eType)) {
					addDeclaredType((EClass) eType);
				}
			}
		}
	}
	
	public EObject getDynInstance(String name) {
		return dynInstances.get(name);
	}
	
	public EClassifier getDynType(String name) {
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
	public Set<String> getVariableNames() {
		return Sets.union(super.getVariableNames(), Sets.union(dynInstances.keySet(), dynTypes.keySet()));
	}
	
	public Iterable<EClassifier> getDeclaredDynTypes() {
		return declaredTypes.values();		
	}
	
	public EClassifier getDeclaredDynType(String name) {
		return declaredTypes.get(name);
	}
}

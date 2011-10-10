package ch.vorburger.el.engine;

import java.util.Map;

import org.eclipse.emf.ecore.util.EContentAdapter;

public class VarTypeAdapter extends EContentAdapter {
	
	public VarTypeAdapter(Map<String, Class<? extends Object>> varTypes) {
		this.varTypes = varTypes;
	}
	
	private Map<String, Class<? extends Object>> varTypes;

	public Map<String, Class<? extends Object>> getVarTypes() {
		return varTypes;
	}

	public void setVarTypes(Map<String, Class<? extends Object>> varTypes) {
		this.varTypes = varTypes;
	}
}
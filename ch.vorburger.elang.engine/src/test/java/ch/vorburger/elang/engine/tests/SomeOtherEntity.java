package ch.vorburger.elang.engine.tests;

import ch.vorburger.elang.engine.ast.DataObjectNodeEvalResult;
import ch.vorburger.elang.engine.ast.StringNode;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;
import ch.vorburger.elang.engine.data.UnknownFieldException;


/**
 * Test Entity.
 * 
 * @author Michael Vorburger
 */
public class SomeOtherEntity implements DataObject {

	private final String anotherStringAttribute;
	private SomeOtherEntity someOtherEntity;
	
	public String getAnotherStringAttribute() {
		return anotherStringAttribute;
	}

	public SomeOtherEntity(String stringAttribute) {
		this.anotherStringAttribute = stringAttribute;
	}

	@Override
	public NodeEvalResult getField(String fieldName, Location requestingParentLocation) throws UnknownFieldException {
		if ("anotherStringAttribute".equals(fieldName)) {
			return new StringNode(requestingParentLocation, anotherStringAttribute);
		} else if ("someOtherEntity".equals(fieldName)) {
			return new DataObjectNodeEvalResult(requestingParentLocation, someOtherEntity);
		} else {
			throw new UnknownFieldException("SomeOtherEntity has no field named: " + fieldName);
		}
	}

	@Override
	public boolean isEqual(DataObject o) {
		throw new UnsupportedOperationException();
	}

	public void setSomeOtherEntity(SomeOtherEntity someOtherEntity) {
		this.someOtherEntity = someOtherEntity;
	}

	public SomeOtherEntity getSomeOtherEntity() {
		return someOtherEntity;
	}
}

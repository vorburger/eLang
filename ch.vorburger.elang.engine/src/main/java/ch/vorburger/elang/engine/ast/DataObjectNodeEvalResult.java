package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Node Eval Result wrapping a Java Bean exposed as DataObject.
 * 
 * Note that this is NOT a Node, it's not part of the AST;
 * objects of this class are created during runtime evaluation,
 * when a variable is resolved into a data object.
 * 
 * @see DataObject
 * 
 * @author Michael Vorburger (MVO)
 */
public final class DataObjectNodeEvalResult extends LocationImpl implements NodeEvalResult {

	// TODO Is it normal that a DataObject needs such an NodeEvalResult wrapper, or is there a better IS-A Design?
	
	private final DataObject dataObject;
	
	// TODO I made this class & constructor public instead of package-local for short-term SomeOtherEntity implements DataObject.  Adapt with Any pattern later... and move.
	public DataObjectNodeEvalResult(Location location, DataObject dataObject) {
		super(location);
		this.dataObject = dataObject;
	}
	
	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return dataObject.isEqual(y.asDataObject());
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		throw new ScriptExcecutionException("Data Object from variable '" + this.getText() + "' can not be compared to anything else, please access one of its properties instead");
	}

	@Override
	public DataObject asDataObject() throws ScriptExcecutionException {
		return dataObject;
	}

	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		throw newImpossibleAsCastExcecutionException("Boolean");
	}

	@Override
	public Double asDouble() throws ScriptExcecutionException {
		throw newImpossibleAsCastExcecutionException("Number");
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		throw newImpossibleAsCastExcecutionException("Date/Time");
	}

	@Override
	public String asString() throws ScriptExcecutionException {
		throw newImpossibleAsCastExcecutionException("String/Text");
	}

	private ScriptExcecutionException newImpossibleAsCastExcecutionException(String typeName) throws ScriptExcecutionException {
		return new ScriptExcecutionException("Data Structure from variable '" + this.getText() + "' can not just be turned into a " + typeName + ", please access one of its properties instead");
	}
	
/* 
    TODO Remove all this then, after related clean-up of VariableNode, given that this code is now inside TestBeanDataObjectWrapper instead?
  
	private final Object bean;
	private final DataObject innerDataObject;

	public DataObjectNodeEvalResult(Object p) {
		this.bean = p;
		this.innerDataObject = new DataObject() {
			@Override
			public NodeEvalResult getField(String fieldName) {
				return getProperty(bean, fieldName);
			}
		};
	}

	private Object getProperty(Object bean, String name) throws ScriptExcecutionException {
		try {
			return PropertyUtils.getProperty(bean, name);
		} catch (IllegalAccessException e) {
			throw newExcecutionException(e, "Unexpected IllegalAccessException, technical problem from BeanUtils PropertyUtils.getProperty(), for: ");
		} catch (InvocationTargetException e) {
			throw newExcecutionException(e, "Unexpected InvocationTargetException, technical problem from BeanUtils PropertyUtils.getProperty(), for: ");
		} catch (NoSuchMethodException e) {
			throw newExcecutionException(e, "Unexpected NoSuchMethodException, technical problem from BeanUtils PropertyUtils.getProperty(), for: ");
		}
	}
*/
}

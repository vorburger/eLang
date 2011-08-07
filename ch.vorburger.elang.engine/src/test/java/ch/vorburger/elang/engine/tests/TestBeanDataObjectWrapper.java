package ch.vorburger.elang.engine.tests;

import java.lang.reflect.InvocationTargetException;
import java.util.GregorianCalendar;

import org.apache.commons.beanutils.PropertyUtils;

import ch.vorburger.elang.engine.ast.BooleanNode;
import ch.vorburger.elang.engine.ast.DataObjectNodeEvalResult;
import ch.vorburger.elang.engine.ast.DateTimeNode;
import ch.vorburger.elang.engine.ast.NumberNode;
import ch.vorburger.elang.engine.ast.StringNode;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;
import ch.vorburger.elang.engine.data.UnknownFieldException;


/**
 * Wrapper which turns a standard Java Bean into a DataObject.
 * 
 * Intended for Unit Testing only.  The intention is that "real" entity classes
 * accessed during interpretation directly implement the DataObject contract themselves.
 * 
 * @see DataObject
 * 
 * @author Michael Vorburger (MVO)
 */
public class TestBeanDataObjectWrapper implements DataObject {

	private final Object bean;
	
	public TestBeanDataObjectWrapper(Object javaBean) {
		this.bean = javaBean;
	}

	public Object getWrappedBean() {
		return this.bean;
	}
	
	@Override
	public NodeEvalResult getField(String fieldName, Location location) throws UnknownFieldException {
		Object property = null;
		try {
			property = PropertyUtils.getProperty(bean, fieldName);
		} catch (IllegalAccessException e) {
			throw new UnknownFieldException("Unexpected IllegalAccessException, technical problem from BeanUtils PropertyUtils.getProperty()", e);
		} catch (InvocationTargetException e) {
			throw new UnknownFieldException("Unexpected InvocationTargetException, technical problem from BeanUtils PropertyUtils.getProperty()", e);
		} catch (NoSuchMethodException e) {
			throw new UnknownFieldException("Unexpected NoSuchMethodException, technical problem from BeanUtils PropertyUtils.getProperty()", e);
		}
		
		if (property == null) {
			return null;
		} else if (property instanceof Number) {
			Number n = (Number) property;
			return new NumberNode(location, n.doubleValue());
		} else if (property instanceof String) {
			return new StringNode(location, (String) property);
		} else if (property instanceof GregorianCalendar) {
			return new DateTimeNode(location, (GregorianCalendar) property);
		} else if (property instanceof Boolean) {
			return BooleanNode.valueOf((Boolean) property);
		} else if (property instanceof DataObject) {
			return new DataObjectNodeEvalResult(location, (DataObject) property);
		} else {
			// return new DataObjectNodeEvalResult(new TestBeanDataObjectWrapper(property), fieldName);
			throw new UnknownFieldException("Don't know how to convert " + property.toString() + " (of class " + property.getClass().getName() + ") into a NodeEvalResult (you may have forgotten to wrap a DataObject around it?)");
		}
	}

	@Override
	public boolean isEqual(DataObject y) {
		// TODO Implement TestBeanDataObjectWrapper.isEqual() ...
		throw new UnsupportedOperationException();
	}
	
}

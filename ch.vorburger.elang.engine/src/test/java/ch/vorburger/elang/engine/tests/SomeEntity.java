package ch.vorburger.elang.engine.tests;

import java.util.GregorianCalendar;


/**
 * Test Entity.
 * 
 * @author Michael Vorburger
 */
public class SomeEntity {

	private Number numericAttribute;
	private String stringAttribute;
	private Boolean booleanAttribute;
	private GregorianCalendar calendarAttribute;
	private SomeOtherEntity anotherEntity;
	
	public GregorianCalendar getCalendarAttribute() {
		return calendarAttribute;
	}
	public void setCalendarAttribute(GregorianCalendar calendarAttribute) {
		this.calendarAttribute = calendarAttribute;
	}
	public Boolean getBooleanAttribute() {
		return booleanAttribute;
	}
	public void setBooleanAttribute(Boolean booleanAttribute) {
		this.booleanAttribute = booleanAttribute;
	}
	
	public SomeOtherEntity getAnotherEntity() {
		return anotherEntity;
	}
	public void setAnotherEntity(SomeOtherEntity anotherEntity) {
		this.anotherEntity = anotherEntity;
	}
	public String getStringAttribute() {
		return stringAttribute;
	}
	public void setStringAttribute(String stringAttribute) {
		this.stringAttribute = stringAttribute;
	}
	public Number getNumericAttribute() {
		return numericAttribute;
	}
	public void setNumericAttribute(Number numericAttribute) {
		this.numericAttribute = numericAttribute;
	}
}

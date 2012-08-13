/**
 * <copyright>
 * </copyright>
 *

 */
package ch.vorburger.el.eL;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.vorburger.el.eL.DateTimeLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.vorburger.el.eL.ELPackage#getDateTimeLiteral()
 * @model
 * @generated
 */
public interface DateTimeLiteral extends XExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ch.vorburger.el.eL.ELPackage#getDateTimeLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ch.vorburger.el.eL.DateTimeLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // DateTimeLiteral

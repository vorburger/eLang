/**
 * <copyright>
 * </copyright>
 *

 */
package ch.vorburger.el.eL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ch.vorburger.el.eL.ELPackage
 * @generated
 */
public interface ELFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ELFactory eINSTANCE = ch.vorburger.el.eL.impl.ELFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Date Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Literal</em>'.
   * @generated
   */
  DateLiteral createDateLiteral();

  /**
   * Returns a new object of class '<em>Date Time Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Time Literal</em>'.
   * @generated
   */
  DateTimeLiteral createDateTimeLiteral();

  /**
   * Returns a new object of class '<em>Decimal Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Literal</em>'.
   * @generated
   */
  DecimalLiteral createDecimalLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ELPackage getELPackage();

} //ELFactory

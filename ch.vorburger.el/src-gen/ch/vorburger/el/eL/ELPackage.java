/**
 */
package ch.vorburger.el.eL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ch.vorburger.el.eL.ELFactory
 * @model kind="package"
 * @generated
 */
public interface ELPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.vorburger.ch/el/EL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ELPackage eINSTANCE = ch.vorburger.el.eL.impl.ELPackageImpl.init();

  /**
   * The meta object id for the '{@link ch.vorburger.el.eL.impl.DateLiteralImpl <em>Date Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ch.vorburger.el.eL.impl.DateLiteralImpl
   * @see ch.vorburger.el.eL.impl.ELPackageImpl#getDateLiteral()
   * @generated
   */
  int DATE_LITERAL = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_LITERAL__VALUE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_LITERAL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ch.vorburger.el.eL.impl.DateTimeLiteralImpl <em>Date Time Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ch.vorburger.el.eL.impl.DateTimeLiteralImpl
   * @see ch.vorburger.el.eL.impl.ELPackageImpl#getDateTimeLiteral()
   * @generated
   */
  int DATE_TIME_LITERAL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_LITERAL__VALUE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Time Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_LITERAL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ch.vorburger.el.eL.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ch.vorburger.el.eL.impl.DecimalLiteralImpl
   * @see ch.vorburger.el.eL.impl.ELPackageImpl#getDecimalLiteral()
   * @generated
   */
  int DECIMAL_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LITERAL__VALUE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LITERAL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link ch.vorburger.el.eL.DateLiteral <em>Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Literal</em>'.
   * @see ch.vorburger.el.eL.DateLiteral
   * @generated
   */
  EClass getDateLiteral();

  /**
   * Returns the meta object for the attribute '{@link ch.vorburger.el.eL.DateLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ch.vorburger.el.eL.DateLiteral#getValue()
   * @see #getDateLiteral()
   * @generated
   */
  EAttribute getDateLiteral_Value();

  /**
   * Returns the meta object for class '{@link ch.vorburger.el.eL.DateTimeLiteral <em>Date Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Time Literal</em>'.
   * @see ch.vorburger.el.eL.DateTimeLiteral
   * @generated
   */
  EClass getDateTimeLiteral();

  /**
   * Returns the meta object for the attribute '{@link ch.vorburger.el.eL.DateTimeLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ch.vorburger.el.eL.DateTimeLiteral#getValue()
   * @see #getDateTimeLiteral()
   * @generated
   */
  EAttribute getDateTimeLiteral_Value();

  /**
   * Returns the meta object for class '{@link ch.vorburger.el.eL.DecimalLiteral <em>Decimal Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Literal</em>'.
   * @see ch.vorburger.el.eL.DecimalLiteral
   * @generated
   */
  EClass getDecimalLiteral();

  /**
   * Returns the meta object for the attribute '{@link ch.vorburger.el.eL.DecimalLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ch.vorburger.el.eL.DecimalLiteral#getValue()
   * @see #getDecimalLiteral()
   * @generated
   */
  EAttribute getDecimalLiteral_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ELFactory getELFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ch.vorburger.el.eL.impl.DateLiteralImpl <em>Date Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.vorburger.el.eL.impl.DateLiteralImpl
     * @see ch.vorburger.el.eL.impl.ELPackageImpl#getDateLiteral()
     * @generated
     */
    EClass DATE_LITERAL = eINSTANCE.getDateLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_LITERAL__VALUE = eINSTANCE.getDateLiteral_Value();

    /**
     * The meta object literal for the '{@link ch.vorburger.el.eL.impl.DateTimeLiteralImpl <em>Date Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.vorburger.el.eL.impl.DateTimeLiteralImpl
     * @see ch.vorburger.el.eL.impl.ELPackageImpl#getDateTimeLiteral()
     * @generated
     */
    EClass DATE_TIME_LITERAL = eINSTANCE.getDateTimeLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_TIME_LITERAL__VALUE = eINSTANCE.getDateTimeLiteral_Value();

    /**
     * The meta object literal for the '{@link ch.vorburger.el.eL.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.vorburger.el.eL.impl.DecimalLiteralImpl
     * @see ch.vorburger.el.eL.impl.ELPackageImpl#getDecimalLiteral()
     * @generated
     */
    EClass DECIMAL_LITERAL = eINSTANCE.getDecimalLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_LITERAL__VALUE = eINSTANCE.getDecimalLiteral_Value();

  }

} //ELPackage

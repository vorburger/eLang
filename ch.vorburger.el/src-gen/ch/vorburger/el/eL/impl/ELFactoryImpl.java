/**
 */
package ch.vorburger.el.eL.impl;

import ch.vorburger.el.eL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ELFactoryImpl extends EFactoryImpl implements ELFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ELFactory init()
  {
    try
    {
      ELFactory theELFactory = (ELFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.vorburger.ch/el/EL"); 
      if (theELFactory != null)
      {
        return theELFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ELFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ELFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ELPackage.DATE_LITERAL: return createDateLiteral();
      case ELPackage.DATE_TIME_LITERAL: return createDateTimeLiteral();
      case ELPackage.DECIMAL_LITERAL: return createDecimalLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateLiteral createDateLiteral()
  {
    DateLiteralImpl dateLiteral = new DateLiteralImpl();
    return dateLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateTimeLiteral createDateTimeLiteral()
  {
    DateTimeLiteralImpl dateTimeLiteral = new DateTimeLiteralImpl();
    return dateTimeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalLiteral createDecimalLiteral()
  {
    DecimalLiteralImpl decimalLiteral = new DecimalLiteralImpl();
    return decimalLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ELPackage getELPackage()
  {
    return (ELPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ELPackage getPackage()
  {
    return ELPackage.eINSTANCE;
  }

} //ELFactoryImpl

package ch.vorburger.el.engine.tests.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;

/**
 * This class contains helper methods to simplify the way how to interact with dynamic EMF
 */
@SuppressWarnings("all")
public class ECoreHelper {
  public EPackage createPackage(final String name) {
      EPackage _createEPackage = EcoreFactory.eINSTANCE.createEPackage();
      final EPackage epkg = _createEPackage;
      epkg.setName(name);
      return epkg;
  }
  
  public EClass createClass(final EPackage epkg, final String name) {
      EClass _createEClass = EcoreFactory.eINSTANCE.createEClass();
      final EClass eclass = _createEClass;
      eclass.setName(name);
      EList<EClassifier> _eClassifiers = epkg.getEClassifiers();
      CollectionExtensions.<EClass>operator_add(_eClassifiers, eclass);
      return eclass;
  }
  
  public EEnum createEnum(final EPackage epkg, final String name) {
      EEnum _createEEnum = EcoreFactory.eINSTANCE.createEEnum();
      final EEnum eEnum = _createEEnum;
      eEnum.setName(name);
      EList<EClassifier> _eClassifiers = epkg.getEClassifiers();
      CollectionExtensions.<EEnum>operator_add(_eClassifiers, eEnum);
      return eEnum;
  }
  
  public boolean addAttribute(final EClass eclass, final EClassifier type, final String attributeName) {
    boolean _xblockexpression = false;
    {
      EAttribute _createEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
      final EAttribute attribute = _createEAttribute;
      attribute.setName(attributeName);
      attribute.setUnsettable(false);
      attribute.setChangeable(true);
      attribute.setEType(type);
      EList<EStructuralFeature> _eStructuralFeatures = eclass.getEStructuralFeatures();
      boolean _operator_add = CollectionExtensions.<EAttribute>operator_add(_eStructuralFeatures, attribute);
      _xblockexpression = (_operator_add);
    }
    return _xblockexpression;
  }
  
  public EEnumLiteral addEnumLiteral(final EEnum eEnum, final String literalName) {
    EEnumLiteral _xblockexpression = null;
    {
      EEnumLiteral _createEEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
      final EEnumLiteral literal = _createEEnumLiteral;
      literal.setName(literalName);
      EList<EEnumLiteral> _eLiterals = eEnum.getELiterals();
      CollectionExtensions.<EEnumLiteral>operator_add(_eLiterals, literal);
      _xblockexpression = (literal);
    }
    return _xblockexpression;
  }
  
  public EObject createInstance(final EClass eclass) {
    EPackage _ePackage = eclass.getEPackage();
    EFactory _eFactoryInstance = _ePackage.getEFactoryInstance();
    EObject _create = _eFactoryInstance.create(eclass);
    return _create;
  }
  
  public void setProperty(final EObject eobj, final String name, final Object value) {
    EClass _eClass = eobj.eClass();
    EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(name);
    eobj.eSet(_eStructuralFeature, value);
  }
}

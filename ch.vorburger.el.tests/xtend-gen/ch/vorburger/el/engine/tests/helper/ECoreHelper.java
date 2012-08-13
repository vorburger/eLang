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

/**
 * This class contains helper methods to simplify the way how to interact with dynamic EMF
 */
@SuppressWarnings("all")
public class ECoreHelper {
  public EPackage createPackage(final String name) {
    final EPackage epkg = EcoreFactory.eINSTANCE.createEPackage();
    epkg.setName(name);
    return epkg;
  }
  
  public EClass createClass(final EPackage epkg, final String name) {
    final EClass eclass = EcoreFactory.eINSTANCE.createEClass();
    eclass.setName(name);
    EList<EClassifier> _eClassifiers = epkg.getEClassifiers();
    _eClassifiers.add(eclass);
    return eclass;
  }
  
  public EEnum createEnum(final EPackage epkg, final String name) {
    final EEnum eEnum = EcoreFactory.eINSTANCE.createEEnum();
    eEnum.setName(name);
    EList<EClassifier> _eClassifiers = epkg.getEClassifiers();
    _eClassifiers.add(eEnum);
    return eEnum;
  }
  
  public boolean addAttribute(final EClass eclass, final EClassifier type, final String attributeName) {
    boolean _xblockexpression = false;
    {
      final EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
      attribute.setName(attributeName);
      attribute.setUnsettable(false);
      attribute.setChangeable(true);
      attribute.setEType(type);
      EList<EStructuralFeature> _eStructuralFeatures = eclass.getEStructuralFeatures();
      boolean _add = _eStructuralFeatures.add(attribute);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public EEnumLiteral addEnumLiteral(final EEnum eEnum, final String literalName) {
    EEnumLiteral _xblockexpression = null;
    {
      final EEnumLiteral literal = EcoreFactory.eINSTANCE.createEEnumLiteral();
      literal.setName(literalName);
      EList<EEnumLiteral> _eLiterals = eEnum.getELiterals();
      _eLiterals.add(literal);
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

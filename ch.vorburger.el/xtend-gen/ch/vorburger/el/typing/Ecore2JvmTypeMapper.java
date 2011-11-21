package ch.vorburger.el.typing;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Ecore2JvmTypeMapper {
  @Inject
  private JvmTypesBuilder jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected JvmGenericType _map(final EClass eClass) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eClass);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
          for (final EStructuralFeature feature : _eStructuralFeatures) {
            EList<JvmMember> _members = it.getMembers();
            JvmField _mapFeature = Ecore2JvmTypeMapper.this.mapFeature(feature);
            CollectionExtensions.<JvmField>operator_add(_members, _mapFeature);
          }
        }
      };
    JvmGenericType _class = this.jvmTypesBuilder.toClass(eClass, _fullyQualifiedName, _function);
    return _class;
  }
  
  protected JvmField _mapFeature(final EAttribute eAttr) {
    String _name = eAttr.getName();
    EClassifier _eType = eAttr.getEType();
    EClassifier _eType_1 = eAttr.getEType();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eType_1);
    String _string = _fullyQualifiedName.toString();
    JvmTypeReference _newTypeRef = this.jvmTypesBuilder.newTypeRef(_eType, _string);
    JvmField _field = this.jvmTypesBuilder.toField(eAttr, _name, _newTypeRef);
    return _field;
  }
  
  protected JvmField _mapFeature(final EReference eRef) {
    String _name = eRef.getName();
    EClassifier _eType = eRef.getEType();
    EClassifier _eType_1 = eRef.getEType();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eType_1);
    String _string = _fullyQualifiedName.toString();
    JvmTypeReference _newTypeRef = this.jvmTypesBuilder.newTypeRef(_eType, _string);
    JvmField _field = this.jvmTypesBuilder.toField(eRef, _name, _newTypeRef);
    return _field;
  }
  
  protected JvmField _mapFeature(final EStructuralFeature eFeature) {
    return null;
  }
  
  protected JvmGenericType _map(final EClassifier eClassifier) {
    return null;
  }
  
  public Object createTypeRef(final EClassifier eClassifier) {
    return null;
  }
  
  public JvmGenericType map(final EClassifier eClass) {
    if (eClass instanceof EClass) {
      return _map((EClass)eClass);
    } else {
      return _map(eClass);
    }
  }
  
  public JvmField mapFeature(final EStructuralFeature eAttr) {
    if (eAttr instanceof EAttribute) {
      return _mapFeature((EAttribute)eAttr);
    } else if (eAttr instanceof EReference) {
      return _mapFeature((EReference)eAttr);
    } else {
      return _mapFeature(eAttr);
    }
  }
}

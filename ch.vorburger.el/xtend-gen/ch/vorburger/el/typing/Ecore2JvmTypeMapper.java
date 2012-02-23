package ch.vorburger.el.typing;

import ch.vorburger.el.typing.ELJvmTypesBuilder;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Ecore2JvmTypeMapper {
  @Inject
  private ELJvmTypesBuilder jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected JvmGenericType _map(final EClass eClass, final ResourceSet rs) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eClass);
    String _string = _fullyQualifiedName.toString();
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
            for (final EStructuralFeature feature : _eStructuralFeatures) {
              EList<JvmMember> _members = it.getMembers();
              JvmField _mapFeature = Ecore2JvmTypeMapper.this.mapFeature(feature, rs);
              CollectionExtensions.<JvmField>operator_add(_members, _mapFeature);
            }
            String _documentation = Ecore2JvmTypeMapper.this.jvmTypesBuilder.getDocumentation(eClass);
            Ecore2JvmTypeMapper.this.jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<EClass> _eSuperTypes = eClass.getESuperTypes();
            for (final EClass superType : _eSuperTypes) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              QualifiedName _fullyQualifiedName = Ecore2JvmTypeMapper.this._iQualifiedNameProvider.getFullyQualifiedName(superType);
              String _string = _fullyQualifiedName.toString();
              JvmTypeReference _newTypeRef = Ecore2JvmTypeMapper.this.jvmTypesBuilder.newTypeRef(rs, _string);
              CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
            }
          }
        }
      };
    JvmGenericType _class = this.jvmTypesBuilder.toClass(eClass, rs, _string, _function);
    return _class;
  }
  
  protected JvmGenericType _map(final EDataType eDatatype, final ResourceSet rs) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eDatatype);
    String _string = _fullyQualifiedName.toString();
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
        }
      };
    JvmGenericType _class = this.jvmTypesBuilder.toClass(eDatatype, rs, _string, _function);
    return _class;
  }
  
  protected JvmField _mapFeature(final EAttribute eAttr, final ResourceSet rs) {
    String _name = eAttr.getName();
    EClassifier _eType = eAttr.getEType();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eType);
    String _string = _fullyQualifiedName.toString();
    String _mapType = this.mapType(_string);
    JvmTypeReference _newTypeRef = this.jvmTypesBuilder.newTypeRef(rs, _mapType);
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
          {
            it.setVisibility(JvmVisibility.PUBLIC);
            String _documentation = Ecore2JvmTypeMapper.this.jvmTypesBuilder.getDocumentation(eAttr);
            Ecore2JvmTypeMapper.this.jvmTypesBuilder.setDocumentation(it, _documentation);
          }
        }
      };
    JvmField _field = this.jvmTypesBuilder.toField(eAttr, _name, _newTypeRef, _function);
    return _field;
  }
  
  protected JvmField _mapFeature(final EReference eRef, final ResourceSet rs) {
    String _name = eRef.getName();
    EClassifier _eType = eRef.getEType();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eType);
    String _string = _fullyQualifiedName.toString();
    String _mapType = this.mapType(_string);
    JvmTypeReference _newTypeRef = this.jvmTypesBuilder.newTypeRef(rs, _mapType);
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
          {
            it.setVisibility(JvmVisibility.PUBLIC);
            String _documentation = Ecore2JvmTypeMapper.this.jvmTypesBuilder.getDocumentation(eRef);
            Ecore2JvmTypeMapper.this.jvmTypesBuilder.setDocumentation(it, _documentation);
          }
        }
      };
    JvmField _field = this.jvmTypesBuilder.toField(eRef, _name, _newTypeRef, _function);
    return _field;
  }
  
  public String mapType(final String typeName) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EInt")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EShort")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.ELong")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EFloat")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EDouble")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EIntegerObject")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EShortObject")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.ELongObject")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EFloatObject")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EDoubleObject")) {
        matched=true;
        _switchResult = "java.math.BigDecimal";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EDate")) {
        matched=true;
        _switchResult = "java.util.GregorianCalendar";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EBoolean")) {
        matched=true;
        _switchResult = "java.lang.Boolean";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EBooleanObject")) {
        matched=true;
        _switchResult = "java.lang.Boolean";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(typeName,"ecore.EString")) {
        matched=true;
        _switchResult = "java.lang.String";
      }
    }
    if (!matched) {
      _switchResult = typeName;
    }
    return _switchResult;
  }
  
  public JvmGenericType map(final EClassifier eClass, final ResourceSet rs) {
    if (eClass instanceof EClass) {
      return _map((EClass)eClass, rs);
    } else if (eClass instanceof EDataType) {
      return _map((EDataType)eClass, rs);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eClass, rs).toString());
    }
  }
  
  public JvmField mapFeature(final EStructuralFeature eAttr, final ResourceSet rs) {
    if (eAttr instanceof EAttribute) {
      return _mapFeature((EAttribute)eAttr, rs);
    } else if (eAttr instanceof EReference) {
      return _mapFeature((EReference)eAttr, rs);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eAttr, rs).toString());
    }
  }
}

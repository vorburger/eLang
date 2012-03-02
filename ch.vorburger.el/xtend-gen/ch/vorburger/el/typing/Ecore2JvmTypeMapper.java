package ch.vorburger.el.typing;

import ch.vorburger.el.typing.ELJvmTypesBuilder;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Ecore2JvmTypeMapper {
  @Inject
  private TypeReferences references;
  
  @Inject
  private ELJvmTypesBuilder jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected JvmDeclaredType _map(final EClass eClass, final ResourceSet rs) {
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
  
  protected JvmDeclaredType _map(final EDataType eDatatype, final ResourceSet rs) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eDatatype);
    String _string = _fullyQualifiedName.toString();
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
        }
      };
    JvmGenericType _class = this.jvmTypesBuilder.toClass(eDatatype, rs, _string, _function);
    return _class;
  }
  
  protected JvmDeclaredType _map(final EEnum eEnum, final ResourceSet rs) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eEnum);
    String _string = _fullyQualifiedName.toString();
    final Procedure1<JvmEnumerationType> _function = new Procedure1<JvmEnumerationType>() {
        public void apply(final JvmEnumerationType it) {
          {
            it.setStatic(true);
            EList<EEnumLiteral> _eLiterals = eEnum.getELiterals();
            for (final EEnumLiteral literal : _eLiterals) {
              {
                JvmEnumerationLiteral _mapLiteral = Ecore2JvmTypeMapper.this.mapLiteral(literal, rs);
                final JvmEnumerationLiteral l = _mapLiteral;
                JvmParameterizedTypeReference _createTypeRef = Ecore2JvmTypeMapper.this.references.createTypeRef(it);
                l.setType(_createTypeRef);
                EList<JvmMember> _members = it.getMembers();
                CollectionExtensions.<JvmEnumerationLiteral>operator_add(_members, l);
              }
            }
            String _documentation = Ecore2JvmTypeMapper.this.jvmTypesBuilder.getDocumentation(eEnum);
            Ecore2JvmTypeMapper.this.jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmParameterizedTypeReference _createTypeRef_1 = Ecore2JvmTypeMapper.this.references.createTypeRef(it);
            JvmTypeReference _newTypeRef = Ecore2JvmTypeMapper.this.jvmTypesBuilder.newTypeRef(rs, "java.lang.Comparable", _createTypeRef_1);
            CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          }
        }
      };
    JvmEnumerationType _enumerationType = this.jvmTypesBuilder.toEnumerationType(eEnum, _string, _function);
    return _enumerationType;
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
  
  public JvmEnumerationLiteral mapLiteral(final EEnumLiteral eEnumLiteral, final ResourceSet rs) {
    String _name = eEnumLiteral.getName();
    final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
        public void apply(final JvmEnumerationLiteral it) {
          {
            it.setStatic(true);
            it.setVisibility(JvmVisibility.PUBLIC);
            String _documentation = Ecore2JvmTypeMapper.this.jvmTypesBuilder.getDocumentation(eEnumLiteral);
            Ecore2JvmTypeMapper.this.jvmTypesBuilder.setDocumentation(it, _documentation);
          }
        }
      };
    JvmEnumerationLiteral _enumerationLiteral = this.jvmTypesBuilder.toEnumerationLiteral(eEnumLiteral, _name, _function);
    return _enumerationLiteral;
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
  
  public JvmDeclaredType map(final EClassifier eEnum, final ResourceSet rs) {
    if (eEnum instanceof EEnum) {
      return _map((EEnum)eEnum, rs);
    } else if (eEnum instanceof EClass) {
      return _map((EClass)eEnum, rs);
    } else if (eEnum instanceof EDataType) {
      return _map((EDataType)eEnum, rs);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eEnum, rs).toString());
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

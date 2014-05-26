/**
 */
package org.specapi.specapiLang.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.specapi.specapiLang.EnumMember;
import org.specapi.specapiLang.SpecapiLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.impl.EnumMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.specapi.specapiLang.impl.EnumMemberImpl#isAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.specapi.specapiLang.impl.EnumMemberImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumMemberImpl extends MinimalEObjectImpl.Container implements EnumMember
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isAssignment() <em>Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAssignment()
   * @generated
   * @ordered
   */
  protected static final boolean ASSIGNMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAssignment() <em>Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAssignment()
   * @generated
   * @ordered
   */
  protected boolean assignment = ASSIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected BigDecimal value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumMemberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpecapiLangPackage.Literals.ENUM_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.ENUM_MEMBER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(boolean newAssignment)
  {
    boolean oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.ENUM_MEMBER__ASSIGNMENT, oldAssignment, assignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(BigDecimal newValue)
  {
    BigDecimal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.ENUM_MEMBER__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpecapiLangPackage.ENUM_MEMBER__NAME:
        return getName();
      case SpecapiLangPackage.ENUM_MEMBER__ASSIGNMENT:
        return isAssignment();
      case SpecapiLangPackage.ENUM_MEMBER__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecapiLangPackage.ENUM_MEMBER__NAME:
        setName((String)newValue);
        return;
      case SpecapiLangPackage.ENUM_MEMBER__ASSIGNMENT:
        setAssignment((Boolean)newValue);
        return;
      case SpecapiLangPackage.ENUM_MEMBER__VALUE:
        setValue((BigDecimal)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpecapiLangPackage.ENUM_MEMBER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpecapiLangPackage.ENUM_MEMBER__ASSIGNMENT:
        setAssignment(ASSIGNMENT_EDEFAULT);
        return;
      case SpecapiLangPackage.ENUM_MEMBER__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpecapiLangPackage.ENUM_MEMBER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpecapiLangPackage.ENUM_MEMBER__ASSIGNMENT:
        return assignment != ASSIGNMENT_EDEFAULT;
      case SpecapiLangPackage.ENUM_MEMBER__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", assignment: ");
    result.append(assignment);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //EnumMemberImpl

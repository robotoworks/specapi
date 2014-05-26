/**
 */
package org.specapi.specapiLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.specapi.specapiLang.ArrayType;
import org.specapi.specapiLang.SpecapiLangPackage;
import org.specapi.specapiLang.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.impl.ArrayTypeImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.specapi.specapiLang.impl.ArrayTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeImpl extends TypeImpl implements ArrayType
{
  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected Type elementType;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeImpl()
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
    return SpecapiLangPackage.Literals.ARRAY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementType(Type newElementType, NotificationChain msgs)
  {
    Type oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE, oldElementType, newElementType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(Type newElementType)
  {
    if (newElementType != elementType)
    {
      NotificationChain msgs = null;
      if (elementType != null)
        msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
      if (newElementType != null)
        msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElementType(newElementType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE, newElementType, newElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.ARRAY_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE:
        return basicSetElementType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE:
        return getElementType();
      case SpecapiLangPackage.ARRAY_TYPE__ID:
        return getId();
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
      case SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE:
        setElementType((Type)newValue);
        return;
      case SpecapiLangPackage.ARRAY_TYPE__ID:
        setId((String)newValue);
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
      case SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE:
        setElementType((Type)null);
        return;
      case SpecapiLangPackage.ARRAY_TYPE__ID:
        setId(ID_EDEFAULT);
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
      case SpecapiLangPackage.ARRAY_TYPE__ELEMENT_TYPE:
        return elementType != null;
      case SpecapiLangPackage.ARRAY_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ArrayTypeImpl

/**
 */
package org.specapi.specapiLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.specapi.specapiLang.Header;
import org.specapi.specapiLang.HeaderBlock;
import org.specapi.specapiLang.SpecapiLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.impl.HeaderBlockImpl#getHeaders <em>Headers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderBlockImpl extends ServiceBlockImpl implements HeaderBlock
{
  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected EList<Header> headers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderBlockImpl()
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
    return SpecapiLangPackage.Literals.HEADER_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Header> getHeaders()
  {
    if (headers == null)
    {
      headers = new EObjectContainmentEList<Header>(Header.class, this, SpecapiLangPackage.HEADER_BLOCK__HEADERS);
    }
    return headers;
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
      case SpecapiLangPackage.HEADER_BLOCK__HEADERS:
        return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
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
      case SpecapiLangPackage.HEADER_BLOCK__HEADERS:
        return getHeaders();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecapiLangPackage.HEADER_BLOCK__HEADERS:
        getHeaders().clear();
        getHeaders().addAll((Collection<? extends Header>)newValue);
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
      case SpecapiLangPackage.HEADER_BLOCK__HEADERS:
        getHeaders().clear();
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
      case SpecapiLangPackage.HEADER_BLOCK__HEADERS:
        return headers != null && !headers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HeaderBlockImpl

/**
 */
package org.specapi.specapiLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.specapi.specapiLang.Api;
import org.specapi.specapiLang.ServiceBlock;
import org.specapi.specapiLang.SpecapiLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.impl.ApiImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.specapi.specapiLang.impl.ApiImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApiImpl extends DeclarationImpl implements Api
{
  /**
   * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected static final String BASE_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected String baseUrl = BASE_URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<ServiceBlock> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApiImpl()
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
    return SpecapiLangPackage.Literals.API;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseUrl()
  {
    return baseUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseUrl(String newBaseUrl)
  {
    String oldBaseUrl = baseUrl;
    baseUrl = newBaseUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.API__BASE_URL, oldBaseUrl, baseUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceBlock> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<ServiceBlock>(ServiceBlock.class, this, SpecapiLangPackage.API__BLOCKS);
    }
    return blocks;
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
      case SpecapiLangPackage.API__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
      case SpecapiLangPackage.API__BASE_URL:
        return getBaseUrl();
      case SpecapiLangPackage.API__BLOCKS:
        return getBlocks();
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
      case SpecapiLangPackage.API__BASE_URL:
        setBaseUrl((String)newValue);
        return;
      case SpecapiLangPackage.API__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends ServiceBlock>)newValue);
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
      case SpecapiLangPackage.API__BASE_URL:
        setBaseUrl(BASE_URL_EDEFAULT);
        return;
      case SpecapiLangPackage.API__BLOCKS:
        getBlocks().clear();
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
      case SpecapiLangPackage.API__BASE_URL:
        return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
      case SpecapiLangPackage.API__BLOCKS:
        return blocks != null && !blocks.isEmpty();
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
    result.append(" (baseUrl: ");
    result.append(baseUrl);
    result.append(')');
    return result.toString();
  }

} //ApiImpl

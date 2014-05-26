/**
 */
package org.specapi.specapiLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.specapi.specapiLang.SpecapiLangPackage;
import org.specapi.specapiLang.UserTypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.impl.UserTypeDeclarationImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.specapi.specapiLang.impl.UserTypeDeclarationImpl#isNogen <em>Nogen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserTypeDeclarationImpl extends DeclarationImpl implements UserTypeDeclaration
{
  /**
   * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected static final String KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected String keyword = KEYWORD_EDEFAULT;

  /**
   * The default value of the '{@link #isNogen() <em>Nogen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNogen()
   * @generated
   * @ordered
   */
  protected static final boolean NOGEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNogen() <em>Nogen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNogen()
   * @generated
   * @ordered
   */
  protected boolean nogen = NOGEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserTypeDeclarationImpl()
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
    return SpecapiLangPackage.Literals.USER_TYPE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyword()
  {
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyword(String newKeyword)
  {
    String oldKeyword = keyword;
    keyword = newKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.USER_TYPE_DECLARATION__KEYWORD, oldKeyword, keyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNogen()
  {
    return nogen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNogen(boolean newNogen)
  {
    boolean oldNogen = nogen;
    nogen = newNogen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecapiLangPackage.USER_TYPE_DECLARATION__NOGEN, oldNogen, nogen));
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
      case SpecapiLangPackage.USER_TYPE_DECLARATION__KEYWORD:
        return getKeyword();
      case SpecapiLangPackage.USER_TYPE_DECLARATION__NOGEN:
        return isNogen();
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
      case SpecapiLangPackage.USER_TYPE_DECLARATION__KEYWORD:
        setKeyword((String)newValue);
        return;
      case SpecapiLangPackage.USER_TYPE_DECLARATION__NOGEN:
        setNogen((Boolean)newValue);
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
      case SpecapiLangPackage.USER_TYPE_DECLARATION__KEYWORD:
        setKeyword(KEYWORD_EDEFAULT);
        return;
      case SpecapiLangPackage.USER_TYPE_DECLARATION__NOGEN:
        setNogen(NOGEN_EDEFAULT);
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
      case SpecapiLangPackage.USER_TYPE_DECLARATION__KEYWORD:
        return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
      case SpecapiLangPackage.USER_TYPE_DECLARATION__NOGEN:
        return nogen != NOGEN_EDEFAULT;
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
    result.append(" (keyword: ");
    result.append(keyword);
    result.append(", nogen: ");
    result.append(nogen);
    result.append(')');
    return result.toString();
  }

} //UserTypeDeclarationImpl

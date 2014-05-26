/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.Api#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.specapi.specapiLang.Api#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getApi()
 * @model
 * @generated
 */
public interface Api extends Declaration
{
  /**
   * Returns the value of the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Url</em>' attribute.
   * @see #setBaseUrl(String)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getApi_BaseUrl()
   * @model
   * @generated
   */
  String getBaseUrl();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.Api#getBaseUrl <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Url</em>' attribute.
   * @see #getBaseUrl()
   * @generated
   */
  void setBaseUrl(String value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.specapi.specapiLang.ServiceBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.specapi.specapiLang.SpecapiLangPackage#getApi_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<ServiceBlock> getBlocks();

} // Api

/**
 */
package org.specapi.specapiLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.ResponseBlock#getCode <em>Code</em>}</li>
 *   <li>{@link org.specapi.specapiLang.ResponseBlock#getMessage <em>Message</em>}</li>
 *   <li>{@link org.specapi.specapiLang.ResponseBlock#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.specapi.specapiLang.ResponseBlock#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getResponseBlock()
 * @model
 * @generated
 */
public interface ResponseBlock extends HttpMethodBlock
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(int)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getResponseBlock_Code()
   * @model
   * @generated
   */
  int getCode();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ResponseBlock#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(int value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getResponseBlock_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ResponseBlock#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ComplexTypeDeclaration)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getResponseBlock_SuperType()
   * @model
   * @generated
   */
  ComplexTypeDeclaration getSuperType();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ResponseBlock#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ComplexTypeDeclaration value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(BlockType)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getResponseBlock_Type()
   * @model containment="true"
   * @generated
   */
  BlockType getType();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ResponseBlock#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(BlockType value);

} // ResponseBlock

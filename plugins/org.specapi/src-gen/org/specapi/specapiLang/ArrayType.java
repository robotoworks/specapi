/**
 */
package org.specapi.specapiLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.ArrayType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.specapi.specapiLang.ArrayType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(Type)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getArrayType_ElementType()
   * @model containment="true"
   * @generated
   */
  Type getElementType();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ArrayType#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(Type value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getArrayType_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ArrayType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // ArrayType

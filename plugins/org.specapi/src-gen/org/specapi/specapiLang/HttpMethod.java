/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.HttpMethod#getType <em>Type</em>}</li>
 *   <li>{@link org.specapi.specapiLang.HttpMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.specapi.specapiLang.HttpMethod#getPath <em>Path</em>}</li>
 *   <li>{@link org.specapi.specapiLang.HttpMethod#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getHttpMethod()
 * @model
 * @generated
 */
public interface HttpMethod extends ServiceBlock
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.specapi.specapiLang.HttpMethodType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.specapi.specapiLang.HttpMethodType
   * @see #setType(HttpMethodType)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getHttpMethod_Type()
   * @model
   * @generated
   */
  HttpMethodType getType();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.HttpMethod#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.specapi.specapiLang.HttpMethodType
   * @see #getType()
   * @generated
   */
  void setType(HttpMethodType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getHttpMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.HttpMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Path)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getHttpMethod_Path()
   * @model containment="true"
   * @generated
   */
  Path getPath();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.HttpMethod#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Path value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.specapi.specapiLang.HttpMethodBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.specapi.specapiLang.SpecapiLangPackage#getHttpMethod_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<HttpMethodBlock> getBlocks();

} // HttpMethod

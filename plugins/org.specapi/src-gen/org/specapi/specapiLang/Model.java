/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.Model#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.specapi.specapiLang.Model#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.Model#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.specapi.specapiLang.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.specapi.specapiLang.SpecapiLangPackage#getModel_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // Model

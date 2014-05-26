/**
 */
package org.specapi.specapiLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.ComplexTypeDeclaration#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getComplexTypeDeclaration()
 * @model
 * @generated
 */
public interface ComplexTypeDeclaration extends UserTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(ComplexTypeLiteral)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getComplexTypeDeclaration_Literal()
   * @model containment="true"
   * @generated
   */
  ComplexTypeLiteral getLiteral();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.ComplexTypeDeclaration#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(ComplexTypeLiteral value);

} // ComplexTypeDeclaration

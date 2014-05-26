/**
 */
package org.specapi.specapiLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.EnumTypeDeclaration#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.specapi.specapiLang.EnumTypeDeclaration#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getEnumTypeDeclaration()
 * @model
 * @generated
 */
public interface EnumTypeDeclaration extends UserTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(IntegerType)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getEnumTypeDeclaration_SuperType()
   * @model containment="true"
   * @generated
   */
  IntegerType getSuperType();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.EnumTypeDeclaration#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(IntegerType value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(EnumTypeLiteral)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getEnumTypeDeclaration_Literal()
   * @model containment="true"
   * @generated
   */
  EnumTypeLiteral getLiteral();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.EnumTypeDeclaration#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(EnumTypeLiteral value);

} // EnumTypeDeclaration

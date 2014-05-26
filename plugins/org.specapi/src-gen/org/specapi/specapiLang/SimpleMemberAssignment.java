/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Member Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.SimpleMemberAssignment#getMember <em>Member</em>}</li>
 *   <li>{@link org.specapi.specapiLang.SimpleMemberAssignment#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getSimpleMemberAssignment()
 * @model
 * @generated
 */
public interface SimpleMemberAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' containment reference.
   * @see #setMember(SimpleMember)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getSimpleMemberAssignment_Member()
   * @model containment="true"
   * @generated
   */
  SimpleMember getMember();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.SimpleMemberAssignment#getMember <em>Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' containment reference.
   * @see #getMember()
   * @generated
   */
  void setMember(SimpleMember value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Literal)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getSimpleMemberAssignment_DefaultValue()
   * @model containment="true"
   * @generated
   */
  Literal getDefaultValue();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.SimpleMemberAssignment#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Literal value);

} // SimpleMemberAssignment

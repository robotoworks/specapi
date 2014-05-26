/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Params Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.ParamsBlock#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getParamsBlock()
 * @model
 * @generated
 */
public interface ParamsBlock extends ServiceBlock, HttpMethodBlock
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.specapi.specapiLang.SimpleMemberAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.specapi.specapiLang.SpecapiLangPackage#getParamsBlock_Params()
   * @model containment="true"
   * @generated
   */
  EList<SimpleMemberAssignment> getParams();

} // ParamsBlock

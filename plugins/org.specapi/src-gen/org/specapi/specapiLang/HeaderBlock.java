/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.HeaderBlock#getHeaders <em>Headers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getHeaderBlock()
 * @model
 * @generated
 */
public interface HeaderBlock extends ServiceBlock, HttpMethodBlock
{
  /**
   * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
   * The list contents are of type {@link org.specapi.specapiLang.Header}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headers</em>' containment reference list.
   * @see org.specapi.specapiLang.SpecapiLangPackage#getHeaderBlock_Headers()
   * @model containment="true"
   * @generated
   */
  EList<Header> getHeaders();

} // HeaderBlock

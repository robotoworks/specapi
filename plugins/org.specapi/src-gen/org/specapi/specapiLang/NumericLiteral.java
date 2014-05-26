/**
 */
package org.specapi.specapiLang;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.specapi.specapiLang.NumericLiteral#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.specapi.specapiLang.SpecapiLangPackage#getNumericLiteral()
 * @model
 * @generated
 */
public interface NumericLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(BigDecimal)
   * @see org.specapi.specapiLang.SpecapiLangPackage#getNumericLiteral_Literal()
   * @model
   * @generated
   */
  BigDecimal getLiteral();

  /**
   * Sets the value of the '{@link org.specapi.specapiLang.NumericLiteral#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(BigDecimal value);

} // NumericLiteral

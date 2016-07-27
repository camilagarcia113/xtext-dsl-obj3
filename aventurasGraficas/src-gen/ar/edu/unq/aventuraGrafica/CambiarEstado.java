/**
 */
package ar.edu.unq.aventuraGrafica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cambiar Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableACambiar <em>Variable ACambiar</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getValorNuevo <em>Valor Nuevo</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableCondicion <em>Variable Condicion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getValorCondicional <em>Valor Condicional</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getCambiarEstado()
 * @model
 * @generated
 */
public interface CambiarEstado extends Accion
{
  /**
   * Returns the value of the '<em><b>Variable ACambiar</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable ACambiar</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable ACambiar</em>' reference.
   * @see #setVariableACambiar(EstadoDeObjeto)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getCambiarEstado_VariableACambiar()
   * @model
   * @generated
   */
  EstadoDeObjeto getVariableACambiar();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableACambiar <em>Variable ACambiar</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable ACambiar</em>' reference.
   * @see #getVariableACambiar()
   * @generated
   */
  void setVariableACambiar(EstadoDeObjeto value);

  /**
   * Returns the value of the '<em><b>Valor Nuevo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Nuevo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Nuevo</em>' attribute.
   * @see #setValorNuevo(String)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getCambiarEstado_ValorNuevo()
   * @model
   * @generated
   */
  String getValorNuevo();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getValorNuevo <em>Valor Nuevo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Nuevo</em>' attribute.
   * @see #getValorNuevo()
   * @generated
   */
  void setValorNuevo(String value);

  /**
   * Returns the value of the '<em><b>Variable Condicion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Condicion</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Condicion</em>' reference.
   * @see #setVariableCondicion(EstadoDeObjeto)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getCambiarEstado_VariableCondicion()
   * @model
   * @generated
   */
  EstadoDeObjeto getVariableCondicion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableCondicion <em>Variable Condicion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Condicion</em>' reference.
   * @see #getVariableCondicion()
   * @generated
   */
  void setVariableCondicion(EstadoDeObjeto value);

  /**
   * Returns the value of the '<em><b>Valor Condicional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Condicional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Condicional</em>' attribute.
   * @see #setValorCondicional(String)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getCambiarEstado_ValorCondicional()
   * @model
   * @generated
   */
  String getValorCondicional();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getValorCondicional <em>Valor Condicional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Condicional</em>' attribute.
   * @see #getValorCondicional()
   * @generated
   */
  void setValorCondicional(String value);

} // CambiarEstado

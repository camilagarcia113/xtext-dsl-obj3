/**
 */
package ar.edu.unq.aventuraGrafica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ir A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.IrA#getHabitacion <em>Habitacion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.IrA#getVariable <em>Variable</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.IrA#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getIrA()
 * @model
 * @generated
 */
public interface IrA extends Accion
{
  /**
   * Returns the value of the '<em><b>Habitacion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Habitacion</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Habitacion</em>' reference.
   * @see #setHabitacion(Habitacion)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getIrA_Habitacion()
   * @model
   * @generated
   */
  Habitacion getHabitacion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.IrA#getHabitacion <em>Habitacion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Habitacion</em>' reference.
   * @see #getHabitacion()
   * @generated
   */
  void setHabitacion(Habitacion value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(EstadoDeObjeto)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getIrA_Variable()
   * @model
   * @generated
   */
  EstadoDeObjeto getVariable();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.IrA#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(EstadoDeObjeto value);

  /**
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(String)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getIrA_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.IrA#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

} // IrA

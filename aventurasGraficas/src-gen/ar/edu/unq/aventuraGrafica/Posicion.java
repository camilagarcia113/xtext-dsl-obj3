/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Posicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Posicion#getHabitacion <em>Habitacion</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getPosicion()
 * @model
 * @generated
 */
public interface Posicion extends EObject
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
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getPosicion_Habitacion()
   * @model
   * @generated
   */
  Habitacion getHabitacion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Posicion#getHabitacion <em>Habitacion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Habitacion</em>' reference.
   * @see #getHabitacion()
   * @generated
   */
  void setHabitacion(Habitacion value);

} // Posicion

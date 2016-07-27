/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Juego</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Juego#getObjetos <em>Objetos</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Juego#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Juego#getHabitaciones <em>Habitaciones</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Juego#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getJuego()
 * @model
 * @generated
 */
public interface Juego extends EObject
{
  /**
   * Returns the value of the '<em><b>Objetos</b></em>' containment reference list.
   * The list contents are of type {@link ar.edu.unq.aventuraGrafica.Objeto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objetos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objetos</em>' containment reference list.
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getJuego_Objetos()
   * @model containment="true"
   * @generated
   */
  EList<Objeto> getObjetos();

  /**
   * Returns the value of the '<em><b>Posicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Posicion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Posicion</em>' containment reference.
   * @see #setPosicion(Posicion)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getJuego_Posicion()
   * @model containment="true"
   * @generated
   */
  Posicion getPosicion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Juego#getPosicion <em>Posicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Posicion</em>' containment reference.
   * @see #getPosicion()
   * @generated
   */
  void setPosicion(Posicion value);

  /**
   * Returns the value of the '<em><b>Habitaciones</b></em>' containment reference list.
   * The list contents are of type {@link ar.edu.unq.aventuraGrafica.Habitacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Habitaciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Habitaciones</em>' containment reference list.
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getJuego_Habitaciones()
   * @model containment="true"
   * @generated
   */
  EList<Habitacion> getHabitaciones();

  /**
   * Returns the value of the '<em><b>Comandos</b></em>' containment reference list.
   * The list contents are of type {@link ar.edu.unq.aventuraGrafica.Comando}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comandos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comandos</em>' containment reference list.
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getJuego_Comandos()
   * @model containment="true"
   * @generated
   */
  EList<Comando> getComandos();

} // Juego

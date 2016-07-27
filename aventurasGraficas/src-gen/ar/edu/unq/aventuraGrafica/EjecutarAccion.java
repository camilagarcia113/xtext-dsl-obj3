/**
 */
package ar.edu.unq.aventuraGrafica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejecutar Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.EjecutarAccion#getAccion <em>Accion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.EjecutarAccion#getObjeto <em>Objeto</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getEjecutarAccion()
 * @model
 * @generated
 */
public interface EjecutarAccion extends Comando
{
  /**
   * Returns the value of the '<em><b>Accion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accion</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accion</em>' reference.
   * @see #setAccion(Accion)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getEjecutarAccion_Accion()
   * @model
   * @generated
   */
  Accion getAccion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.EjecutarAccion#getAccion <em>Accion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accion</em>' reference.
   * @see #getAccion()
   * @generated
   */
  void setAccion(Accion value);

  /**
   * Returns the value of the '<em><b>Objeto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objeto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objeto</em>' reference.
   * @see #setObjeto(Objeto)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getEjecutarAccion_Objeto()
   * @model
   * @generated
   */
  Objeto getObjeto();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.EjecutarAccion#getObjeto <em>Objeto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objeto</em>' reference.
   * @see #getObjeto()
   * @generated
   */
  void setObjeto(Objeto value);

} // EjecutarAccion

/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado De Objeto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getName <em>Name</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getEstadoDeObjeto()
 * @model
 * @generated
 */
public interface EstadoDeObjeto extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getEstadoDeObjeto_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getEstadoDeObjeto_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

} // EstadoDeObjeto

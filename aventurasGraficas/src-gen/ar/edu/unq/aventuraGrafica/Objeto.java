/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objeto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Objeto#isRecogible <em>Recogible</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Objeto#getName <em>Name</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Objeto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Objeto#getEstado <em>Estado</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Objeto#getAcciones <em>Acciones</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getObjeto()
 * @model
 * @generated
 */
public interface Objeto extends EObject
{
  /**
   * Returns the value of the '<em><b>Recogible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recogible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recogible</em>' attribute.
   * @see #setRecogible(boolean)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getObjeto_Recogible()
   * @model
   * @generated
   */
  boolean isRecogible();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Objeto#isRecogible <em>Recogible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recogible</em>' attribute.
   * @see #isRecogible()
   * @generated
   */
  void setRecogible(boolean value);

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
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getObjeto_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Objeto#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descripcion</em>' attribute.
   * @see #setDescripcion(String)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getObjeto_Descripcion()
   * @model
   * @generated
   */
  String getDescripcion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Objeto#getDescripcion <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descripcion</em>' attribute.
   * @see #getDescripcion()
   * @generated
   */
  void setDescripcion(String value);

  /**
   * Returns the value of the '<em><b>Estado</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estado</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estado</em>' containment reference.
   * @see #setEstado(EstadoDeObjeto)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getObjeto_Estado()
   * @model containment="true"
   * @generated
   */
  EstadoDeObjeto getEstado();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Objeto#getEstado <em>Estado</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estado</em>' containment reference.
   * @see #getEstado()
   * @generated
   */
  void setEstado(EstadoDeObjeto value);

  /**
   * Returns the value of the '<em><b>Acciones</b></em>' containment reference list.
   * The list contents are of type {@link ar.edu.unq.aventuraGrafica.Accion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acciones</em>' containment reference list.
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getObjeto_Acciones()
   * @model containment="true"
   * @generated
   */
  EList<Accion> getAcciones();

} // Objeto

/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Habitacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#isFinal <em>Final</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#getName <em>Name</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#getEstadoACambiar <em>Estado ACambiar</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#getObjetoACambiar <em>Objeto ACambiar</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#getValorNuevo <em>Valor Nuevo</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.Habitacion#getObjetos <em>Objetos</em>}</li>
 * </ul>
 *
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion()
 * @model
 * @generated
 */
public interface Habitacion extends EObject
{
  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_Final()
   * @model
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Habitacion#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

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
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Habitacion#getName <em>Name</em>}' attribute.
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
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_Descripcion()
   * @model
   * @generated
   */
  String getDescripcion();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Habitacion#getDescripcion <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descripcion</em>' attribute.
   * @see #getDescripcion()
   * @generated
   */
  void setDescripcion(String value);

  /**
   * Returns the value of the '<em><b>Estado ACambiar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estado ACambiar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estado ACambiar</em>' attribute.
   * @see #setEstadoACambiar(String)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_EstadoACambiar()
   * @model
   * @generated
   */
  String getEstadoACambiar();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Habitacion#getEstadoACambiar <em>Estado ACambiar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estado ACambiar</em>' attribute.
   * @see #getEstadoACambiar()
   * @generated
   */
  void setEstadoACambiar(String value);

  /**
   * Returns the value of the '<em><b>Objeto ACambiar</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objeto ACambiar</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objeto ACambiar</em>' reference.
   * @see #setObjetoACambiar(Objeto)
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_ObjetoACambiar()
   * @model
   * @generated
   */
  Objeto getObjetoACambiar();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Habitacion#getObjetoACambiar <em>Objeto ACambiar</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objeto ACambiar</em>' reference.
   * @see #getObjetoACambiar()
   * @generated
   */
  void setObjetoACambiar(Objeto value);

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
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_ValorNuevo()
   * @model
   * @generated
   */
  String getValorNuevo();

  /**
   * Sets the value of the '{@link ar.edu.unq.aventuraGrafica.Habitacion#getValorNuevo <em>Valor Nuevo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Nuevo</em>' attribute.
   * @see #getValorNuevo()
   * @generated
   */
  void setValorNuevo(String value);

  /**
   * Returns the value of the '<em><b>Objetos</b></em>' reference list.
   * The list contents are of type {@link ar.edu.unq.aventuraGrafica.Objeto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objetos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objetos</em>' reference list.
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#getHabitacion_Objetos()
   * @model
   * @generated
   */
  EList<Objeto> getObjetos();

} // Habitacion

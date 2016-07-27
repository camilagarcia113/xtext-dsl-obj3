/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage
 * @generated
 */
public interface AventuraGraficaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AventuraGraficaFactory eINSTANCE = ar.edu.unq.aventuraGrafica.impl.AventuraGraficaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Juego</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Juego</em>'.
   * @generated
   */
  Juego createJuego();

  /**
   * Returns a new object of class '<em>Objeto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objeto</em>'.
   * @generated
   */
  Objeto createObjeto();

  /**
   * Returns a new object of class '<em>Habitacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Habitacion</em>'.
   * @generated
   */
  Habitacion createHabitacion();

  /**
   * Returns a new object of class '<em>Posicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Posicion</em>'.
   * @generated
   */
  Posicion createPosicion();

  /**
   * Returns a new object of class '<em>Comando</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando</em>'.
   * @generated
   */
  Comando createComando();

  /**
   * Returns a new object of class '<em>Mostrar Objetos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mostrar Objetos</em>'.
   * @generated
   */
  MostrarObjetos createMostrarObjetos();

  /**
   * Returns a new object of class '<em>Describir Objeto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Describir Objeto</em>'.
   * @generated
   */
  DescribirObjeto createDescribirObjeto();

  /**
   * Returns a new object of class '<em>Recoger Objeto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recoger Objeto</em>'.
   * @generated
   */
  RecogerObjeto createRecogerObjeto();

  /**
   * Returns a new object of class '<em>Mostrar Inventario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mostrar Inventario</em>'.
   * @generated
   */
  MostrarInventario createMostrarInventario();

  /**
   * Returns a new object of class '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acciones</em>'.
   * @generated
   */
  Acciones createAcciones();

  /**
   * Returns a new object of class '<em>Ejecutar Accion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ejecutar Accion</em>'.
   * @generated
   */
  EjecutarAccion createEjecutarAccion();

  /**
   * Returns a new object of class '<em>Accion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accion</em>'.
   * @generated
   */
  Accion createAccion();

  /**
   * Returns a new object of class '<em>Ir A</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ir A</em>'.
   * @generated
   */
  IrA createIrA();

  /**
   * Returns a new object of class '<em>Cambiar Estado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cambiar Estado</em>'.
   * @generated
   */
  CambiarEstado createCambiarEstado();

  /**
   * Returns a new object of class '<em>Estado De Objeto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estado De Objeto</em>'.
   * @generated
   */
  EstadoDeObjeto createEstadoDeObjeto();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AventuraGraficaPackage getAventuraGraficaPackage();

} //AventuraGraficaFactory

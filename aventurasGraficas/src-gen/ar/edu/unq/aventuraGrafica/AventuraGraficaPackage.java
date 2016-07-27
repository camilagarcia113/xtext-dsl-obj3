/**
 */
package ar.edu.unq.aventuraGrafica;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaFactory
 * @model kind="package"
 * @generated
 */
public interface AventuraGraficaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aventuraGrafica";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aventuraGrafica";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AventuraGraficaPackage eINSTANCE = ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl.init();

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.JuegoImpl <em>Juego</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.JuegoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getJuego()
   * @generated
   */
  int JUEGO = 0;

  /**
   * The feature id for the '<em><b>Objetos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUEGO__OBJETOS = 0;

  /**
   * The feature id for the '<em><b>Posicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUEGO__POSICION = 1;

  /**
   * The feature id for the '<em><b>Habitaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUEGO__HABITACIONES = 2;

  /**
   * The feature id for the '<em><b>Comandos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUEGO__COMANDOS = 3;

  /**
   * The number of structural features of the '<em>Juego</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUEGO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl <em>Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.ObjetoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getObjeto()
   * @generated
   */
  int OBJETO = 1;

  /**
   * The feature id for the '<em><b>Recogible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__RECOGIBLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__NAME = 1;

  /**
   * The feature id for the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__DESCRIPCION = 2;

  /**
   * The feature id for the '<em><b>Estado</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__ESTADO = 3;

  /**
   * The feature id for the '<em><b>Acciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__ACCIONES = 4;

  /**
   * The number of structural features of the '<em>Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl <em>Habitacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.HabitacionImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getHabitacion()
   * @generated
   */
  int HABITACION = 2;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__FINAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__NAME = 1;

  /**
   * The feature id for the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__DESCRIPCION = 2;

  /**
   * The feature id for the '<em><b>Estado ACambiar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__ESTADO_ACAMBIAR = 3;

  /**
   * The feature id for the '<em><b>Objeto ACambiar</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__OBJETO_ACAMBIAR = 4;

  /**
   * The feature id for the '<em><b>Valor Nuevo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__VALOR_NUEVO = 5;

  /**
   * The feature id for the '<em><b>Objetos</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION__OBJETOS = 6;

  /**
   * The number of structural features of the '<em>Habitacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HABITACION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.PosicionImpl <em>Posicion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.PosicionImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getPosicion()
   * @generated
   */
  int POSICION = 3;

  /**
   * The feature id for the '<em><b>Habitacion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSICION__HABITACION = 0;

  /**
   * The number of structural features of the '<em>Posicion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSICION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.ComandoImpl <em>Comando</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.ComandoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getComando()
   * @generated
   */
  int COMANDO = 4;

  /**
   * The number of structural features of the '<em>Comando</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMANDO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.MostrarObjetosImpl <em>Mostrar Objetos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.MostrarObjetosImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getMostrarObjetos()
   * @generated
   */
  int MOSTRAR_OBJETOS = 5;

  /**
   * The number of structural features of the '<em>Mostrar Objetos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOSTRAR_OBJETOS_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.DescribirObjetoImpl <em>Describir Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.DescribirObjetoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getDescribirObjeto()
   * @generated
   */
  int DESCRIBIR_OBJETO = 6;

  /**
   * The feature id for the '<em><b>Objeto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBIR_OBJETO__OBJETO = COMANDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Describir Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBIR_OBJETO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.RecogerObjetoImpl <em>Recoger Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.RecogerObjetoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getRecogerObjeto()
   * @generated
   */
  int RECOGER_OBJETO = 7;

  /**
   * The feature id for the '<em><b>Objeto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOGER_OBJETO__OBJETO = COMANDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Recoger Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOGER_OBJETO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.MostrarInventarioImpl <em>Mostrar Inventario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.MostrarInventarioImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getMostrarInventario()
   * @generated
   */
  int MOSTRAR_INVENTARIO = 8;

  /**
   * The number of structural features of the '<em>Mostrar Inventario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOSTRAR_INVENTARIO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.AccionesImpl <em>Acciones</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.AccionesImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getAcciones()
   * @generated
   */
  int ACCIONES = 9;

  /**
   * The feature id for the '<em><b>Objeto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIONES__OBJETO = COMANDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Acciones</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIONES_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.EjecutarAccionImpl <em>Ejecutar Accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.EjecutarAccionImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getEjecutarAccion()
   * @generated
   */
  int EJECUTAR_ACCION = 10;

  /**
   * The feature id for the '<em><b>Accion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJECUTAR_ACCION__ACCION = COMANDO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Objeto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJECUTAR_ACCION__OBJETO = COMANDO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ejecutar Accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJECUTAR_ACCION_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.AccionImpl <em>Accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.AccionImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getAccion()
   * @generated
   */
  int ACCION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION__NAME = 0;

  /**
   * The number of structural features of the '<em>Accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.IrAImpl <em>Ir A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.IrAImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getIrA()
   * @generated
   */
  int IR_A = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IR_A__NAME = ACCION__NAME;

  /**
   * The feature id for the '<em><b>Habitacion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IR_A__HABITACION = ACCION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IR_A__VARIABLE = ACCION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IR_A__VALOR = ACCION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Ir A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IR_A_FEATURE_COUNT = ACCION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl <em>Cambiar Estado</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getCambiarEstado()
   * @generated
   */
  int CAMBIAR_ESTADO = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMBIAR_ESTADO__NAME = ACCION__NAME;

  /**
   * The feature id for the '<em><b>Variable ACambiar</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMBIAR_ESTADO__VARIABLE_ACAMBIAR = ACCION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valor Nuevo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMBIAR_ESTADO__VALOR_NUEVO = ACCION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Condicion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMBIAR_ESTADO__VARIABLE_CONDICION = ACCION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Valor Condicional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMBIAR_ESTADO__VALOR_CONDICIONAL = ACCION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Cambiar Estado</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMBIAR_ESTADO_FEATURE_COUNT = ACCION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ar.edu.unq.aventuraGrafica.impl.EstadoDeObjetoImpl <em>Estado De Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ar.edu.unq.aventuraGrafica.impl.EstadoDeObjetoImpl
   * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getEstadoDeObjeto()
   * @generated
   */
  int ESTADO_DE_OBJETO = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADO_DE_OBJETO__NAME = 0;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADO_DE_OBJETO__VALOR = 1;

  /**
   * The number of structural features of the '<em>Estado De Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADO_DE_OBJETO_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Juego <em>Juego</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Juego</em>'.
   * @see ar.edu.unq.aventuraGrafica.Juego
   * @generated
   */
  EClass getJuego();

  /**
   * Returns the meta object for the containment reference list '{@link ar.edu.unq.aventuraGrafica.Juego#getObjetos <em>Objetos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objetos</em>'.
   * @see ar.edu.unq.aventuraGrafica.Juego#getObjetos()
   * @see #getJuego()
   * @generated
   */
  EReference getJuego_Objetos();

  /**
   * Returns the meta object for the containment reference '{@link ar.edu.unq.aventuraGrafica.Juego#getPosicion <em>Posicion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Posicion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Juego#getPosicion()
   * @see #getJuego()
   * @generated
   */
  EReference getJuego_Posicion();

  /**
   * Returns the meta object for the containment reference list '{@link ar.edu.unq.aventuraGrafica.Juego#getHabitaciones <em>Habitaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Habitaciones</em>'.
   * @see ar.edu.unq.aventuraGrafica.Juego#getHabitaciones()
   * @see #getJuego()
   * @generated
   */
  EReference getJuego_Habitaciones();

  /**
   * Returns the meta object for the containment reference list '{@link ar.edu.unq.aventuraGrafica.Juego#getComandos <em>Comandos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comandos</em>'.
   * @see ar.edu.unq.aventuraGrafica.Juego#getComandos()
   * @see #getJuego()
   * @generated
   */
  EReference getJuego_Comandos();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Objeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.Objeto
   * @generated
   */
  EClass getObjeto();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Objeto#isRecogible <em>Recogible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recogible</em>'.
   * @see ar.edu.unq.aventuraGrafica.Objeto#isRecogible()
   * @see #getObjeto()
   * @generated
   */
  EAttribute getObjeto_Recogible();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Objeto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.edu.unq.aventuraGrafica.Objeto#getName()
   * @see #getObjeto()
   * @generated
   */
  EAttribute getObjeto_Name();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Objeto#getDescripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descripcion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Objeto#getDescripcion()
   * @see #getObjeto()
   * @generated
   */
  EAttribute getObjeto_Descripcion();

  /**
   * Returns the meta object for the containment reference '{@link ar.edu.unq.aventuraGrafica.Objeto#getEstado <em>Estado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Estado</em>'.
   * @see ar.edu.unq.aventuraGrafica.Objeto#getEstado()
   * @see #getObjeto()
   * @generated
   */
  EReference getObjeto_Estado();

  /**
   * Returns the meta object for the containment reference list '{@link ar.edu.unq.aventuraGrafica.Objeto#getAcciones <em>Acciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Acciones</em>'.
   * @see ar.edu.unq.aventuraGrafica.Objeto#getAcciones()
   * @see #getObjeto()
   * @generated
   */
  EReference getObjeto_Acciones();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Habitacion <em>Habitacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Habitacion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion
   * @generated
   */
  EClass getHabitacion();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Habitacion#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#isFinal()
   * @see #getHabitacion()
   * @generated
   */
  EAttribute getHabitacion_Final();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Habitacion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#getName()
   * @see #getHabitacion()
   * @generated
   */
  EAttribute getHabitacion_Name();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Habitacion#getDescripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descripcion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#getDescripcion()
   * @see #getHabitacion()
   * @generated
   */
  EAttribute getHabitacion_Descripcion();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Habitacion#getEstadoACambiar <em>Estado ACambiar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Estado ACambiar</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#getEstadoACambiar()
   * @see #getHabitacion()
   * @generated
   */
  EAttribute getHabitacion_EstadoACambiar();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.Habitacion#getObjetoACambiar <em>Objeto ACambiar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objeto ACambiar</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#getObjetoACambiar()
   * @see #getHabitacion()
   * @generated
   */
  EReference getHabitacion_ObjetoACambiar();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Habitacion#getValorNuevo <em>Valor Nuevo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor Nuevo</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#getValorNuevo()
   * @see #getHabitacion()
   * @generated
   */
  EAttribute getHabitacion_ValorNuevo();

  /**
   * Returns the meta object for the reference list '{@link ar.edu.unq.aventuraGrafica.Habitacion#getObjetos <em>Objetos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Objetos</em>'.
   * @see ar.edu.unq.aventuraGrafica.Habitacion#getObjetos()
   * @see #getHabitacion()
   * @generated
   */
  EReference getHabitacion_Objetos();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Posicion <em>Posicion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Posicion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Posicion
   * @generated
   */
  EClass getPosicion();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.Posicion#getHabitacion <em>Habitacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Habitacion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Posicion#getHabitacion()
   * @see #getPosicion()
   * @generated
   */
  EReference getPosicion_Habitacion();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Comando <em>Comando</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comando</em>'.
   * @see ar.edu.unq.aventuraGrafica.Comando
   * @generated
   */
  EClass getComando();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.MostrarObjetos <em>Mostrar Objetos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mostrar Objetos</em>'.
   * @see ar.edu.unq.aventuraGrafica.MostrarObjetos
   * @generated
   */
  EClass getMostrarObjetos();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.DescribirObjeto <em>Describir Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Describir Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.DescribirObjeto
   * @generated
   */
  EClass getDescribirObjeto();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.DescribirObjeto#getObjeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.DescribirObjeto#getObjeto()
   * @see #getDescribirObjeto()
   * @generated
   */
  EReference getDescribirObjeto_Objeto();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.RecogerObjeto <em>Recoger Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recoger Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.RecogerObjeto
   * @generated
   */
  EClass getRecogerObjeto();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.RecogerObjeto#getObjeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.RecogerObjeto#getObjeto()
   * @see #getRecogerObjeto()
   * @generated
   */
  EReference getRecogerObjeto_Objeto();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.MostrarInventario <em>Mostrar Inventario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mostrar Inventario</em>'.
   * @see ar.edu.unq.aventuraGrafica.MostrarInventario
   * @generated
   */
  EClass getMostrarInventario();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Acciones <em>Acciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acciones</em>'.
   * @see ar.edu.unq.aventuraGrafica.Acciones
   * @generated
   */
  EClass getAcciones();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.Acciones#getObjeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.Acciones#getObjeto()
   * @see #getAcciones()
   * @generated
   */
  EReference getAcciones_Objeto();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.EjecutarAccion <em>Ejecutar Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ejecutar Accion</em>'.
   * @see ar.edu.unq.aventuraGrafica.EjecutarAccion
   * @generated
   */
  EClass getEjecutarAccion();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.EjecutarAccion#getAccion <em>Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Accion</em>'.
   * @see ar.edu.unq.aventuraGrafica.EjecutarAccion#getAccion()
   * @see #getEjecutarAccion()
   * @generated
   */
  EReference getEjecutarAccion_Accion();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.EjecutarAccion#getObjeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.EjecutarAccion#getObjeto()
   * @see #getEjecutarAccion()
   * @generated
   */
  EReference getEjecutarAccion_Objeto();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.Accion <em>Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accion</em>'.
   * @see ar.edu.unq.aventuraGrafica.Accion
   * @generated
   */
  EClass getAccion();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.Accion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.edu.unq.aventuraGrafica.Accion#getName()
   * @see #getAccion()
   * @generated
   */
  EAttribute getAccion_Name();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.IrA <em>Ir A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ir A</em>'.
   * @see ar.edu.unq.aventuraGrafica.IrA
   * @generated
   */
  EClass getIrA();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.IrA#getHabitacion <em>Habitacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Habitacion</em>'.
   * @see ar.edu.unq.aventuraGrafica.IrA#getHabitacion()
   * @see #getIrA()
   * @generated
   */
  EReference getIrA_Habitacion();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.IrA#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see ar.edu.unq.aventuraGrafica.IrA#getVariable()
   * @see #getIrA()
   * @generated
   */
  EReference getIrA_Variable();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.IrA#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see ar.edu.unq.aventuraGrafica.IrA#getValor()
   * @see #getIrA()
   * @generated
   */
  EAttribute getIrA_Valor();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.CambiarEstado <em>Cambiar Estado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cambiar Estado</em>'.
   * @see ar.edu.unq.aventuraGrafica.CambiarEstado
   * @generated
   */
  EClass getCambiarEstado();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableACambiar <em>Variable ACambiar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable ACambiar</em>'.
   * @see ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableACambiar()
   * @see #getCambiarEstado()
   * @generated
   */
  EReference getCambiarEstado_VariableACambiar();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getValorNuevo <em>Valor Nuevo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor Nuevo</em>'.
   * @see ar.edu.unq.aventuraGrafica.CambiarEstado#getValorNuevo()
   * @see #getCambiarEstado()
   * @generated
   */
  EAttribute getCambiarEstado_ValorNuevo();

  /**
   * Returns the meta object for the reference '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableCondicion <em>Variable Condicion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable Condicion</em>'.
   * @see ar.edu.unq.aventuraGrafica.CambiarEstado#getVariableCondicion()
   * @see #getCambiarEstado()
   * @generated
   */
  EReference getCambiarEstado_VariableCondicion();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.CambiarEstado#getValorCondicional <em>Valor Condicional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor Condicional</em>'.
   * @see ar.edu.unq.aventuraGrafica.CambiarEstado#getValorCondicional()
   * @see #getCambiarEstado()
   * @generated
   */
  EAttribute getCambiarEstado_ValorCondicional();

  /**
   * Returns the meta object for class '{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto <em>Estado De Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estado De Objeto</em>'.
   * @see ar.edu.unq.aventuraGrafica.EstadoDeObjeto
   * @generated
   */
  EClass getEstadoDeObjeto();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getName()
   * @see #getEstadoDeObjeto()
   * @generated
   */
  EAttribute getEstadoDeObjeto_Name();

  /**
   * Returns the meta object for the attribute '{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see ar.edu.unq.aventuraGrafica.EstadoDeObjeto#getValor()
   * @see #getEstadoDeObjeto()
   * @generated
   */
  EAttribute getEstadoDeObjeto_Valor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AventuraGraficaFactory getAventuraGraficaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.JuegoImpl <em>Juego</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.JuegoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getJuego()
     * @generated
     */
    EClass JUEGO = eINSTANCE.getJuego();

    /**
     * The meta object literal for the '<em><b>Objetos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUEGO__OBJETOS = eINSTANCE.getJuego_Objetos();

    /**
     * The meta object literal for the '<em><b>Posicion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUEGO__POSICION = eINSTANCE.getJuego_Posicion();

    /**
     * The meta object literal for the '<em><b>Habitaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUEGO__HABITACIONES = eINSTANCE.getJuego_Habitaciones();

    /**
     * The meta object literal for the '<em><b>Comandos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUEGO__COMANDOS = eINSTANCE.getJuego_Comandos();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl <em>Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.ObjetoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getObjeto()
     * @generated
     */
    EClass OBJETO = eINSTANCE.getObjeto();

    /**
     * The meta object literal for the '<em><b>Recogible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJETO__RECOGIBLE = eINSTANCE.getObjeto_Recogible();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJETO__NAME = eINSTANCE.getObjeto_Name();

    /**
     * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJETO__DESCRIPCION = eINSTANCE.getObjeto_Descripcion();

    /**
     * The meta object literal for the '<em><b>Estado</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJETO__ESTADO = eINSTANCE.getObjeto_Estado();

    /**
     * The meta object literal for the '<em><b>Acciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJETO__ACCIONES = eINSTANCE.getObjeto_Acciones();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl <em>Habitacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.HabitacionImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getHabitacion()
     * @generated
     */
    EClass HABITACION = eINSTANCE.getHabitacion();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HABITACION__FINAL = eINSTANCE.getHabitacion_Final();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HABITACION__NAME = eINSTANCE.getHabitacion_Name();

    /**
     * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HABITACION__DESCRIPCION = eINSTANCE.getHabitacion_Descripcion();

    /**
     * The meta object literal for the '<em><b>Estado ACambiar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HABITACION__ESTADO_ACAMBIAR = eINSTANCE.getHabitacion_EstadoACambiar();

    /**
     * The meta object literal for the '<em><b>Objeto ACambiar</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HABITACION__OBJETO_ACAMBIAR = eINSTANCE.getHabitacion_ObjetoACambiar();

    /**
     * The meta object literal for the '<em><b>Valor Nuevo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HABITACION__VALOR_NUEVO = eINSTANCE.getHabitacion_ValorNuevo();

    /**
     * The meta object literal for the '<em><b>Objetos</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HABITACION__OBJETOS = eINSTANCE.getHabitacion_Objetos();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.PosicionImpl <em>Posicion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.PosicionImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getPosicion()
     * @generated
     */
    EClass POSICION = eINSTANCE.getPosicion();

    /**
     * The meta object literal for the '<em><b>Habitacion</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSICION__HABITACION = eINSTANCE.getPosicion_Habitacion();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.ComandoImpl <em>Comando</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.ComandoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getComando()
     * @generated
     */
    EClass COMANDO = eINSTANCE.getComando();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.MostrarObjetosImpl <em>Mostrar Objetos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.MostrarObjetosImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getMostrarObjetos()
     * @generated
     */
    EClass MOSTRAR_OBJETOS = eINSTANCE.getMostrarObjetos();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.DescribirObjetoImpl <em>Describir Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.DescribirObjetoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getDescribirObjeto()
     * @generated
     */
    EClass DESCRIBIR_OBJETO = eINSTANCE.getDescribirObjeto();

    /**
     * The meta object literal for the '<em><b>Objeto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIBIR_OBJETO__OBJETO = eINSTANCE.getDescribirObjeto_Objeto();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.RecogerObjetoImpl <em>Recoger Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.RecogerObjetoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getRecogerObjeto()
     * @generated
     */
    EClass RECOGER_OBJETO = eINSTANCE.getRecogerObjeto();

    /**
     * The meta object literal for the '<em><b>Objeto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECOGER_OBJETO__OBJETO = eINSTANCE.getRecogerObjeto_Objeto();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.MostrarInventarioImpl <em>Mostrar Inventario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.MostrarInventarioImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getMostrarInventario()
     * @generated
     */
    EClass MOSTRAR_INVENTARIO = eINSTANCE.getMostrarInventario();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.AccionesImpl <em>Acciones</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.AccionesImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getAcciones()
     * @generated
     */
    EClass ACCIONES = eINSTANCE.getAcciones();

    /**
     * The meta object literal for the '<em><b>Objeto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCIONES__OBJETO = eINSTANCE.getAcciones_Objeto();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.EjecutarAccionImpl <em>Ejecutar Accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.EjecutarAccionImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getEjecutarAccion()
     * @generated
     */
    EClass EJECUTAR_ACCION = eINSTANCE.getEjecutarAccion();

    /**
     * The meta object literal for the '<em><b>Accion</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EJECUTAR_ACCION__ACCION = eINSTANCE.getEjecutarAccion_Accion();

    /**
     * The meta object literal for the '<em><b>Objeto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EJECUTAR_ACCION__OBJETO = eINSTANCE.getEjecutarAccion_Objeto();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.AccionImpl <em>Accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.AccionImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getAccion()
     * @generated
     */
    EClass ACCION = eINSTANCE.getAccion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCION__NAME = eINSTANCE.getAccion_Name();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.IrAImpl <em>Ir A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.IrAImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getIrA()
     * @generated
     */
    EClass IR_A = eINSTANCE.getIrA();

    /**
     * The meta object literal for the '<em><b>Habitacion</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IR_A__HABITACION = eINSTANCE.getIrA_Habitacion();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IR_A__VARIABLE = eINSTANCE.getIrA_Variable();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IR_A__VALOR = eINSTANCE.getIrA_Valor();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl <em>Cambiar Estado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getCambiarEstado()
     * @generated
     */
    EClass CAMBIAR_ESTADO = eINSTANCE.getCambiarEstado();

    /**
     * The meta object literal for the '<em><b>Variable ACambiar</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAMBIAR_ESTADO__VARIABLE_ACAMBIAR = eINSTANCE.getCambiarEstado_VariableACambiar();

    /**
     * The meta object literal for the '<em><b>Valor Nuevo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAMBIAR_ESTADO__VALOR_NUEVO = eINSTANCE.getCambiarEstado_ValorNuevo();

    /**
     * The meta object literal for the '<em><b>Variable Condicion</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAMBIAR_ESTADO__VARIABLE_CONDICION = eINSTANCE.getCambiarEstado_VariableCondicion();

    /**
     * The meta object literal for the '<em><b>Valor Condicional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAMBIAR_ESTADO__VALOR_CONDICIONAL = eINSTANCE.getCambiarEstado_ValorCondicional();

    /**
     * The meta object literal for the '{@link ar.edu.unq.aventuraGrafica.impl.EstadoDeObjetoImpl <em>Estado De Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ar.edu.unq.aventuraGrafica.impl.EstadoDeObjetoImpl
     * @see ar.edu.unq.aventuraGrafica.impl.AventuraGraficaPackageImpl#getEstadoDeObjeto()
     * @generated
     */
    EClass ESTADO_DE_OBJETO = eINSTANCE.getEstadoDeObjeto();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTADO_DE_OBJETO__NAME = eINSTANCE.getEstadoDeObjeto_Name();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTADO_DE_OBJETO__VALOR = eINSTANCE.getEstadoDeObjeto_Valor();

  }

} //AventuraGraficaPackage

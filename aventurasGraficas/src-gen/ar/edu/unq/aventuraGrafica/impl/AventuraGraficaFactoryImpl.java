/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AventuraGraficaFactoryImpl extends EFactoryImpl implements AventuraGraficaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AventuraGraficaFactory init()
  {
    try
    {
      AventuraGraficaFactory theAventuraGraficaFactory = (AventuraGraficaFactory)EPackage.Registry.INSTANCE.getEFactory(AventuraGraficaPackage.eNS_URI);
      if (theAventuraGraficaFactory != null)
      {
        return theAventuraGraficaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AventuraGraficaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AventuraGraficaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AventuraGraficaPackage.JUEGO: return createJuego();
      case AventuraGraficaPackage.OBJETO: return createObjeto();
      case AventuraGraficaPackage.HABITACION: return createHabitacion();
      case AventuraGraficaPackage.POSICION: return createPosicion();
      case AventuraGraficaPackage.COMANDO: return createComando();
      case AventuraGraficaPackage.MOSTRAR_OBJETOS: return createMostrarObjetos();
      case AventuraGraficaPackage.DESCRIBIR_OBJETO: return createDescribirObjeto();
      case AventuraGraficaPackage.RECOGER_OBJETO: return createRecogerObjeto();
      case AventuraGraficaPackage.MOSTRAR_INVENTARIO: return createMostrarInventario();
      case AventuraGraficaPackage.ACCIONES: return createAcciones();
      case AventuraGraficaPackage.EJECUTAR_ACCION: return createEjecutarAccion();
      case AventuraGraficaPackage.ACCION: return createAccion();
      case AventuraGraficaPackage.IR_A: return createIrA();
      case AventuraGraficaPackage.CAMBIAR_ESTADO: return createCambiarEstado();
      case AventuraGraficaPackage.ESTADO_DE_OBJETO: return createEstadoDeObjeto();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Juego createJuego()
  {
    JuegoImpl juego = new JuegoImpl();
    return juego;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objeto createObjeto()
  {
    ObjetoImpl objeto = new ObjetoImpl();
    return objeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Habitacion createHabitacion()
  {
    HabitacionImpl habitacion = new HabitacionImpl();
    return habitacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Posicion createPosicion()
  {
    PosicionImpl posicion = new PosicionImpl();
    return posicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comando createComando()
  {
    ComandoImpl comando = new ComandoImpl();
    return comando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MostrarObjetos createMostrarObjetos()
  {
    MostrarObjetosImpl mostrarObjetos = new MostrarObjetosImpl();
    return mostrarObjetos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescribirObjeto createDescribirObjeto()
  {
    DescribirObjetoImpl describirObjeto = new DescribirObjetoImpl();
    return describirObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecogerObjeto createRecogerObjeto()
  {
    RecogerObjetoImpl recogerObjeto = new RecogerObjetoImpl();
    return recogerObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MostrarInventario createMostrarInventario()
  {
    MostrarInventarioImpl mostrarInventario = new MostrarInventarioImpl();
    return mostrarInventario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acciones createAcciones()
  {
    AccionesImpl acciones = new AccionesImpl();
    return acciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EjecutarAccion createEjecutarAccion()
  {
    EjecutarAccionImpl ejecutarAccion = new EjecutarAccionImpl();
    return ejecutarAccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accion createAccion()
  {
    AccionImpl accion = new AccionImpl();
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IrA createIrA()
  {
    IrAImpl irA = new IrAImpl();
    return irA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CambiarEstado createCambiarEstado()
  {
    CambiarEstadoImpl cambiarEstado = new CambiarEstadoImpl();
    return cambiarEstado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto createEstadoDeObjeto()
  {
    EstadoDeObjetoImpl estadoDeObjeto = new EstadoDeObjetoImpl();
    return estadoDeObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AventuraGraficaPackage getAventuraGraficaPackage()
  {
    return (AventuraGraficaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AventuraGraficaPackage getPackage()
  {
    return AventuraGraficaPackage.eINSTANCE;
  }

} //AventuraGraficaFactoryImpl

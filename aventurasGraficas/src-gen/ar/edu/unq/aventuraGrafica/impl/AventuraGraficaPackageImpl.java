/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.Accion;
import ar.edu.unq.aventuraGrafica.Acciones;
import ar.edu.unq.aventuraGrafica.AventuraGraficaFactory;
import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.CambiarEstado;
import ar.edu.unq.aventuraGrafica.Comando;
import ar.edu.unq.aventuraGrafica.DescribirObjeto;
import ar.edu.unq.aventuraGrafica.EjecutarAccion;
import ar.edu.unq.aventuraGrafica.EstadoDeObjeto;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.IrA;
import ar.edu.unq.aventuraGrafica.Juego;
import ar.edu.unq.aventuraGrafica.MostrarInventario;
import ar.edu.unq.aventuraGrafica.MostrarObjetos;
import ar.edu.unq.aventuraGrafica.Objeto;
import ar.edu.unq.aventuraGrafica.Posicion;
import ar.edu.unq.aventuraGrafica.RecogerObjeto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AventuraGraficaPackageImpl extends EPackageImpl implements AventuraGraficaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass juegoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass habitacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass posicionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mostrarObjetosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass describirObjetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recogerObjetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mostrarInventarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accionesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ejecutarAccionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass irAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cambiarEstadoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass estadoDeObjetoEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AventuraGraficaPackageImpl()
  {
    super(eNS_URI, AventuraGraficaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AventuraGraficaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AventuraGraficaPackage init()
  {
    if (isInited) return (AventuraGraficaPackage)EPackage.Registry.INSTANCE.getEPackage(AventuraGraficaPackage.eNS_URI);

    // Obtain or create and register package
    AventuraGraficaPackageImpl theAventuraGraficaPackage = (AventuraGraficaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AventuraGraficaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AventuraGraficaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAventuraGraficaPackage.createPackageContents();

    // Initialize created meta-data
    theAventuraGraficaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAventuraGraficaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AventuraGraficaPackage.eNS_URI, theAventuraGraficaPackage);
    return theAventuraGraficaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJuego()
  {
    return juegoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJuego_Objetos()
  {
    return (EReference)juegoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJuego_Posicion()
  {
    return (EReference)juegoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJuego_Habitaciones()
  {
    return (EReference)juegoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJuego_Comandos()
  {
    return (EReference)juegoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjeto()
  {
    return objetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjeto_Recogible()
  {
    return (EAttribute)objetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjeto_Name()
  {
    return (EAttribute)objetoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjeto_Descripcion()
  {
    return (EAttribute)objetoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjeto_Estado()
  {
    return (EReference)objetoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjeto_Acciones()
  {
    return (EReference)objetoEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHabitacion()
  {
    return habitacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHabitacion_Final()
  {
    return (EAttribute)habitacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHabitacion_Name()
  {
    return (EAttribute)habitacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHabitacion_Descripcion()
  {
    return (EAttribute)habitacionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHabitacion_EstadoACambiar()
  {
    return (EAttribute)habitacionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHabitacion_ObjetoACambiar()
  {
    return (EReference)habitacionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHabitacion_ValorNuevo()
  {
    return (EAttribute)habitacionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHabitacion_Objetos()
  {
    return (EReference)habitacionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPosicion()
  {
    return posicionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPosicion_Habitacion()
  {
    return (EReference)posicionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComando()
  {
    return comandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMostrarObjetos()
  {
    return mostrarObjetosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescribirObjeto()
  {
    return describirObjetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescribirObjeto_Objeto()
  {
    return (EReference)describirObjetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecogerObjeto()
  {
    return recogerObjetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecogerObjeto_Objeto()
  {
    return (EReference)recogerObjetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMostrarInventario()
  {
    return mostrarInventarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcciones()
  {
    return accionesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcciones_Objeto()
  {
    return (EReference)accionesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEjecutarAccion()
  {
    return ejecutarAccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEjecutarAccion_Accion()
  {
    return (EReference)ejecutarAccionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEjecutarAccion_Objeto()
  {
    return (EReference)ejecutarAccionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccion()
  {
    return accionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccion_Name()
  {
    return (EAttribute)accionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIrA()
  {
    return irAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIrA_Habitacion()
  {
    return (EReference)irAEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIrA_Variable()
  {
    return (EReference)irAEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIrA_Valor()
  {
    return (EAttribute)irAEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCambiarEstado()
  {
    return cambiarEstadoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCambiarEstado_VariableACambiar()
  {
    return (EReference)cambiarEstadoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCambiarEstado_ValorNuevo()
  {
    return (EAttribute)cambiarEstadoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCambiarEstado_VariableCondicion()
  {
    return (EReference)cambiarEstadoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCambiarEstado_ValorCondicional()
  {
    return (EAttribute)cambiarEstadoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEstadoDeObjeto()
  {
    return estadoDeObjetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstadoDeObjeto_Name()
  {
    return (EAttribute)estadoDeObjetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstadoDeObjeto_Valor()
  {
    return (EAttribute)estadoDeObjetoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AventuraGraficaFactory getAventuraGraficaFactory()
  {
    return (AventuraGraficaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    juegoEClass = createEClass(JUEGO);
    createEReference(juegoEClass, JUEGO__OBJETOS);
    createEReference(juegoEClass, JUEGO__POSICION);
    createEReference(juegoEClass, JUEGO__HABITACIONES);
    createEReference(juegoEClass, JUEGO__COMANDOS);

    objetoEClass = createEClass(OBJETO);
    createEAttribute(objetoEClass, OBJETO__RECOGIBLE);
    createEAttribute(objetoEClass, OBJETO__NAME);
    createEAttribute(objetoEClass, OBJETO__DESCRIPCION);
    createEReference(objetoEClass, OBJETO__ESTADO);
    createEReference(objetoEClass, OBJETO__ACCIONES);

    habitacionEClass = createEClass(HABITACION);
    createEAttribute(habitacionEClass, HABITACION__FINAL);
    createEAttribute(habitacionEClass, HABITACION__NAME);
    createEAttribute(habitacionEClass, HABITACION__DESCRIPCION);
    createEAttribute(habitacionEClass, HABITACION__ESTADO_ACAMBIAR);
    createEReference(habitacionEClass, HABITACION__OBJETO_ACAMBIAR);
    createEAttribute(habitacionEClass, HABITACION__VALOR_NUEVO);
    createEReference(habitacionEClass, HABITACION__OBJETOS);

    posicionEClass = createEClass(POSICION);
    createEReference(posicionEClass, POSICION__HABITACION);

    comandoEClass = createEClass(COMANDO);

    mostrarObjetosEClass = createEClass(MOSTRAR_OBJETOS);

    describirObjetoEClass = createEClass(DESCRIBIR_OBJETO);
    createEReference(describirObjetoEClass, DESCRIBIR_OBJETO__OBJETO);

    recogerObjetoEClass = createEClass(RECOGER_OBJETO);
    createEReference(recogerObjetoEClass, RECOGER_OBJETO__OBJETO);

    mostrarInventarioEClass = createEClass(MOSTRAR_INVENTARIO);

    accionesEClass = createEClass(ACCIONES);
    createEReference(accionesEClass, ACCIONES__OBJETO);

    ejecutarAccionEClass = createEClass(EJECUTAR_ACCION);
    createEReference(ejecutarAccionEClass, EJECUTAR_ACCION__ACCION);
    createEReference(ejecutarAccionEClass, EJECUTAR_ACCION__OBJETO);

    accionEClass = createEClass(ACCION);
    createEAttribute(accionEClass, ACCION__NAME);

    irAEClass = createEClass(IR_A);
    createEReference(irAEClass, IR_A__HABITACION);
    createEReference(irAEClass, IR_A__VARIABLE);
    createEAttribute(irAEClass, IR_A__VALOR);

    cambiarEstadoEClass = createEClass(CAMBIAR_ESTADO);
    createEReference(cambiarEstadoEClass, CAMBIAR_ESTADO__VARIABLE_ACAMBIAR);
    createEAttribute(cambiarEstadoEClass, CAMBIAR_ESTADO__VALOR_NUEVO);
    createEReference(cambiarEstadoEClass, CAMBIAR_ESTADO__VARIABLE_CONDICION);
    createEAttribute(cambiarEstadoEClass, CAMBIAR_ESTADO__VALOR_CONDICIONAL);

    estadoDeObjetoEClass = createEClass(ESTADO_DE_OBJETO);
    createEAttribute(estadoDeObjetoEClass, ESTADO_DE_OBJETO__NAME);
    createEAttribute(estadoDeObjetoEClass, ESTADO_DE_OBJETO__VALOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mostrarObjetosEClass.getESuperTypes().add(this.getComando());
    describirObjetoEClass.getESuperTypes().add(this.getComando());
    recogerObjetoEClass.getESuperTypes().add(this.getComando());
    mostrarInventarioEClass.getESuperTypes().add(this.getComando());
    accionesEClass.getESuperTypes().add(this.getComando());
    ejecutarAccionEClass.getESuperTypes().add(this.getComando());
    irAEClass.getESuperTypes().add(this.getAccion());
    cambiarEstadoEClass.getESuperTypes().add(this.getAccion());

    // Initialize classes and features; add operations and parameters
    initEClass(juegoEClass, Juego.class, "Juego", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJuego_Objetos(), this.getObjeto(), null, "objetos", null, 0, -1, Juego.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJuego_Posicion(), this.getPosicion(), null, "posicion", null, 0, 1, Juego.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJuego_Habitaciones(), this.getHabitacion(), null, "habitaciones", null, 0, -1, Juego.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJuego_Comandos(), this.getComando(), null, "comandos", null, 0, -1, Juego.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objetoEClass, Objeto.class, "Objeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjeto_Recogible(), ecorePackage.getEBoolean(), "recogible", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjeto_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjeto_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjeto_Estado(), this.getEstadoDeObjeto(), null, "estado", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjeto_Acciones(), this.getAccion(), null, "acciones", null, 0, -1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(habitacionEClass, Habitacion.class, "Habitacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHabitacion_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHabitacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHabitacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHabitacion_EstadoACambiar(), ecorePackage.getEString(), "estadoACambiar", null, 0, 1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHabitacion_ObjetoACambiar(), this.getObjeto(), null, "objetoACambiar", null, 0, 1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHabitacion_ValorNuevo(), ecorePackage.getEString(), "valorNuevo", null, 0, 1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHabitacion_Objetos(), this.getObjeto(), null, "objetos", null, 0, -1, Habitacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(posicionEClass, Posicion.class, "Posicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPosicion_Habitacion(), this.getHabitacion(), null, "habitacion", null, 0, 1, Posicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoEClass, Comando.class, "Comando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mostrarObjetosEClass, MostrarObjetos.class, "MostrarObjetos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(describirObjetoEClass, DescribirObjeto.class, "DescribirObjeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescribirObjeto_Objeto(), this.getObjeto(), null, "objeto", null, 0, 1, DescribirObjeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recogerObjetoEClass, RecogerObjeto.class, "RecogerObjeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecogerObjeto_Objeto(), this.getObjeto(), null, "objeto", null, 0, 1, RecogerObjeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mostrarInventarioEClass, MostrarInventario.class, "MostrarInventario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(accionesEClass, Acciones.class, "Acciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAcciones_Objeto(), this.getObjeto(), null, "objeto", null, 0, 1, Acciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ejecutarAccionEClass, EjecutarAccion.class, "EjecutarAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEjecutarAccion_Accion(), this.getAccion(), null, "accion", null, 0, 1, EjecutarAccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEjecutarAccion_Objeto(), this.getObjeto(), null, "objeto", null, 0, 1, EjecutarAccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accionEClass, Accion.class, "Accion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAccion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(irAEClass, IrA.class, "IrA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIrA_Habitacion(), this.getHabitacion(), null, "habitacion", null, 0, 1, IrA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIrA_Variable(), this.getEstadoDeObjeto(), null, "variable", null, 0, 1, IrA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIrA_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, IrA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cambiarEstadoEClass, CambiarEstado.class, "CambiarEstado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCambiarEstado_VariableACambiar(), this.getEstadoDeObjeto(), null, "variableACambiar", null, 0, 1, CambiarEstado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCambiarEstado_ValorNuevo(), ecorePackage.getEString(), "valorNuevo", null, 0, 1, CambiarEstado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCambiarEstado_VariableCondicion(), this.getEstadoDeObjeto(), null, "variableCondicion", null, 0, 1, CambiarEstado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCambiarEstado_ValorCondicional(), ecorePackage.getEString(), "valorCondicional", null, 0, 1, CambiarEstado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(estadoDeObjetoEClass, EstadoDeObjeto.class, "EstadoDeObjeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEstadoDeObjeto_Name(), ecorePackage.getEString(), "name", null, 0, 1, EstadoDeObjeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEstadoDeObjeto_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, EstadoDeObjeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AventuraGraficaPackageImpl

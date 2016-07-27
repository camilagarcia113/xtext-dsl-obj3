/**
 */
package ar.edu.unq.aventuraGrafica.util;

import ar.edu.unq.aventuraGrafica.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage
 * @generated
 */
public class AventuraGraficaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AventuraGraficaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AventuraGraficaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AventuraGraficaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AventuraGraficaPackage.JUEGO:
      {
        Juego juego = (Juego)theEObject;
        T result = caseJuego(juego);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.OBJETO:
      {
        Objeto objeto = (Objeto)theEObject;
        T result = caseObjeto(objeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.HABITACION:
      {
        Habitacion habitacion = (Habitacion)theEObject;
        T result = caseHabitacion(habitacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.POSICION:
      {
        Posicion posicion = (Posicion)theEObject;
        T result = casePosicion(posicion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.COMANDO:
      {
        Comando comando = (Comando)theEObject;
        T result = caseComando(comando);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.MOSTRAR_OBJETOS:
      {
        MostrarObjetos mostrarObjetos = (MostrarObjetos)theEObject;
        T result = caseMostrarObjetos(mostrarObjetos);
        if (result == null) result = caseComando(mostrarObjetos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.DESCRIBIR_OBJETO:
      {
        DescribirObjeto describirObjeto = (DescribirObjeto)theEObject;
        T result = caseDescribirObjeto(describirObjeto);
        if (result == null) result = caseComando(describirObjeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.RECOGER_OBJETO:
      {
        RecogerObjeto recogerObjeto = (RecogerObjeto)theEObject;
        T result = caseRecogerObjeto(recogerObjeto);
        if (result == null) result = caseComando(recogerObjeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.MOSTRAR_INVENTARIO:
      {
        MostrarInventario mostrarInventario = (MostrarInventario)theEObject;
        T result = caseMostrarInventario(mostrarInventario);
        if (result == null) result = caseComando(mostrarInventario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.ACCIONES:
      {
        Acciones acciones = (Acciones)theEObject;
        T result = caseAcciones(acciones);
        if (result == null) result = caseComando(acciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.EJECUTAR_ACCION:
      {
        EjecutarAccion ejecutarAccion = (EjecutarAccion)theEObject;
        T result = caseEjecutarAccion(ejecutarAccion);
        if (result == null) result = caseComando(ejecutarAccion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.ACCION:
      {
        Accion accion = (Accion)theEObject;
        T result = caseAccion(accion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.IR_A:
      {
        IrA irA = (IrA)theEObject;
        T result = caseIrA(irA);
        if (result == null) result = caseAccion(irA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.CAMBIAR_ESTADO:
      {
        CambiarEstado cambiarEstado = (CambiarEstado)theEObject;
        T result = caseCambiarEstado(cambiarEstado);
        if (result == null) result = caseAccion(cambiarEstado);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AventuraGraficaPackage.ESTADO_DE_OBJETO:
      {
        EstadoDeObjeto estadoDeObjeto = (EstadoDeObjeto)theEObject;
        T result = caseEstadoDeObjeto(estadoDeObjeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Juego</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Juego</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJuego(Juego object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objeto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objeto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjeto(Objeto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Habitacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Habitacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHabitacion(Habitacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Posicion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Posicion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePosicion(Posicion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComando(Comando object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mostrar Objetos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mostrar Objetos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMostrarObjetos(MostrarObjetos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describir Objeto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describir Objeto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribirObjeto(DescribirObjeto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recoger Objeto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recoger Objeto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecogerObjeto(RecogerObjeto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mostrar Inventario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mostrar Inventario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMostrarInventario(MostrarInventario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcciones(Acciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ejecutar Accion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ejecutar Accion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEjecutarAccion(EjecutarAccion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccion(Accion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ir A</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ir A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIrA(IrA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cambiar Estado</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cambiar Estado</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCambiarEstado(CambiarEstado object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Estado De Objeto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estado De Objeto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstadoDeObjeto(EstadoDeObjeto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AventuraGraficaSwitch

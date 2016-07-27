/**
 */
package ar.edu.unq.aventuraGrafica.util;

import ar.edu.unq.aventuraGrafica.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ar.edu.unq.aventuraGrafica.AventuraGraficaPackage
 * @generated
 */
public class AventuraGraficaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AventuraGraficaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AventuraGraficaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AventuraGraficaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AventuraGraficaSwitch<Adapter> modelSwitch =
    new AventuraGraficaSwitch<Adapter>()
    {
      @Override
      public Adapter caseJuego(Juego object)
      {
        return createJuegoAdapter();
      }
      @Override
      public Adapter caseObjeto(Objeto object)
      {
        return createObjetoAdapter();
      }
      @Override
      public Adapter caseHabitacion(Habitacion object)
      {
        return createHabitacionAdapter();
      }
      @Override
      public Adapter casePosicion(Posicion object)
      {
        return createPosicionAdapter();
      }
      @Override
      public Adapter caseComando(Comando object)
      {
        return createComandoAdapter();
      }
      @Override
      public Adapter caseMostrarObjetos(MostrarObjetos object)
      {
        return createMostrarObjetosAdapter();
      }
      @Override
      public Adapter caseDescribirObjeto(DescribirObjeto object)
      {
        return createDescribirObjetoAdapter();
      }
      @Override
      public Adapter caseRecogerObjeto(RecogerObjeto object)
      {
        return createRecogerObjetoAdapter();
      }
      @Override
      public Adapter caseMostrarInventario(MostrarInventario object)
      {
        return createMostrarInventarioAdapter();
      }
      @Override
      public Adapter caseAcciones(Acciones object)
      {
        return createAccionesAdapter();
      }
      @Override
      public Adapter caseEjecutarAccion(EjecutarAccion object)
      {
        return createEjecutarAccionAdapter();
      }
      @Override
      public Adapter caseAccion(Accion object)
      {
        return createAccionAdapter();
      }
      @Override
      public Adapter caseIrA(IrA object)
      {
        return createIrAAdapter();
      }
      @Override
      public Adapter caseCambiarEstado(CambiarEstado object)
      {
        return createCambiarEstadoAdapter();
      }
      @Override
      public Adapter caseEstadoDeObjeto(EstadoDeObjeto object)
      {
        return createEstadoDeObjetoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Juego <em>Juego</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Juego
   * @generated
   */
  public Adapter createJuegoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Objeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Objeto
   * @generated
   */
  public Adapter createObjetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Habitacion <em>Habitacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Habitacion
   * @generated
   */
  public Adapter createHabitacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Posicion <em>Posicion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Posicion
   * @generated
   */
  public Adapter createPosicionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Comando <em>Comando</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Comando
   * @generated
   */
  public Adapter createComandoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.MostrarObjetos <em>Mostrar Objetos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.MostrarObjetos
   * @generated
   */
  public Adapter createMostrarObjetosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.DescribirObjeto <em>Describir Objeto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.DescribirObjeto
   * @generated
   */
  public Adapter createDescribirObjetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.RecogerObjeto <em>Recoger Objeto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.RecogerObjeto
   * @generated
   */
  public Adapter createRecogerObjetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.MostrarInventario <em>Mostrar Inventario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.MostrarInventario
   * @generated
   */
  public Adapter createMostrarInventarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Acciones <em>Acciones</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Acciones
   * @generated
   */
  public Adapter createAccionesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.EjecutarAccion <em>Ejecutar Accion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.EjecutarAccion
   * @generated
   */
  public Adapter createEjecutarAccionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.Accion <em>Accion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.Accion
   * @generated
   */
  public Adapter createAccionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.IrA <em>Ir A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.IrA
   * @generated
   */
  public Adapter createIrAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.CambiarEstado <em>Cambiar Estado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.CambiarEstado
   * @generated
   */
  public Adapter createCambiarEstadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ar.edu.unq.aventuraGrafica.EstadoDeObjeto <em>Estado De Objeto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ar.edu.unq.aventuraGrafica.EstadoDeObjeto
   * @generated
   */
  public Adapter createEstadoDeObjetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AventuraGraficaAdapterFactory

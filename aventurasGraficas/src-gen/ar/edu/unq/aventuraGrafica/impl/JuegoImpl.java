/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.Comando;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.Juego;
import ar.edu.unq.aventuraGrafica.Objeto;
import ar.edu.unq.aventuraGrafica.Posicion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Juego</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.JuegoImpl#getObjetos <em>Objetos</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.JuegoImpl#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.JuegoImpl#getHabitaciones <em>Habitaciones</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.JuegoImpl#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JuegoImpl extends MinimalEObjectImpl.Container implements Juego
{
  /**
   * The cached value of the '{@link #getObjetos() <em>Objetos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjetos()
   * @generated
   * @ordered
   */
  protected EList<Objeto> objetos;

  /**
   * The cached value of the '{@link #getPosicion() <em>Posicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosicion()
   * @generated
   * @ordered
   */
  protected Posicion posicion;

  /**
   * The cached value of the '{@link #getHabitaciones() <em>Habitaciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHabitaciones()
   * @generated
   * @ordered
   */
  protected EList<Habitacion> habitaciones;

  /**
   * The cached value of the '{@link #getComandos() <em>Comandos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComandos()
   * @generated
   * @ordered
   */
  protected EList<Comando> comandos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JuegoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AventuraGraficaPackage.Literals.JUEGO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objeto> getObjetos()
  {
    if (objetos == null)
    {
      objetos = new EObjectContainmentEList<Objeto>(Objeto.class, this, AventuraGraficaPackage.JUEGO__OBJETOS);
    }
    return objetos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Posicion getPosicion()
  {
    return posicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosicion(Posicion newPosicion, NotificationChain msgs)
  {
    Posicion oldPosicion = posicion;
    posicion = newPosicion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.JUEGO__POSICION, oldPosicion, newPosicion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosicion(Posicion newPosicion)
  {
    if (newPosicion != posicion)
    {
      NotificationChain msgs = null;
      if (posicion != null)
        msgs = ((InternalEObject)posicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AventuraGraficaPackage.JUEGO__POSICION, null, msgs);
      if (newPosicion != null)
        msgs = ((InternalEObject)newPosicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AventuraGraficaPackage.JUEGO__POSICION, null, msgs);
      msgs = basicSetPosicion(newPosicion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.JUEGO__POSICION, newPosicion, newPosicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Habitacion> getHabitaciones()
  {
    if (habitaciones == null)
    {
      habitaciones = new EObjectContainmentEList<Habitacion>(Habitacion.class, this, AventuraGraficaPackage.JUEGO__HABITACIONES);
    }
    return habitaciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comando> getComandos()
  {
    if (comandos == null)
    {
      comandos = new EObjectContainmentEList<Comando>(Comando.class, this, AventuraGraficaPackage.JUEGO__COMANDOS);
    }
    return comandos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AventuraGraficaPackage.JUEGO__OBJETOS:
        return ((InternalEList<?>)getObjetos()).basicRemove(otherEnd, msgs);
      case AventuraGraficaPackage.JUEGO__POSICION:
        return basicSetPosicion(null, msgs);
      case AventuraGraficaPackage.JUEGO__HABITACIONES:
        return ((InternalEList<?>)getHabitaciones()).basicRemove(otherEnd, msgs);
      case AventuraGraficaPackage.JUEGO__COMANDOS:
        return ((InternalEList<?>)getComandos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AventuraGraficaPackage.JUEGO__OBJETOS:
        return getObjetos();
      case AventuraGraficaPackage.JUEGO__POSICION:
        return getPosicion();
      case AventuraGraficaPackage.JUEGO__HABITACIONES:
        return getHabitaciones();
      case AventuraGraficaPackage.JUEGO__COMANDOS:
        return getComandos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AventuraGraficaPackage.JUEGO__OBJETOS:
        getObjetos().clear();
        getObjetos().addAll((Collection<? extends Objeto>)newValue);
        return;
      case AventuraGraficaPackage.JUEGO__POSICION:
        setPosicion((Posicion)newValue);
        return;
      case AventuraGraficaPackage.JUEGO__HABITACIONES:
        getHabitaciones().clear();
        getHabitaciones().addAll((Collection<? extends Habitacion>)newValue);
        return;
      case AventuraGraficaPackage.JUEGO__COMANDOS:
        getComandos().clear();
        getComandos().addAll((Collection<? extends Comando>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AventuraGraficaPackage.JUEGO__OBJETOS:
        getObjetos().clear();
        return;
      case AventuraGraficaPackage.JUEGO__POSICION:
        setPosicion((Posicion)null);
        return;
      case AventuraGraficaPackage.JUEGO__HABITACIONES:
        getHabitaciones().clear();
        return;
      case AventuraGraficaPackage.JUEGO__COMANDOS:
        getComandos().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AventuraGraficaPackage.JUEGO__OBJETOS:
        return objetos != null && !objetos.isEmpty();
      case AventuraGraficaPackage.JUEGO__POSICION:
        return posicion != null;
      case AventuraGraficaPackage.JUEGO__HABITACIONES:
        return habitaciones != null && !habitaciones.isEmpty();
      case AventuraGraficaPackage.JUEGO__COMANDOS:
        return comandos != null && !comandos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JuegoImpl

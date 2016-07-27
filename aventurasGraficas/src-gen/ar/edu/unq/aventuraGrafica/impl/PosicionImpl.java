/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.Posicion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Posicion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.PosicionImpl#getHabitacion <em>Habitacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PosicionImpl extends MinimalEObjectImpl.Container implements Posicion
{
  /**
   * The cached value of the '{@link #getHabitacion() <em>Habitacion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHabitacion()
   * @generated
   * @ordered
   */
  protected Habitacion habitacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PosicionImpl()
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
    return AventuraGraficaPackage.Literals.POSICION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Habitacion getHabitacion()
  {
    if (habitacion != null && habitacion.eIsProxy())
    {
      InternalEObject oldHabitacion = (InternalEObject)habitacion;
      habitacion = (Habitacion)eResolveProxy(oldHabitacion);
      if (habitacion != oldHabitacion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.POSICION__HABITACION, oldHabitacion, habitacion));
      }
    }
    return habitacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Habitacion basicGetHabitacion()
  {
    return habitacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHabitacion(Habitacion newHabitacion)
  {
    Habitacion oldHabitacion = habitacion;
    habitacion = newHabitacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.POSICION__HABITACION, oldHabitacion, habitacion));
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
      case AventuraGraficaPackage.POSICION__HABITACION:
        if (resolve) return getHabitacion();
        return basicGetHabitacion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AventuraGraficaPackage.POSICION__HABITACION:
        setHabitacion((Habitacion)newValue);
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
      case AventuraGraficaPackage.POSICION__HABITACION:
        setHabitacion((Habitacion)null);
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
      case AventuraGraficaPackage.POSICION__HABITACION:
        return habitacion != null;
    }
    return super.eIsSet(featureID);
  }

} //PosicionImpl

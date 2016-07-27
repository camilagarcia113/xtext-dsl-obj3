/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.Accion;
import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.EjecutarAccion;
import ar.edu.unq.aventuraGrafica.Objeto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejecutar Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.EjecutarAccionImpl#getAccion <em>Accion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.EjecutarAccionImpl#getObjeto <em>Objeto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EjecutarAccionImpl extends ComandoImpl implements EjecutarAccion
{
  /**
   * The cached value of the '{@link #getAccion() <em>Accion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccion()
   * @generated
   * @ordered
   */
  protected Accion accion;

  /**
   * The cached value of the '{@link #getObjeto() <em>Objeto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjeto()
   * @generated
   * @ordered
   */
  protected Objeto objeto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EjecutarAccionImpl()
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
    return AventuraGraficaPackage.Literals.EJECUTAR_ACCION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accion getAccion()
  {
    if (accion != null && accion.eIsProxy())
    {
      InternalEObject oldAccion = (InternalEObject)accion;
      accion = (Accion)eResolveProxy(oldAccion);
      if (accion != oldAccion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.EJECUTAR_ACCION__ACCION, oldAccion, accion));
      }
    }
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accion basicGetAccion()
  {
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccion(Accion newAccion)
  {
    Accion oldAccion = accion;
    accion = newAccion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.EJECUTAR_ACCION__ACCION, oldAccion, accion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objeto getObjeto()
  {
    if (objeto != null && objeto.eIsProxy())
    {
      InternalEObject oldObjeto = (InternalEObject)objeto;
      objeto = (Objeto)eResolveProxy(oldObjeto);
      if (objeto != oldObjeto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.EJECUTAR_ACCION__OBJETO, oldObjeto, objeto));
      }
    }
    return objeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objeto basicGetObjeto()
  {
    return objeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjeto(Objeto newObjeto)
  {
    Objeto oldObjeto = objeto;
    objeto = newObjeto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.EJECUTAR_ACCION__OBJETO, oldObjeto, objeto));
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
      case AventuraGraficaPackage.EJECUTAR_ACCION__ACCION:
        if (resolve) return getAccion();
        return basicGetAccion();
      case AventuraGraficaPackage.EJECUTAR_ACCION__OBJETO:
        if (resolve) return getObjeto();
        return basicGetObjeto();
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
      case AventuraGraficaPackage.EJECUTAR_ACCION__ACCION:
        setAccion((Accion)newValue);
        return;
      case AventuraGraficaPackage.EJECUTAR_ACCION__OBJETO:
        setObjeto((Objeto)newValue);
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
      case AventuraGraficaPackage.EJECUTAR_ACCION__ACCION:
        setAccion((Accion)null);
        return;
      case AventuraGraficaPackage.EJECUTAR_ACCION__OBJETO:
        setObjeto((Objeto)null);
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
      case AventuraGraficaPackage.EJECUTAR_ACCION__ACCION:
        return accion != null;
      case AventuraGraficaPackage.EJECUTAR_ACCION__OBJETO:
        return objeto != null;
    }
    return super.eIsSet(featureID);
  }

} //EjecutarAccionImpl

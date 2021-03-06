/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.DescribirObjeto;
import ar.edu.unq.aventuraGrafica.Objeto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describir Objeto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.DescribirObjetoImpl#getObjeto <em>Objeto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescribirObjetoImpl extends ComandoImpl implements DescribirObjeto
{
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
  protected DescribirObjetoImpl()
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
    return AventuraGraficaPackage.Literals.DESCRIBIR_OBJETO;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.DESCRIBIR_OBJETO__OBJETO, oldObjeto, objeto));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.DESCRIBIR_OBJETO__OBJETO, oldObjeto, objeto));
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
      case AventuraGraficaPackage.DESCRIBIR_OBJETO__OBJETO:
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
      case AventuraGraficaPackage.DESCRIBIR_OBJETO__OBJETO:
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
      case AventuraGraficaPackage.DESCRIBIR_OBJETO__OBJETO:
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
      case AventuraGraficaPackage.DESCRIBIR_OBJETO__OBJETO:
        return objeto != null;
    }
    return super.eIsSet(featureID);
  }

} //DescribirObjetoImpl

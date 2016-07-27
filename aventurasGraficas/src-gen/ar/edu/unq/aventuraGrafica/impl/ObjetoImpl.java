/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.Accion;
import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.EstadoDeObjeto;
import ar.edu.unq.aventuraGrafica.Objeto;

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
 * An implementation of the model object '<em><b>Objeto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl#isRecogible <em>Recogible</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl#getName <em>Name</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.ObjetoImpl#getAcciones <em>Acciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetoImpl extends MinimalEObjectImpl.Container implements Objeto
{
  /**
   * The default value of the '{@link #isRecogible() <em>Recogible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecogible()
   * @generated
   * @ordered
   */
  protected static final boolean RECOGIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRecogible() <em>Recogible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecogible()
   * @generated
   * @ordered
   */
  protected boolean recogible = RECOGIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPCION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected String descripcion = DESCRIPCION_EDEFAULT;

  /**
   * The cached value of the '{@link #getEstado() <em>Estado</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstado()
   * @generated
   * @ordered
   */
  protected EstadoDeObjeto estado;

  /**
   * The cached value of the '{@link #getAcciones() <em>Acciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcciones()
   * @generated
   * @ordered
   */
  protected EList<Accion> acciones;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetoImpl()
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
    return AventuraGraficaPackage.Literals.OBJETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRecogible()
  {
    return recogible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecogible(boolean newRecogible)
  {
    boolean oldRecogible = recogible;
    recogible = newRecogible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.OBJETO__RECOGIBLE, oldRecogible, recogible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.OBJETO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescripcion()
  {
    return descripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescripcion(String newDescripcion)
  {
    String oldDescripcion = descripcion;
    descripcion = newDescripcion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.OBJETO__DESCRIPCION, oldDescripcion, descripcion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto getEstado()
  {
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEstado(EstadoDeObjeto newEstado, NotificationChain msgs)
  {
    EstadoDeObjeto oldEstado = estado;
    estado = newEstado;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.OBJETO__ESTADO, oldEstado, newEstado);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstado(EstadoDeObjeto newEstado)
  {
    if (newEstado != estado)
    {
      NotificationChain msgs = null;
      if (estado != null)
        msgs = ((InternalEObject)estado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AventuraGraficaPackage.OBJETO__ESTADO, null, msgs);
      if (newEstado != null)
        msgs = ((InternalEObject)newEstado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AventuraGraficaPackage.OBJETO__ESTADO, null, msgs);
      msgs = basicSetEstado(newEstado, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.OBJETO__ESTADO, newEstado, newEstado));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Accion> getAcciones()
  {
    if (acciones == null)
    {
      acciones = new EObjectContainmentEList<Accion>(Accion.class, this, AventuraGraficaPackage.OBJETO__ACCIONES);
    }
    return acciones;
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
      case AventuraGraficaPackage.OBJETO__ESTADO:
        return basicSetEstado(null, msgs);
      case AventuraGraficaPackage.OBJETO__ACCIONES:
        return ((InternalEList<?>)getAcciones()).basicRemove(otherEnd, msgs);
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
      case AventuraGraficaPackage.OBJETO__RECOGIBLE:
        return isRecogible();
      case AventuraGraficaPackage.OBJETO__NAME:
        return getName();
      case AventuraGraficaPackage.OBJETO__DESCRIPCION:
        return getDescripcion();
      case AventuraGraficaPackage.OBJETO__ESTADO:
        return getEstado();
      case AventuraGraficaPackage.OBJETO__ACCIONES:
        return getAcciones();
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
      case AventuraGraficaPackage.OBJETO__RECOGIBLE:
        setRecogible((Boolean)newValue);
        return;
      case AventuraGraficaPackage.OBJETO__NAME:
        setName((String)newValue);
        return;
      case AventuraGraficaPackage.OBJETO__DESCRIPCION:
        setDescripcion((String)newValue);
        return;
      case AventuraGraficaPackage.OBJETO__ESTADO:
        setEstado((EstadoDeObjeto)newValue);
        return;
      case AventuraGraficaPackage.OBJETO__ACCIONES:
        getAcciones().clear();
        getAcciones().addAll((Collection<? extends Accion>)newValue);
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
      case AventuraGraficaPackage.OBJETO__RECOGIBLE:
        setRecogible(RECOGIBLE_EDEFAULT);
        return;
      case AventuraGraficaPackage.OBJETO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AventuraGraficaPackage.OBJETO__DESCRIPCION:
        setDescripcion(DESCRIPCION_EDEFAULT);
        return;
      case AventuraGraficaPackage.OBJETO__ESTADO:
        setEstado((EstadoDeObjeto)null);
        return;
      case AventuraGraficaPackage.OBJETO__ACCIONES:
        getAcciones().clear();
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
      case AventuraGraficaPackage.OBJETO__RECOGIBLE:
        return recogible != RECOGIBLE_EDEFAULT;
      case AventuraGraficaPackage.OBJETO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AventuraGraficaPackage.OBJETO__DESCRIPCION:
        return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
      case AventuraGraficaPackage.OBJETO__ESTADO:
        return estado != null;
      case AventuraGraficaPackage.OBJETO__ACCIONES:
        return acciones != null && !acciones.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (recogible: ");
    result.append(recogible);
    result.append(", name: ");
    result.append(name);
    result.append(", descripcion: ");
    result.append(descripcion);
    result.append(')');
    return result.toString();
  }

} //ObjetoImpl

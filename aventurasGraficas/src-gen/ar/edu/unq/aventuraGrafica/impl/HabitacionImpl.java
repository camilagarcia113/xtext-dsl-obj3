/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.Objeto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Habitacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#getEstadoACambiar <em>Estado ACambiar</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#getObjetoACambiar <em>Objeto ACambiar</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#getValorNuevo <em>Valor Nuevo</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.HabitacionImpl#getObjetos <em>Objetos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HabitacionImpl extends MinimalEObjectImpl.Container implements Habitacion
{
  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

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
   * The default value of the '{@link #getEstadoACambiar() <em>Estado ACambiar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstadoACambiar()
   * @generated
   * @ordered
   */
  protected static final String ESTADO_ACAMBIAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEstadoACambiar() <em>Estado ACambiar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstadoACambiar()
   * @generated
   * @ordered
   */
  protected String estadoACambiar = ESTADO_ACAMBIAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjetoACambiar() <em>Objeto ACambiar</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjetoACambiar()
   * @generated
   * @ordered
   */
  protected Objeto objetoACambiar;

  /**
   * The default value of the '{@link #getValorNuevo() <em>Valor Nuevo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorNuevo()
   * @generated
   * @ordered
   */
  protected static final String VALOR_NUEVO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValorNuevo() <em>Valor Nuevo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorNuevo()
   * @generated
   * @ordered
   */
  protected String valorNuevo = VALOR_NUEVO_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjetos() <em>Objetos</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjetos()
   * @generated
   * @ordered
   */
  protected EList<Objeto> objetos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HabitacionImpl()
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
    return AventuraGraficaPackage.Literals.HABITACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.HABITACION__FINAL, oldFinal, final_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.HABITACION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.HABITACION__DESCRIPCION, oldDescripcion, descripcion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEstadoACambiar()
  {
    return estadoACambiar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstadoACambiar(String newEstadoACambiar)
  {
    String oldEstadoACambiar = estadoACambiar;
    estadoACambiar = newEstadoACambiar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.HABITACION__ESTADO_ACAMBIAR, oldEstadoACambiar, estadoACambiar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objeto getObjetoACambiar()
  {
    if (objetoACambiar != null && objetoACambiar.eIsProxy())
    {
      InternalEObject oldObjetoACambiar = (InternalEObject)objetoACambiar;
      objetoACambiar = (Objeto)eResolveProxy(oldObjetoACambiar);
      if (objetoACambiar != oldObjetoACambiar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.HABITACION__OBJETO_ACAMBIAR, oldObjetoACambiar, objetoACambiar));
      }
    }
    return objetoACambiar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objeto basicGetObjetoACambiar()
  {
    return objetoACambiar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjetoACambiar(Objeto newObjetoACambiar)
  {
    Objeto oldObjetoACambiar = objetoACambiar;
    objetoACambiar = newObjetoACambiar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.HABITACION__OBJETO_ACAMBIAR, oldObjetoACambiar, objetoACambiar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValorNuevo()
  {
    return valorNuevo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValorNuevo(String newValorNuevo)
  {
    String oldValorNuevo = valorNuevo;
    valorNuevo = newValorNuevo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.HABITACION__VALOR_NUEVO, oldValorNuevo, valorNuevo));
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
      objetos = new EObjectResolvingEList<Objeto>(Objeto.class, this, AventuraGraficaPackage.HABITACION__OBJETOS);
    }
    return objetos;
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
      case AventuraGraficaPackage.HABITACION__FINAL:
        return isFinal();
      case AventuraGraficaPackage.HABITACION__NAME:
        return getName();
      case AventuraGraficaPackage.HABITACION__DESCRIPCION:
        return getDescripcion();
      case AventuraGraficaPackage.HABITACION__ESTADO_ACAMBIAR:
        return getEstadoACambiar();
      case AventuraGraficaPackage.HABITACION__OBJETO_ACAMBIAR:
        if (resolve) return getObjetoACambiar();
        return basicGetObjetoACambiar();
      case AventuraGraficaPackage.HABITACION__VALOR_NUEVO:
        return getValorNuevo();
      case AventuraGraficaPackage.HABITACION__OBJETOS:
        return getObjetos();
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
      case AventuraGraficaPackage.HABITACION__FINAL:
        setFinal((Boolean)newValue);
        return;
      case AventuraGraficaPackage.HABITACION__NAME:
        setName((String)newValue);
        return;
      case AventuraGraficaPackage.HABITACION__DESCRIPCION:
        setDescripcion((String)newValue);
        return;
      case AventuraGraficaPackage.HABITACION__ESTADO_ACAMBIAR:
        setEstadoACambiar((String)newValue);
        return;
      case AventuraGraficaPackage.HABITACION__OBJETO_ACAMBIAR:
        setObjetoACambiar((Objeto)newValue);
        return;
      case AventuraGraficaPackage.HABITACION__VALOR_NUEVO:
        setValorNuevo((String)newValue);
        return;
      case AventuraGraficaPackage.HABITACION__OBJETOS:
        getObjetos().clear();
        getObjetos().addAll((Collection<? extends Objeto>)newValue);
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
      case AventuraGraficaPackage.HABITACION__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case AventuraGraficaPackage.HABITACION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AventuraGraficaPackage.HABITACION__DESCRIPCION:
        setDescripcion(DESCRIPCION_EDEFAULT);
        return;
      case AventuraGraficaPackage.HABITACION__ESTADO_ACAMBIAR:
        setEstadoACambiar(ESTADO_ACAMBIAR_EDEFAULT);
        return;
      case AventuraGraficaPackage.HABITACION__OBJETO_ACAMBIAR:
        setObjetoACambiar((Objeto)null);
        return;
      case AventuraGraficaPackage.HABITACION__VALOR_NUEVO:
        setValorNuevo(VALOR_NUEVO_EDEFAULT);
        return;
      case AventuraGraficaPackage.HABITACION__OBJETOS:
        getObjetos().clear();
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
      case AventuraGraficaPackage.HABITACION__FINAL:
        return final_ != FINAL_EDEFAULT;
      case AventuraGraficaPackage.HABITACION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AventuraGraficaPackage.HABITACION__DESCRIPCION:
        return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
      case AventuraGraficaPackage.HABITACION__ESTADO_ACAMBIAR:
        return ESTADO_ACAMBIAR_EDEFAULT == null ? estadoACambiar != null : !ESTADO_ACAMBIAR_EDEFAULT.equals(estadoACambiar);
      case AventuraGraficaPackage.HABITACION__OBJETO_ACAMBIAR:
        return objetoACambiar != null;
      case AventuraGraficaPackage.HABITACION__VALOR_NUEVO:
        return VALOR_NUEVO_EDEFAULT == null ? valorNuevo != null : !VALOR_NUEVO_EDEFAULT.equals(valorNuevo);
      case AventuraGraficaPackage.HABITACION__OBJETOS:
        return objetos != null && !objetos.isEmpty();
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
    result.append(" (final: ");
    result.append(final_);
    result.append(", name: ");
    result.append(name);
    result.append(", descripcion: ");
    result.append(descripcion);
    result.append(", estadoACambiar: ");
    result.append(estadoACambiar);
    result.append(", valorNuevo: ");
    result.append(valorNuevo);
    result.append(')');
    return result.toString();
  }

} //HabitacionImpl

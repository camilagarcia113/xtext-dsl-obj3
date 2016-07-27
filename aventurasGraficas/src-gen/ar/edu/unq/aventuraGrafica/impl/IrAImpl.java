/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.EstadoDeObjeto;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.IrA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ir A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.IrAImpl#getHabitacion <em>Habitacion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.IrAImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.IrAImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrAImpl extends AccionImpl implements IrA
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
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EstadoDeObjeto variable;

  /**
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final String VALOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected String valor = VALOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IrAImpl()
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
    return AventuraGraficaPackage.Literals.IR_A;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.IR_A__HABITACION, oldHabitacion, habitacion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.IR_A__HABITACION, oldHabitacion, habitacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (EstadoDeObjeto)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.IR_A__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(EstadoDeObjeto newVariable)
  {
    EstadoDeObjeto oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.IR_A__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(String newValor)
  {
    String oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.IR_A__VALOR, oldValor, valor));
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
      case AventuraGraficaPackage.IR_A__HABITACION:
        if (resolve) return getHabitacion();
        return basicGetHabitacion();
      case AventuraGraficaPackage.IR_A__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case AventuraGraficaPackage.IR_A__VALOR:
        return getValor();
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
      case AventuraGraficaPackage.IR_A__HABITACION:
        setHabitacion((Habitacion)newValue);
        return;
      case AventuraGraficaPackage.IR_A__VARIABLE:
        setVariable((EstadoDeObjeto)newValue);
        return;
      case AventuraGraficaPackage.IR_A__VALOR:
        setValor((String)newValue);
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
      case AventuraGraficaPackage.IR_A__HABITACION:
        setHabitacion((Habitacion)null);
        return;
      case AventuraGraficaPackage.IR_A__VARIABLE:
        setVariable((EstadoDeObjeto)null);
        return;
      case AventuraGraficaPackage.IR_A__VALOR:
        setValor(VALOR_EDEFAULT);
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
      case AventuraGraficaPackage.IR_A__HABITACION:
        return habitacion != null;
      case AventuraGraficaPackage.IR_A__VARIABLE:
        return variable != null;
      case AventuraGraficaPackage.IR_A__VALOR:
        return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
    result.append(" (valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //IrAImpl

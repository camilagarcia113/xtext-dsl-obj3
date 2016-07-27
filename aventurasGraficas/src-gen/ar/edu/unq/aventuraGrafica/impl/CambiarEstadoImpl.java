/**
 */
package ar.edu.unq.aventuraGrafica.impl;

import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.CambiarEstado;
import ar.edu.unq.aventuraGrafica.EstadoDeObjeto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cambiar Estado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl#getVariableACambiar <em>Variable ACambiar</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl#getValorNuevo <em>Valor Nuevo</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl#getVariableCondicion <em>Variable Condicion</em>}</li>
 *   <li>{@link ar.edu.unq.aventuraGrafica.impl.CambiarEstadoImpl#getValorCondicional <em>Valor Condicional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CambiarEstadoImpl extends AccionImpl implements CambiarEstado
{
  /**
   * The cached value of the '{@link #getVariableACambiar() <em>Variable ACambiar</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableACambiar()
   * @generated
   * @ordered
   */
  protected EstadoDeObjeto variableACambiar;

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
   * The cached value of the '{@link #getVariableCondicion() <em>Variable Condicion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableCondicion()
   * @generated
   * @ordered
   */
  protected EstadoDeObjeto variableCondicion;

  /**
   * The default value of the '{@link #getValorCondicional() <em>Valor Condicional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorCondicional()
   * @generated
   * @ordered
   */
  protected static final String VALOR_CONDICIONAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValorCondicional() <em>Valor Condicional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorCondicional()
   * @generated
   * @ordered
   */
  protected String valorCondicional = VALOR_CONDICIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CambiarEstadoImpl()
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
    return AventuraGraficaPackage.Literals.CAMBIAR_ESTADO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto getVariableACambiar()
  {
    if (variableACambiar != null && variableACambiar.eIsProxy())
    {
      InternalEObject oldVariableACambiar = (InternalEObject)variableACambiar;
      variableACambiar = (EstadoDeObjeto)eResolveProxy(oldVariableACambiar);
      if (variableACambiar != oldVariableACambiar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR, oldVariableACambiar, variableACambiar));
      }
    }
    return variableACambiar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto basicGetVariableACambiar()
  {
    return variableACambiar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableACambiar(EstadoDeObjeto newVariableACambiar)
  {
    EstadoDeObjeto oldVariableACambiar = variableACambiar;
    variableACambiar = newVariableACambiar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR, oldVariableACambiar, variableACambiar));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_NUEVO, oldValorNuevo, valorNuevo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto getVariableCondicion()
  {
    if (variableCondicion != null && variableCondicion.eIsProxy())
    {
      InternalEObject oldVariableCondicion = (InternalEObject)variableCondicion;
      variableCondicion = (EstadoDeObjeto)eResolveProxy(oldVariableCondicion);
      if (variableCondicion != oldVariableCondicion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_CONDICION, oldVariableCondicion, variableCondicion));
      }
    }
    return variableCondicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeObjeto basicGetVariableCondicion()
  {
    return variableCondicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableCondicion(EstadoDeObjeto newVariableCondicion)
  {
    EstadoDeObjeto oldVariableCondicion = variableCondicion;
    variableCondicion = newVariableCondicion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_CONDICION, oldVariableCondicion, variableCondicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValorCondicional()
  {
    return valorCondicional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValorCondicional(String newValorCondicional)
  {
    String oldValorCondicional = valorCondicional;
    valorCondicional = newValorCondicional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_CONDICIONAL, oldValorCondicional, valorCondicional));
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
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR:
        if (resolve) return getVariableACambiar();
        return basicGetVariableACambiar();
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_NUEVO:
        return getValorNuevo();
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_CONDICION:
        if (resolve) return getVariableCondicion();
        return basicGetVariableCondicion();
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_CONDICIONAL:
        return getValorCondicional();
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
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR:
        setVariableACambiar((EstadoDeObjeto)newValue);
        return;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_NUEVO:
        setValorNuevo((String)newValue);
        return;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_CONDICION:
        setVariableCondicion((EstadoDeObjeto)newValue);
        return;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_CONDICIONAL:
        setValorCondicional((String)newValue);
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
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR:
        setVariableACambiar((EstadoDeObjeto)null);
        return;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_NUEVO:
        setValorNuevo(VALOR_NUEVO_EDEFAULT);
        return;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_CONDICION:
        setVariableCondicion((EstadoDeObjeto)null);
        return;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_CONDICIONAL:
        setValorCondicional(VALOR_CONDICIONAL_EDEFAULT);
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
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR:
        return variableACambiar != null;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_NUEVO:
        return VALOR_NUEVO_EDEFAULT == null ? valorNuevo != null : !VALOR_NUEVO_EDEFAULT.equals(valorNuevo);
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VARIABLE_CONDICION:
        return variableCondicion != null;
      case AventuraGraficaPackage.CAMBIAR_ESTADO__VALOR_CONDICIONAL:
        return VALOR_CONDICIONAL_EDEFAULT == null ? valorCondicional != null : !VALOR_CONDICIONAL_EDEFAULT.equals(valorCondicional);
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
    result.append(" (valorNuevo: ");
    result.append(valorNuevo);
    result.append(", valorCondicional: ");
    result.append(valorCondicional);
    result.append(')');
    return result.toString();
  }

} //CambiarEstadoImpl

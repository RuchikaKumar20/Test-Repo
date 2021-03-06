/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project.turn.turn.Decomposition;
import org.xtext.project.turn.turn.DecompositionType;
import org.xtext.project.turn.turn.IntentionalElement;
import org.xtext.project.turn.turn.LongName;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.DecompositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.DecompositionImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.DecompositionImpl#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.DecompositionImpl#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecompositionImpl extends URNmodelElementImpl implements Decomposition
{
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
   * The cached value of the '{@link #getLongName() <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected LongName longName;

  /**
   * The default value of the '{@link #getDecompositionType() <em>Decomposition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositionType()
   * @generated
   * @ordered
   */
  protected static final DecompositionType DECOMPOSITION_TYPE_EDEFAULT = DecompositionType.AND;

  /**
   * The cached value of the '{@link #getDecompositionType() <em>Decomposition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositionType()
   * @generated
   * @ordered
   */
  protected DecompositionType decompositionType = DECOMPOSITION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected IntentionalElement dest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecompositionImpl()
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
    return TurnPackage.Literals.DECOMPOSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.DECOMPOSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongName getLongName()
  {
    return longName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongName(LongName newLongName, NotificationChain msgs)
  {
    LongName oldLongName = longName;
    longName = newLongName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurnPackage.DECOMPOSITION__LONG_NAME, oldLongName, newLongName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongName(LongName newLongName)
  {
    if (newLongName != longName)
    {
      NotificationChain msgs = null;
      if (longName != null)
        msgs = ((InternalEObject)longName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurnPackage.DECOMPOSITION__LONG_NAME, null, msgs);
      if (newLongName != null)
        msgs = ((InternalEObject)newLongName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurnPackage.DECOMPOSITION__LONG_NAME, null, msgs);
      msgs = basicSetLongName(newLongName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.DECOMPOSITION__LONG_NAME, newLongName, newLongName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionType getDecompositionType()
  {
    return decompositionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecompositionType(DecompositionType newDecompositionType)
  {
    DecompositionType oldDecompositionType = decompositionType;
    decompositionType = newDecompositionType == null ? DECOMPOSITION_TYPE_EDEFAULT : newDecompositionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.DECOMPOSITION__DECOMPOSITION_TYPE, oldDecompositionType, decompositionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getDest()
  {
    if (dest != null && dest.eIsProxy())
    {
      InternalEObject oldDest = (InternalEObject)dest;
      dest = (IntentionalElement)eResolveProxy(oldDest);
      if (dest != oldDest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.DECOMPOSITION__DEST, oldDest, dest));
      }
    }
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDest(IntentionalElement newDest)
  {
    IntentionalElement oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.DECOMPOSITION__DEST, oldDest, dest));
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
      case TurnPackage.DECOMPOSITION__LONG_NAME:
        return basicSetLongName(null, msgs);
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
      case TurnPackage.DECOMPOSITION__NAME:
        return getName();
      case TurnPackage.DECOMPOSITION__LONG_NAME:
        return getLongName();
      case TurnPackage.DECOMPOSITION__DECOMPOSITION_TYPE:
        return getDecompositionType();
      case TurnPackage.DECOMPOSITION__DEST:
        if (resolve) return getDest();
        return basicGetDest();
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
      case TurnPackage.DECOMPOSITION__NAME:
        setName((String)newValue);
        return;
      case TurnPackage.DECOMPOSITION__LONG_NAME:
        setLongName((LongName)newValue);
        return;
      case TurnPackage.DECOMPOSITION__DECOMPOSITION_TYPE:
        setDecompositionType((DecompositionType)newValue);
        return;
      case TurnPackage.DECOMPOSITION__DEST:
        setDest((IntentionalElement)newValue);
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
      case TurnPackage.DECOMPOSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TurnPackage.DECOMPOSITION__LONG_NAME:
        setLongName((LongName)null);
        return;
      case TurnPackage.DECOMPOSITION__DECOMPOSITION_TYPE:
        setDecompositionType(DECOMPOSITION_TYPE_EDEFAULT);
        return;
      case TurnPackage.DECOMPOSITION__DEST:
        setDest((IntentionalElement)null);
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
      case TurnPackage.DECOMPOSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TurnPackage.DECOMPOSITION__LONG_NAME:
        return longName != null;
      case TurnPackage.DECOMPOSITION__DECOMPOSITION_TYPE:
        return decompositionType != DECOMPOSITION_TYPE_EDEFAULT;
      case TurnPackage.DECOMPOSITION__DEST:
        return dest != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", decompositionType: ");
    result.append(decompositionType);
    result.append(')');
    return result.toString();
  }

} //DecompositionImpl

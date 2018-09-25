/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.ComponentRef#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.ComponentRef#getKind <em>Kind</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.ComponentRef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.ComponentRef#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.ComponentRef#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.ComponentRef#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef()
 * @model
 * @generated
 */
public interface ComponentRef extends URNmodelElement, ReferencedBoundElement
{
  /**
   * Returns the value of the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protected</em>' attribute.
   * @see #setProtected(boolean)
   * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef_Protected()
   * @model
   * @generated
   */
  boolean isProtected();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.ComponentRef#isProtected <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protected</em>' attribute.
   * @see #isProtected()
   * @generated
   */
  void setProtected(boolean value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.project.turn.turn.COMPONENTKIND}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.xtext.project.turn.turn.COMPONENTKIND
   * @see #setKind(COMPONENTKIND)
   * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef_Kind()
   * @model
   * @generated
   */
  COMPONENTKIND getKind();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.ComponentRef#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.xtext.project.turn.turn.COMPONENTKIND
   * @see #getKind()
   * @generated
   */
  void setKind(COMPONENTKIND value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.ComponentRef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' containment reference.
   * @see #setLongName(LongName)
   * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.ComponentRef#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(BoundOption)
   * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef_Element()
   * @model containment="true"
   * @generated
   */
  BoundOption getElement();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.ComponentRef#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(BoundOption value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.BoundOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getComponentRef_Elements()
   * @model containment="true"
   * @generated
   */
  EList<BoundOption> getElements();

} // ComponentRef

/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UR Nspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getInfo <em>Info</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getActors <em>Actors</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#isShowAsMeansEnd <em>Show As Means End</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getStratGroups <em>Strat Groups</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getIndConversions <em>Ind Conversions</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getContribContextGroups <em>Contrib Context Groups</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getContribContexts <em>Contrib Contexts</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getUcmMaps <em>Ucm Maps</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getUrnlinks <em>Urnlinks</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.URNspec#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getURNspec()
 * @model
 * @generated
 */
public interface URNspec extends EObject
{
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
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.URNspec#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info</em>' containment reference.
   * @see #setInfo(ConcreteURNspec)
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Info()
   * @model containment="true"
   * @generated
   */
  ConcreteURNspec getInfo();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.URNspec#getInfo <em>Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' containment reference.
   * @see #getInfo()
   * @generated
   */
  void setInfo(ConcreteURNspec value);

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

  /**
   * Returns the value of the '<em><b>Show As Means End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show As Means End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show As Means End</em>' attribute.
   * @see #setShowAsMeansEnd(boolean)
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_ShowAsMeansEnd()
   * @model
   * @generated
   */
  boolean isShowAsMeansEnd();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.URNspec#isShowAsMeansEnd <em>Show As Means End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show As Means End</em>' attribute.
   * @see #isShowAsMeansEnd()
   * @generated
   */
  void setShowAsMeansEnd(boolean value);

  /**
   * Returns the value of the '<em><b>Strat Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.StrategiesGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strat Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strat Groups</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_StratGroups()
   * @model containment="true"
   * @generated
   */
  EList<StrategiesGroup> getStratGroups();

  /**
   * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.EvaluationStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategies</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Strategies()
   * @model containment="true"
   * @generated
   */
  EList<EvaluationStrategy> getStrategies();

  /**
   * Returns the value of the '<em><b>Ind Conversions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.IndicatorConversion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ind Conversions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ind Conversions</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_IndConversions()
   * @model containment="true"
   * @generated
   */
  EList<IndicatorConversion> getIndConversions();

  /**
   * Returns the value of the '<em><b>Contrib Context Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.ContributionContextGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contrib Context Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrib Context Groups</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_ContribContextGroups()
   * @model containment="true"
   * @generated
   */
  EList<ContributionContextGroup> getContribContextGroups();

  /**
   * Returns the value of the '<em><b>Contrib Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.ContributionContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contrib Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrib Contexts</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_ContribContexts()
   * @model containment="true"
   * @generated
   */
  EList<ContributionContext> getContribContexts();

  /**
   * Returns the value of the '<em><b>Ucm Maps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.UCMmap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ucm Maps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ucm Maps</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_UcmMaps()
   * @model containment="true"
   * @generated
   */
  EList<UCMmap> getUcmMaps();

  /**
   * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.Concern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concerns</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Concerns()
   * @model containment="true"
   * @generated
   */
  EList<Concern> getConcerns();

  /**
   * Returns the value of the '<em><b>Urnlinks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.URNlink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Urnlinks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Urnlinks</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Urnlinks()
   * @model containment="true"
   * @generated
   */
  EList<URNlink> getUrnlinks();

  /**
   * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.Metadata}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getURNspec_Metadata()
   * @model containment="true"
   * @generated
   */
  EList<Metadata> getMetadata();

} // URNspec

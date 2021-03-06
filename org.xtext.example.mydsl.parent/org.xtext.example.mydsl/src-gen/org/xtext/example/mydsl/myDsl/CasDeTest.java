/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cas De Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CasDeTest#getTitreCasDeTest <em>Titre Cas De Test</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CasDeTest#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCasDeTest()
 * @model
 * @generated
 */
public interface CasDeTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Titre Cas De Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Titre Cas De Test</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Titre Cas De Test</em>' attribute.
   * @see #setTitreCasDeTest(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCasDeTest_TitreCasDeTest()
   * @model
   * @generated
   */
  String getTitreCasDeTest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CasDeTest#getTitreCasDeTest <em>Titre Cas De Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titre Cas De Test</em>' attribute.
   * @see #getTitreCasDeTest()
   * @generated
   */
  void setTitreCasDeTest(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCasDeTest_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // CasDeTest

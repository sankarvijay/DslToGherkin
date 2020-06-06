/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ScenarioImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Title Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TITLE_SCENARIO = 1;

  /**
   * The feature id for the '<em><b>Cas De Tests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__CAS_DE_TESTS = 2;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CasDeTestImpl <em>Cas De Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CasDeTestImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCasDeTest()
   * @generated
   */
  int CAS_DE_TEST = 1;

  /**
   * The feature id for the '<em><b>Titre Cas De Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAS_DE_TEST__TITRE_CAS_DE_TEST = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAS_DE_TEST__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Cas De Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAS_DE_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION = 0;

  /**
   * The feature id for the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__VALEUR = 1;

  /**
   * The feature id for the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TEXTE = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see org.xtext.example.mydsl.myDsl.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Scenario#getTitleScenario <em>Title Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title Scenario</em>'.
   * @see org.xtext.example.mydsl.myDsl.Scenario#getTitleScenario()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_TitleScenario();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Scenario#getCasDeTests <em>Cas De Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cas De Tests</em>'.
   * @see org.xtext.example.mydsl.myDsl.Scenario#getCasDeTests()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_CasDeTests();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CasDeTest <em>Cas De Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cas De Test</em>'.
   * @see org.xtext.example.mydsl.myDsl.CasDeTest
   * @generated
   */
  EClass getCasDeTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CasDeTest#getTitreCasDeTest <em>Titre Cas De Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Titre Cas De Test</em>'.
   * @see org.xtext.example.mydsl.myDsl.CasDeTest#getTitreCasDeTest()
   * @see #getCasDeTest()
   * @generated
   */
  EAttribute getCasDeTest_TitreCasDeTest();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.CasDeTest#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.xtext.example.mydsl.myDsl.CasDeTest#getActions()
   * @see #getCasDeTest()
   * @generated
   */
  EReference getCasDeTest_Actions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Action#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Action();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Action#getValeur <em>Valeur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valeur</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getValeur()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Valeur();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Action#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texte</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getTexte()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Texte();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ScenarioImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Title Scenario</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__TITLE_SCENARIO = eINSTANCE.getScenario_TitleScenario();

    /**
     * The meta object literal for the '<em><b>Cas De Tests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__CAS_DE_TESTS = eINSTANCE.getScenario_CasDeTests();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CasDeTestImpl <em>Cas De Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CasDeTestImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCasDeTest()
     * @generated
     */
    EClass CAS_DE_TEST = eINSTANCE.getCasDeTest();

    /**
     * The meta object literal for the '<em><b>Titre Cas De Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAS_DE_TEST__TITRE_CAS_DE_TEST = eINSTANCE.getCasDeTest_TitreCasDeTest();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAS_DE_TEST__ACTIONS = eINSTANCE.getCasDeTest_Actions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ACTION = eINSTANCE.getAction_Action();

    /**
     * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__VALEUR = eINSTANCE.getAction_Valeur();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TEXTE = eINSTANCE.getAction_Texte();

  }

} //MyDslPackage
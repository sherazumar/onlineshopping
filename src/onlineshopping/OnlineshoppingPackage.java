/**
 */
package onlineshopping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see onlineshopping.OnlineshoppingFactory
 * @model kind="package"
 * @generated
 */
public interface OnlineshoppingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "onlineshopping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///onlineshopping.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "onlineshopping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OnlineshoppingPackage eINSTANCE = onlineshopping.impl.OnlineshoppingPackageImpl.init();

	/**
	 * The meta object id for the '{@link onlineshopping.impl.NewClass1Impl <em>New Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see onlineshopping.impl.NewClass1Impl
	 * @see onlineshopping.impl.OnlineshoppingPackageImpl#getNewClass1()
	 * @generated
	 */
	int NEW_CLASS1 = 0;

	/**
	 * The number of structural features of the '<em>New Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS1_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link onlineshopping.NewClass1 <em>New Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Class1</em>'.
	 * @see onlineshopping.NewClass1
	 * @generated
	 */
	EClass getNewClass1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OnlineshoppingFactory getOnlineshoppingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link onlineshopping.impl.NewClass1Impl <em>New Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see onlineshopping.impl.NewClass1Impl
		 * @see onlineshopping.impl.OnlineshoppingPackageImpl#getNewClass1()
		 * @generated
		 */
		EClass NEW_CLASS1 = eINSTANCE.getNewClass1();

	}

} //OnlineshoppingPackage

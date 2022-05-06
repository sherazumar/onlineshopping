/**
 */
package onlineshopping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see onlineshopping.OnlineshoppingPackage
 * @generated
 */
public interface OnlineshoppingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OnlineshoppingFactory eINSTANCE = onlineshopping.impl.OnlineshoppingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>New Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Class1</em>'.
	 * @generated
	 */
	NewClass1 createNewClass1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OnlineshoppingPackage getOnlineshoppingPackage();

} //OnlineshoppingFactory

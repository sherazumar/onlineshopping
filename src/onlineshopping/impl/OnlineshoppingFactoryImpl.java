/**
 */
package onlineshopping.impl;

import onlineshopping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnlineshoppingFactoryImpl extends EFactoryImpl implements OnlineshoppingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnlineshoppingFactory init() {
		try {
			OnlineshoppingFactory theOnlineshoppingFactory = (OnlineshoppingFactory)EPackage.Registry.INSTANCE.getEFactory(OnlineshoppingPackage.eNS_URI);
			if (theOnlineshoppingFactory != null) {
				return theOnlineshoppingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OnlineshoppingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineshoppingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OnlineshoppingPackage.NEW_CLASS1: return createNewClass1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewClass1 createNewClass1() {
		NewClass1Impl newClass1 = new NewClass1Impl();
		return newClass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineshoppingPackage getOnlineshoppingPackage() {
		return (OnlineshoppingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OnlineshoppingPackage getPackage() {
		return OnlineshoppingPackage.eINSTANCE;
	}

} //OnlineshoppingFactoryImpl

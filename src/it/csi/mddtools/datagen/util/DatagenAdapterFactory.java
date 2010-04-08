/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.util;

import it.csi.mddtools.datagen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.DatagenPackage
 * @generated
 */
public class DatagenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatagenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatagenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatagenSwitch<Adapter> modelSwitch =
		new DatagenSwitch<Adapter>() {
			@Override
			public Adapter caseDBAccessModel(DBAccessModel object) {
				return createDBAccessModelAdapter();
			}
			@Override
			public Adapter caseDataAccessObject(DataAccessObject object) {
				return createDataAccessObjectAdapter();
			}
			@Override
			public Adapter caseDaoPackage(DaoPackage object) {
				return createDaoPackageAdapter();
			}
			@Override
			public Adapter casePKGenerator(PKGenerator object) {
				return createPKGeneratorAdapter();
			}
			@Override
			public Adapter caseSequencePKGenerator(SequencePKGenerator object) {
				return createSequencePKGeneratorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DBAccessModel <em>DB Access Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DBAccessModel
	 * @generated
	 */
	public Adapter createDBAccessModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DataAccessObject <em>Data Access Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DataAccessObject
	 * @generated
	 */
	public Adapter createDataAccessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DaoPackage <em>Dao Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DaoPackage
	 * @generated
	 */
	public Adapter createDaoPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.PKGenerator <em>PK Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.PKGenerator
	 * @generated
	 */
	public Adapter createPKGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.SequencePKGenerator <em>Sequence PK Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.SequencePKGenerator
	 * @generated
	 */
	public Adapter createSequencePKGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatagenAdapterFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.DatagenPackage
 * @generated
 */
public interface DatagenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatagenFactory eINSTANCE = it.csi.mddtools.datagen.impl.DatagenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DB Access Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Access Model</em>'.
	 * @generated
	 */
	DBAccessModel createDBAccessModel();

	/**
	 * Returns a new object of class '<em>Data Access Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Access Object</em>'.
	 * @generated
	 */
	DataAccessObject createDataAccessObject();

	/**
	 * Returns a new object of class '<em>Dao Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dao Package</em>'.
	 * @generated
	 */
	DaoPackage createDaoPackage();

	/**
	 * Returns a new object of class '<em>Sequence PK Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence PK Generator</em>'.
	 * @generated
	 */
	SequencePKGenerator createSequencePKGenerator();

	/**
	 * Returns a new object of class '<em>Inserter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserter</em>'.
	 * @generated
	 */
	Inserter createInserter();

	/**
	 * Returns a new object of class '<em>Find By PK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find By PK</em>'.
	 * @generated
	 */
	FindByPK createFindByPK();

	/**
	 * Returns a new object of class '<em>Find All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find All</em>'.
	 * @generated
	 */
	FindAll createFindAll();

	/**
	 * Returns a new object of class '<em>QBE Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QBE Finder</em>'.
	 * @generated
	 */
	QBEFinder createQBEFinder();

	/**
	 * Returns a new object of class '<em>Custom Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Finder</em>'.
	 * @generated
	 */
	CustomFinder createCustomFinder();

	/**
	 * Returns a new object of class '<em>Updaters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Updaters</em>'.
	 * @generated
	 */
	Updaters createUpdaters();

	/**
	 * Returns a new object of class '<em>Update Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Row</em>'.
	 * @generated
	 */
	UpdateRow createUpdateRow();

	/**
	 * Returns a new object of class '<em>Update Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Columns</em>'.
	 * @generated
	 */
	UpdateColumns createUpdateColumns();

	/**
	 * Returns a new object of class '<em>Deleters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleters</em>'.
	 * @generated
	 */
	Deleters createDeleters();

	/**
	 * Returns a new object of class '<em>Delete By PK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete By PK</em>'.
	 * @generated
	 */
	DeleteByPK createDeleteByPK();

	/**
	 * Returns a new object of class '<em>Custom Updater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Updater</em>'.
	 * @generated
	 */
	CustomUpdater createCustomUpdater();

	/**
	 * Returns a new object of class '<em>Finders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finders</em>'.
	 * @generated
	 */
	Finders createFinders();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatagenPackage getDatagenPackage();

} //DatagenFactory

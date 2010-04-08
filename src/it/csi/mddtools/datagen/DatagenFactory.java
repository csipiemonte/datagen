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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatagenPackage getDatagenPackage();

} //DatagenFactory

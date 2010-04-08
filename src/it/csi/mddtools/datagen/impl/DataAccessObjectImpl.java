/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;

import it.csi.mddtools.datagen.PKGenerator;
import it.csi.mddtools.rdbmdl.Table;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getMainTable <em>Main Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getPkGenerator <em>Pk Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAccessObjectImpl extends CDOObjectImpl implements DataAccessObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAccessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.DATA_ACCESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getMainTable() {
		return (Table)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__MAIN_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainTable(Table newMainTable) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__MAIN_TABLE, newMainTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKGenerator getPkGenerator() {
		return (PKGenerator)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__PK_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkGenerator(PKGenerator newPkGenerator) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__PK_GENERATOR, newPkGenerator);
	}

} //DataAccessObjectImpl

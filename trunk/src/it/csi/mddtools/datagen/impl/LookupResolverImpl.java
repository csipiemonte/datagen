/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.LookupResolver;

import it.csi.mddtools.rdbmdl.constraints.ForeignKey;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Resolver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.LookupResolverImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.LookupResolverImpl#getSupplierDAO <em>Supplier DAO</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.LookupResolverImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LookupResolverImpl extends CDOObjectImpl implements LookupResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupResolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.LOOKUP_RESOLVER;
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
	public ForeignKey getForeignKey() {
		return (ForeignKey)eGet(DatagenPackage.Literals.LOOKUP_RESOLVER__FOREIGN_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(ForeignKey newForeignKey) {
		eSet(DatagenPackage.Literals.LOOKUP_RESOLVER__FOREIGN_KEY, newForeignKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessObject getSupplierDAO() {
		return (DataAccessObject)eGet(DatagenPackage.Literals.LOOKUP_RESOLVER__SUPPLIER_DAO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierDAO(DataAccessObject newSupplierDAO) {
		eSet(DatagenPackage.Literals.LOOKUP_RESOLVER__SUPPLIER_DAO, newSupplierDAO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(DatagenPackage.Literals.LOOKUP_RESOLVER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(DatagenPackage.Literals.LOOKUP_RESOLVER__NAME, newName);
	}

} //LookupResolverImpl

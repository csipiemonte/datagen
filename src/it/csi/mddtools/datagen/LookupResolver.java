/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import it.csi.mddtools.rdbmdl.constraints.ForeignKey;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Resolver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.LookupResolver#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.LookupResolver#getSupplierDAO <em>Supplier DAO</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getLookupResolver()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface LookupResolver extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' reference.
	 * @see #setForeignKey(ForeignKey)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getLookupResolver_ForeignKey()
	 * @model
	 * @generated
	 */
	ForeignKey getForeignKey();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.LookupResolver#getForeignKey <em>Foreign Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Supplier DAO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier DAO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier DAO</em>' reference.
	 * @see #setSupplierDAO(DataAccessObject)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getLookupResolver_SupplierDAO()
	 * @model
	 * @generated
	 */
	DataAccessObject getSupplierDAO();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.LookupResolver#getSupplierDAO <em>Supplier DAO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier DAO</em>' reference.
	 * @see #getSupplierDAO()
	 * @generated
	 */
	void setSupplierDAO(DataAccessObject value);

} // LookupResolver

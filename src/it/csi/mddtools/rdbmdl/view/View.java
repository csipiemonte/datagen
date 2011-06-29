/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.view;

import it.csi.mddtools.rdbmdl.NamedColumnSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.View#getColumns <em>Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.View#getReferencedTablesAndViews <em>Referenced Tables And Views</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.View#getDdl <em>Ddl</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getView()
 * @model
 * @generated
 */
public interface View extends NamedColumnSet {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.view.ViewColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getView_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ViewColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Referenced Tables And Views</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.view.ViewAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Tables And Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Tables And Views</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getView_ReferencedTablesAndViews()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewAlias> getReferencedTablesAndViews();

	/**
	 * Returns the value of the '<em><b>Ddl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddl</em>' attribute.
	 * @see #setDdl(String)
	 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getView_Ddl()
	 * @model
	 * @generated
	 */
	String getDdl();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.view.View#getDdl <em>Ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ddl</em>' attribute.
	 * @see #getDdl()
	 * @generated
	 */
	void setDdl(String value);

} // View

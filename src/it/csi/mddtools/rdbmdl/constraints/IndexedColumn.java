/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints;

import it.csi.mddtools.rdbmdl.NamedElement;
import it.csi.mddtools.rdbmdl.TableColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexed Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#isAscending <em>Ascending</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#getRefColumn <em>Ref Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndexedColumn()
 * @model
 * @generated
 */
public interface IndexedColumn extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #setAscending(boolean)
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndexedColumn_Ascending()
	 * @model
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

	/**
	 * Returns the value of the '<em><b>Ref Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Column</em>' reference.
	 * @see #setRefColumn(TableColumn)
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndexedColumn_RefColumn()
	 * @model required="true"
	 * @generated
	 */
	TableColumn getRefColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#getRefColumn <em>Ref Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Column</em>' reference.
	 * @see #getRefColumn()
	 * @generated
	 */
	void setRefColumn(TableColumn value);

} // IndexedColumn

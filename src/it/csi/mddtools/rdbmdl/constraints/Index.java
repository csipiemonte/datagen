/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.Index#getIndexedColumns <em>Indexed Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends Constraint {
	/**
	 * Returns the value of the '<em><b>Indexed Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed Columns</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndex_IndexedColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexedColumn> getIndexedColumns();

} // Index

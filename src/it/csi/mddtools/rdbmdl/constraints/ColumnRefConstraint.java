/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints;

import it.csi.mddtools.rdbmdl.TableColumn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Ref Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint#getIncludedColumns <em>Included Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getColumnRefConstraint()
 * @model abstract="true"
 * @generated
 */
public interface ColumnRefConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Included Columns</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Columns</em>' reference list.
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getColumnRefConstraint_IncludedColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<TableColumn> getIncludedColumns();

} // ColumnRefConstraint

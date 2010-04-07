/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints.impl;

import it.csi.mddtools.rdbmdl.TableColumn;

import it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint;
import it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Ref Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.impl.ColumnRefConstraintImpl#getIncludedColumns <em>Included Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ColumnRefConstraintImpl extends ConstraintImpl implements ColumnRefConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnRefConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.COLUMN_REF_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TableColumn> getIncludedColumns() {
		return (EList<TableColumn>)eGet(ConstraintsPackage.Literals.COLUMN_REF_CONSTRAINT__INCLUDED_COLUMNS, true);
	}

} //ColumnRefConstraintImpl

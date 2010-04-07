/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.impl;

import it.csi.mddtools.rdbmdl.RdbmdlPackage;
import it.csi.mddtools.rdbmdl.Table;
import it.csi.mddtools.rdbmdl.TableColumn;

import it.csi.mddtools.rdbmdl.constraints.CheckConstraint;
import it.csi.mddtools.rdbmdl.constraints.ForeignKey;
import it.csi.mddtools.rdbmdl.constraints.Index;
import it.csi.mddtools.rdbmdl.constraints.PrimaryKey;
import it.csi.mddtools.rdbmdl.constraints.UniqueConstraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableImpl#getUniqueConstraints <em>Unique Constraints</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableImpl#getChecks <em>Checks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends NamedColumnSetImpl implements Table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmdlPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TableColumn> getColumns() {
		return (EList<TableColumn>)eGet(RdbmdlPackage.Literals.TABLE__COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		return (PrimaryKey)eGet(RdbmdlPackage.Literals.TABLE__PRIMARY_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		eSet(RdbmdlPackage.Literals.TABLE__PRIMARY_KEY, newPrimaryKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UniqueConstraint> getUniqueConstraints() {
		return (EList<UniqueConstraint>)eGet(RdbmdlPackage.Literals.TABLE__UNIQUE_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ForeignKey> getForeignKeys() {
		return (EList<ForeignKey>)eGet(RdbmdlPackage.Literals.TABLE__FOREIGN_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Index> getIndices() {
		return (EList<Index>)eGet(RdbmdlPackage.Literals.TABLE__INDICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CheckConstraint> getChecks() {
		return (EList<CheckConstraint>)eGet(RdbmdlPackage.Literals.TABLE__CHECKS, true);
	}

} //TableImpl

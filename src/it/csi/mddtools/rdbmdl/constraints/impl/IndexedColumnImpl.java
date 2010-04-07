/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints.impl;

import it.csi.mddtools.rdbmdl.TableColumn;

import it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage;
import it.csi.mddtools.rdbmdl.constraints.IndexedColumn;

import it.csi.mddtools.rdbmdl.impl.NamedElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indexed Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.impl.IndexedColumnImpl#isAscending <em>Ascending</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.impl.IndexedColumnImpl#getRefColumn <em>Ref Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexedColumnImpl extends NamedElementImpl implements IndexedColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexedColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.INDEXED_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAscending() {
		return (Boolean)eGet(ConstraintsPackage.Literals.INDEXED_COLUMN__ASCENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscending(boolean newAscending) {
		eSet(ConstraintsPackage.Literals.INDEXED_COLUMN__ASCENDING, newAscending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn getRefColumn() {
		return (TableColumn)eGet(ConstraintsPackage.Literals.INDEXED_COLUMN__REF_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefColumn(TableColumn newRefColumn) {
		eSet(ConstraintsPackage.Literals.INDEXED_COLUMN__REF_COLUMN, newRefColumn);
	}

} //IndexedColumnImpl

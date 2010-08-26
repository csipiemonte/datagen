/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.OrderSpec;

import it.csi.mddtools.rdbmdl.Column;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.OrderSpecImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.OrderSpecImpl#isAscending <em>Ascending</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderSpecImpl extends CDOObjectImpl implements OrderSpec {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.ORDER_SPEC;
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
	public Column getColumn() {
		return (Column)eGet(DatagenPackage.Literals.ORDER_SPEC__COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		eSet(DatagenPackage.Literals.ORDER_SPEC__COLUMN, newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAscending() {
		return (Boolean)eGet(DatagenPackage.Literals.ORDER_SPEC__ASCENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscending(boolean newAscending) {
		eSet(DatagenPackage.Literals.ORDER_SPEC__ASCENDING, newAscending);
	}

} //OrderSpecImpl

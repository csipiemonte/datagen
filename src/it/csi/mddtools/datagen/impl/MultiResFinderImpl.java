/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.MultiResFinder;
import it.csi.mddtools.datagen.OrderSpecs;

import it.csi.mddtools.rdbmdl.Column;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Res Finder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.MultiResFinderImpl#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.MultiResFinderImpl#getOrderSpecs <em>Order Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MultiResFinderImpl extends FinderImpl implements MultiResFinder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiResFinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.MULTI_RES_FINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Column> getDistinct() {
		return (EList<Column>)eGet(DatagenPackage.Literals.MULTI_RES_FINDER__DISTINCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSpecs getOrderSpecs() {
		return (OrderSpecs)eGet(DatagenPackage.Literals.MULTI_RES_FINDER__ORDER_SPECS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderSpecs(OrderSpecs newOrderSpecs) {
		eSet(DatagenPackage.Literals.MULTI_RES_FINDER__ORDER_SPECS, newOrderSpecs);
	}

} //MultiResFinderImpl

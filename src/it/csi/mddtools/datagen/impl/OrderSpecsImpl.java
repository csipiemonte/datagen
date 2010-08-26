/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.OrderSpec;
import it.csi.mddtools.datagen.OrderSpecs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Specs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.OrderSpecsImpl#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderSpecsImpl extends CDOObjectImpl implements OrderSpecs {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderSpecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.ORDER_SPECS;
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
	@SuppressWarnings("unchecked")
	public EList<OrderSpec> getSpecs() {
		return (EList<OrderSpec>)eGet(DatagenPackage.Literals.ORDER_SPECS__SPECS, true);
	}

} //OrderSpecsImpl

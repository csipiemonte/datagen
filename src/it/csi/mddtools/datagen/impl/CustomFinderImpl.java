/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.CustomFinder;
import it.csi.mddtools.datagen.DatagenPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Finder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#isCustomSelect <em>Custom Select</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#isCustomFrom <em>Custom From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFinderImpl extends MultiResFinderImpl implements CustomFinder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.CUSTOM_FINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterClassFQN() {
		return (String)eGet(DatagenPackage.Literals.CUSTOM_FINDER__FILTER_CLASS_FQN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClassFQN(String newFilterClassFQN) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__FILTER_CLASS_FQN, newFilterClassFQN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomSelect() {
		return (Boolean)eGet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_SELECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomSelect(boolean newCustomSelect) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_SELECT, newCustomSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomFrom() {
		return (Boolean)eGet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomFrom(boolean newCustomFrom) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_FROM, newCustomFrom);
	}

} //CustomFinderImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.CustomUpdater;
import it.csi.mddtools.datagen.DatagenPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Updater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomUpdaterImpl#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomUpdaterImpl#getValueClassFQN <em>Value Class FQN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomUpdaterImpl extends UpdaterImpl implements CustomUpdater {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomUpdaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.CUSTOM_UPDATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterClassFQN() {
		return (String)eGet(DatagenPackage.Literals.CUSTOM_UPDATER__FILTER_CLASS_FQN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClassFQN(String newFilterClassFQN) {
		eSet(DatagenPackage.Literals.CUSTOM_UPDATER__FILTER_CLASS_FQN, newFilterClassFQN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueClassFQN() {
		return (String)eGet(DatagenPackage.Literals.CUSTOM_UPDATER__VALUE_CLASS_FQN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueClassFQN(String newValueClassFQN) {
		eSet(DatagenPackage.Literals.CUSTOM_UPDATER__VALUE_CLASS_FQN, newValueClassFQN);
	}

} //CustomUpdaterImpl

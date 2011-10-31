/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.JoinCriterion;
import it.csi.mddtools.datagen.QTable;

import it.csi.mddtools.rdbmdl.TableColumn;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.JoinCriterionImpl#getLeftTable <em>Left Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.JoinCriterionImpl#getLeftColumn <em>Left Column</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.JoinCriterionImpl#getRightTable <em>Right Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.JoinCriterionImpl#getRightColumn <em>Right Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinCriterionImpl extends CDOObjectImpl implements JoinCriterion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.JOIN_CRITERION;
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
	public QTable getLeftTable() {
		return (QTable)eGet(DatagenPackage.Literals.JOIN_CRITERION__LEFT_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftTable(QTable newLeftTable) {
		eSet(DatagenPackage.Literals.JOIN_CRITERION__LEFT_TABLE, newLeftTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn getLeftColumn() {
		return (TableColumn)eGet(DatagenPackage.Literals.JOIN_CRITERION__LEFT_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftColumn(TableColumn newLeftColumn) {
		eSet(DatagenPackage.Literals.JOIN_CRITERION__LEFT_COLUMN, newLeftColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTable getRightTable() {
		return (QTable)eGet(DatagenPackage.Literals.JOIN_CRITERION__RIGHT_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightTable(QTable newRightTable) {
		eSet(DatagenPackage.Literals.JOIN_CRITERION__RIGHT_TABLE, newRightTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn getRightColumn() {
		return (TableColumn)eGet(DatagenPackage.Literals.JOIN_CRITERION__RIGHT_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightColumn(TableColumn newRightColumn) {
		eSet(DatagenPackage.Literals.JOIN_CRITERION__RIGHT_COLUMN, newRightColumn);
	}

} //JoinCriterionImpl

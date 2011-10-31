/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.QTable;
import it.csi.mddtools.datagen.QTableColumn;

import it.csi.mddtools.rdbmdl.TableColumn;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QTable Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.QTableColumnImpl#getQtable <em>Qtable</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.QTableColumnImpl#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QTableColumnImpl extends QResultColumnImpl implements QTableColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QTableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.QTABLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTable getQtable() {
		return (QTable)eGet(DatagenPackage.Literals.QTABLE_COLUMN__QTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtable(QTable newQtable) {
		eSet(DatagenPackage.Literals.QTABLE_COLUMN__QTABLE, newQtable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn getColumn() {
		return (TableColumn)eGet(DatagenPackage.Literals.QTABLE_COLUMN__COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(TableColumn newColumn) {
		eSet(DatagenPackage.Literals.QTABLE_COLUMN__COLUMN, newColumn);
	}

} //QTableColumnImpl

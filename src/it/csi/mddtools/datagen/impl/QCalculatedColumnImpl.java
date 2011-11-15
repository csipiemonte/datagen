/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.QCalculatedColumn;

import it.csi.mddtools.datagen.QResultColumn;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QCalculated Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.QCalculatedColumnImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.QCalculatedColumnImpl#getFreeTextExpression <em>Free Text Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QCalculatedColumnImpl extends QResultColumnImpl implements QCalculatedColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QCalculatedColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.QCALCULATED_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QResultColumn> getReferencedColumns() {
		return (EList<QResultColumn>)eGet(DatagenPackage.Literals.QCALCULATED_COLUMN__REFERENCED_COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreeTextExpression() {
		return (String)eGet(DatagenPackage.Literals.QCALCULATED_COLUMN__FREE_TEXT_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeTextExpression(String newFreeTextExpression) {
		eSet(DatagenPackage.Literals.QCALCULATED_COLUMN__FREE_TEXT_EXPRESSION, newFreeTextExpression);
	}

} //QCalculatedColumnImpl

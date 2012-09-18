/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.OrderSpec;

import it.csi.mddtools.datagen.QTableColumn;
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
 *   <li>{@link it.csi.mddtools.datagen.impl.OrderSpecImpl#getQcolumn <em>Qcolumn</em>}</li>
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTableColumn getQcolumn() {
		return (QTableColumn)eGet(DatagenPackage.Literals.ORDER_SPEC__QCOLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQcolumn(QTableColumn newQcolumn) {
		eSet(DatagenPackage.Literals.ORDER_SPEC__QCOLUMN, newQcolumn);
	}

} //OrderSpecImpl

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

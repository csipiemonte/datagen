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
package it.csi.mddtools.rdbmdl.constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.Index#getIndexedColumns <em>Indexed Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends Constraint {
	/**
	 * Returns the value of the '<em><b>Indexed Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed Columns</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndex_IndexedColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexedColumn> getIndexedColumns();

} // Index

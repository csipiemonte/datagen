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
package it.csi.mddtools.rdbmdl.view;

import it.csi.mddtools.rdbmdl.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced View Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.ReferencedViewColumn#getRefColumn <em>Ref Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getReferencedViewColumn()
 * @model
 * @generated
 */
public interface ReferencedViewColumn extends ViewColumn {
	/**
	 * Returns the value of the '<em><b>Ref Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Column</em>' reference.
	 * @see #setRefColumn(Column)
	 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getReferencedViewColumn_RefColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getRefColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.view.ReferencedViewColumn#getRefColumn <em>Ref Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Column</em>' reference.
	 * @see #getRefColumn()
	 * @generated
	 */
	void setRefColumn(Column value);

} // ReferencedViewColumn

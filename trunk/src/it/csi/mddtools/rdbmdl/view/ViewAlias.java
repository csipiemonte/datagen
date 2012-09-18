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

import it.csi.mddtools.rdbmdl.NamedColumnSet;
import it.csi.mddtools.rdbmdl.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.ViewAlias#getReferencedTableOrView <em>Referenced Table Or View</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getViewAlias()
 * @model
 * @generated
 */
public interface ViewAlias extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Referenced Table Or View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Table Or View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table Or View</em>' reference.
	 * @see #setReferencedTableOrView(NamedColumnSet)
	 * @see it.csi.mddtools.rdbmdl.view.ViewPackage#getViewAlias_ReferencedTableOrView()
	 * @model required="true"
	 * @generated
	 */
	NamedColumnSet getReferencedTableOrView();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.view.ViewAlias#getReferencedTableOrView <em>Referenced Table Or View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table Or View</em>' reference.
	 * @see #getReferencedTableOrView()
	 * @generated
	 */
	void setReferencedTableOrView(NamedColumnSet value);

} // ViewAlias

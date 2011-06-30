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
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finders</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Insieme dei <b>Finder</b> messi a disposizione dal <b>DataAccessObject</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Finders#getFinders <em>Finders</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getFinders()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Finders extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Finders</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Finder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei <b>Finder</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finders</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getFinders_Finders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finder> getFinders();

} // Finders

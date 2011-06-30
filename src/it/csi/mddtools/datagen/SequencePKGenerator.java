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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence PK Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generatorew di primary key basato su SEQUENCE
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.SequencePKGenerator#getSequenceName <em>Sequence Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getSequencePKGenerator()
 * @model
 * @generated
 */
public interface SequencePKGenerator extends PKGenerator {
	/**
	 * Returns the value of the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome della SEQUENCE utilizzata dal generatore di primary key
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Name</em>' attribute.
	 * @see #setSequenceName(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getSequencePKGenerator_SequenceName()
	 * @model required="true"
	 * @generated
	 */
	String getSequenceName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.SequencePKGenerator#getSequenceName <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Name</em>' attribute.
	 * @see #getSequenceName()
	 * @generated
	 */
	void setSequenceName(String value);

} // SequencePKGenerator

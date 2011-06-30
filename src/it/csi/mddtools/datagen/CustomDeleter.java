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
 * A representation of the model object '<em><b>Custom Deleter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operazione di cancellazioen righe altamente personalizzabile, tramite scrittura di codice custom.
 * E' utile nel caso si debbano realizzare delle operazioni di cancellazione di un insieme di righe e non
 * di una singola riga identificata da PK.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.CustomDeleter#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomDeleter()
 * @model
 * @generated
 */
public interface CustomDeleter extends Deleter {
	/**
	 * Returns the value of the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full qualified name della classe che deve essere utilizzata come parametro di input per il deleter.
	 * Possibili valori:
	 * <ul>
	 * <li>Se non si specifica la proipriet&agrave; la classe utilizzata sar&agrave; <i>java.lang.Object</i>.</li>
	 * <li>Se il valore specificato &egrave; $dto, sar&agrave; utilizzata la classe del dto associato. </li>
	 * <li>Se il valore specificato &egrave; $dto[], sar&agrave; utilizzata una ArrayList costituita da oggetti del tipo del dto associato. </li>
	 * </ul>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Class FQN</em>' attribute.
	 * @see #setFilterClassFQN(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomDeleter_FilterClassFQN()
	 * @model
	 * @generated
	 */
	String getFilterClassFQN();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.CustomDeleter#getFilterClassFQN <em>Filter Class FQN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class FQN</em>' attribute.
	 * @see #getFilterClassFQN()
	 * @generated
	 */
	void setFilterClassFQN(String value);

} // CustomDeleter

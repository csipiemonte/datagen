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
 * A representation of the model object '<em><b>Custom Finder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operazione di ricerca con logica custom
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.CustomFinder#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.CustomFinder#isCustomSelect <em>Custom Select</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.CustomFinder#isCustomFrom <em>Custom From</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomFinder()
 * @model
 * @generated
 */
public interface CustomFinder extends MultiResFinder {

	/**
	 * Returns the value of the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full qualified name della classe che deve essere utilizzata come parametro di input per il finder.
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
	 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomFinder_FilterClassFQN()
	 * @model
	 * @generated
	 */
	String getFilterClassFQN();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.CustomFinder#getFilterClassFQN <em>Filter Class FQN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class FQN</em>' attribute.
	 * @see #getFilterClassFQN()
	 * @generated
	 */
	void setFilterClassFQN(String value);

	/**
	 * Returns the value of the '<em><b>Custom Select</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostata a true permette la customizzazione della clausola select, 
	 * altrimenti viene generata una clausola di default che tiene conto di:
	 * <ul>
	 * <li>nomi di colonne</li>
	 * <li>posizione delle colonne</li>
	 * <li>eventuali clausole DISTINCT</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Select</em>' attribute.
	 * @see #setCustomSelect(boolean)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomFinder_CustomSelect()
	 * @model default="false"
	 * @generated
	 */
	boolean isCustomSelect();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.CustomFinder#isCustomSelect <em>Custom Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Select</em>' attribute.
	 * @see #isCustomSelect()
	 * @generated
	 */
	void setCustomSelect(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom From</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostata a true permette la customizzazione della clausola FROM, 
	 * tipicamente necessaria quando si debba introdurre una tabella aggiuntiva
	 * per fare ad esempio una join.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom From</em>' attribute.
	 * @see #setCustomFrom(boolean)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomFinder_CustomFrom()
	 * @model default="false"
	 * @generated
	 */
	boolean isCustomFrom();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.CustomFinder#isCustomFrom <em>Custom From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom From</em>' attribute.
	 * @see #isCustomFrom()
	 * @generated
	 */
	void setCustomFrom(boolean value);
} // CustomFinder

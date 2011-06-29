/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Updater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operazione di aggiornamento dati altamente personalizzabile, tramite scrittura di codice custom.
 * E' utile, ad esempio, nel caso si debbano realizzare delle operazioni di aggiornamento di un insieme di righe e non
 * di una singola riga identificata da PK.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.CustomUpdater#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.CustomUpdater#getValueClassFQN <em>Value Class FQN</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomUpdater()
 * @model
 * @generated
 */
public interface CustomUpdater extends Updater {

	/**
	 * Returns the value of the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full qualified name della classe che deve essere utilizzata come primo parametro di input per il finder.
	 * Serve per determinare l'inisieme di righe su cui operare la modifica
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
	 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomUpdater_FilterClassFQN()
	 * @model
	 * @generated
	 */
	String getFilterClassFQN();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.CustomUpdater#getFilterClassFQN <em>Filter Class FQN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class FQN</em>' attribute.
	 * @see #getFilterClassFQN()
	 * @generated
	 */
	void setFilterClassFQN(String value);

	/**
	 * Returns the value of the '<em><b>Value Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full qualified name della classe che deve essere utilizzata come secondo parametro parametro di input per l'updater.
	 * Serve per specificare i valori da impostare
	 * 
	 * Possibili valori:
	 * <ul>
	 * <li>Se non si specifica la proipriet&agrave; la classe utilizzata sar&agrave; <i>java.lang.Object</i>.</li>
	 * <li>Se il valore specificato &egrave; $dto, sar&agrave; utilizzata la classe del dto associato. </li>
	 * <li>Se il valore specificato &egrave; $dto[], sar&agrave; utilizzata una ArrayList costituita da oggetti del tipo del dto associato. </li>
	 * </ul>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Class FQN</em>' attribute.
	 * @see #setValueClassFQN(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomUpdater_ValueClassFQN()
	 * @model
	 * @generated
	 */
	String getValueClassFQN();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.CustomUpdater#getValueClassFQN <em>Value Class FQN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Class FQN</em>' attribute.
	 * @see #getValueClassFQN()
	 * @generated
	 */
	void setValueClassFQN(String value);
} // CustomUpdater

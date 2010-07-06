/**
 * <copyright>
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
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getCustomFinder()
 * @model
 * @generated
 */
public interface CustomFinder extends Finder {

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
} // CustomFinder

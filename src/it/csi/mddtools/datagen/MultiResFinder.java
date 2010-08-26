/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;

import it.csi.mddtools.rdbmdl.Column;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Res Finder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe astratta da cui discendono tutti i <b>Finder</b> a risultato
 * potenzialmente multiplo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.MultiResFinder#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.MultiResFinder#getOrderSpecs <em>Order Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getMultiResFinder()
 * @model abstract="true"
 * @generated
 */
public interface MultiResFinder extends Finder {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distinct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eventuale direttiva di _DISTINCT_. Se si specifica una o pi&ugrave; colonne viene applicata la clausola _DISTINCT_.
	 * In questo caso il risultato conterr&agrave; la valorizzazione delle sole colonne
	 * indicate nell'elenco.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distinct</em>' reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getMultiResFinder_Distinct()
	 * @model
	 * @generated
	 */
	EList<Column> getDistinct();

	/**
	 * Returns the value of the '<em><b>Order Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Specs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eventuali specifiche di ordinamento dei risultati della query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Specs</em>' containment reference.
	 * @see #setOrderSpecs(OrderSpecs)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getMultiResFinder_OrderSpecs()
	 * @model containment="true"
	 * @generated
	 */
	OrderSpecs getOrderSpecs();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.MultiResFinder#getOrderSpecs <em>Order Specs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Specs</em>' containment reference.
	 * @see #getOrderSpecs()
	 * @generated
	 */
	void setOrderSpecs(OrderSpecs value);

} // MultiResFinder

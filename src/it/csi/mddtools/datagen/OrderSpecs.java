/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Specs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifiche di ordinamento da applicare ai risultati di una query
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.OrderSpecs#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpecs()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OrderSpecs extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.OrderSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contiene l'elenco delle specifiche di ordinamento. L'ordinamento dei
	 * risultati &egrave; ottenuto applicando le specifiche relative alle singole
	 * colonne nell'ordine in cui sono inserite in questo elenco.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specs</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpecs_Specs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderSpec> getSpecs();

} // OrderSpecs

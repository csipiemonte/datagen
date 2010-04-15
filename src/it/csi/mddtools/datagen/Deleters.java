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
 * A representation of the model object '<em><b>Deleters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Deleters#getDeleters <em>Deleters</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getDeleters()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Deleters extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Deleters</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Deleter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleters</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDeleters_Deleters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deleter> getDeleters();

} // Deleters

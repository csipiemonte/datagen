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
 * A representation of the model object '<em><b>Finders</b></em>'.
 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Finders</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getFinders_Finders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finder> getFinders();

} // Finders

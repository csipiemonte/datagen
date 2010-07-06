/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.Model#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.Model#getServer_id <em>Server id</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getModel_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Server id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server id</em>' attribute.
	 * @see #setServer_id(String)
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getModel_Server_id()
	 * @model
	 * @generated
	 */
	String getServer_id();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.Model#getServer_id <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server id</em>' attribute.
	 * @see #getServer_id()
	 * @generated
	 */
	void setServer_id(String value);

} // Model

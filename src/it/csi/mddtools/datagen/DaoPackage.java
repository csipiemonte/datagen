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
 * A representation of the model object '<em><b>Dao Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Raggruppamento logico di <b>DataAccessObject</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.DaoPackage#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DaoPackage#getDao <em>Dao</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getDaoPackage()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DaoPackage extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome logico del package. deve essere un identificativo valido per un package java
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDaoPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DaoPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dao</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.DataAccessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dao</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei <b>DataAccessObject</b> contenuti nel package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dao</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDaoPackage_Dao()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAccessObject> getDao();

} // DaoPackage

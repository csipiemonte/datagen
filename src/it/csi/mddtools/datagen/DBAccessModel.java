/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;

import it.csi.mddtools.rdbmdl.Schema;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Access Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.DBAccessModel#getSchema <em>Schema</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DBAccessModel#getDaopkgs <em>Daopkgs</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DBAccessModel#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DBAccessModel#getCodComponente <em>Cod Componente</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getDBAccessModel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DBAccessModel extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDBAccessModel_Schema()
	 * @model required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DBAccessModel#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Daopkgs</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.DaoPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daopkgs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daopkgs</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDBAccessModel_Daopkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaoPackage> getDaopkgs();

	/**
	 * Returns the value of the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Prodotto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #setCodProdotto(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDBAccessModel_CodProdotto()
	 * @model
	 * @generated
	 */
	String getCodProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DBAccessModel#getCodProdotto <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #getCodProdotto()
	 * @generated
	 */
	void setCodProdotto(String value);

	/**
	 * Returns the value of the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Componente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Componente</em>' attribute.
	 * @see #setCodComponente(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDBAccessModel_CodComponente()
	 * @model
	 * @generated
	 */
	String getCodComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DBAccessModel#getCodComponente <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Componente</em>' attribute.
	 * @see #getCodComponente()
	 * @generated
	 */
	void setCodComponente(String value);

} // DBAccessModel

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl;

import it.csi.mddtools.rdbmdl.datatypes.Domain;
import it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.TableColumn#getDomain <em>Domain</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.TableColumn#getType <em>Type</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.TableColumn#getIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.TableColumn#getIsForeignKey <em>Is Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTableColumn()
 * @model
 * @generated
 */
public interface TableColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Domain)
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTableColumn_Domain()
	 * @model
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.TableColumn#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PrimitiveDataType)
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTableColumn_Type()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveDataType getType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.TableColumn#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveDataType value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(Boolean)
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTableColumn_IsPrimaryKey()
	 * @model
	 * @generated
	 */
	Boolean getIsPrimaryKey();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.TableColumn#getIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #getIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Foreign Key</em>' attribute.
	 * @see #setIsForeignKey(Boolean)
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTableColumn_IsForeignKey()
	 * @model
	 * @generated
	 */
	Boolean getIsForeignKey();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.TableColumn#getIsForeignKey <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Foreign Key</em>' attribute.
	 * @see #getIsForeignKey()
	 * @generated
	 */
	void setIsForeignKey(Boolean value);

} // TableColumn

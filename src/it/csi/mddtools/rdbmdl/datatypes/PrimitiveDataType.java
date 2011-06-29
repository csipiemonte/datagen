/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes
	 * @see #setType(PrimitiveTypeCodes)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getPrimitiveDataType_Type()
	 * @model
	 * @generated
	 */
	PrimitiveTypeCodes getType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypeCodes value);

} // PrimitiveDataType

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getProperty <em>Property</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getComment <em>Comment</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getIndex <em>Index</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getId <em>Id</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType()
 * @model extendedMetaData="name='Table_._type' kind='elementOnly'"
 * @generated
 */
public interface TableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The comment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Comment()
	 * @model dataType="it.csi.mddtools.datagen.Erdesignerschema30.CommentType1"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an atrtribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeType> getAttribute();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an index
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Index()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Index' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IndexType> getIndex();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getId();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTableType_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='schema' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSchema();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Object value);

} // TableType

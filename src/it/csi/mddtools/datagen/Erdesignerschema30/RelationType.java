/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getGroup <em>Group</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getProperty <em>Property</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getComment <em>Comment</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getMapping <em>Mapping</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getExportingtablerefid <em>Exportingtablerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getId <em>Id</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getImportingtablerefid <em>Importingtablerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOndelete <em>Ondelete</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOnupdate <em>Onupdate</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType()
 * @model extendedMetaData="name='Relation_._type' kind='elementOnly'"
 * @generated
 */
public interface RelationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relation layout property
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Comment()
	 * @model unique="false" dataType="it.csi.mddtools.datagen.Erdesignerschema30.CommentType1" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getComment();

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mapping element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Mapping()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mapping' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<MappingType> getMapping();

	/**
	 * Returns the value of the '<em><b>Exportingtablerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exportingtablerefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exportingtablerefid</em>' attribute.
	 * @see #setExportingtablerefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Exportingtablerefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='exportingtablerefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getExportingtablerefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getExportingtablerefid <em>Exportingtablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exportingtablerefid</em>' attribute.
	 * @see #getExportingtablerefid()
	 * @generated
	 */
	void setExportingtablerefid(Object value);

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
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getId();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Object value);

	/**
	 * Returns the value of the '<em><b>Importingtablerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importingtablerefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importingtablerefid</em>' attribute.
	 * @see #setImportingtablerefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Importingtablerefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='importingtablerefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getImportingtablerefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getImportingtablerefid <em>Importingtablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importingtablerefid</em>' attribute.
	 * @see #getImportingtablerefid()
	 * @generated
	 */
	void setImportingtablerefid(Object value);

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
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Ondelete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ondelete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ondelete</em>' attribute.
	 * @see #setOndelete(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Ondelete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='ondelete' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getOndelete();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOndelete <em>Ondelete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ondelete</em>' attribute.
	 * @see #getOndelete()
	 * @generated
	 */
	void setOndelete(Object value);

	/**
	 * Returns the value of the '<em><b>Onupdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onupdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onupdate</em>' attribute.
	 * @see #setOnupdate(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getRelationType_Onupdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='onupdate' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getOnupdate();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOnupdate <em>Onupdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onupdate</em>' attribute.
	 * @see #getOnupdate()
	 * @generated
	 */
	void setOnupdate(Object value);

} // RelationType

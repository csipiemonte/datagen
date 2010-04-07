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
 * A representation of the model object '<em><b>Tables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TablesType#getGroup <em>Group</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.TablesType#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTablesType()
 * @model extendedMetaData="name='Tables_._type' kind='elementOnly'"
 * @generated
 */
public interface TablesType extends EObject {
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
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTablesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition for a table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getTablesType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Table' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TableType> getTable();

} // TablesType
/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 * A representation of the model object '<em><b>Subjectareas Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType#getGroup <em>Group</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType#getSubjectarea <em>Subjectarea</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getSubjectareasType()
 * @model extendedMetaData="name='Subjectareas_._type' kind='elementOnly'"
 * @generated
 */
public interface SubjectareasType extends EObject {
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
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getSubjectareasType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Subjectarea</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subject area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subjectarea</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getSubjectareasType_Subjectarea()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subjectarea' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<SubjectareaType> getSubjectarea();

} // SubjectareasType

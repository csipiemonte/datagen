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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getDomains <em>Domains</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getTables <em>Tables</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getRelations <em>Relations</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getViews <em>Views</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getSubjectareas <em>Subjectareas</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getComments <em>Comments</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType()
 * @model extendedMetaData="name='Model_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment describing your root element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Configuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType getConfiguration();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType value);

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of domains defined for this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference.
	 * @see #setDomains(DomainsType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Domains()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Domains' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainsType getDomains();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getDomains <em>Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domains</em>' containment reference.
	 * @see #getDomains()
	 * @generated
	 */
	void setDomains(DomainsType value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of Tables defined for this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference.
	 * @see #setTables(TablesType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Tables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tables' namespace='##targetNamespace'"
	 * @generated
	 */
	TablesType getTables();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getTables <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' containment reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(TablesType value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of relations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference.
	 * @see #setRelations(RelationsType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Relations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Relations' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationsType getRelations();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getRelations <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relations</em>' containment reference.
	 * @see #getRelations()
	 * @generated
	 */
	void setRelations(RelationsType value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of views
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Views</em>' containment reference.
	 * @see #setViews(ViewsType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Views()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Views' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewsType getViews();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getViews <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views</em>' containment reference.
	 * @see #getViews()
	 * @generated
	 */
	void setViews(ViewsType value);

	/**
	 * Returns the value of the '<em><b>Subjectareas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of subject areas
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subjectareas</em>' containment reference.
	 * @see #setSubjectareas(SubjectareasType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Subjectareas()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subjectareas' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectareasType getSubjectareas();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getSubjectareas <em>Subjectareas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectareas</em>' containment reference.
	 * @see #getSubjectareas()
	 * @generated
	 */
	void setSubjectareas(SubjectareasType value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of comments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(CommentsType)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comments' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentsType getComments();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(CommentsType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getModelType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ModelType

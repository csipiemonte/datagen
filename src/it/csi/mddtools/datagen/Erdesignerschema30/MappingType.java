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
 * A representation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getExportingexpressionrefid <em>Exportingexpressionrefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getImportingattributerefid <em>Importingattributerefid</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getMappingType()
 * @model extendedMetaData="name='Mapping_._type' kind='empty'"
 * @generated
 */
public interface MappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exportingexpressionrefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exportingexpressionrefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exportingexpressionrefid</em>' attribute.
	 * @see #setExportingexpressionrefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getMappingType_Exportingexpressionrefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='exportingexpressionrefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getExportingexpressionrefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getExportingexpressionrefid <em>Exportingexpressionrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exportingexpressionrefid</em>' attribute.
	 * @see #getExportingexpressionrefid()
	 * @generated
	 */
	void setExportingexpressionrefid(Object value);

	/**
	 * Returns the value of the '<em><b>Importingattributerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importingattributerefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importingattributerefid</em>' attribute.
	 * @see #setImportingattributerefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getMappingType_Importingattributerefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='importingattributerefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getImportingattributerefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getImportingattributerefid <em>Importingattributerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importingattributerefid</em>' attribute.
	 * @see #getImportingattributerefid()
	 * @generated
	 */
	void setImportingattributerefid(Object value);

} // MappingType

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
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getCommentrefid <em>Commentrefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getTablerefid <em>Tablerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getViewrefid <em>Viewrefid</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getItemType()
 * @model extendedMetaData="name='Item_._type' kind='empty'"
 * @generated
 */
public interface ItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Commentrefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentrefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentrefid</em>' attribute.
	 * @see #setCommentrefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getItemType_Commentrefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='commentrefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCommentrefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getCommentrefid <em>Commentrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentrefid</em>' attribute.
	 * @see #getCommentrefid()
	 * @generated
	 */
	void setCommentrefid(Object value);

	/**
	 * Returns the value of the '<em><b>Tablerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablerefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablerefid</em>' attribute.
	 * @see #setTablerefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getItemType_Tablerefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='tablerefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTablerefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getTablerefid <em>Tablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tablerefid</em>' attribute.
	 * @see #getTablerefid()
	 * @generated
	 */
	void setTablerefid(Object value);

	/**
	 * Returns the value of the '<em><b>Viewrefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewrefid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewrefid</em>' attribute.
	 * @see #setViewrefid(Object)
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#getItemType_Viewrefid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='viewrefid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getViewrefid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getViewrefid <em>Viewrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewrefid</em>' attribute.
	 * @see #getViewrefid()
	 * @generated
	 */
	void setViewrefid(Object value);

} // ItemType

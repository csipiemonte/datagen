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
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Specs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifiche di ordinamento da applicare ai risultati di una query
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.OrderSpecs#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpecs()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OrderSpecs extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.OrderSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contiene l'elenco delle specifiche di ordinamento. L'ordinamento dei
	 * risultati &egrave; ottenuto applicando le specifiche relative alle singole
	 * colonne nell'ordine in cui sono inserite in questo elenco.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specs</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpecs_Specs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderSpec> getSpecs();

} // OrderSpecs

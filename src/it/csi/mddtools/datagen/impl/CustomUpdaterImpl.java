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
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.CustomUpdater;
import it.csi.mddtools.datagen.DatagenPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Updater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomUpdaterImpl#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomUpdaterImpl#getValueClassFQN <em>Value Class FQN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomUpdaterImpl extends UpdaterImpl implements CustomUpdater {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomUpdaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.CUSTOM_UPDATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterClassFQN() {
		return (String)eGet(DatagenPackage.Literals.CUSTOM_UPDATER__FILTER_CLASS_FQN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClassFQN(String newFilterClassFQN) {
		eSet(DatagenPackage.Literals.CUSTOM_UPDATER__FILTER_CLASS_FQN, newFilterClassFQN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueClassFQN() {
		return (String)eGet(DatagenPackage.Literals.CUSTOM_UPDATER__VALUE_CLASS_FQN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueClassFQN(String newValueClassFQN) {
		eSet(DatagenPackage.Literals.CUSTOM_UPDATER__VALUE_CLASS_FQN, newValueClassFQN);
	}

} //CustomUpdaterImpl

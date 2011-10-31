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

import it.csi.mddtools.datagen.CustomFinder;
import it.csi.mddtools.datagen.DatagenPackage;

import it.csi.mddtools.datagen.QueryDef;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Finder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#getFilterClassFQN <em>Filter Class FQN</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#isCustomSelect <em>Custom Select</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#isCustomFrom <em>Custom From</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.CustomFinderImpl#getQueryDefinition <em>Query Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFinderImpl extends MultiResFinderImpl implements CustomFinder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.CUSTOM_FINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterClassFQN() {
		return (String)eGet(DatagenPackage.Literals.CUSTOM_FINDER__FILTER_CLASS_FQN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClassFQN(String newFilterClassFQN) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__FILTER_CLASS_FQN, newFilterClassFQN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomSelect() {
		return (Boolean)eGet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_SELECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomSelect(boolean newCustomSelect) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_SELECT, newCustomSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomFrom() {
		return (Boolean)eGet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomFrom(boolean newCustomFrom) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__CUSTOM_FROM, newCustomFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDef getQueryDefinition() {
		return (QueryDef)eGet(DatagenPackage.Literals.CUSTOM_FINDER__QUERY_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryDefinition(QueryDef newQueryDefinition) {
		eSet(DatagenPackage.Literals.CUSTOM_FINDER__QUERY_DEFINITION, newQueryDefinition);
	}

} //CustomFinderImpl

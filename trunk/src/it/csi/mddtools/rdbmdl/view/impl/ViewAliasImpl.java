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
package it.csi.mddtools.rdbmdl.view.impl;

import it.csi.mddtools.rdbmdl.NamedColumnSet;

import it.csi.mddtools.rdbmdl.impl.NamedElementImpl;

import it.csi.mddtools.rdbmdl.view.ViewAlias;
import it.csi.mddtools.rdbmdl.view.ViewPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.impl.ViewAliasImpl#getReferencedTableOrView <em>Referenced Table Or View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewAliasImpl extends NamedElementImpl implements ViewAlias {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewAliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.VIEW_ALIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedColumnSet getReferencedTableOrView() {
		return (NamedColumnSet)eGet(ViewPackage.Literals.VIEW_ALIAS__REFERENCED_TABLE_OR_VIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTableOrView(NamedColumnSet newReferencedTableOrView) {
		eSet(ViewPackage.Literals.VIEW_ALIAS__REFERENCED_TABLE_OR_VIEW, newReferencedTableOrView);
	}

} //ViewAliasImpl

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

import it.csi.mddtools.rdbmdl.impl.NamedColumnSetImpl;

import it.csi.mddtools.rdbmdl.view.View;
import it.csi.mddtools.rdbmdl.view.ViewAlias;
import it.csi.mddtools.rdbmdl.view.ViewColumn;
import it.csi.mddtools.rdbmdl.view.ViewPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.impl.ViewImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.impl.ViewImpl#getReferencedTablesAndViews <em>Referenced Tables And Views</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.impl.ViewImpl#getDdl <em>Ddl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends NamedColumnSetImpl implements View {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ViewColumn> getColumns() {
		return (EList<ViewColumn>)eGet(ViewPackage.Literals.VIEW__COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ViewAlias> getReferencedTablesAndViews() {
		return (EList<ViewAlias>)eGet(ViewPackage.Literals.VIEW__REFERENCED_TABLES_AND_VIEWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdl() {
		return (String)eGet(ViewPackage.Literals.VIEW__DDL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdl(String newDdl) {
		eSet(ViewPackage.Literals.VIEW__DDL, newDdl);
	}

} //ViewImpl

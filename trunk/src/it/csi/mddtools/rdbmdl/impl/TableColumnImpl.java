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
package it.csi.mddtools.rdbmdl.impl;

import it.csi.mddtools.rdbmdl.RdbmdlPackage;
import it.csi.mddtools.rdbmdl.TableColumn;

import it.csi.mddtools.rdbmdl.datatypes.Domain;
import it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableColumnImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableColumnImpl#getIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.impl.TableColumnImpl#getIsForeignKey <em>Is Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableColumnImpl extends ColumnImpl implements TableColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmdlPackage.Literals.TABLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		return (Domain)eGet(RdbmdlPackage.Literals.TABLE_COLUMN__DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		eSet(RdbmdlPackage.Literals.TABLE_COLUMN__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType getType() {
		return (PrimitiveDataType)eGet(RdbmdlPackage.Literals.TABLE_COLUMN__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveDataType newType) {
		eSet(RdbmdlPackage.Literals.TABLE_COLUMN__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPrimaryKey() {
		return (Boolean)eGet(RdbmdlPackage.Literals.TABLE_COLUMN__IS_PRIMARY_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimaryKey(Boolean newIsPrimaryKey) {
		eSet(RdbmdlPackage.Literals.TABLE_COLUMN__IS_PRIMARY_KEY, newIsPrimaryKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsForeignKey() {
		return (Boolean)eGet(RdbmdlPackage.Literals.TABLE_COLUMN__IS_FOREIGN_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForeignKey(Boolean newIsForeignKey) {
		eSet(RdbmdlPackage.Literals.TABLE_COLUMN__IS_FOREIGN_KEY, newIsForeignKey);
	}

} //TableColumnImpl

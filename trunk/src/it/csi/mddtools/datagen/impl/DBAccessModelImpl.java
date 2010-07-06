/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DBAccessModel;
import it.csi.mddtools.datagen.DaoPackage;
import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;

import it.csi.mddtools.rdbmdl.Schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Access Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.DBAccessModelImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DBAccessModelImpl#getDaopkgs <em>Daopkgs</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DBAccessModelImpl#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DBAccessModelImpl#getCodComponente <em>Cod Componente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBAccessModelImpl extends CDOObjectImpl implements DBAccessModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBAccessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.DB_ACCESS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(DatagenPackage.Literals.DB_ACCESS_MODEL__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(DatagenPackage.Literals.DB_ACCESS_MODEL__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DaoPackage> getDaopkgs() {
		return (EList<DaoPackage>)eGet(DatagenPackage.Literals.DB_ACCESS_MODEL__DAOPKGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodProdotto() {
		return (String)eGet(DatagenPackage.Literals.DB_ACCESS_MODEL__COD_PRODOTTO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodProdotto(String newCodProdotto) {
		eSet(DatagenPackage.Literals.DB_ACCESS_MODEL__COD_PRODOTTO, newCodProdotto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodComponente() {
		return (String)eGet(DatagenPackage.Literals.DB_ACCESS_MODEL__COD_COMPONENTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodComponente(String newCodComponente) {
		eSet(DatagenPackage.Literals.DB_ACCESS_MODEL__COD_COMPONENTE, newCodComponente);
	}

} //DBAccessModelImpl

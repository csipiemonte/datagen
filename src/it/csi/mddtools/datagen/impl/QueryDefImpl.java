/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.FromClause;
import it.csi.mddtools.datagen.JoinClause;
import it.csi.mddtools.datagen.QueryDef;
import it.csi.mddtools.datagen.SelectClause;

import it.csi.mddtools.datagen.WhereClause;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.QueryDefImpl#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.QueryDefImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.QueryDefImpl#getJoinClause <em>Join Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.QueryDefImpl#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryDefImpl extends CDOObjectImpl implements QueryDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.QUERY_DEF;
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
	public SelectClause getSelectClause() {
		return (SelectClause)eGet(DatagenPackage.Literals.QUERY_DEF__SELECT_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectClause(SelectClause newSelectClause) {
		eSet(DatagenPackage.Literals.QUERY_DEF__SELECT_CLAUSE, newSelectClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromClause getFromClause() {
		return (FromClause)eGet(DatagenPackage.Literals.QUERY_DEF__FROM_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromClause(FromClause newFromClause) {
		eSet(DatagenPackage.Literals.QUERY_DEF__FROM_CLAUSE, newFromClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinClause getJoinClause() {
		return (JoinClause)eGet(DatagenPackage.Literals.QUERY_DEF__JOIN_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinClause(JoinClause newJoinClause) {
		eSet(DatagenPackage.Literals.QUERY_DEF__JOIN_CLAUSE, newJoinClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereClause getWhereClause() {
		return (WhereClause)eGet(DatagenPackage.Literals.QUERY_DEF__WHERE_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClause(WhereClause newWhereClause) {
		eSet(DatagenPackage.Literals.QUERY_DEF__WHERE_CLAUSE, newWhereClause);
	}

} //QueryDefImpl

/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.LookupResolver;
import it.csi.mddtools.datagen.LookupResolvers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Resolvers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.LookupResolversImpl#getResolvers <em>Resolvers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LookupResolversImpl extends CDOObjectImpl implements LookupResolvers {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupResolversImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.LOOKUP_RESOLVERS;
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
	@SuppressWarnings("unchecked")
	public EList<LookupResolver> getResolvers() {
		return (EList<LookupResolver>)eGet(DatagenPackage.Literals.LOOKUP_RESOLVERS__RESOLVERS, true);
	}

} //LookupResolversImpl

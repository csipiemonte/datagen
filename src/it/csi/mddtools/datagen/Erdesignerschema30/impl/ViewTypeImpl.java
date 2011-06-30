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
package it.csi.mddtools.datagen.Erdesignerschema30.impl;

import it.csi.mddtools.datagen.Erdesignerschema30.PropertyType;
import it.csi.mddtools.datagen.Erdesignerschema30.ViewType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewTypeImpl extends EObjectImpl implements ViewType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Object id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Object schema = SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, erdesignerschema30Package.VIEW_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		return getGroup().list(erdesignerschema30Package.Literals.VIEW_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComment() {
		return getGroup().list(erdesignerschema30Package.Literals.VIEW_TYPE__COMMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSql() {
		return getGroup().list(erdesignerschema30Package.Literals.VIEW_TYPE__SQL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Object newId) {
		Object oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.VIEW_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.VIEW_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Object newSchema) {
		Object oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.VIEW_TYPE__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case erdesignerschema30Package.VIEW_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case erdesignerschema30Package.VIEW_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erdesignerschema30Package.VIEW_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case erdesignerschema30Package.VIEW_TYPE__PROPERTY:
				return getProperty();
			case erdesignerschema30Package.VIEW_TYPE__COMMENT:
				return getComment();
			case erdesignerschema30Package.VIEW_TYPE__SQL:
				return getSql();
			case erdesignerschema30Package.VIEW_TYPE__ID:
				return getId();
			case erdesignerschema30Package.VIEW_TYPE__NAME:
				return getName();
			case erdesignerschema30Package.VIEW_TYPE__SCHEMA:
				return getSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case erdesignerschema30Package.VIEW_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case erdesignerschema30Package.VIEW_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case erdesignerschema30Package.VIEW_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends String>)newValue);
				return;
			case erdesignerschema30Package.VIEW_TYPE__SQL:
				getSql().clear();
				getSql().addAll((Collection<? extends String>)newValue);
				return;
			case erdesignerschema30Package.VIEW_TYPE__ID:
				setId(newValue);
				return;
			case erdesignerschema30Package.VIEW_TYPE__NAME:
				setName(newValue);
				return;
			case erdesignerschema30Package.VIEW_TYPE__SCHEMA:
				setSchema(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case erdesignerschema30Package.VIEW_TYPE__GROUP:
				getGroup().clear();
				return;
			case erdesignerschema30Package.VIEW_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case erdesignerschema30Package.VIEW_TYPE__COMMENT:
				getComment().clear();
				return;
			case erdesignerschema30Package.VIEW_TYPE__SQL:
				getSql().clear();
				return;
			case erdesignerschema30Package.VIEW_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case erdesignerschema30Package.VIEW_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case erdesignerschema30Package.VIEW_TYPE__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case erdesignerschema30Package.VIEW_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case erdesignerschema30Package.VIEW_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case erdesignerschema30Package.VIEW_TYPE__COMMENT:
				return !getComment().isEmpty();
			case erdesignerschema30Package.VIEW_TYPE__SQL:
				return !getSql().isEmpty();
			case erdesignerschema30Package.VIEW_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case erdesignerschema30Package.VIEW_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case erdesignerschema30Package.VIEW_TYPE__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} //ViewTypeImpl

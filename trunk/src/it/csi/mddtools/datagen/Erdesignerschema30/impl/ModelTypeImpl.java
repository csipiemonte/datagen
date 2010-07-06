/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30.impl;

import it.csi.mddtools.datagen.Erdesignerschema30.CommentsType;
import it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType;
import it.csi.mddtools.datagen.Erdesignerschema30.DomainsType;
import it.csi.mddtools.datagen.Erdesignerschema30.ModelType;
import it.csi.mddtools.datagen.Erdesignerschema30.RelationsType;
import it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType;
import it.csi.mddtools.datagen.Erdesignerschema30.TablesType;
import it.csi.mddtools.datagen.Erdesignerschema30.ViewsType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getViews <em>Views</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getSubjectareas <em>Subjectareas</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends EObjectImpl implements ModelType {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationType configuration;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected DomainsType domains;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected TablesType tables;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected RelationsType relations;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected ViewsType views;

	/**
	 * The cached value of the '{@link #getSubjectareas() <em>Subjectareas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectareas()
	 * @generated
	 * @ordered
	 */
	protected SubjectareasType subjectareas;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected CommentsType comments;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationType getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(ConfigurationType newConfiguration, NotificationChain msgs) {
		ConfigurationType oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(ConfigurationType newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainsType getDomains() {
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomains(DomainsType newDomains, NotificationChain msgs) {
		DomainsType oldDomains = domains;
		domains = newDomains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__DOMAINS, oldDomains, newDomains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomains(DomainsType newDomains) {
		if (newDomains != domains) {
			NotificationChain msgs = null;
			if (domains != null)
				msgs = ((InternalEObject)domains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__DOMAINS, null, msgs);
			if (newDomains != null)
				msgs = ((InternalEObject)newDomains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__DOMAINS, null, msgs);
			msgs = basicSetDomains(newDomains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__DOMAINS, newDomains, newDomains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesType getTables() {
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTables(TablesType newTables, NotificationChain msgs) {
		TablesType oldTables = tables;
		tables = newTables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__TABLES, oldTables, newTables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTables(TablesType newTables) {
		if (newTables != tables) {
			NotificationChain msgs = null;
			if (tables != null)
				msgs = ((InternalEObject)tables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__TABLES, null, msgs);
			if (newTables != null)
				msgs = ((InternalEObject)newTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__TABLES, null, msgs);
			msgs = basicSetTables(newTables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__TABLES, newTables, newTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsType getRelations() {
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelations(RelationsType newRelations, NotificationChain msgs) {
		RelationsType oldRelations = relations;
		relations = newRelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__RELATIONS, oldRelations, newRelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelations(RelationsType newRelations) {
		if (newRelations != relations) {
			NotificationChain msgs = null;
			if (relations != null)
				msgs = ((InternalEObject)relations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__RELATIONS, null, msgs);
			if (newRelations != null)
				msgs = ((InternalEObject)newRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__RELATIONS, null, msgs);
			msgs = basicSetRelations(newRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__RELATIONS, newRelations, newRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViews(ViewsType newViews, NotificationChain msgs) {
		ViewsType oldViews = views;
		views = newViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__VIEWS, oldViews, newViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViews(ViewsType newViews) {
		if (newViews != views) {
			NotificationChain msgs = null;
			if (views != null)
				msgs = ((InternalEObject)views).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__VIEWS, null, msgs);
			if (newViews != null)
				msgs = ((InternalEObject)newViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__VIEWS, null, msgs);
			msgs = basicSetViews(newViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__VIEWS, newViews, newViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectareasType getSubjectareas() {
		return subjectareas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectareas(SubjectareasType newSubjectareas, NotificationChain msgs) {
		SubjectareasType oldSubjectareas = subjectareas;
		subjectareas = newSubjectareas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS, oldSubjectareas, newSubjectareas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectareas(SubjectareasType newSubjectareas) {
		if (newSubjectareas != subjectareas) {
			NotificationChain msgs = null;
			if (subjectareas != null)
				msgs = ((InternalEObject)subjectareas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS, null, msgs);
			if (newSubjectareas != null)
				msgs = ((InternalEObject)newSubjectareas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS, null, msgs);
			msgs = basicSetSubjectareas(newSubjectareas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS, newSubjectareas, newSubjectareas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentsType getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(CommentsType newComments, NotificationChain msgs) {
		CommentsType oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(CommentsType newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - erdesignerschema30Package.MODEL_TYPE__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MODEL_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case erdesignerschema30Package.MODEL_TYPE__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case erdesignerschema30Package.MODEL_TYPE__DOMAINS:
				return basicSetDomains(null, msgs);
			case erdesignerschema30Package.MODEL_TYPE__TABLES:
				return basicSetTables(null, msgs);
			case erdesignerschema30Package.MODEL_TYPE__RELATIONS:
				return basicSetRelations(null, msgs);
			case erdesignerschema30Package.MODEL_TYPE__VIEWS:
				return basicSetViews(null, msgs);
			case erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS:
				return basicSetSubjectareas(null, msgs);
			case erdesignerschema30Package.MODEL_TYPE__COMMENTS:
				return basicSetComments(null, msgs);
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
			case erdesignerschema30Package.MODEL_TYPE__CONFIGURATION:
				return getConfiguration();
			case erdesignerschema30Package.MODEL_TYPE__DOMAINS:
				return getDomains();
			case erdesignerschema30Package.MODEL_TYPE__TABLES:
				return getTables();
			case erdesignerschema30Package.MODEL_TYPE__RELATIONS:
				return getRelations();
			case erdesignerschema30Package.MODEL_TYPE__VIEWS:
				return getViews();
			case erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS:
				return getSubjectareas();
			case erdesignerschema30Package.MODEL_TYPE__COMMENTS:
				return getComments();
			case erdesignerschema30Package.MODEL_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case erdesignerschema30Package.MODEL_TYPE__CONFIGURATION:
				setConfiguration((ConfigurationType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__DOMAINS:
				setDomains((DomainsType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__TABLES:
				setTables((TablesType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__RELATIONS:
				setRelations((RelationsType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__VIEWS:
				setViews((ViewsType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS:
				setSubjectareas((SubjectareasType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__COMMENTS:
				setComments((CommentsType)newValue);
				return;
			case erdesignerschema30Package.MODEL_TYPE__VERSION:
				setVersion((String)newValue);
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
			case erdesignerschema30Package.MODEL_TYPE__CONFIGURATION:
				setConfiguration((ConfigurationType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__DOMAINS:
				setDomains((DomainsType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__TABLES:
				setTables((TablesType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__RELATIONS:
				setRelations((RelationsType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__VIEWS:
				setViews((ViewsType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS:
				setSubjectareas((SubjectareasType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__COMMENTS:
				setComments((CommentsType)null);
				return;
			case erdesignerschema30Package.MODEL_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case erdesignerschema30Package.MODEL_TYPE__CONFIGURATION:
				return configuration != null;
			case erdesignerschema30Package.MODEL_TYPE__DOMAINS:
				return domains != null;
			case erdesignerschema30Package.MODEL_TYPE__TABLES:
				return tables != null;
			case erdesignerschema30Package.MODEL_TYPE__RELATIONS:
				return relations != null;
			case erdesignerschema30Package.MODEL_TYPE__VIEWS:
				return views != null;
			case erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS:
				return subjectareas != null;
			case erdesignerschema30Package.MODEL_TYPE__COMMENTS:
				return comments != null;
			case erdesignerschema30Package.MODEL_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl

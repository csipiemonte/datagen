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
package it.csi.mddtools.datagen.provider;


import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenFactory;
import it.csi.mddtools.datagen.DatagenPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.DataAccessObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAccessObjectItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addMainTablePropertyDescriptor(object);
			addCacheabilityPropertyDescriptor(object);
			addCacheTTLminutesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAccessObject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAccessObject_name_feature", "_UI_DataAccessObject_type"),
				 DatagenPackage.Literals.DATA_ACCESS_OBJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Main Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAccessObject_mainTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAccessObject_mainTable_feature", "_UI_DataAccessObject_type"),
				 DatagenPackage.Literals.DATA_ACCESS_OBJECT__MAIN_TABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cacheability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAccessObject_cacheability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAccessObject_cacheability_feature", "_UI_DataAccessObject_type"),
				 DatagenPackage.Literals.DATA_ACCESS_OBJECT__CACHEABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cache TT Lminutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheTTLminutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAccessObject_cacheTTLminutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAccessObject_cacheTTLminutes_feature", "_UI_DataAccessObject_type"),
				 DatagenPackage.Literals.DATA_ACCESS_OBJECT__CACHE_TT_LMINUTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DatagenPackage.Literals.DATA_ACCESS_OBJECT__PK_GENERATOR);
			childrenFeatures.add(DatagenPackage.Literals.DATA_ACCESS_OBJECT__INSERTER);
			childrenFeatures.add(DatagenPackage.Literals.DATA_ACCESS_OBJECT__FINDERS);
			childrenFeatures.add(DatagenPackage.Literals.DATA_ACCESS_OBJECT__UPDATERS);
			childrenFeatures.add(DatagenPackage.Literals.DATA_ACCESS_OBJECT__DELETERS);
			childrenFeatures.add(DatagenPackage.Literals.DATA_ACCESS_OBJECT__LOOKUP_RESOLVERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataAccessObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataAccessObject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataAccessObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataAccessObject_type") :
			getString("_UI_DataAccessObject_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataAccessObject.class)) {
			case DatagenPackage.DATA_ACCESS_OBJECT__NAME:
			case DatagenPackage.DATA_ACCESS_OBJECT__CACHEABILITY:
			case DatagenPackage.DATA_ACCESS_OBJECT__CACHE_TT_LMINUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DatagenPackage.DATA_ACCESS_OBJECT__PK_GENERATOR:
			case DatagenPackage.DATA_ACCESS_OBJECT__INSERTER:
			case DatagenPackage.DATA_ACCESS_OBJECT__FINDERS:
			case DatagenPackage.DATA_ACCESS_OBJECT__UPDATERS:
			case DatagenPackage.DATA_ACCESS_OBJECT__DELETERS:
			case DatagenPackage.DATA_ACCESS_OBJECT__LOOKUP_RESOLVERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.DATA_ACCESS_OBJECT__PK_GENERATOR,
				 DatagenFactory.eINSTANCE.createSequencePKGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.DATA_ACCESS_OBJECT__INSERTER,
				 DatagenFactory.eINSTANCE.createInserter()));

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.DATA_ACCESS_OBJECT__FINDERS,
				 DatagenFactory.eINSTANCE.createFinders()));

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.DATA_ACCESS_OBJECT__UPDATERS,
				 DatagenFactory.eINSTANCE.createUpdaters()));

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.DATA_ACCESS_OBJECT__DELETERS,
				 DatagenFactory.eINSTANCE.createDeleters()));

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.DATA_ACCESS_OBJECT__LOOKUP_RESOLVERS,
				 DatagenFactory.eINSTANCE.createLookupResolvers()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DatagenEditPlugin.INSTANCE;
	}

}

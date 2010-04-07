/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30.provider;


import it.csi.mddtools.datagen.Erdesignerschema30.ModelType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Factory;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeItemProvider
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
	public ModelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_version_feature", "_UI_ModelType_type"),
				 erdesignerschema30Package.Literals.MODEL_TYPE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__CONFIGURATION);
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__DOMAINS);
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__TABLES);
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__RELATIONS);
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__VIEWS);
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__SUBJECTAREAS);
			childrenFeatures.add(erdesignerschema30Package.Literals.MODEL_TYPE__COMMENTS);
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
	 * This returns ModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelType)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelType_type") :
			getString("_UI_ModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelType.class)) {
			case erdesignerschema30Package.MODEL_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case erdesignerschema30Package.MODEL_TYPE__CONFIGURATION:
			case erdesignerschema30Package.MODEL_TYPE__DOMAINS:
			case erdesignerschema30Package.MODEL_TYPE__TABLES:
			case erdesignerschema30Package.MODEL_TYPE__RELATIONS:
			case erdesignerschema30Package.MODEL_TYPE__VIEWS:
			case erdesignerschema30Package.MODEL_TYPE__SUBJECTAREAS:
			case erdesignerschema30Package.MODEL_TYPE__COMMENTS:
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
				(erdesignerschema30Package.Literals.MODEL_TYPE__CONFIGURATION,
				 erdesignerschema30Factory.eINSTANCE.createConfigurationType()));

		newChildDescriptors.add
			(createChildParameter
				(erdesignerschema30Package.Literals.MODEL_TYPE__DOMAINS,
				 erdesignerschema30Factory.eINSTANCE.createDomainsType()));

		newChildDescriptors.add
			(createChildParameter
				(erdesignerschema30Package.Literals.MODEL_TYPE__TABLES,
				 erdesignerschema30Factory.eINSTANCE.createTablesType()));

		newChildDescriptors.add
			(createChildParameter
				(erdesignerschema30Package.Literals.MODEL_TYPE__RELATIONS,
				 erdesignerschema30Factory.eINSTANCE.createRelationsType()));

		newChildDescriptors.add
			(createChildParameter
				(erdesignerschema30Package.Literals.MODEL_TYPE__VIEWS,
				 erdesignerschema30Factory.eINSTANCE.createViewsType()));

		newChildDescriptors.add
			(createChildParameter
				(erdesignerschema30Package.Literals.MODEL_TYPE__SUBJECTAREAS,
				 erdesignerschema30Factory.eINSTANCE.createSubjectareasType()));

		newChildDescriptors.add
			(createChildParameter
				(erdesignerschema30Package.Literals.MODEL_TYPE__COMMENTS,
				 erdesignerschema30Factory.eINSTANCE.createCommentsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Erdesignerschema_3EditPlugin.INSTANCE;
	}

}
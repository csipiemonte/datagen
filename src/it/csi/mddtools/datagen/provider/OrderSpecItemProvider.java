/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.provider;


import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.OrderSpec;
import it.csi.mddtools.datagen.OrderSpecs;
import it.csi.mddtools.rdbmdl.Column;
import it.csi.mddtools.rdbmdl.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.OrderSpec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderSpecItemProvider
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
	public OrderSpecItemProvider(AdapterFactory adapterFactory) {
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

			addColumnPropertyDescriptor(object);
			addAscendingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_OrderSpec_column_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_OrderSpec_column_feature",
						  "_UI_OrderSpec_type"),
				DatagenPackage.eINSTANCE.getOrderSpec_Column(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						HashMap<String, OrderSpec> hmSpecsAlreadyUsed = new HashMap<String, OrderSpec>();
						ArrayList<Column> result = new ArrayList<Column>();
						OrderSpec orderSpec = (OrderSpec)object;
//						Salgo l'albero fino ad OrderSpecs
						OrderSpecs orderSpecs = (OrderSpecs)orderSpec.eContainer();
						for (OrderSpec s : orderSpecs.getSpecs()) {
							if (s.getColumn()!=null){
								hmSpecsAlreadyUsed.put(s.getColumn().getName(), s);
							}
						}						
//						Salgo l'albero fino a Data Access Object						
						DataAccessObject dao = (DataAccessObject)orderSpecs.eContainer().eContainer().eContainer();
						Table table = dao.getMainTable();
						if (table!=null && table.getColumns()!=null && !table.getColumns().isEmpty()){
							for(Column c : table.getColumns()){
								if (!hmSpecsAlreadyUsed.containsKey(c.getName())){									
									result.add(c);
								}
							}
						}
						return result;						
					}
				}
			);
	}

	/**
	 * This adds a property descriptor for the Ascending feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAscendingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrderSpec_ascending_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrderSpec_ascending_feature", "_UI_OrderSpec_type"),
				 DatagenPackage.Literals.ORDER_SPEC__ASCENDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OrderSpec.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		OrderSpec orderSpec = (OrderSpec)object;
		if (orderSpec.isAscending()){
			return overlayImage(object, getResourceLocator().getImage("full/obj16/OrderSpec"));
		}
		else{
			return overlayImage(object, getResourceLocator().getImage("full/obj16/OrderSpec-desc"));
		}
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		
		OrderSpec orderSpec = (OrderSpec)object;
		return getString("_UI_OrderSpec_type") 
				+ " " + (orderSpec.getColumn()!=null ? orderSpec.getColumn().getName() : "")
				+ " " + (orderSpec.isAscending() ? "ASC" : "DESC");
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

		switch (notification.getFeatureID(OrderSpec.class)) {
			case DatagenPackage.ORDER_SPEC__ASCENDING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

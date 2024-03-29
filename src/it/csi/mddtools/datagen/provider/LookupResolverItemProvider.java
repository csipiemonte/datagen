/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.provider;


import it.csi.mddtools.datagen.DaoPackage;
import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.LookupResolver;
import it.csi.mddtools.datagen.LookupResolvers;
import it.csi.mddtools.datagen.OrderSpec;
import it.csi.mddtools.datagen.OrderSpecs;
import it.csi.mddtools.rdbmdl.Column;
import it.csi.mddtools.rdbmdl.Table;
import it.csi.mddtools.rdbmdl.constraints.ForeignKey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.LookupResolver} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LookupResolverItemProvider
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
	public LookupResolverItemProvider(AdapterFactory adapterFactory) {
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

			addForeignKeyPropertyDescriptor(object);
			addSupplierDAOPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Foreign Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addForeignKeyPropertyDescriptor(Object object) {		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_LookupResolver_foreignKey_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_LookupResolver_foreignKey_feature",
						  "_UI_LookupResolver_type"),
				DatagenPackage.eINSTANCE.getLookupResolver_ForeignKey(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le FK della mainTable del dao contenitore
						LookupResolver lr = (LookupResolver)object;
						LookupResolvers lrs = (LookupResolvers)lr.eContainer();
						DataAccessObject dao = (DataAccessObject)lrs.eContainer();
						ArrayList<ForeignKey> result = new ArrayList<ForeignKey>();
						if (dao.getMainTable()!=null && dao.getMainTable().getForeignKeys()!=null){
							Iterator<ForeignKey> fks = dao.getMainTable().getForeignKeys().iterator();
							while(fks.hasNext()){
								ForeignKey currFK = fks.next();
								result.add(currFK);
							}
						}
						return result;						
					}
				}
			);
		
	}

	/**
	 * This adds a property descriptor for the Supplier DAO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSupplierDAOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_LookupResolver_supplierDAO_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_LookupResolver_supplierDAO_feature",
						  "_UI_LookupResolver_type"),
				DatagenPackage.eINSTANCE.getLookupResolver_SupplierDAO(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo i DAO che hanno come main table la tabella proprietaria
						// delle colonne in FK
						LookupResolver lr = (LookupResolver)object;
						LookupResolvers lrs = (LookupResolvers)lr.eContainer();
						DataAccessObject dao = (DataAccessObject)lrs.eContainer();
						DaoPackage daoPkg = (DaoPackage)dao.eContainer();
						ArrayList<DataAccessObject> result = new ArrayList<DataAccessObject>();
						if (lr.getForeignKey()!=null && lr.getForeignKey().getIncludedColumns()!=null && 
								lr.getForeignKey().getIncludedColumns().size()>0){
							Table referencedTable = (Table)lr.getForeignKey().getReferredUC().eContainer();	
							Iterator<DataAccessObject> daos = daoPkg.getDao().iterator();
							while(daos.hasNext()){
								DataAccessObject currDAO = daos.next();
								if (currDAO.getMainTable()!= null && referencedTable.equals(currDAO.getMainTable()))
									result.add(currDAO);
							}
						}
						 
						return result;						
					}
				}
			);

	
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
				 getString("_UI_LookupResolver_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LookupResolver_name_feature", "_UI_LookupResolver_type"),
				 DatagenPackage.Literals.LOOKUP_RESOLVER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LookupResolver.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LookupResolver"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		LookupResolver res = (LookupResolver)object;
		String label = ": FK[";
		label += (res.getForeignKey()!=null?res.getForeignKey().getName():"<undefined FK>")+"]: resolution supplied by DAO[";
		label += (res.getSupplierDAO()!=null?res.getSupplierDAO().getName():"<undefined DAO>")+"]";
		return getString("_UI_LookupResolver_type")+label;
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

		switch (notification.getFeatureID(LookupResolver.class)) {
			case DatagenPackage.LOOKUP_RESOLVER__FOREIGN_KEY:
			case DatagenPackage.LOOKUP_RESOLVER__SUPPLIER_DAO:
			case DatagenPackage.LOOKUP_RESOLVER__NAME:
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

/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.provider;


import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.JoinClause;
import it.csi.mddtools.datagen.JoinCriterion;
import it.csi.mddtools.datagen.QTable;
import it.csi.mddtools.datagen.QTableColumn;
import it.csi.mddtools.datagen.QueryDef;
import it.csi.mddtools.rdbmdl.TableColumn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.JoinCriterion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinCriterionItemProvider
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
	public JoinCriterionItemProvider(AdapterFactory adapterFactory) {
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

			addLeftTablePropertyDescriptor(object);
			addLeftColumnPropertyDescriptor(object);
			addRightTablePropertyDescriptor(object);
			addRightColumnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLeftTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_JoinCriterion_leftTable_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_JoinCriterion_leftTable_feature",
						  "_UI_JoinCriterion_type"),
				DatagenPackage.eINSTANCE.getJoinCriterion_LeftTable(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le table presenti in from
						ArrayList<QTable> result = new ArrayList<QTable>();
						JoinCriterion jc = (JoinCriterion)object;
						JoinClause jcl = (JoinClause)jc.eContainer();
						QueryDef qdef = (QueryDef)jcl.eContainer();
						if (qdef.getFromClause()!=null){
							Iterator<QTable> it = qdef.getFromClause().getTables().iterator();
							while(it.hasNext())
								result.add(it.next());
						}
						return result;						
					}
				}
			);
	}

	/**
	 * This adds a property descriptor for the Left Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLeftColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_JoinCriterion_leftColumn_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_JoinCriterion_leftColumn_feature",
						  "_UI_JoinCriterion_type"),
				DatagenPackage.eINSTANCE.getJoinCriterion_LeftColumn(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le column della qtable selezionata
						ArrayList<TableColumn> result = new ArrayList<TableColumn>();
						JoinCriterion jcrit = (JoinCriterion)object;
						if (jcrit.getLeftTable()!=null && jcrit.getLeftTable().getTable()!=null){
							Iterator<TableColumn> it = jcrit.getLeftTable().getTable().getColumns().iterator();
							while(it.hasNext())
								result.add(it.next());
						}
						return result;						
					}
				}
			);
	}

	/**
	 * This adds a property descriptor for the Right Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRightTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_JoinCriterion_rightTable_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_JoinCriterion_rightTable_feature",
						  "_UI_JoinCriterion_type"),
				DatagenPackage.eINSTANCE.getJoinCriterion_RightTable(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le table presenti in from
						ArrayList<QTable> result = new ArrayList<QTable>();
						JoinCriterion jc = (JoinCriterion)object;
						JoinClause jcl = (JoinClause)jc.eContainer();
						QueryDef qdef = (QueryDef)jcl.eContainer();
						if (qdef.getFromClause()!=null){
							Iterator<QTable> it = qdef.getFromClause().getTables().iterator();
							while(it.hasNext())
								result.add(it.next());
						}
						return result;						
					}
				}
			);
	}

	/**
	 * This adds a property descriptor for the Right Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRightColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_JoinCriterion_rightColumn_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_JoinCriterion_rightColumn_feature",
						  "_UI_JoinCriterion_type"),
				DatagenPackage.eINSTANCE.getJoinCriterion_RightColumn(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le column della qtable selezionata
						ArrayList<TableColumn> result = new ArrayList<TableColumn>();
						JoinCriterion jcrit = (JoinCriterion)object;
						if (jcrit.getRightTable()!=null && jcrit.getRightTable().getTable()!=null){
							Iterator<TableColumn> it = jcrit.getRightTable().getTable().getColumns().iterator();
							while(it.hasNext())
								result.add(it.next());
						}
						return result;						
					}
				}
			);

	}

	/**
	 * This returns JoinCriterion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JoinCriterion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		JoinCriterion jc = (JoinCriterion)object;
		String label = ": ";
		label += formatJoinTerm(jc.getLeftTable(), jc.getLeftColumn());
		label += " = ";
		label += formatJoinTerm(jc.getRightTable(), jc.getRightColumn());
		return getString("_UI_JoinCriterion_type")+ label;
	}

	protected String formatJoinTerm(QTable qtable, TableColumn col){
		String s = "";
		s += ((qtable != null && qtable.getTable() != null) ? qtable.getTable().getName() : "<???>");
		s += "."+(col != null ? col.getName() : "<???>");
		return s;
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

		switch (notification.getFeatureID(JoinCriterion.class)) {
			case DatagenPackage.JOIN_CRITERION__LEFT_TABLE:
			case DatagenPackage.JOIN_CRITERION__LEFT_COLUMN:
			case DatagenPackage.JOIN_CRITERION__RIGHT_TABLE:
			case DatagenPackage.JOIN_CRITERION__RIGHT_COLUMN:
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

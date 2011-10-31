/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.provider;


import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.LookupResolver;
import it.csi.mddtools.datagen.LookupResolvers;
import it.csi.mddtools.datagen.QTable;
import it.csi.mddtools.datagen.QTableColumn;
import it.csi.mddtools.datagen.QueryDef;
import it.csi.mddtools.datagen.SelectClause;
import it.csi.mddtools.rdbmdl.TableColumn;
import it.csi.mddtools.rdbmdl.constraints.ForeignKey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.QTableColumn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QTableColumnItemProvider
	extends QResultColumnItemProvider
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
	public QTableColumnItemProvider(AdapterFactory adapterFactory) {
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

			addQtablePropertyDescriptor(object);
			addColumnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Qtable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addQtablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_QTableColumn_qtable_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_QTableColumn_qtable_feature",
						  "_UI_QTableColumn_type"),
				DatagenPackage.eINSTANCE.getQTableColumn_Qtable(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le qtable presenti nella clausola from
						ArrayList<QTable> result = new ArrayList<QTable>();
						QTableColumn qtc = (QTableColumn)object;
						SelectClause sel = (SelectClause)qtc.eContainer();
						QueryDef qdef = (QueryDef)sel.eContainer();
						if (qdef.getFromClause() != null){
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
	 * This adds a property descriptor for the Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_QTableColumn_column_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_QTableColumn_column_feature",
						  "_UI_QTableColumn_type"),
				DatagenPackage.eINSTANCE.getQTableColumn_Column(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						// elenca solo le column della qtable selezionata
						ArrayList<TableColumn> result = new ArrayList<TableColumn>();
						QTableColumn qtc = (QTableColumn)object;
						if (qtc.getQtable()!=null && qtc.getQtable().getTable()!=null){
							Iterator<TableColumn> it = qtc.getQtable().getTable().getColumns().iterator();
							while(it.hasNext())
								result.add(it.next());
						}
						return result;						
					}
				}
			);
	}

	/**
	 * This returns QTableColumn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QTableColumn"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		QTableColumn qtc = (QTableColumn) object;
		String label = ": ";
		label += (qtc.getQtable() != null && qtc.getQtable().getTable() != null ? (qtc
				.getQtable().getAliasName() != null
				&& qtc.getQtable().getAliasName().length() > 0 ? qtc
				.getQtable().getAliasName() : qtc.getQtable().getTable()
				.getName()) : "<???>");
		label += "."
				+ (qtc.getColumn() != null ? qtc.getColumn().getName()
						: "<???>");
		return getString("_UI_QTableColumn_type") + label;
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

		switch (notification.getFeatureID(QTableColumn.class)) {
			case DatagenPackage.QTABLE_COLUMN__QTABLE:
			case DatagenPackage.QTABLE_COLUMN__COLUMN:
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

}

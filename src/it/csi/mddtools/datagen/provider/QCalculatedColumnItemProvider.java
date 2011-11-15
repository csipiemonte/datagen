/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen.provider;


import it.csi.mddtools.datagen.DatagenFactory;
import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.QCalculatedColumn;
import it.csi.mddtools.datagen.QResultColumn;
import it.csi.mddtools.datagen.QTableColumn;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.datagen.QCalculatedColumn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QCalculatedColumnItemProvider
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
	public QCalculatedColumnItemProvider(AdapterFactory adapterFactory) {
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

			addFreeTextExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Free Text Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreeTextExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QCalculatedColumn_freeTextExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QCalculatedColumn_freeTextExpression_feature", "_UI_QCalculatedColumn_type"),
				 DatagenPackage.Literals.QCALCULATED_COLUMN__FREE_TEXT_EXPRESSION,
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
			childrenFeatures.add(DatagenPackage.Literals.QCALCULATED_COLUMN__REFERENCED_COLUMNS);
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
	 * This returns QCalculatedColumn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QCalculatedColumn"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		QCalculatedColumn qcc = ((QCalculatedColumn)object);
		String label = formatQCalcColumn(qcc);
		return getString("_UI_QCalculatedColumn_type") + " " + label;
	}

	/**
	 * @generated NOT
	 * @param qcc
	 * @return
	 */
	public static String formatQCalcColumn(QCalculatedColumn qcc){
		String label = qcc.getFreeTextExpression();
		if (qcc.getFreeTextExpression()!=null){
			if (qcc.getReferencedColumns()!=null){
				String expr = qcc.getFreeTextExpression();
				for(int i=0; i<qcc.getReferencedColumns().size(); i++){
					QResultColumn currCol = qcc.getReferencedColumns().get(i);
					String colLabel = null;
					if (currCol instanceof QTableColumn){
						colLabel = "["+QTableColumnItemProvider.formatQTableColumn((QTableColumn)currCol)+"]";
					}
					else if (currCol instanceof QResultColumn){
						colLabel = "["+QCalculatedColumnItemProvider.formatQCalcColumn((QCalculatedColumn)currCol)+"]";
					}
					else{
						colLabel = "[???]";
					}
					String currPlaceHolder = "\\$"+(i+1);
					expr = expr.replaceFirst(currPlaceHolder, colLabel);
				}
				label = expr;
			}
		}
		else{
			label = "<specificare espressione>";
		}
		return label;
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

		switch (notification.getFeatureID(QCalculatedColumn.class)) {
			case DatagenPackage.QCALCULATED_COLUMN__FREE_TEXT_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DatagenPackage.QCALCULATED_COLUMN__REFERENCED_COLUMNS:
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
				(DatagenPackage.Literals.QCALCULATED_COLUMN__REFERENCED_COLUMNS,
				 DatagenFactory.eINSTANCE.createQTableColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DatagenPackage.Literals.QCALCULATED_COLUMN__REFERENCED_COLUMNS,
				 DatagenFactory.eINSTANCE.createQCalculatedColumn()));
	}

}

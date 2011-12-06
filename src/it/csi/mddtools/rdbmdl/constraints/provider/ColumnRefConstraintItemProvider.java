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
package it.csi.mddtools.rdbmdl.constraints.provider;


import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;
import it.csi.mddtools.datagen.LookupResolver;
import it.csi.mddtools.datagen.LookupResolvers;
import it.csi.mddtools.rdbmdl.RdbmdlPackage;
import it.csi.mddtools.rdbmdl.Table;
import it.csi.mddtools.rdbmdl.TableColumn;
import it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint;
import it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage;
import it.csi.mddtools.rdbmdl.constraints.ForeignKey;
import it.csi.mddtools.rdbmdl.constraints.PrimaryKey;
import it.csi.mddtools.rdbmdl.constraints.impl.CheckConstraintImpl;
import it.csi.mddtools.rdbmdl.constraints.impl.ColumnRefConstraintImpl;
import it.csi.mddtools.rdbmdl.constraints.impl.ForeignKeyImpl;
import it.csi.mddtools.rdbmdl.constraints.impl.PrimaryKeyImpl;
import it.csi.mddtools.rdbmdl.constraints.impl.UniqueConstraintImpl;
import it.csi.mddtools.rdbmdl.impl.TableImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnRefConstraintItemProvider
	extends ConstraintItemProvider
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
	public ColumnRefConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addIncludedColumnsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Included Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIncludedColumnsPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ColumnRefConstraint_includedColumns_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnRefConstraint_includedColumns_feature", "_UI_ColumnRefConstraint_type"),
//				 ConstraintsPackage.Literals.COLUMN_REF_CONSTRAINT__INCLUDED_COLUMNS,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getString("_UI_ColumnRefConstraint_includedColumns_feature"), 
				getString("_UI_PropertyDescriptor_description",
						  "_UI_ColumnRefConstraint_includedColumns_feature",
						  "_UI_ColumnRefConstraint_type"),
				ConstraintsPackage.eINSTANCE.getColumnRefConstraint_IncludedColumns(),
				true) {
					@SuppressWarnings("unchecked")
					protected Collection getComboBoxObjects(Object object) {
						ArrayList<TableColumn> result = new ArrayList<TableColumn>();
						ColumnRefConstraintImpl crci = (ColumnRefConstraintImpl)object;
						TableImpl ti = (TableImpl) crci.eContainer();
						for(int i = 0; i<ti.getColumns().size();i++){
							result.add(ti.getColumns().get(i));
							}
						
					return result;						
					}
				}
			);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ColumnRefConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ColumnRefConstraint_type") :
			getString("_UI_ColumnRefConstraint_type") + " " + label;
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

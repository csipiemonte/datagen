/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.provider;

import it.csi.mddtools.datagen.util.DatagenAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatagenItemProviderAdapterFactory extends DatagenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.DBAccessModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBAccessModelItemProvider dbAccessModelItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.DBAccessModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDBAccessModelAdapter() {
		if (dbAccessModelItemProvider == null) {
			dbAccessModelItemProvider = new DBAccessModelItemProvider(this);
		}

		return dbAccessModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.DataAccessObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAccessObjectItemProvider dataAccessObjectItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.DataAccessObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAccessObjectAdapter() {
		if (dataAccessObjectItemProvider == null) {
			dataAccessObjectItemProvider = new DataAccessObjectItemProvider(this);
		}

		return dataAccessObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.DaoPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaoPackageItemProvider daoPackageItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.DaoPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDaoPackageAdapter() {
		if (daoPackageItemProvider == null) {
			daoPackageItemProvider = new DaoPackageItemProvider(this);
		}

		return daoPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.SequencePKGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencePKGeneratorItemProvider sequencePKGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.SequencePKGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequencePKGeneratorAdapter() {
		if (sequencePKGeneratorItemProvider == null) {
			sequencePKGeneratorItemProvider = new SequencePKGeneratorItemProvider(this);
		}

		return sequencePKGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.Inserter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InserterItemProvider inserterItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.Inserter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInserterAdapter() {
		if (inserterItemProvider == null) {
			inserterItemProvider = new InserterItemProvider(this);
		}

		return inserterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.FindByPK} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindByPKItemProvider findByPKItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.FindByPK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindByPKAdapter() {
		if (findByPKItemProvider == null) {
			findByPKItemProvider = new FindByPKItemProvider(this);
		}

		return findByPKItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.FindAll} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindAllItemProvider findAllItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.FindAll}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindAllAdapter() {
		if (findAllItemProvider == null) {
			findAllItemProvider = new FindAllItemProvider(this);
		}

		return findAllItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.QBEFinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QBEFinderItemProvider qbeFinderItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.QBEFinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQBEFinderAdapter() {
		if (qbeFinderItemProvider == null) {
			qbeFinderItemProvider = new QBEFinderItemProvider(this);
		}

		return qbeFinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.CustomFinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFinderItemProvider customFinderItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.CustomFinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomFinderAdapter() {
		if (customFinderItemProvider == null) {
			customFinderItemProvider = new CustomFinderItemProvider(this);
		}

		return customFinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.Updaters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatersItemProvider updatersItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.Updaters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdatersAdapter() {
		if (updatersItemProvider == null) {
			updatersItemProvider = new UpdatersItemProvider(this);
		}

		return updatersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.UpdateRow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateRowItemProvider updateRowItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.UpdateRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateRowAdapter() {
		if (updateRowItemProvider == null) {
			updateRowItemProvider = new UpdateRowItemProvider(this);
		}

		return updateRowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.UpdateColumns} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateColumnsItemProvider updateColumnsItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.UpdateColumns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateColumnsAdapter() {
		if (updateColumnsItemProvider == null) {
			updateColumnsItemProvider = new UpdateColumnsItemProvider(this);
		}

		return updateColumnsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.Deleters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeletersItemProvider deletersItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.Deleters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeletersAdapter() {
		if (deletersItemProvider == null) {
			deletersItemProvider = new DeletersItemProvider(this);
		}

		return deletersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.DeleteByPK} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteByPKItemProvider deleteByPKItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.DeleteByPK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteByPKAdapter() {
		if (deleteByPKItemProvider == null) {
			deleteByPKItemProvider = new DeleteByPKItemProvider(this);
		}

		return deleteByPKItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.CustomUpdater} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomUpdaterItemProvider customUpdaterItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.CustomUpdater}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomUpdaterAdapter() {
		if (customUpdaterItemProvider == null) {
			customUpdaterItemProvider = new CustomUpdaterItemProvider(this);
		}

		return customUpdaterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.CustomDeleter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDeleterItemProvider customDeleterItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.CustomDeleter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomDeleterAdapter() {
		if (customDeleterItemProvider == null) {
			customDeleterItemProvider = new CustomDeleterItemProvider(this);
		}

		return customDeleterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.csi.mddtools.datagen.Finders} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindersItemProvider findersItemProvider;

	/**
	 * This creates an adapter for a {@link it.csi.mddtools.datagen.Finders}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindersAdapter() {
		if (findersItemProvider == null) {
			findersItemProvider = new FindersItemProvider(this);
		}

		return findersItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dbAccessModelItemProvider != null) dbAccessModelItemProvider.dispose();
		if (dataAccessObjectItemProvider != null) dataAccessObjectItemProvider.dispose();
		if (daoPackageItemProvider != null) daoPackageItemProvider.dispose();
		if (sequencePKGeneratorItemProvider != null) sequencePKGeneratorItemProvider.dispose();
		if (inserterItemProvider != null) inserterItemProvider.dispose();
		if (findersItemProvider != null) findersItemProvider.dispose();
		if (findByPKItemProvider != null) findByPKItemProvider.dispose();
		if (findAllItemProvider != null) findAllItemProvider.dispose();
		if (qbeFinderItemProvider != null) qbeFinderItemProvider.dispose();
		if (customFinderItemProvider != null) customFinderItemProvider.dispose();
		if (updatersItemProvider != null) updatersItemProvider.dispose();
		if (updateRowItemProvider != null) updateRowItemProvider.dispose();
		if (updateColumnsItemProvider != null) updateColumnsItemProvider.dispose();
		if (deletersItemProvider != null) deletersItemProvider.dispose();
		if (deleteByPKItemProvider != null) deleteByPKItemProvider.dispose();
		if (customUpdaterItemProvider != null) customUpdaterItemProvider.dispose();
		if (customDeleterItemProvider != null) customDeleterItemProvider.dispose();
	}

}

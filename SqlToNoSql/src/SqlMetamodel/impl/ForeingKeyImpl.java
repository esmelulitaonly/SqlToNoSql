/**
 */
package SqlMetamodel.impl;

import SqlMetamodel.ForeingKey;
import SqlMetamodel.SqlMetamodelPackage;
import SqlMetamodel.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreing Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SqlMetamodel.impl.ForeingKeyImpl#getRefTable <em>Ref Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeingKeyImpl extends ConstraintImpl implements ForeingKey {
	/**
	 * The cached value of the '{@link #getRefTable() <em>Ref Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTable()
	 * @generated
	 * @ordered
	 */
	protected Table refTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeingKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlMetamodelPackage.Literals.FOREING_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getRefTable() {
		if (refTable != null && refTable.eIsProxy()) {
			InternalEObject oldRefTable = (InternalEObject)refTable;
			refTable = (Table)eResolveProxy(oldRefTable);
			if (refTable != oldRefTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlMetamodelPackage.FOREING_KEY__REF_TABLE, oldRefTable, refTable));
			}
		}
		return refTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetRefTable() {
		return refTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTable(Table newRefTable) {
		Table oldRefTable = refTable;
		refTable = newRefTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.FOREING_KEY__REF_TABLE, oldRefTable, refTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlMetamodelPackage.FOREING_KEY__REF_TABLE:
				if (resolve) return getRefTable();
				return basicGetRefTable();
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
			case SqlMetamodelPackage.FOREING_KEY__REF_TABLE:
				setRefTable((Table)newValue);
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
			case SqlMetamodelPackage.FOREING_KEY__REF_TABLE:
				setRefTable((Table)null);
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
			case SqlMetamodelPackage.FOREING_KEY__REF_TABLE:
				return refTable != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeingKeyImpl

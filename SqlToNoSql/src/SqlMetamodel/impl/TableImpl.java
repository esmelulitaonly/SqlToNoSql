/**
 */
package SqlMetamodel.impl;

import SqlMetamodel.Column;
import SqlMetamodel.Constraint;
import SqlMetamodel.PrimaryKey;
import SqlMetamodel.SqlMetamodelPackage;
import SqlMetamodel.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SqlMetamodel.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link SqlMetamodel.impl.TableImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link SqlMetamodel.impl.TableImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link SqlMetamodel.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlMetamodelPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, SqlMetamodelPackage.TABLE__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, SqlMetamodelPackage.TABLE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		if (primaryKey != null && primaryKey.eIsProxy()) {
			InternalEObject oldPrimaryKey = (InternalEObject)primaryKey;
			primaryKey = (PrimaryKey)eResolveProxy(oldPrimaryKey);
			if (primaryKey != oldPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlMetamodelPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
			}
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlMetamodelPackage.TABLE__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case SqlMetamodelPackage.TABLE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlMetamodelPackage.TABLE__NAME:
				return getName();
			case SqlMetamodelPackage.TABLE__COLUMN:
				return getColumn();
			case SqlMetamodelPackage.TABLE__CONSTRAINT:
				return getConstraint();
			case SqlMetamodelPackage.TABLE__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlMetamodelPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case SqlMetamodelPackage.TABLE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlMetamodelPackage.TABLE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case SqlMetamodelPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
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
			case SqlMetamodelPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SqlMetamodelPackage.TABLE__COLUMN:
				getColumn().clear();
				return;
			case SqlMetamodelPackage.TABLE__CONSTRAINT:
				getConstraint().clear();
				return;
			case SqlMetamodelPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
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
			case SqlMetamodelPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SqlMetamodelPackage.TABLE__COLUMN:
				return column != null && !column.isEmpty();
			case SqlMetamodelPackage.TABLE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case SqlMetamodelPackage.TABLE__PRIMARY_KEY:
				return primaryKey != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl

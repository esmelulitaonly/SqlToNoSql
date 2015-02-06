/**
 */
package SqlMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreing Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SqlMetamodel.ForeingKey#getRefTable <em>Ref Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see SqlMetamodel.SqlMetamodelPackage#getForeingKey()
 * @model
 * @generated
 */
public interface ForeingKey extends Constraint {
	/**
	 * Returns the value of the '<em><b>Ref Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Table</em>' reference.
	 * @see #setRefTable(Table)
	 * @see SqlMetamodel.SqlMetamodelPackage#getForeingKey_RefTable()
	 * @model required="true"
	 * @generated
	 */
	Table getRefTable();

	/**
	 * Sets the value of the '{@link SqlMetamodel.ForeingKey#getRefTable <em>Ref Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Table</em>' reference.
	 * @see #getRefTable()
	 * @generated
	 */
	void setRefTable(Table value);

} // ForeingKey

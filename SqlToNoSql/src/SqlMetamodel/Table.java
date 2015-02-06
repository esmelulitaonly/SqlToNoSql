/**
 */
package SqlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SqlMetamodel.Table#getName <em>Name</em>}</li>
 *   <li>{@link SqlMetamodel.Table#getColumn <em>Column</em>}</li>
 *   <li>{@link SqlMetamodel.Table#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link SqlMetamodel.Table#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see SqlMetamodel.SqlMetamodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SqlMetamodel.SqlMetamodelPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SqlMetamodel.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link SqlMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see SqlMetamodel.SqlMetamodelPackage#getTable_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link SqlMetamodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see SqlMetamodel.SqlMetamodelPackage#getTable_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see SqlMetamodel.SqlMetamodelPackage#getTable_PrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link SqlMetamodel.Table#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

} // Table

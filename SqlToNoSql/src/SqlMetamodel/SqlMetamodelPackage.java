/**
 */
package SqlMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SqlMetamodel.SqlMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SqlMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SqlMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SqlMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SqlMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlMetamodelPackage eINSTANCE = SqlMetamodel.impl.SqlMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SqlMetamodel.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.impl.SchemaImpl
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SqlMetamodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.impl.TableImpl
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SqlMetamodel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.impl.ColumnImpl
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SqlMetamodel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.impl.ConstraintImpl
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SqlMetamodel.impl.ForeingKeyImpl <em>Foreing Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.impl.ForeingKeyImpl
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getForeingKey()
	 * @generated
	 */
	int FOREING_KEY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREING_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREING_KEY__REF_TABLE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreing Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREING_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Foreing Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREING_KEY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SqlMetamodel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.impl.PrimaryKeyImpl
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SqlMetamodel.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SqlMetamodel.TypeData
	 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 6;


	/**
	 * Returns the meta object for class '{@link SqlMetamodel.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see SqlMetamodel.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link SqlMetamodel.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SqlMetamodel.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SqlMetamodel.Schema#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see SqlMetamodel.Schema#getTable()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Table();

	/**
	 * Returns the meta object for class '{@link SqlMetamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see SqlMetamodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link SqlMetamodel.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SqlMetamodel.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SqlMetamodel.Table#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see SqlMetamodel.Table#getColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link SqlMetamodel.Table#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see SqlMetamodel.Table#getConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Constraint();

	/**
	 * Returns the meta object for the reference '{@link SqlMetamodel.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see SqlMetamodel.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link SqlMetamodel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see SqlMetamodel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link SqlMetamodel.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SqlMetamodel.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link SqlMetamodel.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SqlMetamodel.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link SqlMetamodel.Column#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see SqlMetamodel.Column#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for class '{@link SqlMetamodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see SqlMetamodel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link SqlMetamodel.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SqlMetamodel.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link SqlMetamodel.ForeingKey <em>Foreing Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreing Key</em>'.
	 * @see SqlMetamodel.ForeingKey
	 * @generated
	 */
	EClass getForeingKey();

	/**
	 * Returns the meta object for the reference '{@link SqlMetamodel.ForeingKey#getRefTable <em>Ref Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Table</em>'.
	 * @see SqlMetamodel.ForeingKey#getRefTable()
	 * @see #getForeingKey()
	 * @generated
	 */
	EReference getForeingKey_RefTable();

	/**
	 * Returns the meta object for class '{@link SqlMetamodel.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see SqlMetamodel.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for enum '{@link SqlMetamodel.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see SqlMetamodel.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SqlMetamodelFactory getSqlMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SqlMetamodel.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.impl.SchemaImpl
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLE = eINSTANCE.getSchema_Table();

		/**
		 * The meta object literal for the '{@link SqlMetamodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.impl.TableImpl
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMN = eINSTANCE.getTable_Column();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONSTRAINT = eINSTANCE.getTable_Constraint();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '{@link SqlMetamodel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.impl.ColumnImpl
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NULLABLE = eINSTANCE.getColumn_Nullable();

		/**
		 * The meta object literal for the '{@link SqlMetamodel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.impl.ConstraintImpl
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link SqlMetamodel.impl.ForeingKeyImpl <em>Foreing Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.impl.ForeingKeyImpl
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getForeingKey()
		 * @generated
		 */
		EClass FOREING_KEY = eINSTANCE.getForeingKey();

		/**
		 * The meta object literal for the '<em><b>Ref Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREING_KEY__REF_TABLE = eINSTANCE.getForeingKey_RefTable();

		/**
		 * The meta object literal for the '{@link SqlMetamodel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.impl.PrimaryKeyImpl
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link SqlMetamodel.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SqlMetamodel.TypeData
		 * @see SqlMetamodel.impl.SqlMetamodelPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

	}

} //SqlMetamodelPackage

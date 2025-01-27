/**
 */
package astro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see astro.AstroFactory
 * @model kind="package"
 * @generated
 */
public interface AstroPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "astro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uk.ac.york.astro";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "astro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstroPackage eINSTANCE = astro.impl.AstroPackageImpl.init();

	/**
	 * The meta object id for the '{@link astro.impl.GeneratorParametersImpl <em>Generator Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see astro.impl.GeneratorParametersImpl
	 * @see astro.impl.AstroPackageImpl#getGeneratorParameters()
	 * @generated
	 */
	int GENERATOR_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Emf Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__EMF_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Emf Edit Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__EMF_EDIT_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Pom Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__POM_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Sirius Web Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__PROJECT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__PROJECT_PATH = 5;

	/**
	 * The feature id for the '<em><b>Target Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS__TARGET_PACKAGE = 6;

	/**
	 * The number of structural features of the '<em>Generator Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Generator Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETERS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link astro.GeneratorParameters <em>Generator Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Parameters</em>'.
	 * @see astro.GeneratorParameters
	 * @generated
	 */
	EClass getGeneratorParameters();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getEmfProject <em>Emf Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Project</em>'.
	 * @see astro.GeneratorParameters#getEmfProject()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_EmfProject();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getEmfEditProject <em>Emf Edit Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Edit Project</em>'.
	 * @see astro.GeneratorParameters#getEmfEditProject()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_EmfEditProject();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getPomVersion <em>Pom Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pom Version</em>'.
	 * @see astro.GeneratorParameters#getPomVersion()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_PomVersion();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getSiriusWebVersion <em>Sirius Web Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sirius Web Version</em>'.
	 * @see astro.GeneratorParameters#getSiriusWebVersion()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_SiriusWebVersion();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see astro.GeneratorParameters#getProjectName()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getProjectPath <em>Project Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Path</em>'.
	 * @see astro.GeneratorParameters#getProjectPath()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_ProjectPath();

	/**
	 * Returns the meta object for the attribute '{@link astro.GeneratorParameters#getTargetPackage <em>Target Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Package</em>'.
	 * @see astro.GeneratorParameters#getTargetPackage()
	 * @see #getGeneratorParameters()
	 * @generated
	 */
	EAttribute getGeneratorParameters_TargetPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstroFactory getAstroFactory();

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
		 * The meta object literal for the '{@link astro.impl.GeneratorParametersImpl <em>Generator Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see astro.impl.GeneratorParametersImpl
		 * @see astro.impl.AstroPackageImpl#getGeneratorParameters()
		 * @generated
		 */
		EClass GENERATOR_PARAMETERS = eINSTANCE.getGeneratorParameters();

		/**
		 * The meta object literal for the '<em><b>Emf Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__EMF_PROJECT = eINSTANCE.getGeneratorParameters_EmfProject();

		/**
		 * The meta object literal for the '<em><b>Emf Edit Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__EMF_EDIT_PROJECT = eINSTANCE.getGeneratorParameters_EmfEditProject();

		/**
		 * The meta object literal for the '<em><b>Pom Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__POM_VERSION = eINSTANCE.getGeneratorParameters_PomVersion();

		/**
		 * The meta object literal for the '<em><b>Sirius Web Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION = eINSTANCE.getGeneratorParameters_SiriusWebVersion();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__PROJECT_NAME = eINSTANCE.getGeneratorParameters_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Project Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__PROJECT_PATH = eINSTANCE.getGeneratorParameters_ProjectPath();

		/**
		 * The meta object literal for the '<em><b>Target Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETERS__TARGET_PACKAGE = eINSTANCE.getGeneratorParameters_TargetPackage();

	}

} //AstroPackage

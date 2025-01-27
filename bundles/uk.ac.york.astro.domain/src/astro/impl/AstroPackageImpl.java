/**
 */
package astro.impl;

import astro.AstroFactory;
import astro.AstroPackage;
import astro.GeneratorParameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstroPackageImpl extends EPackageImpl implements AstroPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorParametersEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see astro.AstroPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstroPackageImpl() {
		super(eNS_URI, AstroFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AstroPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AstroPackage init() {
		if (isInited) return (AstroPackage)EPackage.Registry.INSTANCE.getEPackage(AstroPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAstroPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AstroPackageImpl theAstroPackage = registeredAstroPackage instanceof AstroPackageImpl ? (AstroPackageImpl)registeredAstroPackage : new AstroPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAstroPackage.createPackageContents();

		// Initialize created meta-data
		theAstroPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstroPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AstroPackage.eNS_URI, theAstroPackage);
		return theAstroPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneratorParameters() {
		return generatorParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_EmfProject() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_EmfEditProject() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_PomVersion() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_SiriusWebVersion() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_ProjectName() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_ProjectPath() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorParameters_TargetPackage() {
		return (EAttribute)generatorParametersEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AstroFactory getAstroFactory() {
		return (AstroFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		generatorParametersEClass = createEClass(GENERATOR_PARAMETERS);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__EMF_PROJECT);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__EMF_EDIT_PROJECT);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__POM_VERSION);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__PROJECT_NAME);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__PROJECT_PATH);
		createEAttribute(generatorParametersEClass, GENERATOR_PARAMETERS__TARGET_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(generatorParametersEClass, GeneratorParameters.class, "GeneratorParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorParameters_EmfProject(), ecorePackage.getEString(), "emfProject", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorParameters_EmfEditProject(), ecorePackage.getEString(), "emfEditProject", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorParameters_PomVersion(), ecorePackage.getEString(), "pomVersion", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorParameters_SiriusWebVersion(), ecorePackage.getEString(), "siriusWebVersion", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorParameters_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorParameters_ProjectPath(), ecorePackage.getEString(), "projectPath", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorParameters_TargetPackage(), ecorePackage.getEString(), "targetPackage", null, 0, 1, GeneratorParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AstroPackageImpl

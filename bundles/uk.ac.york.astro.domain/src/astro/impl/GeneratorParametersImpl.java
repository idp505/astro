/**
 */
package astro.impl;

import astro.AstroPackage;
import astro.GeneratorParameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getEmfProject <em>Emf Project</em>}</li>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getEmfEditProject <em>Emf Edit Project</em>}</li>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getPomVersion <em>Pom Version</em>}</li>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getSiriusWebVersion <em>Sirius Web Version</em>}</li>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link astro.impl.GeneratorParametersImpl#getTargetPackage <em>Target Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorParametersImpl extends MinimalEObjectImpl.Container implements GeneratorParameters {
	/**
	 * The default value of the '{@link #getEmfProject() <em>Emf Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfProject()
	 * @generated
	 * @ordered
	 */
	protected static final String EMF_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmfProject() <em>Emf Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfProject()
	 * @generated
	 * @ordered
	 */
	protected String emfProject = EMF_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmfEditProject() <em>Emf Edit Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfEditProject()
	 * @generated
	 * @ordered
	 */
	protected static final String EMF_EDIT_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmfEditProject() <em>Emf Edit Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfEditProject()
	 * @generated
	 * @ordered
	 */
	protected String emfEditProject = EMF_EDIT_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPomVersion() <em>Pom Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPomVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String POM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPomVersion() <em>Pom Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPomVersion()
	 * @generated
	 * @ordered
	 */
	protected String pomVersion = POM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiriusWebVersion() <em>Sirius Web Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiriusWebVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SIRIUS_WEB_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiriusWebVersion() <em>Sirius Web Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiriusWebVersion()
	 * @generated
	 * @ordered
	 */
	protected String siriusWebVersion = SIRIUS_WEB_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectPath() <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectPath() <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPath()
	 * @generated
	 * @ordered
	 */
	protected String projectPath = PROJECT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPackage() <em>Target Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPackage() <em>Target Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackage()
	 * @generated
	 * @ordered
	 */
	protected String targetPackage = TARGET_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstroPackage.Literals.GENERATOR_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmfProject() {
		return emfProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmfProject(String newEmfProject) {
		String oldEmfProject = emfProject;
		emfProject = newEmfProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__EMF_PROJECT, oldEmfProject, emfProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmfEditProject() {
		return emfEditProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmfEditProject(String newEmfEditProject) {
		String oldEmfEditProject = emfEditProject;
		emfEditProject = newEmfEditProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__EMF_EDIT_PROJECT, oldEmfEditProject, emfEditProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPomVersion() {
		return pomVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPomVersion(String newPomVersion) {
		String oldPomVersion = pomVersion;
		pomVersion = newPomVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__POM_VERSION, oldPomVersion, pomVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiriusWebVersion() {
		return siriusWebVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiriusWebVersion(String newSiriusWebVersion) {
		String oldSiriusWebVersion = siriusWebVersion;
		siriusWebVersion = newSiriusWebVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION, oldSiriusWebVersion, siriusWebVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectPath() {
		return projectPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectPath(String newProjectPath) {
		String oldProjectPath = projectPath;
		projectPath = newProjectPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__PROJECT_PATH, oldProjectPath, projectPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetPackage() {
		return targetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPackage(String newTargetPackage) {
		String oldTargetPackage = targetPackage;
		targetPackage = newTargetPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstroPackage.GENERATOR_PARAMETERS__TARGET_PACKAGE, oldTargetPackage, targetPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstroPackage.GENERATOR_PARAMETERS__EMF_PROJECT:
				return getEmfProject();
			case AstroPackage.GENERATOR_PARAMETERS__EMF_EDIT_PROJECT:
				return getEmfEditProject();
			case AstroPackage.GENERATOR_PARAMETERS__POM_VERSION:
				return getPomVersion();
			case AstroPackage.GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION:
				return getSiriusWebVersion();
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_NAME:
				return getProjectName();
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_PATH:
				return getProjectPath();
			case AstroPackage.GENERATOR_PARAMETERS__TARGET_PACKAGE:
				return getTargetPackage();
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
			case AstroPackage.GENERATOR_PARAMETERS__EMF_PROJECT:
				setEmfProject((String)newValue);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__EMF_EDIT_PROJECT:
				setEmfEditProject((String)newValue);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__POM_VERSION:
				setPomVersion((String)newValue);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION:
				setSiriusWebVersion((String)newValue);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_PATH:
				setProjectPath((String)newValue);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__TARGET_PACKAGE:
				setTargetPackage((String)newValue);
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
			case AstroPackage.GENERATOR_PARAMETERS__EMF_PROJECT:
				setEmfProject(EMF_PROJECT_EDEFAULT);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__EMF_EDIT_PROJECT:
				setEmfEditProject(EMF_EDIT_PROJECT_EDEFAULT);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__POM_VERSION:
				setPomVersion(POM_VERSION_EDEFAULT);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION:
				setSiriusWebVersion(SIRIUS_WEB_VERSION_EDEFAULT);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_PATH:
				setProjectPath(PROJECT_PATH_EDEFAULT);
				return;
			case AstroPackage.GENERATOR_PARAMETERS__TARGET_PACKAGE:
				setTargetPackage(TARGET_PACKAGE_EDEFAULT);
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
			case AstroPackage.GENERATOR_PARAMETERS__EMF_PROJECT:
				return EMF_PROJECT_EDEFAULT == null ? emfProject != null : !EMF_PROJECT_EDEFAULT.equals(emfProject);
			case AstroPackage.GENERATOR_PARAMETERS__EMF_EDIT_PROJECT:
				return EMF_EDIT_PROJECT_EDEFAULT == null ? emfEditProject != null : !EMF_EDIT_PROJECT_EDEFAULT.equals(emfEditProject);
			case AstroPackage.GENERATOR_PARAMETERS__POM_VERSION:
				return POM_VERSION_EDEFAULT == null ? pomVersion != null : !POM_VERSION_EDEFAULT.equals(pomVersion);
			case AstroPackage.GENERATOR_PARAMETERS__SIRIUS_WEB_VERSION:
				return SIRIUS_WEB_VERSION_EDEFAULT == null ? siriusWebVersion != null : !SIRIUS_WEB_VERSION_EDEFAULT.equals(siriusWebVersion);
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case AstroPackage.GENERATOR_PARAMETERS__PROJECT_PATH:
				return PROJECT_PATH_EDEFAULT == null ? projectPath != null : !PROJECT_PATH_EDEFAULT.equals(projectPath);
			case AstroPackage.GENERATOR_PARAMETERS__TARGET_PACKAGE:
				return TARGET_PACKAGE_EDEFAULT == null ? targetPackage != null : !TARGET_PACKAGE_EDEFAULT.equals(targetPackage);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (emfProject: ");
		result.append(emfProject);
		result.append(", emfEditProject: ");
		result.append(emfEditProject);
		result.append(", pomVersion: ");
		result.append(pomVersion);
		result.append(", siriusWebVersion: ");
		result.append(siriusWebVersion);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", projectPath: ");
		result.append(projectPath);
		result.append(", targetPackage: ");
		result.append(targetPackage);
		result.append(')');
		return result.toString();
	}

} //GeneratorParametersImpl

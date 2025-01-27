/**
 */
package astro;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see astro.AstroPackage
 * @generated
 */
public interface AstroFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstroFactory eINSTANCE = astro.impl.AstroFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generator Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Parameters</em>'.
	 * @generated
	 */
	GeneratorParameters createGeneratorParameters();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AstroPackage getAstroPackage();

} //AstroFactory

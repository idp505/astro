package uk.ac.york.astro;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.dt.console.EpsilonConsole;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.properties.PropertiesPackage;

import astro.AstroPackage;
import uk.ac.york.astro.util.UtilityService;


public class SiriusModelsValidator extends Job {

	private IFile odesignFile;
	private IFile metamodelFile;
	private IFile generatorParametersFile;
	private URI odesignUri;
	private URI metamodelUri;
	private URI generatorParametersUri;
	
	public SiriusModelsValidator(IFile odesign, IFile metamodel, IFile generatorParameters)  {
		super("Validate the Sirius models (odesign, metamodel, parameters)");
		odesignFile = odesign;
		metamodelFile = metamodel;		
		generatorParametersFile = generatorParameters;
		odesignUri = UtilityService.getPlatformURI(odesign);
		metamodelUri = UtilityService.getPlatformURI(metamodel);
		generatorParametersUri = UtilityService.getPlatformURI(generatorParameters);
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			boolean isValid = validateSiriusModels();
			return isValid ? Status.OK_STATUS : Status.CANCEL_STATUS;
		}
		catch (Exception e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
	}

	public boolean validateSiriusModels() throws Exception {
		      
 		EmfModel odesign = new EmfModel();
 		odesign.setMetamodelUris(Arrays.asList(DescriptionPackage.eINSTANCE.getNsURI(), PropertiesPackage.eINSTANCE.getNsURI()));
 		odesign.setModelFileUri(odesignUri);
 		odesign.setName("O");
 		odesign.setReadOnLoad(true);
 	    odesign.setStoredOnDisposal(false);
 		odesign.load();
 		
 		EmfModel metamodel = new EmfModel();
 		metamodel.setMetamodelUris(Arrays.asList(EcorePackage.eINSTANCE.getNsURI()));
 		metamodel.setModelFileUri(metamodelUri);
 		metamodel.setName("M");
 		metamodel.setReadOnLoad(true);
 		metamodel.setStoredOnDisposal(false);
 		metamodel.load();
 				
 		EmfModel generatorParameters = new EmfModel();
 		generatorParameters.setMetamodelUris(Arrays.asList(AstroPackage.eINSTANCE.getNsURI()));
 		generatorParameters.setModelFileUri(generatorParametersUri);
 		generatorParameters.setName("P");
 		generatorParameters.setReadOnLoad(true);
 		generatorParameters.setStoredOnDisposal(false);
 		generatorParameters.load();
 		
		EvlModule evlModule = new EvlModule();
		evlModule.parse(getClass().getResource(ModelData.PATH_TO_EVL).toURI());
		evlModule.getContext().getModelRepository().addModel(odesign);
		evlModule.getContext().getModelRepository().addModel(metamodel);
		evlModule.getContext().getModelRepository().addModel(generatorParameters);     
		evlModule.execute();
		
		odesignFile.deleteMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO);
		metamodelFile.deleteMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO);
		generatorParametersFile.deleteMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO);
		
		Collection<UnsatisfiedConstraint> unsatisfiedConstraints = evlModule.getContext().getUnsatisfiedConstraints();		
		if (unsatisfiedConstraints.size() == 0) {
	 		System.out.println("The Sirius models are valid.");
			evlModule.getContext().getModelRepository().dispose();
	 		return true;
		}
		else {
			System.err.println("At least one of the the Sirius models are invalid.");
			EpsilonConsole console = EpsilonConsole.getInstance();
			for (UnsatisfiedConstraint unsatisfiedConstraint : unsatisfiedConstraints) {
				EObject eObject = (EObject) unsatisfiedConstraint.getInstance();						
				URI uri = EcoreUtil.getURI(eObject);
				IFile file = UtilityService.getFile(uri);
				String uriFragment = eObject.eResource().getURIFragment(eObject);
				IMarker marker = file.createMarker(EValidator.MARKER);					
				if (unsatisfiedConstraint.getConstraint().isCritique()) {
					console.getWarningStream().println(unsatisfiedConstraint.getMessage());
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				}
				else {
					console.getErrorStream().println(unsatisfiedConstraint.getMessage());
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				}
				marker.setAttribute(IMarker.MESSAGE, unsatisfiedConstraint.getMessage());
				marker.setAttribute(IMarker.LOCATION, uriFragment);
	            marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(eObject).toString());			
			}
			evlModule.getContext().getModelRepository().dispose();
			return false;
		}
	}
	
}

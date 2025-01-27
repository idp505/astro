package uk.ac.york.astro;

import java.io.File;
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
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.properties.PropertiesPackage;

//import astro.AstroPackage;
import uk.ac.york.astro.util.UtilityService;

import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

public class Sirius2SiriusWeb extends Job {

	private IFile odesignFile;
	private IFile metamodelFile;
	private IFile generatorParametersFile;
	private URI odesignUri;
	private URI metamodelUri;
	private URI generatorParametersUri;
	
	public Sirius2SiriusWeb(IFile odesign, IFile metamodel, IFile generatorParameters)  {
		super("Generate Sirius Web editor");
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
			boolean isValid = generateSiriusWebEditor();
			return isValid ? Status.OK_STATUS : Status.CANCEL_STATUS;
		}
		catch (Exception e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
	}

	public boolean generateSiriusWebEditor() throws Exception {
		      
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
 		//generatorParameters.setMetamodelUris(Arrays.asList(AstroPackage.eINSTANCE.getNsURI()));
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
	 		EgxModule egxModule = new EgxModule(new File(".").getAbsolutePath());
	 		egxModule.parse(getClass().getResource(ModelData.PATH_TO_EGX).toURI());
	 		egxModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
	 		egxModule.getContext().getModelRepository().addModel(odesign);
	 		egxModule.getContext().getModelRepository().addModel(metamodel);
	 		egxModule.getContext().getModelRepository().addModel(generatorParameters);
	 		egxModule.execute();
	 		egxModule.getContext().getModelRepository().dispose();
	 		System.out.println("The Sirius Web editor has been generated successfully.");
	 		evlModule.getContext().getModelRepository().dispose();
	 		return true;
		}
		else {
			System.err.println("Cannot complete code generation due to invalid Sirius models.");
			EpsilonConsole console = EpsilonConsole.getInstance();
			for (UnsatisfiedConstraint unsatisfiedConstraint : unsatisfiedConstraints) {
				EObject eObject = (EObject) unsatisfiedConstraint.getInstance();						
				URI uri = EcoreUtil.getURI(eObject);
				String uriFragment = eObject.eResource().getURIFragment(eObject);
				IFile file = UtilityService.getFile(uri);
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

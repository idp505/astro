package uk.ac.york.astro.handlers;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.ac.york.astro.ModelData;
import uk.ac.york.astro.SiriusModelsValidator;
import uk.ac.york.astro.util.UtilityService;

public class SiriusWebValidatorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection0 = HandlerUtil.getCurrentSelection(event);
		if (selection0 instanceof IStructuredSelection) {
			Map<String, IFile> siriusModels = UtilityService.getSiriusModels((IStructuredSelection)selection0);		
			IFile odesign = siriusModels.get(ModelData.ODESIGN_EXTENSION);
			IFile metamodel = siriusModels.get(ModelData.METAMODEL_EXTENSION);
			IFile generatorParameters = siriusModels.get(ModelData.GENERATORPARAMETERS_EXTENSION);
			if (odesign != null && metamodel != null && generatorParameters != null) {
				SiriusModelsValidator job = new SiriusModelsValidator(odesign, metamodel, generatorParameters);
				job.setUser(true);
				job.schedule();
			}
		}
		return null;
	}

}

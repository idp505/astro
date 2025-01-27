package uk.ac.york.astro.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;

import uk.ac.york.astro.ModelData;


public class UtilityService {

    public static String GetImageId (String imagePath) {
        try (FileInputStream fis = new FileInputStream(imagePath)) {
            UUID id = UUID.nameUUIDFromBytes(fis.readAllBytes());
            return id.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "replace with the actual ID from the database";
        }
    }
    
    public static URI getPlatformURI(IFile eclipseFile) {
		return URI.createPlatformResourceURI(eclipseFile.getFullPath().toOSString(), true);
	}
    
    public static Map<String, IFile> getSiriusModels(IStructuredSelection selection) {
    	Map<String, IFile> siriusModels = new HashMap<String, IFile>();	   
		for (Iterator<?> i = selection.iterator(); i.hasNext();) {
			IFile file = (IFile) i.next();
			if (ModelData.ODESIGN_EXTENSION.equals(file.getFileExtension())) {
				siriusModels.put(ModelData.ODESIGN_EXTENSION, file);
			}
			else if (ModelData.METAMODEL_EXTENSION.equals(file.getFileExtension())) {
				siriusModels.put(ModelData.METAMODEL_EXTENSION, file);
			}
			else if (ModelData.GENERATORPARAMETERS_EXTENSION.equals(file.getFileExtension())) {
				siriusModels.put(ModelData.GENERATORPARAMETERS_EXTENSION, file);
			}
		}
    	return siriusModels;
    }

    public static IFile getFile(URI uri) {
      return uri.isPlatformResource() && uri.segmentCount() > 2 ? 
        ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))) :
        null;
    }
    
}
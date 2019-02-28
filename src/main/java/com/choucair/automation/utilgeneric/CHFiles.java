package com.choucair.automation.utilgeneric;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CHFiles {
	
	private static final Logger logger = LoggerFactory.getLogger(CHFiles.class);
	
	CHSerenityPropertiesExt serenityPropertiesExt;
	
	/* 
	 * Permite renombrar el archivo existente
	 * @param  strPathArchivo es el archivo que se quiere mover, debe contener al menos la ruta relativa. Ejemplo (src/test/resources/docs/2SRetencionP22018.xls)
	 * @param  strNewFileName es el nuvo nombre del archivo, tener en cuenta que debe contener la extensión. Ejemplo (NombreNuevo.txt)
	 * @author Wilson Medina
	 * @return retorna el archivo con el nombre cambiado
	 */
	public File renameFile(String strPathArchivo, String strNewFileName) {
		File flFileOrigen = new File(strPathArchivo);
		if (flFileOrigen.renameTo(new File(flFileOrigen.getParentFile(), strNewFileName))) {
			return new File(flFileOrigen.getParentFile(), strNewFileName);
		} else {
			return null;
		}
	}
	
	/* 
	 * Permite cambiar la extensión de un archivo
	 * @param  strPathArchivo es el archivo que se quiere mover, debe contener al menos la ruta relativa. Ejemplo (src/test/resources/docs/2SRetencionP22018.xls)
	 * @param  strNewExtension es la extensión con la que se renombrará el archivo. Ejemplo (pdf)
	 * @author Wilson Medina
	 * @return retorna el archivo con la extensión cambiada
	 */
	public File changeExtension(String strPathArchivo, String strNewExtension) {
		File flFileOrigen = new File(strPathArchivo);
		String strFilename = flFileOrigen.getName();

	    if (strFilename.contains(".")) {
	    	strFilename = strFilename.substring(0, strFilename.lastIndexOf('.'));
	    }
	    strFilename += "." + strNewExtension;

	   if (flFileOrigen.renameTo(new File(flFileOrigen.getParentFile(), strFilename))) {
		   return new File(flFileOrigen.getParentFile(), strFilename);
	   } else {
		   return null;
	   }
		   
	   
	   
	}
	
	/* 
	 * Permite copiar un archivo a una ruta especificada
	 * @param  strPathArchivo es el archivo que se quiere mover, debe contener al menos la ruta relativa. Ejemplo (src/test/resources/docs/2SRetencionP22018.xls)
	 * @param  strPathDestino es la ruta en la que se almacena el archivo, puede ser relativo o absoluto
	 * @author Wilson Medina
	 * @return retorna el archivo de destino que se creó
	 */
	public File copyFile(String strPathArchivo, String strPathDestino) {
		
		
		Path ptPathOrigen = Paths.get(strPathArchivo);
		File flFileDestino = null;
		
		if (Files.exists(ptPathOrigen)) {
			
			Path ptPathDestino = Paths.get(strPathDestino);
			if (Files.exists(ptPathDestino)) {
				File flFileOrigen = new File(strPathArchivo);
				String strFileDestino = strPathDestino + "/" + flFileOrigen.getName();
				flFileDestino = new File(strFileDestino);
				
				long lngPesoOrigen = 0;
				long lngPesoDestino = 1;
				
				if (flFileDestino.exists()) {
					lngPesoOrigen = flFileOrigen.length();
					lngPesoDestino = flFileDestino.length();
				}
							
				if (lngPesoOrigen!=lngPesoDestino){
					File flPathDestino = new File(strPathDestino);
					try 
					{
						FileUtils.copyFileToDirectory(flFileOrigen, flPathDestino);
					}
					catch (Exception e)
					{
						logger.error("Error: Copiando el archivo en la ruta destino -->", e);
						
					}
				}
			}
		}
		return flFileDestino;
		
	}
}

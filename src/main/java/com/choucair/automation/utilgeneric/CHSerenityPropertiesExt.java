package com.choucair.automation.utilgeneric;
/*
 * La clase sirve para retornar las propiedades de serinity en ejecución
 * que se hayan definido en un archivo de propiedades.
 * 
 * En el caso que no se haya definido, este retorna "null", por ejemplo con
 * serenity.outputDirectory, como no se definió en el archivo de propiedades retorna "null"
 * 
 * @author: Wilson Medina
 * @version: 27/08/2018
 * @Return: Valor de la propiedad solicitada
 */


import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class CHSerenityPropertiesExt {

	public String getSerenityPropertiesValues(String strPropertie) {
		EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
		return variables.getProperty(strPropertie);
	}

	public String getOutputDirectory() {
		
		String strFolder = getSerenityPropertiesValues("serenity.outputDirectory");
		
		if (strFolder == null) {
			strFolder = "/target/site/serenity";
		}
		return strFolder;
	}

}

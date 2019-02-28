package com.choucair.automation.utilgeneric;

/*
 * La clase sirve para reemplazar la imgen del logo nativo de serenity con uno personalizado.
 * 
 * @author: Wilson Medina
 * @version: 27/08/2018
 * 
 */


public class CHLogoSerenityReport {

	CHSerenityPropertiesExt serenityPropertiesExt;

	public void changeLogo() {

		serenityPropertiesExt = new CHSerenityPropertiesExt();
		
		String strFileOrigen = "src/test/resources/images/serenity-logo.png";
		String strPathDestino = serenityPropertiesExt.getOutputDirectory() + "/images";
		
		CHFiles chFiles = new CHFiles();
		chFiles.copyFile(strFileOrigen, strPathDestino);
				
	}

}

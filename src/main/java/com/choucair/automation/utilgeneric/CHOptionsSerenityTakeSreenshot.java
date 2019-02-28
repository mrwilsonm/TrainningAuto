package com.choucair.automation.utilgeneric;

/*
 * La clase que permite tomar una imagen externa la la libreria robot de java
 * Internamente se hace un cambio para la imagen quede en la evidencia de serenity 
 * 
 * @author: Wilson Medina
 * @version: 27/08/2018
 * 
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

//Java Program to Capture full
//Image of Screen
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.serenitybdd.core.Serenity;

public class CHOptionsSerenityTakeSreenshot {

	private static final Logger logger = LoggerFactory.getLogger(CHOptionsSerenityTakeSreenshot.class);
	
	private static String getNameImage() {
		
		Serenity.takeScreenshot();
		CHSerenityPropertiesExt serenityPropertiesExt = new CHSerenityPropertiesExt();
		File flEvidencia = new File(serenityPropertiesExt.getOutputDirectory());
	    
	    FilenameFilter fnfFiltroPNG = new CHMyFilenameFilter();
	    
	    File[] flsArchivos = flEvidencia.listFiles(fnfFiltroPNG);
	    Arrays.sort(flsArchivos, new Comparator<File>(){
	        public int compare(File fl1, File fl2) {
	        	return Long.valueOf(fl2.lastModified()).compareTo(fl1.lastModified());
	        	} 
	      	});
		   
	    return flsArchivos[0].toString();  
	      
	}

	public void captureScreen() {
		try 
		{
            Robot rbRobot = new Robot();

            Rectangle recCapture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage bfiImage = rbRobot.createScreenCapture(recCapture);
            String path = getNameImage();
            ImageIO.write(bfiImage, "png", new File(path));
            
        }
        catch (AWTException | IOException ex) {
        	logger.error("Error: Captura de Pantalla Externa --> ", ex);
        }
		
	}

	
}

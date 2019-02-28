package com.choucair.automation.utilgeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CHProcessUtility {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CHProcessUtility.class);
	CHClassUtility chClassUtility = new CHClassUtility();
	
	private static final String strListaDeTareas = "tasklist";
	private static final String strAsesinoDeTareas = "taskkill /IM ";

	public boolean isProcessRunning(String serviceName) {
		try 
		{
			Process pro = Runtime.getRuntime().exec(strListaDeTareas);
			BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.startsWith(serviceName)) {
					return true;
				}
			}
		} catch (IOException e) {
			LOGGER.trace("Exception ", chClassUtility.getMethodName(), e.getMessage());
		}
		return false;
	 }

	public void killProcess(String serviceName) {
		try 
		{
			Runtime.getRuntime().exec(strAsesinoDeTareas + serviceName);
			LOGGER.info(chClassUtility.getMethodName() + "killed successfully!");
		} catch (IOException e) {
			LOGGER.trace("Exception ", chClassUtility.getMethodName(), e.getMessage());
		}
	 } 
}

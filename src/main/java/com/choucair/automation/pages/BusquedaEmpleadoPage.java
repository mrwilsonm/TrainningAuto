package com.choucair.automation.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.choucair.automation.utilgeneric.CHClassUtility;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;


public class BusquedaEmpleadoPage extends PageObject{

	private static final Logger LOGGER = LoggerFactory.getLogger(BusquedaEmpleadoPage.class);
	CHClassUtility chClassUtility = new CHClassUtility();
	
	@FindBy(name="cargo")
    private WebElementFacade wefcmbCargo;
	
	@FindBy(xpath="//A[@href='javascript:buscarpersona()'][text()=' Buscar']/self::A")
    private WebElementFacade wefBtnBuscar;
	

	
	public void selectCargoBusqueda(String strCargoBusqueda) {
		
		try {
			wefcmbCargo.waitUntilPresent().selectByVisibleText(strCargoBusqueda);
			LOGGER.info(chClassUtility.getMethodName() + strCargoBusqueda);
		} catch (Exception ex) {
			LOGGER.error(chClassUtility.getMethodName() + ex.getMessage());
		}
		Serenity.takeScreenshot();
		
	}

	public void clickBuscar() {
		find(By.linkText("Buscar")).click();
		LOGGER.info(chClassUtility.getMethodName());
		waitFor(25).seconds();
		Serenity.takeScreenshot();
	}

	public void verificarResultados() {
		// Construir verificación
		LOGGER.info(chClassUtility.getMethodName() + "<<No implementado>>");
	}


}

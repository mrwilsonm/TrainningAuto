package com.choucair.automation.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.choucair.automation.utilgeneric.CHClassUtility;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPlanetPage extends PageObject{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuPlanetPage.class);
	CHClassUtility chClassUtility = new CHClassUtility();
	
	@FindBy(xpath="//*[@id=\"patternSideBarContents\"]/span[7]/a")
    private WebElementFacade wefMnuEncuentrame;
	
	@FindBy(xpath="//*[@id=\"patternMainContents\"]/div[3]/div[1]/ul/li[1]/a")
    private WebElementFacade wefSMnuEmpleados;
	
	@FindBy(xpath="//*[@id=\"patternMainContents\"]/div[3]/div[1]/ul/li[2]/a")
    private WebElementFacade wefSMnuEmpresas;
	
	public void menuEncuentrame() {
		wefMnuEncuentrame.waitUntilClickable().and().click();
		LOGGER.info(chClassUtility.getMethodName());
		Serenity.takeScreenshot();
	}
	
	public void submenuEmpleados() {
		wefSMnuEmpleados.waitUntilClickable().and().click();
		LOGGER.info(chClassUtility.getMethodName());
		Serenity.takeScreenshot();
	}
	
	public void submenuEmpresas() {
		wefSMnuEmpresas.waitUntilClickable().and().click();
		LOGGER.info(chClassUtility.getMethodName());
		
	}
}

package com.choucair.automation.pages;

import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.choucair.automation.utilgeneric.CHClassUtility;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")
public class LoginPlanetPage extends PageObject{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginPlanetPage.class);
	CHClassUtility chClassUtility = new CHClassUtility();
	
	@FindBy(name="username")
    private WebElementFacade wefTxtUserName;
	
	@FindBy(name="password")
    private WebElementFacade wefTxtPassword;
	
	
	
	public void inputUsuario(String strUsuario) {
		wefTxtUserName.waitUntilPresent().and().sendKeys(strUsuario);
		LOGGER.info(chClassUtility.getMethodName() + strUsuario);
	}
	
	public void inputPass(String strPass) {
		wefTxtPassword.waitUntilPresent().and().sendKeys(strPass);
		LOGGER.info(chClassUtility.getMethodName() + strPass);
		Serenity.takeScreenshot();
	}

	public void clickIngresar() {
		wefTxtPassword.sendKeys(Keys.ENTER);
		LOGGER.info(chClassUtility.getMethodName());
		Serenity.takeScreenshot();
	}
}

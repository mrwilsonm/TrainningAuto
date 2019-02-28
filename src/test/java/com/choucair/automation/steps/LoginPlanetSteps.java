package com.choucair.automation.steps;


import com.choucair.automation.pages.LoginPlanetPage;
import net.thucydides.core.annotations.Step;

public class LoginPlanetSteps {

	LoginPlanetPage loginPlanetPage;
	
	@Step
	public void loginPlanet(String strUsuario, String strPass) {
		loginPlanetPage.open();
		loginPlanetPage.inputUsuario(strUsuario);
		loginPlanetPage.inputPass(strPass);
		loginPlanetPage.clickIngresar();
	}
		
}

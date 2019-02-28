package com.choucair.automation.steps;

import com.choucair.automation.pages.MenuPlanetPage;

import net.thucydides.core.annotations.Step;

public class MenuPlanetSteps {

	MenuPlanetPage menuPlanetPage;
	
	@Step
	public void IngresarAPantallaEncuentrameEmpleados() {
		menuPlanetPage.menuEncuentrame();
		menuPlanetPage.submenuEmpleados();
	}
	@Step
	public void IngresarAPantallaEncuentrameEmpresas() {
		menuPlanetPage.menuEncuentrame();
		menuPlanetPage.submenuEmpresas();
	}
}

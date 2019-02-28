package com.choucair.automation.definitions;

import com.choucair.automation.steps.BusquedaEmpleadoSteps;
import com.choucair.automation.steps.LoginPlanetSteps;
import com.choucair.automation.steps.MenuPlanetSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaDefinition {

	@Steps
	LoginPlanetSteps loginPlanetSteps;
	
	@Steps
	MenuPlanetSteps menuPlanetSteps;
	
	@Steps
	BusquedaEmpleadoSteps busquedaEmpleadoSteps;
	
	@Given("^me logueo al aplicativo planet como \"([^\"]*)\" con pass \"([^\"]*)\"$")
	public void meLogueoAlAplicativoPlanetComoConPass(String strUsuario, String strPass) throws Throwable {
		loginPlanetSteps.loginPlanet(strUsuario, strPass);
	}

	@Given("^navego hasta la pantalla busqueda de empleados$")
	public void navegoHastaLaPantallaBusquedaDeEmpleados() {
		menuPlanetSteps.IngresarAPantallaEncuentrameEmpleados();
	}

	@When("^filtrar los analistas de prueba$")
	public void filtrarLosAnalistasDePrueba() {
		busquedaEmpleadoSteps.filtrarLosAnalistasDePrueba();
	}

	@Then("^se enlista todos los resultados$")
	public void seEnlistaTodosLosResultados()  {
		busquedaEmpleadoSteps.seEnlistaTodosLosResultados();
	}

	@When("^filtrar los Automatizadores$")
	public void filtrarLosAutomatizadores()  {
		busquedaEmpleadoSteps.filtrarLosAutomatizadores();
	}
	
}

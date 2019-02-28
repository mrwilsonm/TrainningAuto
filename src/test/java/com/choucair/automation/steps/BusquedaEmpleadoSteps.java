package com.choucair.automation.steps;


import com.choucair.automation.pages.BusquedaEmpleadoPage;
import net.thucydides.core.annotations.Step;

public class BusquedaEmpleadoSteps {

	BusquedaEmpleadoPage busquedaEmpleadoPage;
	
	 
	@Step
	public void filtrarLosAnalistasDePrueba() {
		busquedaEmpleadoPage.selectCargoBusqueda("Analista de Pruebas");
		busquedaEmpleadoPage.clickBuscar();
	}
	@Step
	public void seEnlistaTodosLosResultados() {
		busquedaEmpleadoPage.verificarResultados();
	}
	@Step
	public void filtrarLosAutomatizadores() {
		busquedaEmpleadoPage.selectCargoBusqueda("Automatizador");
		busquedaEmpleadoPage.clickBuscar();
	}

}

package com.choucair.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/Planet/Busqueda/BusquedaEmpleado.feature",
glue = "com.choucair.automation.definitions")

public class RunnerFeature {

}

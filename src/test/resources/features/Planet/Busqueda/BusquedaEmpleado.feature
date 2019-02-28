#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Critico
Feature: Busqueda Empleado
Permite realizar la búsqueda de empleados por diferentes criterios en el aplicativo planet

@SmokeTest
Scenario: Buscar Analistas de Prueba
	Given me logueo al aplicativo planet como "maruiz" con pass "Afrm55030"
	And navego hasta la pantalla busqueda de empleados 
	When filtrar los analistas de prueba
	Then se enlista todos los resultados


@RutaCritica
Scenario: Buscar Automatizadores
	Given me logueo al aplicativo planet como "maruiz" con pass "Afrm55030"
	And navego hasta la pantalla busqueda de empleados 
	When filtrar los Automatizadores
	Then se enlista todos los resultados
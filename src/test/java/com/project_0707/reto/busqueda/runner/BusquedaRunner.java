package com.project_0707.reto.busqueda.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
                 snippets = CucumberOptions.SnippetType.CAMELCASE,
                 glue = "com.project_0707.reto.busqueda.stepdefinition")


public class BusquedaRunner {

}

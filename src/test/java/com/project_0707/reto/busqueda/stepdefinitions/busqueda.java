package com.project_0707.reto.busqueda.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static com.project_0707.reto.busqueda.drivers.ChromeDriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class busqueda {

    @Before
    public void usuario(){
        setTheStage(new Cast());
        theActorCalled("usuario");
    }
    @Given("El usuario ingresa a Google")
    public void elUsuarioIngresaAGoogle() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome().conURL("https://www.google.com/")));
    }

    @When("Realiza la busqueda de la palabra animal")
    public void realizaLaBusquedaDeLaPalabraAnimal() {
    }

    @Then("Se muestran resultados con la palabra animal")
    public void seMuestranResultadosConLaPalabraAnimal() {
    }
}

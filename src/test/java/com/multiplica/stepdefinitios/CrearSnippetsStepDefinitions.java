package com.multiplica.stepdefinitios;

import com.multiplica.questions.BorradoExitoso;
import com.multiplica.questions.BusquedaExitosa;
import com.multiplica.tasks.Crear;
import com.multiplica.tasks.Eliminar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static com.multiplica.stepdefinitios.HomeStepDefinitions.elUsuario;

public class CrearSnippetsStepDefinitions {

	@When("Diligencio el formulario de crear Snippets (.*)$")
	public void diligencioElFormularioDeCrearSnippets(String texto) {
		elUsuario.attemptsTo(Crear.nuevoSnippets(texto));
	}
	@And("Borro el ultimo Snippet creado$")
	public void borroElEltimoSnippetCreado() {
		elUsuario.attemptsTo(Eliminar.elUltimoSnippet());
	}

	@Then("Valido que se haya borrado exitosamente")
	public void validoQueSeHayaBorradoExitosamente() {
		elUsuario.should(GivenWhenThen.seeThat(BorradoExitoso.delUltimoSnippetCreado()));
	}
}

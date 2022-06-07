package com.multiplica.stepdefinitios;

import com.multiplica.questions.BusquedaExitosa;
import com.multiplica.questions.Cerrar;
import com.multiplica.tasks.IniciarLaAplicacion;
import com.multiplica.tasks.LogOut;
import com.multiplica.tasks.Login;
import com.multiplica.tasks.Registro;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import static com.multiplica.tasks.IniciarLaAplicacion.nChrome;

public class HomeStepDefinitions {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Managed(options = "--start-maximized")
	public static Actor elUsuario = Actor.named("Duvier");


	@Given("Que estoy en el home (.*)$")
	public void queEstoyEnElHome(String url) {
		elUsuario.wasAbleTo(IniciarLaAplicacion.conElNavigator(nChrome).yEnLaUrl(url));

	}

	@When("Ingreso las credenciales (.*), (.*).$")
	public void ingresoLasCredenciales(String user, String pwd) {
		elUsuario.attemptsTo(Login.deUsuario(user, pwd));
	}

	@When("Diligencio el formualrio con las credenciales (.*), (.*).$")
	public void DiligencioElFormualrioConLasCredenciales(String user, String pwd) {
		elUsuario.attemptsTo(Registro.deUsuario(user, pwd));
	}

	@Then("Accedo exitosamente$")
	public void accedoExitosamente() {
		//elUsuario.should(GivenWhenThen.seeThat(AutenticacionExitosa.enPantallaPrincipal()).orComplainWith(com.multiplica.exceptions.MensajeValidacionNoVisualizadoException.class, MENSAJE_VALIDACION_NO_ENCONTRADO));
		elUsuario.should(GivenWhenThen.seeThat(BusquedaExitosa.enPantallaPrincipal()));
	}

	@Then("Cierro sesion exitosamente$")
	public void CierroSesionExitosamente() {
		elUsuario.attemptsTo(LogOut.deUsuario());
		elUsuario.should(GivenWhenThen.seeThat(Cerrar.sesionExitosa()));
	}

}

package com.multiplica.tasks;

import com.multiplica.interactions.DiligenciaCredenciales;
import com.multiplica.interactions.ValidaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.HomePage.BTN_SGN_UP;
import static com.multiplica.userinterface.SignUpPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Registro implements Task {

	private String users;
	private String pwds;

	public Registro(String users, String pwds) {
		this.users = users;
		this.pwds = pwds;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(BTN_SGN_UP, isEnabled()),
				Click.on(BTN_SGN_UP),
				DiligenciaCredenciales.EnFormulario(users,pwds),
				Click.on(BTN_CREATE_ACCOUNT));
		actor.attemptsTo(ValidaHome.Logueado());

	}

	public static Registro deUsuario(String user, String pwd) {
		return Tasks.instrumented(Registro.class, user, pwd);

	}
}

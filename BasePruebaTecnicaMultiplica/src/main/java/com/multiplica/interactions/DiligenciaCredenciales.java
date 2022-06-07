package com.multiplica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.SignUpPage.INPUT_PASSWORD;
import static com.multiplica.userinterface.SignUpPage.INPUT_USER_NAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DiligenciaCredenciales implements Interaction {

	private String users;
	private String pwds;

	public DiligenciaCredenciales(String users, String pwds) {
		this.users = users;
		this.pwds = pwds;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(INPUT_USER_NAME, isEnabled()),
				Type.theValue(users).into(INPUT_USER_NAME),
				WaitUntil.the(INPUT_PASSWORD, isEnabled()).forNoMoreThan(3000).milliseconds(),
				Type.theValue(pwds).into(INPUT_PASSWORD));
	}

	public static DiligenciaCredenciales EnFormulario(String userName, String Password) {
		return Tasks.instrumented(DiligenciaCredenciales.class, userName, Password);

	}


}

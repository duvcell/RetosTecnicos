package com.multiplica.tasks;

import com.multiplica.interactions.DiligenciaCredenciales;
import com.multiplica.interactions.ValidaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.HomePage.BTNL_SIGN_IN;
import static com.multiplica.userinterface.HomePage.BTN_SGN_UP;
import static com.multiplica.userinterface.SignInPage.BTN_LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Task {

	private String users;
	private String pwds;

	public Login(String users, String pwds) {
		this.users = users;
		this.pwds = pwds;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(BTNL_SIGN_IN, isEnabled()),
				Click.on(BTNL_SIGN_IN),
				DiligenciaCredenciales.EnFormulario(users,pwds),
				Click.on(BTN_LOGIN));

		actor.attemptsTo(ValidaHome.Logueado());

	}

	public static Login deUsuario(String user, String pwd) {
		return Tasks.instrumented(Login.class, user, pwd);

	}
}

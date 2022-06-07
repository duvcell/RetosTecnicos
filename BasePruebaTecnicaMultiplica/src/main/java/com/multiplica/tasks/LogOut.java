package com.multiplica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.SignOutPage.BTN_SIGN_OUT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class LogOut implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(BTN_SIGN_OUT, isEnabled()),
				Click.on(BTN_SIGN_OUT));
	}

	public static LogOut deUsuario() {
		return Tasks.instrumented(LogOut.class);

	}
}

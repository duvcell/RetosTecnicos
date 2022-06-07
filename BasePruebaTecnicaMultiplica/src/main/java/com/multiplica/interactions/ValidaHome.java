package com.multiplica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.HomePage.BTN_HOME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ValidaHome implements Interaction {

		public ValidaHome(){
		}

		@Override
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(WaitUntil.the(BTN_HOME, isEnabled()).forNoMoreThan(3000).milliseconds(),
					Click.on(BTN_HOME));
		}

	public static ValidaHome Logueado() {
		return Tasks.instrumented(ValidaHome.class);

	}
}

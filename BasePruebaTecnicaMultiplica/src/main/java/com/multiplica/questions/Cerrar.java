package com.multiplica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.multiplica.userinterface.HomePage.BTN_SGN_UP;

public class Cerrar implements Question<Boolean> {

	public static Cerrar sesionExitosa() {
		return new Cerrar();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return (BTN_SGN_UP.resolveFor(actor).isDisplayed());
	}
}

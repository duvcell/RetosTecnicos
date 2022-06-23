package com.multiplica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.multiplica.userinterface.HomePage.LBL_USER_SIGN_IN;
import static com.multiplica.userinterface.SignOutPage.BTN_SIGN_OUT;


public class BusquedaExitosa implements Question<Boolean> {

	public static BusquedaExitosa enPantallaPrincipal() {
		return new BusquedaExitosa();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return (BTN_SIGN_OUT.resolveFor(actor).isDisplayed());
	}
}
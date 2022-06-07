package com.multiplica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.multiplica.userinterface.UserCreatedPage.LBL_ACCOUNT_CREATED;


public class AutenticacionExitosa implements Question<Boolean> {
    public static AutenticacionExitosa enPantallaPrincipal() {
        return new AutenticacionExitosa();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            return (LBL_ACCOUNT_CREATED.resolveFor(actor).isDisplayed());
    }
}

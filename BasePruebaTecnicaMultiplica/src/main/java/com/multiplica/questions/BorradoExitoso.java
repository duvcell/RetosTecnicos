package com.multiplica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.multiplica.userinterface.SnippetsPage.TXT_SNIPPETS;

public class BorradoExitoso implements Question<Boolean> {

	public static BorradoExitoso delUltimoSnippetCreado() {
		return new BorradoExitoso();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return (TXT_SNIPPETS.resolveFor(actor).isDisabled());
	}
}

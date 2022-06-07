package com.multiplica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.SnippetsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Eliminar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(LNK_BORRAR_SNIPPETS, isEnabled()),
				Click.on(LNK_BORRAR_SNIPPETS));
	}

	public static Eliminar elUltimoSnippet() {
		return Tasks.instrumented(Eliminar.class);

	}
}

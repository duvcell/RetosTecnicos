package com.multiplica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.multiplica.userinterface.SnippetsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Crear implements Task {

	private String texto;

	public Crear(String texto) {
		this.texto = texto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(LNK_CREAR_SNIPPETS, isEnabled()),
				Click.on(LNK_CREAR_SNIPPETS),
				WaitUntil.the(TXT_AREA_SNIPPETS, isEnabled()),
				Type.theValue(texto).into(TXT_AREA_SNIPPETS),
				Click.on(BTN_CREAR_SNIPPETS));

	}

	public static Crear nuevoSnippets(String texto) {
		return Tasks.instrumented(Crear.class, texto);

	}
}

package com.multiplica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Buscar implements Task {
	private String palabra;


	public Buscar(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		/*actor.attemptsTo(WaitUntil.the(BTN_SOURCE, isEnabled()).forNoMoreThan(10000).milliseconds(),
				Click.on(BTN_SOURCE),
				Type.theValue(palabra).into(INPUT_SOURCE).thenHit(Keys.ENTER));*/
	}

	public static Buscar laPalabra(String palabra) {
		return Tasks.instrumented(Buscar.class, palabra);

	}
}

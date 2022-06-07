package com.multiplica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

public class IniciarLaAplicacion implements Task {
	private String url;
	public static WebDriver nChrome;

	public IniciarLaAplicacion(WebDriver Chrome){
		nChrome = Chrome;
	}

	public <T extends Actor> void performAs(T actor) {
		actor.can(BrowseTheWeb.with(nChrome));
		actor.wasAbleTo(Open.url(url));
	}

	public IniciarLaAplicacion yEnLaUrl(String url){
		this.url = url;
		return this;
	}
	public static IniciarLaAplicacion conElNavigator(WebDriver bchrome){
		return Tasks.instrumented(IniciarLaAplicacion.class, bchrome);
	}

}

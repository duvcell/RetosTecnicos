package com.multiplica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SnippetsPage {

	public static final Target LNK_SNIPPETS=
			Target.the("Enlace a Snippets").
					locatedBy("//a[contains(text(),'Snippets')]");

	public static final Target LNK_CREAR_SNIPPETS=
			Target.the("Link para crearun Snippets").
					locatedBy("//*[contains(@href,'/newsnippet.gtl')]");

	public static final Target TXT_AREA_SNIPPETS=
			Target.the("Cuadro de texto para diligenciar Snippets").
					locatedBy("//textarea[@name='snippet']");

	public static final Target BTN_CREAR_SNIPPETS=
			Target.the("Boton crear Snippets").
					locatedBy("//input[@value='Submit']");


	public static final Target LNK_BORRAR_SNIPPETS=
			Target.the("Enlace borrar Snippets").
					locatedBy("//*[contains(@href,'/deletesnippet?index=0')]");

	public static final Target TXT_SNIPPETS=
			Target.the("Enlace borrar Snippets").
					locatedBy("Mi ultimo Snippet777777777777");

}

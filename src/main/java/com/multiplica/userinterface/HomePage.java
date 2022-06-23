package com.multiplica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	public static final Target BTN_HOME =
			Target.the("Botón de Home").
					locatedBy("//a[text()='Home']");

	public static final Target BTN_SGN_UP =
			Target.the("Botón Registrarse").
					locatedBy("//a[text()='Sign up']");

	public static final Target BTNL_SIGN_IN =
			Target.the("Botón Loguearse").
					locatedBy("//a[text()='Sign in']");

	public static final Target LBL_USER_SIGN_IN =
			Target.the("Label Exitoso").
					locatedBy("//*[contains(text(),'UserTes9')]");

}

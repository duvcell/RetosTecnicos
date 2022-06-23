package com.multiplica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignInPage {

	public static final Target BTN_LOGIN =
			Target.the("Botón login para iniciar sesión").
					locatedBy("//input[@value='Login']");

}

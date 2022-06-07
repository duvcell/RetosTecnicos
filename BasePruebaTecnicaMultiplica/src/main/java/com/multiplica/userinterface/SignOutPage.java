package com.multiplica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignOutPage {
	public static final Target BTN_SIGN_OUT =
			Target.the("Botón Cerrar Sesión").
					locatedBy("//a[text()='Sign out']");
}

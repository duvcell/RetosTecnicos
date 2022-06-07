package com.multiplica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignUpPage {

	public static final Target INPUT_USER_NAME =
			Target.the("Campo para diligenciar userName").
					locatedBy("//input[@name='uid']");

	public static final Target INPUT_PASSWORD =
			Target.the("Campo para diligenciar el pwd").
					locatedBy("//input[@name='pw']");


	public static final Target BTN_CREATE_ACCOUNT =
			Target.the("Boton para crear cuenta").
					locatedBy("//input[@value='Create account']");

}

package com.multiplica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UserCreatedPage {

public static final Target LBL_ACCOUNT_CREATED =
		Target.the("Label Exitoso").
				locatedBy("//*[contains(text(),'Account created.')]");
}

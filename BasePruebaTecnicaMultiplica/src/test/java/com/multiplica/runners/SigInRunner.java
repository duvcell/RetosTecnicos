package com.multiplica.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/login.feature"},
		glue = {"com.multiplica.stepdefinitios"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SigInRunner {
}

package com.multiplica.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/registrarse.feature"},
		glue = {"com.multiplica.stepdefinitios"},
		snippets = SnippetType.CAMELCASE
)
public class MainRunner {


}
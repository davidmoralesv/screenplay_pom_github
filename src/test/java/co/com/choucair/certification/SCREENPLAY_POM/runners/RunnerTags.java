package co.com.choucair.certification.SCREENPLAY_POM.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/prueba.feature",
        glue = "co.com.choucair.certification.SCREENPLAY_POM.stepdefinitions")
public class RunnerTags {
}

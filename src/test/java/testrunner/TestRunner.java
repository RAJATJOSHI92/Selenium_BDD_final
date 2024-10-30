package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"/Users/macbookpro/Desktop/Selemium_BDD_final/src/test/resources/Feature"},
        glue = {"stepdefinition","hooks"},
        plugin = {"pretty"}
)
public class TestRunner
{

}
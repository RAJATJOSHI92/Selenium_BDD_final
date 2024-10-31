package parallel;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features ={"/Users/macbookpro/Desktop/Selemium_BDD_final/src/test/resources/Feature/"},
        monochrome = true,
        glue = {"parallel"},
       // tags = "not @skip",
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/",
        }
)

public class ParallelRunner extends AbstractTestNGCucumberTests
{
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

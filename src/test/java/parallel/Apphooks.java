package parallel;

import com.qa.factory.Driverfactory;
import com.qa.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.util.Properties;

public class Apphooks
{
    private ConfigReader config;
    private Driverfactory driverfactory;
    private WebDriver driver;
    Properties prop;

@Before(value = "@skip",order = 0)
public void skip_scenario(Scenario sc)
{
    System.out.println("skipped scenario is"+sc.getName());
    Assume.assumeTrue(false);
}

    @Before(order = 1)
    public void get_property() throws FileNotFoundException {
    config= new ConfigReader();
    prop = config.setconfig();

}

    @Before(order = 2)
    public  void launch_browser()
    {
      String browserName = prop.getProperty("browser");
      driverfactory= new Driverfactory();
      driver=driverfactory.init_browser(browserName);
    }

    @After(order = 0)
    public void quit_browser()
    {
        driver.quit();
    }
    @After(order = 1)
    public void teardown(Scenario scenario)
    {
       if(scenario.isFailed())
        {
            String Screenshot = scenario.getName().replaceAll("", "_");
            byte[] sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcefile,"image/png",Screenshot);
        }
    }
}
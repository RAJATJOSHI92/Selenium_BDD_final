package stepdefinition;

import com.pages.Accountspage;
import com.pages.LoginPage;
import com.qa.factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.qa.factory.Driverfactory.driver;

public class LoginPageSteps {

    LoginPage login = new LoginPage(Driverfactory.getdriver());
    public static String title;

    @Given("user is on login poge")
    public void user_is_on_login_poge() {
        Driverfactory.getdriver().get("https://practice.automationtesting.in/");
    }

    @When("user gets  the tite of the page")
    public void user_gets_the_tite_of_the_page() {
        title = login.get_Title();
        System.out.println("title is " + title);
    }

    @Then("user should get the title {string}")
    public void user_should_get_the_title(String expected) {
        System.out.println("Login Page title is " + title);
        System.out.println("expected is"+expected);
        Assert.assertEquals(title,expected);

    }

    @Given("uuser is on login poge")
    public void uuser_is_on_login_poge() {
        Driverfactory.getdriver().get("https://practice.automationtesting.in/");
    }

    @When("user click on Myaccount Link")
    public void  user_click_on_myaccount_link() {
        login.linkclick();
    }

    @Then("user should naviagte to Myaccount Page")
    public void user_should_naviagte_to_myaccount_page()
    {

        System.out.println("user navigated to my account page");
    }
}



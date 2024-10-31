package parallel;

import com.pages.Accountspage;
import com.pages.LoginPage;
import com.qa.factory.Driverfactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Accountspagesteps {
    Accountspage accounts;
    LoginPage login = new LoginPage(Driverfactory.getdriver());

    @Given("user is on Accounts page")
    public void user_is_on_accounts_page()
    {
        Driverfactory.getdriver().get("https://practice.automationtesting.in/");
        accounts = login.linkclick();
    }


    @When("user enters username and passward")
    public void user_enters_username_and_passward(DataTable dataTable)
    {
        List<Map<String, String>> dt = dataTable.asMaps();
        String usrnm = dt.get(0).get("username");
        String psswrd = dt.get(0).get("passward");
        accounts.dologin(usrnm,psswrd);
    }

    @When("user click on Login button")
    public void user_click_on_login_button()
    {
            accounts.clicklogin();
    }

    @Then("user should be on Landing page")
    public void user_should_be_on_Landing_page()
    {
        System.out.println("user is on Landing Page");
    }


}

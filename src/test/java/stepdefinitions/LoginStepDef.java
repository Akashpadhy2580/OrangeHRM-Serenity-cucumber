package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Dashboard;
import pages.Login;

public class LoginStepDef
{
    @Managed
    protected WebDriver driver;

    @Steps
    Login login;
    Dashboard dashboard;

//    @Steps
//    Dashboard dashboard;

    @Given("i open the browser with url")
    public void i_open_the_browser_with_url() {
        login.open();
    }

    @When("i enter the username  as {string}")
    public void i_enter_the_username_as(String x) {
        login.enterUserName(x);
    }
    @When("i enter password as {string}")
    public void i_enter_password_as(String x) {
        login.enterPassword(x);
    }
    @When("i click login")
    public void i_click_login() {
        login.clickSignin();
    }
    @Then("i should see admin Dashboard")
    public void i_should_see_admin_dashboard() {
        Assert.assertEquals(dashboard.validateDashboard(),"Dashboard");
    }

}

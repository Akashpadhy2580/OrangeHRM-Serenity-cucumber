package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.WebDriver;
import pages.Dashboard;
import pages.Login;
import pages.PIM;

public class EmpRegStepDef
{
    @Managed
    protected WebDriver driver;

    @Steps
    Login login;

    @Steps
    Dashboard dashboard;
    @Steps
    PIM pim;

    @Given("i open browser with url")
    public void i_open_browser_with_url()
    {
        login.open();
    }

    @When("i enter username as {string}")
    public void i_enter_username_as(String string) {
        login.enterUserName("Admin");
    }
    @When("i enter password as {string}")
    public void i_enter_password_as(String string) {
        login.enterPassword("admin123");
    }
    @When("i click login")
    public void i_click_login() {
        login.clickSignin();
    }
    @When("i goto add employee page")
    public void i_goto_add_employee_page() {
        pim.PIM();
        pim.Add_newEmp();
    }
    @When("i enter firstname as {string}")
    public void i_enter_firstname_as(String string) {
        pim.enterFirstName(String x);
    }
    @When("i enter lastname as {string}")
    public void i_enter_lastname_as(String string) {
        pim.enterLastName(String x);
      String Empid= pim.empid.getText();
    }
    @When("i click save")
    public void i_click_save() {

    }
    @When("i click logout")
    public void i_click_logout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("i close browser")
    public void i_close_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

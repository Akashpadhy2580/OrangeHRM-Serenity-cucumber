package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PIM extends PageObject {
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[2]")
    public WebElementFacade pim;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElementFacade addbutton;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElementFacade firstname;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElementFacade lastname;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElementFacade empid;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElementFacade checkbox;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElementFacade username;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElementFacade password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade save;
    @FindBy(xpath = "(//nav[@role='navigation'])[2]/ul/li[2]")
    public WebElementFacade empList;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElementFacade searchId;

    public void PIM() {
        pim.waitUntilPresent().click();
    }

    public void Add_newEmp() {
        addbutton.waitUntilPresent().click();
    }

    public void enterFirstName(String x) {
        firstname.waitUntilPresent().sendKeys(x);
    }

    public void enterLastName(String x) {
        lastname.waitUntilPresent().sendKeys(x);
    }

//    public int getEmpId() {
//        int id= Integer.parseInt(empid.getText());
//        return id;}
    public void setCheckbox() {
        checkbox.click();
    }

    public void enterUsername(String x) {
        username.sendKeys(x);
    }

    public void enterPassword(String x) {
        password.sendKeys(x);
    }

    public void enterconfirmPassword(String x) {
        password.sendKeys(x);
    }

    public void savebutton() {
        save.click();
    }

    public void employeeList() {
        empList.click();
    }

    public void seachemp() {
        searchId.sendKeys(empid.getText());
    }
}

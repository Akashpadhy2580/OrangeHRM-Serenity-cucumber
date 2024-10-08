package pages.PIM;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class AddEmployee extends PageObject {
    @FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']")
    public WebElementFacade addEmployeeNavButton;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    public WebElementFacade addEmployeeHeader;

    @FindBy(xpath = "//label[@class='oxd-label oxd-input-field-required']")
    public WebElementFacade employeeFullNameText;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
    public WebElementFacade firstNameInputBox;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']")
    public WebElementFacade middleNameInputBox;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
    public WebElementFacade lastNameInputBox;

    @FindBy(xpath = "//label[text()='Employee Id']")
    public WebElementFacade employeeIdText;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and .//../preceding-sibling::div/label[text()='Employee Id']]")
    public WebElementFacade employeeIdInputBox;

    @FindBy(xpath = "//p[text()='Create Login Details']/parent::div//child::span")
    public WebElementFacade createLoginDetailsCheckbox;

    @FindBy(xpath = "//label[text()='Username']/parent::div/following-sibling::div/input")
    public WebElementFacade usernameInputBox;

    @FindBy(xpath = "//div[@class='oxd-radio-wrapper']/label[text()='Enabled']/span")
    public WebElementFacade enabledRadioButton;

    @FindBy(xpath = "//div[@class='oxd-radio-wrapper']/label[text()='Disabled']/span")
    public WebElementFacade disabledRadioButton;

    @FindBy(xpath = "//label[text()='Password']/parent::div/following-sibling::div/input")
    public WebElementFacade passwordInputBox;

    @FindBy(xpath = "//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
    public WebElementFacade confirmPasswordInputBox;

    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[@type='submit' and text()=' Save ']")
    public WebElementFacade addEmployeeSaveButton;

    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[@type='button' and text()=' Cancel ']")
    public WebElementFacade addEmployeeCancelButton;


    public void validate_Add_Employee_Nav_Button() {
        Assert.assertTrue("Add Employee Nav button is not clickable",addEmployeeNavButton.waitUntilClickable().isClickable());
    }

    @Step
    public void clickOnAddEmployeeNavButton() {
        validate_Add_Employee_Nav_Button();
        clickOn(addEmployeeNavButton);
    }

    @Step
    public void validate_Add_Employee_Title_Page_Header() {
        Assert.assertEquals("Validated Add Employee Heading is failed","Add Employee",addEmployeeHeader.waitUntilVisible().getText());
    }

    public void validate_First_Name_Input_Box_Is_Present() {
        Assert.assertTrue( "First Name Input Box is not visible",firstNameInputBox.isVisible());

    }

    @Step
    public void enterFirstName(String firstName) {
        validate_First_Name_Input_Box_Is_Present();
        firstNameInputBox.waitUntilPresent().sendKeys(firstName);
    }

    public void validate_Middle_Name_Input_Box_Is_Present() {
        Assert.assertTrue( "Middle Name Input Box is not visible",middleNameInputBox.isVisible());
    }

    @Step
    public void enterMiddleName(String middleName) {
        validate_Middle_Name_Input_Box_Is_Present();
        middleNameInputBox.waitUntilPresent().sendKeys(middleName);
    }

    public void validate_Last_Name_Input_Box_Is_Present() {
        Assert.assertTrue( "Last Name Input Box is not visible",lastNameInputBox.isVisible());
    }

    @Step
    public void enterLastName(String lastName) {
        validate_Last_Name_Input_Box_Is_Present();
        lastNameInputBox.waitUntilPresent().sendKeys(lastName);
    }

    public void validate_Employee_ID_Input_Text_Is_Present() {
        Assert.assertEquals("Validated Employee ID input header is failed","Employee Id",employeeIdText.waitUntilVisible().getText());
    }

    public void validate_Employee_ID_Input_Box_Is_Present() {
        validate_Employee_ID_Input_Text_Is_Present();
        Assert.assertTrue( "Work Email Input Box is not visible",employeeIdInputBox.isVisible());
    }

    @Step
    public void enterEmployeeID(String employeeId) {
        validate_Employee_ID_Input_Box_Is_Present();
        employeeIdInputBox.clear();
        employeeIdInputBox.waitUntilPresent().sendKeys(employeeId);
    }

    @Step
    public void turnOnLoginDetailsCheckbox() {
        Assert.assertTrue( "Create Login Details Checkbox is not enabled",createLoginDetailsCheckbox.isEnabled());
        clickOn(createLoginDetailsCheckbox);
        //clickElement(addEmployeeLocators.createLoginDetailsCheckbox, "Create Login Details Checkbox is on", true, 30);
    }

    @Step
    public void enterUsername(String username) {
        usernameInputBox.waitUntilPresent().sendKeys(username);
    }

//    public void selectStatus(String status) {
//        if(status.equalsIgnoreCase("enabled")) {
//            clickElement(addEmployeeLocators.enabledRadioButton, "Successfully checked enabled", true, 30);
//        } else if(status.equalsIgnoreCase("disabled")) {
//            clickElement(addEmployeeLocators.disabledRadioButton, "Successfully checked disabled", true, 30);
//        } else {
//            logFail("Incorrect data provided", true);
//        }
//    }

    @Step
    public void enterPassword(String password) {
        passwordInputBox.waitUntilPresent().sendKeys(password);
    }

    @Step
    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInputBox.waitUntilPresent().sendKeys(confirmPassword);
    }

    @Step
    public void clickOnSaveButton() {
        addEmployeeSaveButton.waitUntilClickable().click();
    }

    @Step
    public void clickOnCancelButton() {
        addEmployeeCancelButton.waitUntilClickable();
        clickOn(addEmployeeCancelButton);
    }

}

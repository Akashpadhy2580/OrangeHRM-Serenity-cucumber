package pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.junit.Assert;

import java.util.List;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    public WebElementFacade loginHeader;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p' and text()='Username : Admin']")
    public WebElementFacade usernameData;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p' and text()='Password : admin123']")
    public WebElementFacade passwordData;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Username']")
    public WebElementFacade usernameInputText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElementFacade usernameTextBox;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Password']")
    public WebElementFacade passwordInputText;

    @FindBy(xpath = "//input[@name='password']")
    public WebElementFacade passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade loginButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    public WebElementFacade forgotPasswordLink;

    @FindBy(xpath = "(//*[@class='oxd-text oxd-text--p orangehrm-copyright'])[1]")
    public WebElementFacade copyrightText1;

    @FindBy(xpath = "(//*[@class='oxd-text oxd-text--p orangehrm-copyright'])[2]")
    public WebElementFacade copyrightText2;

    @FindBy(xpath = "//div[@class='orangehrm-login-footer-sm']/*")
    public List<WebElementFacade> loginFooterElements;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElementFacade invalidCredentialsErrorMessage;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public List<WebElementFacade> requiredErrorMessage;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    public WebElementFacade dashboardPageHeader;

    @FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']/p[text()='Account disabled']")
    public WebElementFacade accountDisabledErrorMessage;

    @Step
    public void validatePresenceOfLoginPageHeader() {
        Assert.assertEquals("Login",loginHeader.waitUntilVisible().getText());
    }

    @Step
    public void validatePresenceOfUsernameInputHeader() {
        Assert.assertTrue("Username header is not Present",usernameInputText.waitUntilVisible().isPresent());
    }

    @Step
    public void validatePresenceOfPasswordInputHeader() {
        Assert.assertTrue("Password header is not Present",passwordInputText.waitUntilVisible().isPresent());
    }

    @Step
    public void validatePresenceOfUsernameInputField() {
        Assert.assertTrue("Username Text box is not visible",usernameTextBox.waitUntilVisible().isPresent());
    }

    @Step
    public void enterUsername(String username) {
        validatePresenceOfUsernameInputField();
        enter(username).into(usernameTextBox);
    }

    @Step
    public void validatePresenceOfPasswordInputField() {
        Assert.assertTrue("Password Text box is not visible",passwordTextBox.waitUntilVisible().isPresent());
    }

    @Step
    public void enterPassword(String pwd) {
        validatePresenceOfPasswordInputField();
        enter(pwd).into(passwordTextBox);
    }
    @Step
    public void validatePresenceOfLoginButton() {
        Assert.assertTrue("Login Button is not visible",loginButton.waitUntilVisible().isPresent());
    }

    @Step
    public void clickOnLoginButton() {
        validatePresenceOfLoginButton();
        clickOn(loginButton);
    }

    @Step
    public void validatePresenceOfForgotPasswordLink() {
        Assert.assertTrue("Login Button is not visible",forgotPasswordLink.waitUntilVisible().isPresent());
    }

    @Step
    public void validatePresenceOfFooterElements() {
        System.out.println("Size of all footer elements: " + loginFooterElements.size());
    }

    @Step
    public void clickOnForgotPasswordLink() {
        validatePresenceOfForgotPasswordLink();
        clickOn(forgotPasswordLink);
    }

    @Step
    public void validateInvalidCredentialsError() {
        Assert.assertEquals("Invalid credentials",invalidCredentialsErrorMessage.waitUntilVisible().getText());
    }

    @Step
    public void validateRequiredMessageError() {
        System.out.println("Size of required error message errors: " + requiredErrorMessage.size());
        for(WebElementFacade errorMessage: requiredErrorMessage) {
            Assert.assertEquals("Validation of Required error message is unsuccessful","Required",errorMessage.waitUntilVisible().getText());

        }
    }

    @Step
    public void validateAccountDisabledErrorMessage() {
        Assert.assertEquals("Validated the error message - Account disabled is unsuccessful","Account disabled",accountDisabledErrorMessage.waitUntilVisible().getText());
    }

    @Step
    public void validateDashboardPageHeader() {
        Assert.assertTrue("Dashboard page is not visible",dashboardPageHeader.waitUntilVisible().isVisible());
        Assert.assertEquals("Dashboard Page Header Text validation Failed","Dashboard",dashboardPageHeader.waitUntilVisible().getText());
    }
}

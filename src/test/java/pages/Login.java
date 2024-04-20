package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Login extends PageObject {

    @FindBy(name = "username")
    public WebElementFacade userName;

    @FindBy(name = "password")
    public WebElementFacade password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade submit;

    @FindBy(xpath = "//div[@class='orangehrm-login-error']/descendant::div[contains(@class,'error')][2]/p")
    public WebElementFacade errorMessage;

    public void enterUserName(String x)
    {
        userName.waitUntilPresent().sendKeys(x);
    }

    public void enterPassword(String x)
    {
        password.waitUntilPresent().sendKeys(x);
    }

    public void clickSignin()
    {
        submit.waitUntilClickable().click();
    }
    public String validateErrorMessage(){
        return errorMessage.waitUntilPresent().getText();
    }
}

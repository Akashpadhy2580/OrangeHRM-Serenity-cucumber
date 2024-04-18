package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class Dashboard extends PageObject {

    @FindBy(xpath = "//div[@class='oxd-topbar-header']//following::h6")
    public WebElementFacade dashboardText;

    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[1]")
    public WebElementFacade admintab;



    public String validateDashboard()
    {
        dashboardText.waitUntilPresent();
        return dashboardText.getText();
    }

    public void clickAdministrator()
    {
        admintab.waitUntilClickable().click();
    }

}

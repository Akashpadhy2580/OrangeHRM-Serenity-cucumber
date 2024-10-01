package pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class DashboardPage extends PageObject {

    @FindBy(xpath = "//h6[text()='Dashboard']")
    public WebElementFacade dashboardPageHeader;

    @Step
    public void validateDashboardPageHeader() {
        Assert.assertEquals("Dashboard Page Header Text validation Failed", "Dashboard", dashboardPageHeader.waitUntilVisible().getText());
    }

}

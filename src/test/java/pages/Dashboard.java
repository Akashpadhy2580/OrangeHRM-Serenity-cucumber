package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Dashboard {

    @FindBy(xpath = "//div[@class='oxd-topbar-header']//following::h6")
    public WebElementFacade dashboardText;

    public String validateDashboard()
    {
        dashboardText.waitUntilPresent();
        return dashboardText.getText();
    }

}

package pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class SideMenuPage extends PageObject {
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")
    public WebElementFacade adminLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']")
    public WebElementFacade pimLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']")
    public WebElementFacade leaveLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Time']")
    public WebElementFacade timeLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Recruitment']")
    public WebElementFacade recruitmentLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='My Info']")
    public WebElementFacade myInfoLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Performance']")
    public WebElementFacade performanceLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Dashboard']")
    public WebElementFacade dashboardLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Directory']")
    public WebElementFacade directoryLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Maintenance']")
    public WebElementFacade maintenanceLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Claim']")
    public WebElementFacade claimLink;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Buzz']")
    public WebElementFacade buzzLink;

    public void validateAdminLinkIsNotPresentInSideMenu() {
        Assert.assertTrue("AdminLink is not present in Side menu",adminLink.isPresent());
    }

    @Step
    public void clickOnAdminLink() {
        validateAdminLinkIsNotPresentInSideMenu();
        adminLink.waitUntilClickable().click();
    }

    public void validatePIMLinkIsNotPresentInSideMenu() {
        Assert.assertTrue("PIMLink is not present in Side menu",pimLink.isPresent());
    }

    public void clickOnPIMLink() {
        validatePIMLinkIsNotPresentInSideMenu();
        pimLink.waitUntilClickable().click();
    }

    public void clickOnLeaveLink() {
        Assert.assertTrue("leaveLink is not present in Side menu",leaveLink.isPresent());
        leaveLink.waitUntilClickable().click();
    }

    public void clickOnTimeLink() {
        Assert.assertTrue("timeLink is not present in Side menu",timeLink.isPresent());
        timeLink.waitUntilClickable().click();
    }

    public void clickOnRecruitmentLink() {
        validateRecruitmentLinkIsNotPresentInSideMenu();
        recruitmentLink.waitUntilClickable().click();
    }

    public void validateRecruitmentLinkIsNotPresentInSideMenu() {
        Assert.assertTrue("recruitmentLink is not present in Side menu",recruitmentLink.isPresent());
    }

    public void clickOnMyInfoLink() {
        Assert.assertTrue("myInfoLink is not present in Side menu",myInfoLink.isPresent());
        myInfoLink.waitUntilClickable().click();
    }

    public void clickOnPerformanceLink() {
        Assert.assertTrue("performanceLink is not present in Side menu",performanceLink.isPresent());
        performanceLink.waitUntilClickable().click();
    }

    public void clickOnDashboardLink() {
        Assert.assertTrue("dashboardLink is not present in Side menu",dashboardLink.isPresent());
        dashboardLink.waitUntilClickable().click();
    }

    public void clickOnDirectoryLink() {
        Assert.assertTrue("directoryLink is not present in Side menu",directoryLink.isPresent());
        directoryLink.waitUntilClickable().click();
    }

    public void clickOnMaintenanceLink() {
        validateMaintenanceLinkIsNotPresentInSideMenu();
        maintenanceLink.waitUntilClickable().click();
    }

    public void validateMaintenanceLinkIsNotPresentInSideMenu() {
        Assert.assertTrue("maintenanceLink is not present in Side menu",maintenanceLink.isPresent());
    }

    public void clickOnClaimLink() {
        Assert.assertTrue("claimLink is not present in Side menu",claimLink.isPresent());
        claimLink.waitUntilClickable().click();
    }

    public void clickOnBuzzLink() {
        Assert.assertTrue("buzzLink is not present in Side menu",buzzLink.isPresent());
        buzzLink.waitUntilClickable().click();
    }

    public void validateAdminMenuIsPresent() {
        Assert.assertTrue("adminLink is not Present in Side menu",adminLink.isPresent());
    }

    public void validatePIMMenuIsPresent() {
        Assert.assertTrue("PIM Link is not Present in Side menu",pimLink.isPresent());
    }

    public void validateRecruitmentMenuIsPresent() {
        Assert.assertTrue("Recruitment Link is not Present in Side menu", recruitmentLink.isPresent());
    }

    public void validateMaintenanceMenuIsPresent() {
        Assert.assertTrue("Maintenance Link is not Present in Side menu", maintenanceLink.isPresent());
    }
}

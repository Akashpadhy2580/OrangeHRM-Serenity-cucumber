package pages;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;

public class UserMenuPage extends PageObject {
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    public WebElementFacade userMenu;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/img[@alt='profile picture']")
    public WebElementFacade profilePicture;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/p[@class='oxd-userdropdown-name']")
    public WebElementFacade nameOfUser;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    public WebElementFacade userDropdown;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']")
    public WebElementFacade userDropdownMenu;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/*")
    public List<WebElementFacade> userDropdownMenuItems;

    @FindBy(xpath = "//a[@class='oxd-userdropdown-link' and text()='Logout']")
    public WebElementFacade logoutLink;

    @Step
    public void validateUserMenuIsPresent() {
        Assert.assertTrue("UserMenu is not present",userMenu.isPresent());
    }

    @Step
    public void validateProfilePictureIsPresent() {
        Assert.assertTrue("ProfilePicture is not present",profilePicture.isPresent());
    }

    @Step
    public void validateUserDropdownIsPresent() {
        Assert.assertTrue("User Dropdown is not present",userDropdown.isPresent());
    }

    @Step
    public void clickOnUserDropdown() {
        validateUserDropdownIsPresent();
        userDropdown.waitUntilClickable().click();
    }

    @Step
    public void clickOnLogoutMenuOption() {
        logoutLink.waitUntilClickable().click();
    }
}

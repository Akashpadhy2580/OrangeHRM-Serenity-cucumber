package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PIM extends PageObject
{
    @FindBy(xpath ="//div[@class='oxd-sidepanel-body']/ul/li[2]")
    public WebElementFacade pim;
    @FindBy(xpath="(//button[@type='button'])[4]")
    public WebElementFacade addbutton;
    @FindBy(xpath="//input[@name='firstName']")
    public WebElementFacade firstname;
    @FindBy(xpath="//input[@name='lastName']")
    public WebElementFacade lastname;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElementFacade empid;


}

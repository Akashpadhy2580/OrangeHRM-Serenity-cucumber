package pages.PIM.EmployeeList;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class ContactDetails extends PageObject {

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Street 1']")
    public WebElementFacade street1InputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Street 1']]")
    public WebElementFacade street1Input;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Street 2']")
    public WebElementFacade street2InputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Street 2']]")
    public WebElementFacade street2Input;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='City']")
    public WebElementFacade cityInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='City']]")
    public WebElementFacade cityInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='State/Province']")
    public WebElementFacade stateInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='State/Province']]")
    public WebElementFacade stateInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Zip/Postal Code']")
    public WebElementFacade zipInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Zip/Postal Code']]")
    public WebElementFacade zipInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Country']")
    public WebElementFacade countryInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Country']]")
    public WebElementFacade countryInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Home']")
    public WebElementFacade homeInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Home']]")
    public WebElementFacade homeInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Mobile']")
    public WebElementFacade mobileInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Mobile']]")
    public WebElementFacade mobileInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Work']")
    public WebElementFacade workInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Work']]")
    public WebElementFacade workInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Work Email']")
    public WebElementFacade workEmailInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Work Email']]")
    public WebElementFacade workEmailInput;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Other Email']")
    public WebElementFacade otherEmailInputHeader;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Other Email']]")
    public WebElementFacade otherEmailInput;
    @FindBy(xpath =  "//button[text()=' Save ']")
    public WebElementFacade saveButton;

    public void validate_Street1_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Street1 input header is failed",street1InputHeader.waitUntilVisible().getText(),"Street1");
    }

    public void validate_Street1_Input_Box_Is_Present() {
        validate_Street1_Input_Text_Is_Present();
        Assert.assertTrue("Validation Street1 input text box is failed",street1Input.isPresent());
    }

    @Step
    public void enterStreet1(String street1) {
        validate_Street1_Input_Box_Is_Present();
        street1Input.waitUntilPresent().sendKeys(street1);
    }

    public void validate_Street2_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Street2 input header is failed",street2InputHeader.waitUntilVisible().getText(),"Street2");
    }

    public void validate_Street2_Input_Box_Is_Present() {
        validate_Street2_Input_Text_Is_Present();
        Assert.assertTrue("Validation Street2 input text box is failed",street2Input.isPresent());
    }

    @Step
    public void enterStreet2(String street2) {
        validate_Street2_Input_Box_Is_Present();
        street2Input.waitUntilPresent().sendKeys(street2);
    }

    public void validate_City_Input_Text_Is_Present() {
        Assert.assertEquals("Validation City input header is failed",cityInputHeader.waitUntilVisible().getText(),"City");
    }

    public void validate_City_Input_Box_Is_Present() {
        validate_City_Input_Text_Is_Present();
        Assert.assertTrue("Validation City input text box is failed",cityInput.isPresent());
    }

    @Step
    public void enterCity(String city) {
        validate_City_Input_Box_Is_Present();
        cityInput.waitUntilPresent().sendKeys(city);
    }

    public void validate_State_Input_Text_Is_Present() {
        Assert.assertEquals("Validation State/Province input header is failed",stateInputHeader.waitUntilVisible().getText(),"State/Province");
    }

    public void validate_State_Input_Box_Is_Present() {
        validate_State_Input_Text_Is_Present();
        Assert.assertTrue("Validation State input text box is failed",stateInput.isPresent());
    }

    @Step
    public void enterState(String state) {
        validate_State_Input_Box_Is_Present();
        stateInput.waitUntilPresent().sendKeys(state);
    }

    public void validate_Zip_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Zip/Postal Code input header is failed",zipInputHeader.waitUntilVisible().getText(),"Zip/Postal Code");
    }

    public void validate_Zip_Input_Box_Is_Present() {
        validate_Zip_Input_Text_Is_Present();
        Assert.assertTrue("Validation Zip input text box is failed",zipInput.isPresent());
    }

    @Step
    public void enterZip(String zip) {
        validate_Zip_Input_Box_Is_Present();
        zipInput.waitUntilPresent().sendKeys(zip);
    }

    public void validate_Country_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Country input header is failed",countryInputHeader.waitUntilVisible().getText(),"Country");
    }

    public void validate_Country_Input_Box_Is_Present() {
        validate_Country_Input_Text_Is_Present();
        Assert.assertTrue("Validation Country input text box is failed",countryInput.isPresent());
    }

    @Step
    public void enterCountry(String country) {
        validate_Country_Input_Box_Is_Present();
        countryInput.waitUntilPresent().sendKeys(country);
    }

    public void validate_Home_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Home input header is failed",homeInputHeader.waitUntilVisible().getText(),"Home");
    }

    public void validate_Home_Input_Box_Is_Present() {
        validate_Home_Input_Text_Is_Present();
        Assert.assertTrue("Validation Home input text box is failed",homeInput.isPresent());
    }

    @Step
    public void enterHome(String home) {
        validate_Home_Input_Box_Is_Present();
        homeInput.waitUntilPresent().sendKeys(home);
    }

    public void validate_Mobile_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Mobile input header is failed",mobileInputHeader.waitUntilVisible().getText(),"Mobile");
    }

    public void validate_Mobile_Input_Box_Is_Present() {
        validate_Mobile_Input_Text_Is_Present();
        Assert.assertTrue("Validation Mobile input text box is failed",mobileInput.isPresent());
    }

    @Step
    public void enterMobile(String mobile) {
        validate_Mobile_Input_Box_Is_Present();
        mobileInput.waitUntilPresent().sendKeys(mobile);
    }

    public void validate_Work_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Work input header is failed",workInputHeader.waitUntilVisible().getText(),"Work");
    }

    public void validate_Work_Input_Box_Is_Present() {
        validate_Work_Input_Text_Is_Present();
        Assert.assertTrue("Validation Work input text box is failed",workInput.isPresent());
    }

    @Step
    public void enterWork(String work) {
        validate_Work_Input_Box_Is_Present();
        workInput.waitUntilPresent().sendKeys(work);
    }

    public void validate_Work_Email_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Work email input header is failed",workEmailInputHeader.waitUntilVisible().getText(),"Work Email");
    }

    public void validate_Work_Email_Input_Box_Is_Present() {
        validate_Work_Email_Input_Text_Is_Present();
        Assert.assertTrue("Validation Work email input text box is failed",workEmailInput.isPresent());
    }

    @Step
    public void enterWorkEmail(String workEmail) {
        validate_Work_Email_Input_Box_Is_Present();
        workEmailInput.waitUntilPresent().sendKeys(workEmail);
    }

    public void validate_Other_Email_Input_Text_Is_Present() {
        Assert.assertEquals("Validation Other email input header is failed",otherEmailInputHeader.waitUntilVisible().getText(),"Other Email");
    }

    public void validate_Other_Email_Input_Box_Is_Present() {
        validate_Other_Email_Input_Text_Is_Present();
        Assert.assertTrue("Validation Other email input text box is failed",otherEmailInput.isPresent());
    }

    @Step
    public void enterOtherEmail(String otherEmail) {
        validate_Other_Email_Input_Box_Is_Present();
        otherEmailInput.waitUntilPresent().sendKeys(otherEmail);
    }

    @Step
    public void clickOnSaveButton() {
        saveButton.waitUntilEnabled().waitUntilClickable().click();
    }
}

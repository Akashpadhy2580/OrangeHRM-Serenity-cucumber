package pages.PIM.EmployeeList;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalDetails extends PageObject {

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title' and text()='Personal Details']")
    public WebElementFacade personalDetailsHeader;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 --strong']")
    public WebElementFacade nameOfUser;

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

    @FindBy(xpath = "//label[text()='Other Id']")
    public WebElementFacade otherIdInputText;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and .//../preceding-sibling::div/label[text()='Other Id']]")
    public WebElementFacade otherIdInputBox;

    @FindBy(xpath = "//label[text()='Driver License Number']")
    public WebElementFacade driverLicenseNumberInputText;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and .//../preceding-sibling::div/label[text()='Driver License Number']]")
    public WebElementFacade driverLicenseNumberInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade saveButton;

    @FindBy(xpath = "//label[text()='Nationality']")
    public WebElementFacade nationalityInputText;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Nationality']]")
    public WebElementFacade nationalityDropdown;

    @FindBy(xpath = "//label[text()='Marital Status']")
    public WebElementFacade maritalStatusInputText;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Marital Status']]")
    public WebElementFacade maritalStatusDropdown;

    @FindBy(xpath = "//div[@role='listbox']/*")
    public List<WebElementFacade> dropdownListElements;

    @FindBy(xpath = "//label[text()='License Expiry Date']")
    public WebElementFacade licenseExpiryDateInputText;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and .//../../../preceding-sibling::div/label[text()='License Expiry Date']]")
    public WebElementFacade licenseExpiryDateInputBox;

    @FindBy(xpath = "//label[text()='Date of Birth']")
    public WebElementFacade dateOfBirthInputText;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and .//../../../preceding-sibling::div/label[text()='Date of Birth']]")
    public WebElementFacade dateOfBirthInputBox;

    @FindBy(xpath = "//label[text()='Gender']")
    public WebElementFacade genderInputText;

    @FindBy(xpath = "//input[@type='radio' and ./parent::label[text()='Male']]")
    public WebElementFacade maleRadioButton;

    @FindBy(xpath = "//input[@type='radio' and ./parent::label[text()='Female']]")
    public WebElementFacade femaleRadioButton;

    @FindBy(xpath = "(//div[@class='oxd-radio-wrapper'])[1]/label[text()='Male']")
    public WebElementFacade maleRadioButtonText;

    @FindBy(xpath = "(//div[@class='oxd-radio-wrapper'])[1]/label[text()='Female']")
    public WebElementFacade femaleRadioButtonText;

    @FindBy(xpath = "//p[text()=' * Required']")
    public WebElementFacade requiredText;

    @FindBy(xpath = "//h6[text()='Custom Fields']")
    public WebElementFacade customFieldsText;

    @FindBy(xpath = "//h6[text()='Attachments']")
    public WebElementFacade attachmentsHeader;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text' and ./preceding-sibling::h6[text()='Attachments']]")
    public WebElementFacade attachmentsAddButton;

    @FindBy(xpath = "//label[text()='Select File']")
    public WebElementFacade selectFileInputText;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-input-hint' and text()='Accepts upto 1 MB']")
    public WebElementFacade acceptsUpTo1MBText;

    @FindBy(xpath = "//label[text()='Comment']")
    public WebElementFacade commentInputText;

    @FindBy(xpath = "//div[@class='oxd-file-button' and text()='Browse']")
    public WebElementFacade browseButton;

    @FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
    public WebElementFacade uploadIcon;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    public WebElementFacade commentBox;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost' and text()=' Cancel ']")
    public WebElementFacade cancelButton;

    public void validate_Personal_Details_Header() {
        Assert.assertTrue("navigate to Personal Details Page is failed",personalDetailsHeader.isVisible());
    }

    public void validate_All_Headers_And_Input_Boxes_In_Personal_Details_Page() {
        Map<WebElementFacade, String> inputHeaders = new HashMap<>();
        inputHeaders.put(employeeFullNameText, "Employee Full Name");
        inputHeaders.put(employeeIdText, "Employee Id");
        inputHeaders.put(otherIdInputText, "Other Id");
        inputHeaders.put(driverLicenseNumberInputText, "Driver's License Number");
        inputHeaders.put(licenseExpiryDateInputText, "License Expiry Date");
        inputHeaders.put(nationalityInputText, "Nationality");
        inputHeaders.put(maritalStatusInputText, "Marital Status");
        inputHeaders.put(dateOfBirthInputText, "Date of Birth");
        inputHeaders.put(genderInputText, "Gender");
        inputHeaders.put(maleRadioButtonText, "Male Radio Button");
        inputHeaders.put(femaleRadioButtonText, "Female Radio Button");
        inputHeaders.put(requiredText, " * Required");
        inputHeaders.put(customFieldsText, "Custom Fields");
        inputHeaders.put(attachmentsHeader, "Attachments");
        inputHeaders.put(selectFileInputText, "Select File");
        inputHeaders.put(acceptsUpTo1MBText, "Accepts upto 1 MB");


        for (Map.Entry<WebElementFacade, String> entry : inputHeaders.entrySet()) {
            Assert.assertEquals("validation All Headers And Input Boxes In Personal Details Page is failed",entry.getValue(), entry.getKey().getText());
        }

        Map<WebElementFacade, String> inputBoxes = new HashMap<>();
        inputBoxes.put(firstNameInputBox, "First Name Input Box");
        inputBoxes.put(middleNameInputBox, "Middle Name Input Box");
        inputBoxes.put(lastNameInputBox, "Last Name Input Box");
        inputBoxes.put(employeeIdInputBox, "Employee Id Input Box");
        inputBoxes.put(otherIdInputBox, "Other ID input box");
        inputBoxes.put(driverLicenseNumberInputBox, "Driver's license number input box");
        inputBoxes.put(nationalityDropdown, "Nationality Dropdown");
        inputBoxes.put(maritalStatusDropdown, "Marital Status Dropdown");
        inputBoxes.put(dateOfBirthInputBox, "Date Of Birth Input Box");
        inputBoxes.put(maleRadioButton, "Male Radio Button");
        inputBoxes.put(femaleRadioButton, "Female Radio Button");
        inputBoxes.put(saveButton, "Save button");
        inputBoxes.put(browseButton, "Browse button");
        inputBoxes.put(uploadIcon, "Upload icon");
        inputBoxes.put(commentBox, "Comment Input Box");


        for (Map.Entry<WebElementFacade, String> entry : inputBoxes.entrySet()) {
            Assert.assertTrue(entry.getKey()+" is not visible", entry.getKey().isVisible());
        }
    }

    public void validate_Name_Of_User_Is_Shown_Correctly() {
        String nameofUser = nameOfUser.getText();
        String firstName =firstNameInputBox.getText();
        String lastName =lastNameInputBox.getText();

        String fullName = firstName + lastName;
        Assert.assertEquals("Name of the user is not shown correctly in the Personal details page",nameofUser,fullName);
    }

    public void enterEmployeeFullName(String firstName, String middleName, String lastName) {
        firstNameInputBox.waitUntilPresent().sendKeys(firstName);
        middleNameInputBox.waitUntilPresent().sendKeys(middleName);
        lastNameInputBox.waitUntilPresent().sendKeys(lastName);
    }

    public void enterEmployeeId(String employeeId) {
        employeeIdInputBox.waitUntilPresent().sendKeys(employeeId);
    }

    public void enterOtherID(String otherId) {
        otherIdInputBox.waitUntilPresent().sendKeys(otherId);
    }

    public void enterDriverLicenseNumber(String licenseNumber) {
        driverLicenseNumberInputBox.waitUntilPresent().sendKeys(licenseNumber);
    }

    public void enterLicenseExpiryDate(String licenseExpiryDate) {
        licenseExpiryDateInputBox.waitUntilPresent().sendKeys(licenseExpiryDate);
    }

    public void select_Nationality_Option_From_Dropdown(String nationality) {
        nationalityDropdown.waitUntilClickable().click();
        clickOn(nationalityDropdown.findElement(By.xpath("parent::div/following-sibling::div/div/span[text()='"+nationality+"']")));
    }

    public void select_Marital_Status_From_Dropdown(String maritalStatus) {
        maritalStatusDropdown.waitUntilClickable().click();
        clickOn(maritalStatusDropdown.findElement(By.xpath("parent::div/following-sibling::div/div/span[text()='"+maritalStatus+"']")));
    }

    public void selectGender(String gender) {
        if(gender.equalsIgnoreCase("Male")) {
            maleRadioButton.waitUntilClickable().click();
        } else if(gender.equalsIgnoreCase("Female")) {
            femaleRadioButton.waitUntilClickable().click();
        }
    }

    public void clickOnSaveButton() {
        saveButton.waitUntilClickable().click();
    }

    public void clickOnCancelButton() {
        cancelButton.waitUntilClickable().click();
    }

    public void clickOnAddAttachmentButton() {
        attachmentsAddButton.waitUntilClickable().click();
    }

    public void enterComment(String comment) {
        commentBox.waitUntilPresent().sendKeys(comment);
    }
}

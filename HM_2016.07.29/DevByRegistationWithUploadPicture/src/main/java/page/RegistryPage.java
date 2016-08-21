package page;

import helpers.Locators;
import helpers.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistryPage {
    public static final By USERNAME = Locators.get("UserName");
    public static final By EMAIL = Locators.get("UserEmail");
    public static final By PASSWORD = Locators.get("Password");
    public static final By PASSWORD_CONFIRMATION = Locators.get("PasswordConfirmation");
    public static final By FIRSTNAME = Locators.get("UserFirstName");
    public static final By LASTNAME = Locators.get("UserLastName");
    public static final By CURRENT_POSITION = Locators.get("UserCurrentPosition");
    public static final By COMPANY_DROPDOWN_LABEL = Locators.get("UserCompanyDropDownLabel");
    public static final By COMPANY_DROPDOWN_INPUT = Locators.get("UserCompanyDropDownInput");
    public static final By COMPANY_DROPDOWN_RESULT_ITEM = Locators.get("UserCompanyDropDownResult");
    public static final By AGREE_CHECKBOX = Locators.get("AgreedWithCheckbox");
    public static final By SUBMIT_BUTTON = Locators.get("SubmitBlueButton");
    public static final By SelectSex = Locators.get("SelectSex");
    public static final By UpLoadAvatar = Locators.get("UpLoadAvatar");


    public static void PopulateRegistryForm(WebDriver driver, RegistrationData data) {

        driver.findElement(SelectSex).click();
        driver.findElement(UpLoadAvatar).sendKeys("J:\\Upload.jpg");
        driver.findElement(USERNAME).sendKeys(data.username);
        driver.findElement(EMAIL).sendKeys(data.email);
        driver.findElement(PASSWORD).sendKeys(data.password);
        driver.findElement(PASSWORD_CONFIRMATION).sendKeys(data.confirmPassword);
        driver.findElement(FIRSTNAME).sendKeys(data.firstName);
        driver.findElement(LASTNAME).sendKeys(data.lastName);
        driver.findElement(CURRENT_POSITION).sendKeys(data.currentPosition);
        SelectCompany(data.company, driver);
        if (data.isAgree == true){
            driver.findElement(AGREE_CHECKBOX).click();
        }

        driver.findElement(SUBMIT_BUTTON).click();
    }

    public static void SelectCompany(String company, WebDriver driver) {
        driver.findElement(COMPANY_DROPDOWN_LABEL).click();
        driver.findElement(COMPANY_DROPDOWN_INPUT).sendKeys(company);
        driver.findElement(COMPANY_DROPDOWN_RESULT_ITEM).click();
    }
}

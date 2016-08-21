package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompaniesPage {
    private static final By ISSOFT_COMPANY = By.cssSelector("#tablesort [data='ISsoft']");

    public static boolean isIsSoftCompanyPresentInTable(WebDriver driver){
        WebElement isSoftCompany = driver.findElement(ISSOFT_COMPANY);

        if (!isSoftCompany.isDisplayed()){
            return false;
        }
        return true;
    }
}

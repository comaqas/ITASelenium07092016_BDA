package pages;


import blocks.NavigationMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class CompaniesPage {
    private NavigationMenuBlock navigationMenuBlock;
    private static final By ISSOFT_COMPANY = By.cssSelector("#tablesort [data='ISsoft']");

    public CompaniesPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void CompaniesButtonClick(){
        navigationMenuBlock.companiesButtonClick();
    }
    public boolean isIsSoftCompanyPresentInTable(WebDriver driver){
        WebElement isSoftCompany = driver.findElement(ISSOFT_COMPANY);

        if (!isSoftCompany.isDisplayed()){
            return false;
        }
        return true;
    }
}

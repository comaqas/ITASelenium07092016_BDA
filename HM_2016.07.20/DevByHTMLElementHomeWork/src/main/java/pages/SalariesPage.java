package pages;


import blocks.NavigationMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class SalariesPage {

    private NavigationMenuBlock navigationMenuBlock;
    private static final By SALARY_IN_IT_TEXT = By.cssSelector(".input.info-count>h3");

    public SalariesPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void SalariesButtonClick(){
        navigationMenuBlock.salariesButtonClick();
    }

    public boolean isSalaryTextPresent(WebDriver driver){
        WebElement salaryInItText = driver.findElement(SALARY_IN_IT_TEXT);

        if(!salaryInItText.getText().equals("Зарплата в ИТ")){
            return false;
        }
        return true;
    }
}

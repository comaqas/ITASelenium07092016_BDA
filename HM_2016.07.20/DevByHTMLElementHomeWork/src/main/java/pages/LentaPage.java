package pages;


import blocks.NavigationMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class LentaPage {
    private NavigationMenuBlock navigationMenuBlock;
    private static final By LOGO = By.className("header-logo");

    public LentaPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void  lentaButtonClick(){
        navigationMenuBlock.lentaButtonClick();
    }

    public boolean isLogoPresent(WebDriver driver){
        WebElement logo = driver.findElement(LOGO);

        if(!logo.isDisplayed()){
            return false;
        }
        return true;
    }
}

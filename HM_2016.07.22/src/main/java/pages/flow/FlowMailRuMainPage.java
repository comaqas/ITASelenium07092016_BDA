package pages.flow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FlowMailRuMainPage {
    private final By PLACEHOLDERLOGIN = By.xpath("//input[@id='mailbox__login']");
    private final By PLACEHOLDERPASSWORD = By.xpath("//input[@id='mailbox__password']");
    private final By BUTTONLOGIN = By.xpath("//input[@id='mailbox__auth__button']");

    private WebDriver driver;

    public FlowMailRuMainPage(WebDriver driver){
        this.driver = driver;
    }
    public FlowMailRuMainPage InputLoginText(String LoginText) {
        WebElement placeholderlogin = driver.findElement(PLACEHOLDERLOGIN);
        placeholderlogin.sendKeys(LoginText);
        return this;
    }

    public FlowMailRuMainPage InputPasswordText(String PasswordText) {

        WebElement placeholderpassword = driver.findElement(PLACEHOLDERPASSWORD);
        placeholderpassword.sendKeys(PasswordText);
        return this;
    }
    public FlowMailRuMainPage ClickButtonLogIn() {
        WebElement buttonLogIn = driver.findElement(BUTTONLOGIN);
        buttonLogIn.click();
        return this;
    }
}

package pages.dynamic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicMailRuMainPage {
    private final By PLACEHOLDERLOGIN = By.xpath("//input[@id='mailbox__login']");
    private final By PLACEHOLDERPASSWORD = By.xpath("//input[@id='mailbox__password']");
    private final By BUTTONLOGIN = By.xpath("//input[@id='mailbox__auth__button']");

    private WebDriver driver;

    public DynamicMailRuMainPage(WebDriver driver){
        this.driver = driver;
    }

    public void LogIn(String LoginText, String PasswordText) {
        WebElement placeholderlogin = driver.findElement(PLACEHOLDERLOGIN);
        placeholderlogin.sendKeys(LoginText);

        WebElement placeholderpassword = driver.findElement(PLACEHOLDERPASSWORD);
        placeholderpassword.sendKeys(PasswordText);

        WebElement buttonLogIn = driver.findElement(BUTTONLOGIN);
        buttonLogIn.click();
    }
}

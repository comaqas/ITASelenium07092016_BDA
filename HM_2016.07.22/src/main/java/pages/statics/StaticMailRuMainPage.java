package pages.statics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticMailRuMainPage {
    private static final By PLACEHOLDERLOGIN = By.xpath("//input[@id='mailbox__login']");
    private static final By PLACEHOLDERPASSWORD = By.xpath("//input[@id='mailbox__password']");
    private static final By BUTTONLOGIN = By.xpath("//input[@id='mailbox__auth__button']");

    public static void LogIn(WebDriver driver, String LoginText, String PasswordText) {
        WebElement placeholderlogin = driver.findElement(PLACEHOLDERLOGIN);
        placeholderlogin.sendKeys(LoginText);

        WebElement placeholderpassword = driver.findElement(PLACEHOLDERPASSWORD);
        placeholderpassword.sendKeys(PasswordText);

        WebElement buttonLogIn = driver.findElement(BUTTONLOGIN);
        buttonLogIn.click();
    }
}

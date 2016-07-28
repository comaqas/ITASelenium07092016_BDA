package pages.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryMailRuMainPage {

    @FindBy(xpath = "//input[@id='mailbox__login']")
    private WebElement PLACEHOLDERLOGIN;

    @FindBy (xpath = "//input[@id='mailbox__password']")
    private WebElement PLACEHOLDERPASSWORD;

    @FindBy (xpath = "//input[@id='mailbox__auth__button']")
    private WebElement BUTTONLOGIN;

    public void LogIn(String LoginText, String PasswordText) {

        PLACEHOLDERLOGIN.sendKeys(LoginText);

        PLACEHOLDERPASSWORD.sendKeys(PasswordText);

        BUTTONLOGIN.click();
    }

}

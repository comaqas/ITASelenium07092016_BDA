package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;


public class PageFactory {

    @FindBy(xpath = "//input[@id='mailbox__login']")
    private WebElement PLACEHOLDERLOGIN;

    @FindBy (xpath = "//input[@id='mailbox__password']")
    private WebElement PLACEHOLDERPASSWORD;

    @FindBy (xpath = "//input[@id='mailbox__auth__button']")
    private WebElement BUTTONLOGIN;

    @FindBy (xpath = "//span[text()='Входящие']")
    private WebElement INBOXMAILMENU;

    @FindBy (xpath = "//div[@data-name='next']")
    private WebElement TURNPAGEBUTTON;


    public void LogIn(String LoginText, String PasswordText) {

        PLACEHOLDERLOGIN.sendKeys(LoginText);

        PLACEHOLDERPASSWORD.sendKeys(PasswordText);

        BUTTONLOGIN.click();

        INBOXMAILMENU.click();

    }
    public void MailCalculator(WebDriver driver){
        int page = 0;
        while(true){
            List<WebElement> LetterCountCalc = driver.findElements(By.xpath("//div[@data-bem='b-datalist__item']"));
            System.out.println("The " + page + " page is contains " +LetterCountCalc.size() + " letters");
            page++;
            if (!TURNPAGEBUTTON.getAttribute("class").contains("b-toolbar__btn_disabled")) {
               TURNPAGEBUTTON.click();
            } else {
                break;
            }

        }
    }
    public void HelperAssert (WebDriver driver, String AssertText){
        Assert.assertEquals(driver.getTitle(), AssertText);

    }
}

package pages.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class PageFlow {

    private final By PLACEHOLDERLOGIN = By.xpath("//input[@id='mailbox__login']");
    private final By PLACEHOLDERPASSWORD = By.xpath("//input[@id='mailbox__password']");
    private final By BUTTONLOGIN = By.xpath("//input[@id='mailbox__auth__button']");
    private final By INBOXMAILMENU = By.xpath("//span[text()='Входящие']");
    private final By TURNPAGEBUTTON = By.xpath("//div[@data-name='next']");
    private final By LETTERCOUNT = By.xpath("//div[@data-bem='b-datalist__item']");


    private WebDriver driver;

    public PageFlow(WebDriver driver) {
        this.driver = driver;
    }

    public PageFlow InputLoginText(String LoginText) {
        WebElement placeholderlogin = driver.findElement(PLACEHOLDERLOGIN);
        placeholderlogin.sendKeys(LoginText);
        return this;
    }

    public PageFlow InputPasswordText(String PasswordText) {

        WebElement placeholderpassword = driver.findElement(PLACEHOLDERPASSWORD);
        placeholderpassword.sendKeys(PasswordText);
        return this;
    }
    public PageFlow ClickButtonLogIn() {
        WebElement buttonLogIn = driver.findElement(BUTTONLOGIN);
        buttonLogIn.click();
        return this;
    }
    public PageFlow SelectInboxMailMenu(){
        WebElement InboxMail = driver.findElement(INBOXMAILMENU);
        InboxMail.click();
        return this;
    }
    public PageFlow MailCalculator(){
        int page = 0;
        while(true){
            List<WebElement> LetterCountCalc = driver.findElements(LETTERCOUNT);
            System.out.println("The " + page + " page is contains " +LetterCountCalc.size() + " letters");
            page++;
            if (!driver.findElement(TURNPAGEBUTTON).getAttribute("class").contains("b-toolbar__btn_disabled")) {
                driver.findElement(TURNPAGEBUTTON).click();
            } else {
                break;
            }

        }
        return this;
    }

    public PageFlow HelperAssert (String AssertText){
        Assert.assertEquals(driver.getTitle(), AssertText);
        return this;
    }

}

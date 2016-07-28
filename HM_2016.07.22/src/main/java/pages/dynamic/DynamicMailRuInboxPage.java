package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PageDynamic {
    private final By PLACEHOLDERLOGIN = By.xpath("//input[@id='mailbox__login']");
    private final By PLACEHOLDERPASSWORD = By.xpath("//input[@id='mailbox__password']");
    private final By BUTTONLOGIN = By.xpath("//input[@id='mailbox__auth__button']");
    private final By INBOXMAILMENU = By.xpath("//span[text()='Входящие']");
    private final By TURNPAGEBUTTON = By.xpath("//div[@data-name='next']");
    private final By LETTERCOUNT = By.xpath("//div[@data-bem='b-datalist__item']");

    private WebDriver driver;

    public PageDynamic(WebDriver driver) {
        this.driver = driver;
    }
    public void LogIn(String LoginText, String PasswordText){
        WebElement placeholderlogin = driver.findElement(PLACEHOLDERLOGIN);
        placeholderlogin.sendKeys(LoginText);

        WebElement placeholderpassword = driver.findElement(PLACEHOLDERPASSWORD);
        placeholderpassword.sendKeys(PasswordText);

        WebElement buttonLogIn = driver.findElement(BUTTONLOGIN);
        buttonLogIn.click();

        WebElement InboxMail = driver.findElement(INBOXMAILMENU);
        InboxMail.click();

    }
    public void MailCalculator(){
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
    }
    public void HelperAssert (String AssertText){
        Assert.assertEquals(driver.getTitle(), AssertText);

    }
}

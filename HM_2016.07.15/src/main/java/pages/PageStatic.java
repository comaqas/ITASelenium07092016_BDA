package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;



public class PageStatic {
    private static final By PLACEHOLDERLOGIN = By.xpath("//input[@id='mailbox__login']");
    private static final By PLACEHOLDERPASSWORD = By.xpath("//input[@id='mailbox__password']");
    private static final By BUTTONLOGIN = By.xpath("//input[@id='mailbox__auth__button']");
    private static final By INBOXMAILMENU = By.xpath("//span[text()='Входящие']");
    private static final By TURNPAGEBUTTON = By.xpath("//div[@data-name='next']");
    private static final By LETTERCOUNT = By.xpath("//div[@data-bem='b-datalist__item']");

    public static void LogIn(WebDriver driver, String LoginText, String PasswordText){
        WebElement placeholderlogin = driver.findElement(PLACEHOLDERLOGIN);
        placeholderlogin.sendKeys(LoginText);

        WebElement placeholderpassword = driver.findElement(PLACEHOLDERPASSWORD);
        placeholderpassword.sendKeys(PasswordText);

        WebElement buttonLogIn = driver.findElement(BUTTONLOGIN);
        buttonLogIn.click();

        WebElement InboxMail = driver.findElement(INBOXMAILMENU);
        InboxMail.click();

    }
    public static void MailCalculator(WebDriver driver){
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
    public static void HelperAssert (WebDriver driver, String AssertText){
        Assert.assertEquals(driver.getTitle(), AssertText);

    }


}





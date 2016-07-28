package pages.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class FlowMailRuInboxPage {


    private final By INBOXMAILMENU = By.xpath("//span[text()='Входящие']");
    private final By TURNPAGEBUTTON = By.xpath("//div[@data-name='next']");
    private final By LETTERCOUNT = By.xpath("//div[@data-bem='b-datalist__item']");


    private WebDriver driver;

    public FlowMailRuInboxPage(WebDriver driver) {
        this.driver = driver;

    }


    public FlowMailRuInboxPage SelectInboxMailMenu(){
        WebElement InboxMail = driver.findElement(INBOXMAILMENU);
        InboxMail.click();
        return this;
    }
    public FlowMailRuInboxPage MailCalculator(){
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


}

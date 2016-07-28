import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class MailRuTest {

    @Test
    public void MailTestMethod(){
        
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");
        Assert.assertEquals(driver.getTitle(), "Mail.Ru: почта, поиск в интернете, новости, игры");

        WebElement placeholderLogin = driver.findElement(By.xpath("//input[@id='mailbox__login']"));
        placeholderLogin.sendKeys("strong.zubovich@bk.ru");

        Assert.assertNotNull(placeholderLogin);

        WebElement placeholderPassword = driver.findElement(By.xpath("//input[@id='mailbox__password']"));
        placeholderPassword.sendKeys("ZXCvbn123!");
        Assert.assertNotNull(placeholderPassword);

        WebElement buttonLogIn = driver.findElement(By.xpath("//input[@id='mailbox__auth__button']"));
        buttonLogIn.click();

        WebElement InboxMail = driver.findElement(By.xpath("//span[text()='Входящие']"));
        InboxMail.click();

        Assert.assertEquals(driver.getTitle(), "Входящие - Почта Mail.Ru");

        int page = 0;

        while(true){
            List<WebElement> LetterCount = driver.findElements(By.xpath("//div[@data-bem='b-datalist__item']"));
            System.out.println("The " + page + " page is contains " + LetterCount.size() + " letters");
            page++;
            if (!driver.findElement(By.xpath("//div[@data-name='next']")).getAttribute("class").contains("b-toolbar__btn_disabled")) {
                driver.findElement(By.xpath("//div[@data-name='next']")).click();
            } else {
                break;
            }
        }
    }
}




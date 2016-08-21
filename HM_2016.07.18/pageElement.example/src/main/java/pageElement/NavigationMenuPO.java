package pageElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenuPO {

    private static final By LENTA = By.cssSelector(/*".menu>li>a*/"[href='https://dev.by/lenta']");
    private static final By COMPANIES = By.cssSelector(/*".menu>li>a*/"[href='https://companies.dev.by/']");
    private static final By SALARIES = By.cssSelector(/*".menu>li>a*/"[href='https://salaries.dev.by/']");
    private static final By JOBS = By.cssSelector(/*".menu>li>a*/"[href='https://jobs.dev.by/']");


    public static void lentaButtonClick(WebDriver driver){
        WebElement lenta = driver.findElement(LENTA);
        lenta.click();
    }

    public static void companiesButtonClick(WebDriver driver){
        WebElement companies = driver.findElement(COMPANIES);
        companies.click();
    }

    public static void salariesButtonClick(WebDriver driver){
        WebElement salaries = driver.findElement(SALARIES);
        salaries.click();
    }

    public static void jobsButtonClick(WebDriver driver){
        WebElement jobs = driver.findElement(JOBS);
        jobs.click();
    }
}


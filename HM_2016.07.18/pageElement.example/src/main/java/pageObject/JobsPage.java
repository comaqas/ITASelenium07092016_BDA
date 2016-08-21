package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {
    private static final By VACANCIES_SEARCH_TEXT =  By.cssSelector(".column-left>h3");

    public static boolean isJobsSearchTextPresent(WebDriver driver){
        WebElement vacanciesSearchText = driver.findElement(VACANCIES_SEARCH_TEXT);

        if(!vacanciesSearchText.getText().equals("Поиск вакансий:")){
            return false;
        }
        return true;
    }
}

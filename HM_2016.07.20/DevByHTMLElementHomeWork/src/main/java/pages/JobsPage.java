package pages;


import blocks.NavigationMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class JobsPage {

    private NavigationMenuBlock navigationMenuBlock;
    private static final By VACANCIES_SEARCH_TEXT =  By.cssSelector(".column-left>h3");

    public JobsPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void JobsButtonClick(){
        navigationMenuBlock.jobsButtonClick();
    }

    public boolean isJobsSearchTextPresent(WebDriver driver){
        WebElement vacanciesSearchText = driver.findElement(VACANCIES_SEARCH_TEXT);

        if(!vacanciesSearchText.getText().equals("Поиск вакансий:")){
            return false;
        }
        return true;
    }
}

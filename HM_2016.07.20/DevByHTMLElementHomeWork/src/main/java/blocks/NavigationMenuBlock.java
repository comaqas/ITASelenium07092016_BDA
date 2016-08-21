package blocks;


import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("NavigationBlock")
@Block(@FindBy(css = ".dev-container.header-nav"))
public class NavigationMenuBlock extends HtmlElement {

    @Name("LentaButton")
    @FindBy(css = "[href='https://dev.by/lenta']")
    private Button lentaButton;

    @Name("CompaniesButton")
    @FindBy(css = ".menu>li>a[href='https://companies.dev.by/']")
    private Button companiesButton;

    @Name("SalariesButton")
    @FindBy(css = ".menu>li>a[href='https://salaries.dev.by/']")
    private Button salariesButton;

    @Name("JobsButton")
    @FindBy(css = ".menu>li>a[href='https://jobs.dev.by/']")
    private Button jobsButton;

    public void lentaButtonClick(){
        lentaButton.click();
    }

    public void companiesButtonClick(){
        companiesButton.click();
    }

    public void salariesButtonClick(){
        salariesButton.click();
    }

    public void jobsButtonClick(){
        jobsButton.click();
    }

}

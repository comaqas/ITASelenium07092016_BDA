import core.Basic;
import org.testng.annotations.Test;
import pages.CompaniesPage;
import pages.JobsPage;
import pages.LentaPage;
import pages.SalariesPage;
import static org.testng.Assert.assertTrue;

public class NavigationTest extends Basic{



    @Test
    public void NavigationMenuTest(){
        LentaPage lentaPage = new LentaPage(driver);
        CompaniesPage companiesPage = new CompaniesPage(driver);
        SalariesPage salariesPage = new SalariesPage(driver);
        JobsPage jobsPage = new JobsPage(driver);

        lentaPage.lentaButtonClick();
        assertTrue(lentaPage.isLogoPresent(driver));
        companiesPage.CompaniesButtonClick();
        assertTrue(companiesPage.isIsSoftCompanyPresentInTable(driver));
        salariesPage.SalariesButtonClick();
        assertTrue(salariesPage.isSalaryTextPresent(driver));
        jobsPage.JobsButtonClick();
        assertTrue(jobsPage.isJobsSearchTextPresent(driver));
    }

}

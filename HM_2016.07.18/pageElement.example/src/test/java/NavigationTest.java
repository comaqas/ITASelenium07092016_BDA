import core.Basic;
import org.testng.annotations.Test;
import pageElement.NavigationMenuPO;
import pageObject.CompaniesPage;
import pageObject.JobsPage;
import pageObject.LentaPage;
import pageObject.SalariesPage;

import static org.testng.Assert.assertTrue;

public class NavigationTest extends Basic{

    @Test
    public void NavigateTest(){
        NavigationMenuPO.lentaButtonClick(driver);
        assertTrue(LentaPage.isLogoPresent(driver));

        NavigationMenuPO.companiesButtonClick(driver);
        assertTrue(CompaniesPage.isIsSoftCompanyPresentInTable(driver));

        NavigationMenuPO.salariesButtonClick(driver);
        assertTrue(SalariesPage.isSalaryTextPresent(driver));

        NavigationMenuPO.jobsButtonClick(driver);
        assertTrue(JobsPage.isJobsSearchTextPresent(driver));
    }


}

import core.Core;
import helpers.RegistrationData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import page.RegistryPage;

public class DevByRegistrationTest extends Core{



    @Test
    public void RegistrationTest(){
        driver.findElement(MainPage.REGISTRATION_LINK).click();
        RegistryPage.PopulateRegistryForm(driver, new RegistrationData());
        Assert.assertTrue(driver.findElement(MainPage.CONFIRMATION_REGISTRATION_POPUP_MESSAGE).isDisplayed(), "Popup is not displayed");
    }
}

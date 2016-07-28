package core;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HelperAssertStatic {
    static public void CheckTitle (WebDriver driver, String AssertText) {
        Assert.assertEquals(driver.getTitle(), AssertText);
    }
}

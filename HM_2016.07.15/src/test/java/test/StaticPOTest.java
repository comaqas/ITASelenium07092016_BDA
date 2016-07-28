package StaticTest;


import core.TestBase;
import org.testng.annotations.Test;
import pages.PageStatic;

public class StaticPOTest extends TestBase{
    @Test
    public void MailRuTest(){

        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        PageStatic.HelperAssert(driver, AssertTitleMainPage );
        PageStatic.LogIn(driver, LoginText, PasswordText);
        PageStatic.HelperAssert(driver, AssertTitleInbox);
        PageStatic.MailCalculator(driver);


    }

}

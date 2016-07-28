package test;


import core.TestBase;
import org.testng.annotations.Test;
import pages.PageDynamic;

public class DynamicPOTest extends TestBase{
    @Test
    public void MailRuTest() {
        PageDynamic page = new PageDynamic(driver);
        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        page.HelperAssert(AssertTitleMainPage );
        page.LogIn(LoginText, PasswordText);
        page.HelperAssert(AssertTitleInbox);
        page.MailCalculator();

    }
}

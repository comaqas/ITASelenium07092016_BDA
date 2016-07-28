package test.dynamicTest;


import core.HelperAssertStatic;
import core.TestBase;
import org.testng.annotations.Test;
import pages.dynamic.DynamicMailRuInboxPage;
import pages.dynamic.DynamicMailRuMainPage;

public class DynamicPOTest extends TestBase{
    @Test
    public void MailRuTest() {
        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        DynamicMailRuMainPage mainPage = new DynamicMailRuMainPage(driver);
        DynamicMailRuInboxPage inboxPage = new DynamicMailRuInboxPage(driver);

        HelperAssertStatic.CheckTitle(driver, AssertTitleMainPage);
        mainPage.LogIn(LoginText, PasswordText);
        inboxPage.SelectInboxMenu();
        HelperAssertStatic.CheckTitle(driver, AssertTitleInbox);
        inboxPage.MailCalculator();



    }
}

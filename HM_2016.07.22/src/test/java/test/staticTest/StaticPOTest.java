package test.staticTest;


import core.HelperAssertStatic;
import core.TestBase;
import org.testng.annotations.Test;
import pages.statics.StaticMailRuInboxPage;
import pages.statics.StaticMailRuMainPage;

public class StaticPOTest extends TestBase{
    @Test
    public void MailRuTest(){

        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        HelperAssertStatic.CheckTitle(driver, AssertTitleMainPage);
        StaticMailRuMainPage.LogIn(driver, LoginText, PasswordText);
        StaticMailRuInboxPage.SelectInboxMenu(driver);
        HelperAssertStatic.CheckTitle(driver, AssertTitleInbox);
        StaticMailRuInboxPage.MailCalculator(driver);

    }

}

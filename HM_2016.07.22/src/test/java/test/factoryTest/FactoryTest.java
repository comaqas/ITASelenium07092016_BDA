package test.factoryTest;

import core.HelperAssertStatic;
import core.TestBase;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import pages.factory.FactoryMailRuInboxPage;
import pages.factory.FactoryMailRuMainPage;


public class FactoryTest extends TestBase {
    @Test
    public void MailRUTest(){
        FactoryMailRuMainPage mainPage = PageFactory.initElements(driver, FactoryMailRuMainPage.class);
        FactoryMailRuInboxPage inboxPage = PageFactory.initElements(driver, FactoryMailRuInboxPage.class);

        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        HelperAssertStatic.CheckTitle(driver, AssertTitleMainPage);
        mainPage.LogIn(LoginText, PasswordText);
        inboxPage.SelectInboxMenu();
        HelperAssertStatic.CheckTitle(driver, AssertTitleInbox);
        inboxPage.MailCalculator(driver);


    }
}

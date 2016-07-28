package test;

import core.TestBase;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import pages.PageSimpleFactory;


public class FactoryTest extends TestBase {
    @Test
    public void MailRUTest(){
        PageSimpleFactory page = PageFactory.initElements(driver, PageSimpleFactory.class);

        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        page.HelperAssert(driver, AssertTitleMainPage);
        page.LogIn(LoginText, PasswordText);
        page.HelperAssert(driver, AssertTitleInbox);
        page.MailCalculator(driver);


    }
}

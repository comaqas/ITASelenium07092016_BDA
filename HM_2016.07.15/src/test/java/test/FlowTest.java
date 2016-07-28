package test;

import core.TestBase;
import org.testng.annotations.Test;
import pages.PageFlow;


public class FlowTest extends TestBase {

    @Test
    public void MailRUTest(){
        PageFlow page = new PageFlow(driver);

        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        page
                .HelperAssert(AssertTitleMainPage)
                .InputLoginText(LoginText)
                .InputPasswordText(PasswordText)
                .ClickButtonLogIn()
                .SelectInboxMailMenu()
                .HelperAssert(AssertTitleInbox)
                .MailCalculator();




















    }
}

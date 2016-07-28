package test.flowTest;

import core.HelperAssertStatic;
import core.TestBase;
import org.testng.annotations.Test;
import pages.flow.FlowMailRuInboxPage;
import pages.flow.FlowMailRuMainPage;


public class FlowTest extends TestBase {

    @Test
    public void MailRUTest(){
        FlowMailRuMainPage mainPage = new FlowMailRuMainPage(driver);
        FlowMailRuInboxPage inboxPage = new FlowMailRuInboxPage(driver);

        String LoginText = "strong.zubovich@bk.ru";
        String PasswordText = "ZXCvbn123!";
        String AssertTitleMainPage = "Mail.Ru: почта, поиск в интернете, новости, игры";
        String AssertTitleInbox = "Входящие - Почта Mail.Ru";

        HelperAssertStatic.CheckTitle(driver, AssertTitleMainPage);

        mainPage
                .InputLoginText(LoginText)
                .InputPasswordText(PasswordText)
                .ClickButtonLogIn();

        inboxPage
                .SelectInboxMailMenu();

        HelperAssertStatic.CheckTitle(driver, AssertTitleInbox);

        inboxPage
                .MailCalculator();
            }


}

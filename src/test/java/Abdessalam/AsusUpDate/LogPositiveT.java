package Abdessalam.AsusUpDate;


import AbdessalamPages.AsusHomePage;
import AbdessalamPages.AsusLogInPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogPositiveT extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LogPositiveT.class);

    @Test
    public void LogIn(){

        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusLogInPage AsusLogInPage = new AsusLogInPage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.clickLogInIcon();
        LOG.info("Log in Icon clicked");
        AsusHomePage.clickLogInBtn();
        LOG.info("Log in Button clicked");
        waitFor(1);
        AsusLogInPage.enterEmail();
        LOG.info("Email entered successfully");
        AsusLogInPage.enterPassWord();
        LOG.info("Password entered successfully");
        Assert.assertEquals(getPageTitle(),"Account Login");

    }
}

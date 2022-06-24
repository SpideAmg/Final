package Abdessalam.AsusUpDate;


import AbdessalamPages.AsusHomePage;
import AbdessalamPages.AsusLogInPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogNegativeT extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LogNegativeT.class);

    @Test
    public void LogIn(){

        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusLogInPage AsusLogInPage = new AsusLogInPage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.clickLogInIcon();
        LOG.info("Log in Icon clicked");
        waitFor(1);
        AsusHomePage.clickLogInBtn();
        LOG.info("Log in Button clicked");
        waitFor(1);
        AsusLogInPage.enterFakeEmail();
        LOG.info("Fake Email entered successfully");
        AsusLogInPage.enterFakePassWord();
        LOG.info("Fake Password entered successfully");

    }
}

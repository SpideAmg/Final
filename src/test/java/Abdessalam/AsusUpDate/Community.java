package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Community extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(Community.class);
    @Test
    public void Community(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        waitFor(2);
        AsusHomePage.ClickFacebookLogo();
        LOG.info("Facebook Logo clicked and page opened successfully");
        AsusHomePage.ClickTwitterLogo();
        LOG.info("Twitter Logo clicked and page opened successfully");
        AsusHomePage.ClickLinkedInLogo();
        LOG.info("LinkedIn Logo clicked and page opened successfully");
        AsusHomePage.ClickPinterestLogo();
        LOG.info("Pinterest Logo clicked and page opened successfully");
        AsusHomePage.ClickGlassDoorLogo();
        LOG.info("GlassDoor Logo clicked and page opened successfully");
        AsusHomePage.ClickEdgeUpLogo();
        LOG.info("EdgeUp Logo clicked and page opened successfully");

    }

}

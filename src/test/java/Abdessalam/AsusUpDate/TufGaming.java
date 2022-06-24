package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TufGaming extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(TufGaming.class);

    @Test
    public void Tuf(){
        AsusHomePage AsusHomePage =new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverGamingBtn(getDriver());
        LOG.info("hover over Gaming button success and dropdown displayed");
        AsusHomePage.clickTufGamingFromDropDown();
        LOG.info("TufGaming clicked and page opened successfully");

    }
}

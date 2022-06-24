package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GMobile extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(GMobile.class);
    @Test
    public void GamingMobilePhone(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverMobile(getDriver());
        LOG.info("hover over Mobile success and dropdown displayed");
        AsusHomePage.clickPhoneAllSeriesFromMenu();
        LOG.info("All Phone Series Clicked success and Page Opened");
        Assert.assertEquals(getPageTitle(),"Phone - All series｜ASUS USA");
        AsusHomePage.clickCheckBoxGamingPhone();
        LOG.info("Gaming Phone Box Checked success and Gaming Phone Displayed ");
        waitFor(1);
        AsusHomePage.checkIfBoxCheckedGaming();
        LOG.info("Gaming phone Box is checked");

    }
}

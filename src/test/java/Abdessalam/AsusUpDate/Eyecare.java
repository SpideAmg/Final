package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Eyecare extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Eyecare.class);
    @Test

    public void MonitorsEyeCare(){

        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.hoverOverMenuDisplaysAndDesktops(getDriver());
        LOG.info("hover over Displays And Desktops success and dropdown opened");
        waitFor(1);
        AsusHomePage.hoverOverMonitorFromMenu(getDriver());
        LOG.info("hover over Monitor success and displayed");
        AsusHomePage.clickEyeCareFromMenu();
        LOG.info("EyeCare Monitor clicked success and displayed");


    }
}

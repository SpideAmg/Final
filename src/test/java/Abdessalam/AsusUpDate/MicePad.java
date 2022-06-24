package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MicePad extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(MicePad.class);
    @Test
    public void mouseAndPad(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverAccessoriesMenu(getDriver());
        LOG.info("hover over Accessories success dropdown displayed");
        AsusHomePage.clickAllSeriesFromMiceAndMousePads();
        LOG.info("All Series Mice And Mouse Pads clicked success and displayed");
    }
}

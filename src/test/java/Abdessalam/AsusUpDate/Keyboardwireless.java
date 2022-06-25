package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Keyboardwireless extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(Keyboardwireless.class);
    @Test
    public void wall(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverAccessoriesMenu(getDriver());
        LOG.info("hover Over Accessories success and dropdown displayed");
        AsusHomePage.clickWirelessKeyboards();
        LOG.info("Wireless Keyboards clicked and keyboards displayed");


    }

}

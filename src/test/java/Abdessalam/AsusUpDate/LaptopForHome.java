package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopForHome extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LaptopForHome.class);

    @Test
    public void MiniPc(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverMenuLaptop(getDriver());
        LOG.info("hover Over Laptop success and dropdown displayed");
        waitFor(1);
        AsusHomePage.ClickAllSeriesFromLaptopHomeMenu();
        LOG.info("All Series Laptop clicked and laptop displayed");

    }
}

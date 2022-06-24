package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiniPC extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(MiniPC.class);
    @Test
    public void PHand(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());


        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverMenuDisplaysAndDesktops(getDriver());
        LOG.info("hover Over on Displays And Desktops success and dropdown displayed");
        AsusHomePage.hoverOverMiniPcFromMenu(getDriver());
        LOG.info("hover Over on MiniPc success and menu displayed");
        AsusHomePage.clickAllSeriesMiniPcFromMenu();
        LOG.info("All Series MiniPc clicked and page opens");

    }
    }


package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDriver extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(FindDriver.class);
    @Test
    public void FindDriverToDownload() {
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverSupportBtn(getDriver());
        LOG.info("hover over Support button success and dropdown displayed");
        AsusHomePage.clickDriversAndManuals();
        LOG.info("Drivers and Manuals button clicked success and page opened");
       // AsusHomePage.clicksearchBarModelNamee();
      //  AsusHomePage.typeSearchBarModelName();

    }
}

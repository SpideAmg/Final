package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(Search.class);

    @Test
    public void Search(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.clickSearchIcon();
        LOG.info("Search Icon clicked and search bar displayed");
        waitFor(1);
        AsusHomePage.MousetypeAndEnterInSearchBar();
        LOG.info("mouse entered and mouse page displayed");

    }
}

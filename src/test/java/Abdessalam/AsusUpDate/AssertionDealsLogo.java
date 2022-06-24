package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDealsLogo extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AssertionDealsLogo.class);
    @Test
    public void Assertion(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ASUS USA");



    }
}

package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleTUFPageAndFrame extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(HandleTUFPageAndFrame.class);
    @Test
    public void HandleTUFPage(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        RepublicOfGamers.hovereOverProductsClickSwitchPages(getDriver());
        Assert.assertEquals(getPageTitle(),"TUF Gaming｜Laptops For Gaming｜ASUS USA");

    }
}

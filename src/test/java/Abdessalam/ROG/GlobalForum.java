package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobalForum extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(GlobalForum.class);

    @Test
    public void Forum() {
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.hoverOverCommunityMenu(getDriver());
        LOG.info("hover over Community success and dropdown displayed");
        ROGHP.ClickOnGlobalForum();
        LOG.info("Global Forum button clicked and pages open successfully");

    }
}
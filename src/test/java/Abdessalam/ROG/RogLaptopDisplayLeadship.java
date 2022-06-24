package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RogLaptopDisplayLeadship extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(RogLaptopDisplayLeadship.class);

    @Test
    public void DisplayLeadership() {
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.hoverOverInnovationMenu(getDriver());
        LOG.info("hover over innovation success and dropdown displayed");
        waitFor(1);
        ROGHP.displayLeaderShip();
        LOG.info("Rog laptop display leader ship clicked and page opens successfully");
        Assert.assertEquals(getPageTitle(), "ROG Laptop Display Leadership");

    }
}
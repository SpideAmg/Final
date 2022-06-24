package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControllerROGKunai3 extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ControllerROGKunai3.class);

    @Test
    public void Router() {
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.hoverOverProducts(getDriver());
        LOG.info("hover over product success and dropdown displayed");
        ROGHP.clickOnController();
        LOG.info("Controller clicked and page opens");
        ROGHP.ClickOnRogKunai3();
        LOG.info("ROG Kunai 3 page opens successfully");
        Assert.assertEquals(getPageTitle(), "ROG Kunai 3 Gamepad | Gaming Controllers｜ROG - Republic of Gamers｜ROG USA");
    }
}
package Abdessalam.RepublicOfGamers;

import AbdessalamPages.ArmouryCratePage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PupOpZoomArmoryCrate extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(PupOpZoomArmoryCrate.class);
    @Test
    public void PupOpZoom() {
       RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
       ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.hoverOverInnovationMenu(getDriver());
        LOG.info("hover Over Innovation success and dropdown displayed");
        RepublicOfGamers.clickArmoryBtn();
        LOG.info("Armory button clicked page opened successfully");
        Assert.assertEquals(getPageTitle(), "Armoury-Crate | US | For Those Who Dare");
        ArmouryCratePage.hoverOverPicN1(getDriver());
        LOG.info("hover Over PicN1 successfully");
        ArmouryCratePage.hoverOverPicN2(getDriver());
        LOG.info("hover Over PicN2 successfully");
        ArmouryCratePage.hoverOverPicN3(getDriver());
        LOG.info("hover Over PicN3 successfully");








    }
}
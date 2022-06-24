package Abdessalam.RepublicOfGamers;

import Abdessalam.AsusUpDate.AddToCart;
import AbdessalamPages.ArmouryCratePage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArmoryCrateHov extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ArmoryCrateHov.class);
    @Test
    public void ArmoryCrate() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.hoverOverInnovationMenu(getDriver());
        LOG.info("Hover over Innovation success and dropdown displayed");
        waitFor(1);
        RepublicOfGamers.clickArmoryBtn();
        LOG.info("Armory button clicked successfully");
        Assert.assertEquals(getPageTitle(), "Armoury-Crate | US | For Those Who Dare");
        ArmouryCratePage.hoverOverAuraSyncLogo(getDriver());
        LOG.info("hover Over Aura Sync Logo successfully");
        ArmouryCratePage.hoverOverEasyDeviceConfigurationLogo(getDriver());
        LOG.info("hover Over Easy Device Configuration Logo successfully");
        ArmouryCratePage.hoverOverFastHelpUpDateLogo(getDriver());
        LOG.info("hover Over Fast Help UpDate Logo successfully");
        ArmouryCratePage.hoverOverNewNInboxLogo(getDriver());
        LOG.info("hover Over New In box Logo successfully");
        ArmouryCratePage.hoverOverSimpleAccountManagementLogo(getDriver());
        LOG.info("hover Over Simple Account Management Logo successfully");


    }
}

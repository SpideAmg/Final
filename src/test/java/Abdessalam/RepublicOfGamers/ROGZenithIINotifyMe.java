package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ROGZenithIINotifyMe extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ROGZenithIINotifyMe.class);
    @Test
    public void NotifyMeBtn() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.hoverOverProducts(getDriver());
        LOG.info("Hover Over Products dropdown displayed");
        RepublicOfGamers.clickMotherboardsFromMenu();
        LOG.info("Motherboard clicked successfully");

        RepublicOfGamers.clickRogZenith();
        LOG.info("Rog Zenith Motherboard Button clicked successfully page opened");
        Assert.assertEquals(getPageTitle(),"ROG Zenith | Gaming Motherboards｜ROG - Republic of Gamers｜ROG USA");


    }
}

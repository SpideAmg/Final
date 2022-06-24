package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheRiseOfGamingLoop extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(TheRiseOfGamingLoop.class);
    @Test
    public void HoverOverLoop() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        RepublicOfGamers.TheList(getDriver());
        Assert.assertEquals(getPageTitle(), "2022-ces-rog-gaming-laptops | US | For Those Who Dare");


        }
    }

package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExternalGraphicsDocks2022 extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ExternalGraphicsDocks2022.class);

    @Test
    public void ExternalGraphicsDocks2022(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.hoverOverProducts(getDriver());
        LOG.info("hover Over Products drop down displayed");
        RepublicOfGamers.clickExternalGraphicsDocks2022();
        LOG.info("External Graphics Docks 2022 clicked and page opened successfully");
        waitFor(1);
        RepublicOfGamers.hoverOverRogXgMobile2022(getDriver());
        RepublicOfGamers.clickRogXgMobile2022();
        LOG.info("hover Over and click on Rog Xg Mobile 2022 success and page opened");
        Assert.assertEquals(getPageTitle(),"2022 ROG XG Mobile");




    }
}

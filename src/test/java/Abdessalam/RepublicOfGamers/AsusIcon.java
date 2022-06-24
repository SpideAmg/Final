package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AsusIcon extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AsusIcon.class);
    @Test
    public void Test(){
        RepublicOfGamersHomePage RepublicOGHM = new RepublicOfGamersHomePage(getDriver());

        RepublicOGHM.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOGHM.GoBack(getDriver());

    }
}

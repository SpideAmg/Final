package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeButton extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(HomeButton.class);

    @Test
    public void Homebutton() {
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.scrollAndClickHome(getDriver());
        LOG.info("Scroll and click home successfully");
        LOG.info("Page scroll up successfully");


    }
}
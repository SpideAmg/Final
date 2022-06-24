package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CasesButton extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(CasesButton.class);

    @Test
    public void Cases() {
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.hoverOverProducts(getDriver());
        LOG.info("hover over product success and dropdown displayed");
        ROGHP.ClickonCases();
        LOG.info("Cases click and page opens successfully");
    }
}
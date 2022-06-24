package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TermAndUseNotice extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TermAndUseNotice.class);

    @Test
    public void TermAndNotice() {
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        waitFor(1);
        ROGHP.scrollAndClickTerm(getDriver());
        LOG.info("Scroll and click Term and use notice successfully");
        LOG.info("Term and use notice page opens successfully");
        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers | Privacy Policy");

    }
}
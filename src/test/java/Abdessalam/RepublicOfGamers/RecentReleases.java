package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecentReleases extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(RecentReleases.class);
    @Test
    public void RecentRelease(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.ScrollDownToRecentReleases(getDriver());
        LOG.info("Scroll down to new release success");
        waitFor(1);
        RepublicOfGamers.hoverOver5Image(getDriver());



    }
}

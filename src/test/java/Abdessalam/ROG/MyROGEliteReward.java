package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyROGEliteReward extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(MyROGEliteReward.class);
    @Test
    public void Reward(){
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.clickLogInBtn();
        LOG.info("Login Button clicked and dropdown Opens");
        waitFor(1);
        ROGHP.ClickOnMyRogEliteReward();
        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜Global | For Those Who Dare");
    }

}

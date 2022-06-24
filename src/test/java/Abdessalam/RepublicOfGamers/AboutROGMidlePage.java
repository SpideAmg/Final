package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutROGMidlePage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AboutROGMidlePage.class);

    @Test
    public void AboutROG(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.AboutROGMidlePage(getDriver());
        Assert.assertEquals(getPageTitle(),"about-rog | us | For Those Who Dare");

    }
}

package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExploreOurProductsSlideBtn extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ExploreOurProductsSlideBtn.class);

    @Test
    public void NewTest(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickSlideRightBtn(getDriver());
        RepublicOfGamers.clickSlideLeftBtn();


    }

}

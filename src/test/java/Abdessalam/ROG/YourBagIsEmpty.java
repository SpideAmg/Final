package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YourBagIsEmpty extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(YourBagIsEmpty.class);
    @Test

    public void YourBagIsEmpty(){
        RepublicOfGamersHomePage ROGHP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGHP.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        ROGHP.clickOnCardBtn();
        LOG.info("Card Button Clicked successfully");
        Assert.assertEquals(ROGHP.CardisEmptyText(),"Your Bag is empty.");
        LOG.info("Text Your Bag is empty present");

    }
}

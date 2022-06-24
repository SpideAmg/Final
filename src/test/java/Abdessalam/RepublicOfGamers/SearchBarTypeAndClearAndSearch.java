package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTypeAndClearAndSearch extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(SearchBarTypeAndClearAndSearch.class);

    @Test
    public void SearchBarTypeAndClearAndSearch(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.clickSearchBtn();
        LOG.info("search button clicked successfully");
        RepublicOfGamers.TypeSearchBar();
        LOG.info("Text entered product displayed");
        RepublicOfGamers.ClearSearchBar();
        LOG.info("Text deleted");
        RepublicOfGamers.TypeAndEnterSearchBarr();
        LOG.info("Text entered product displayed");
        Assert.assertEquals("Product", RepublicOfGamers.getTextProduct());


    }
}

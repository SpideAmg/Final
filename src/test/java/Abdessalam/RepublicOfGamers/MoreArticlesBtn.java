package Abdessalam.RepublicOfGamers;

import AbdessalamPages.ArticlesPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreArticlesBtn extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(MoreArticlesBtn.class);

    @Test
    public void MoreArticlesBtn(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArticlesPage ArticlesPage = new ArticlesPage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.hoverOverCommunityMenu(getDriver());
        LOG.info("hover Over on Community success and dropdown displayed");
        RepublicOfGamers.clickNewsAndArticles();
        LOG.info("News and Articles clicked and page opened successfully");
        Assert.assertEquals("ARTICLES",ArticlesPage.getArticleText());
        waitFor(1);
        ArticlesPage.scrollAndclickMoreArticlesBtn(getDriver());
        LOG.info("scroll down success and More Articles Button clicked");
        LOG.info("More Articles displayed");





    }
}

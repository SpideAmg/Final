package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import AbdessalamPages.WallPapersPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WallPapersDownload extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(WallPapersDownload.class);
    @Test
    public void WallPaperDownload(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        WallPapersPage WallPapersPage = new WallPapersPage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.hoverOverDownloadMenu(getDriver());
        LOG.info("hover Over Download dropdown displayed");
        waitFor(1);
        RepublicOfGamers.clickWallPapersFromMenu();
        LOG.info("WallPapers clicked and page opened successfully");
        Assert.assertEquals(WallPapersPage.getWallPapersText(),"WALLPAPERS");
        WallPapersPage.clickWallPapers2022();
        LOG.info("Wall Papers 2022 clicked");
        Assert.assertEquals(getPageTitle(),"Wallpapers | ROG - Republic of Gamers Global");





    }
}

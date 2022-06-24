package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProArt_Motherboards extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ProArt_Motherboards.class);
    @Test
    public void ProArt(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        LOG.info("hover over Motherboards And Components dropdowns displayed");
        waitFor(1);
        AsusHomePage.clickProArtMotherboards();
        LOG.info("Pro Art Motherboards clicked and page opened successfully");



//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        click("#headerLayerOne > div > div.HeaderDesktop__topLeftMenu___uskw.HeaderDesktop__themeWhite__1bpoN > div:nth-child(4) > a");
//        click("#s2__productline > div > a.product__item.item-5");
//        click("#s2__grid > div > div.item.item-4.text-left > div.item-content > div > div.btn-group > a");


    }
}

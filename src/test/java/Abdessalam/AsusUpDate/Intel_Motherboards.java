package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Intel_Motherboards extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(Intel_Motherboards.class);

    @Test
    public void Intel(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        LOG.info("hover Over Motherboards And Components success and dropdown displayed");
        AsusHomePage.clickIntelByChipsetBrand();
        LOG.info("Intel By Chipset Brand clicked success and Motherboards displayed");

    }
}

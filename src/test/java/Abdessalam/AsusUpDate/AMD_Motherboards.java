package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AMD_Motherboards extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AMD_Motherboards.class);
    @Test
    public void AMDMotherBoard() {
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        LOG.info("Hover over Motherboards And Components success and dropdown opens");
        AsusHomePage.clickAMDChipsetBrandFromMenu();
        Assert.assertEquals("AMD｜Motherboards｜ASUS USA",getPageTitle());
        LOG.info("AMD Chipset clicked success and AMD Motherboards displayed");


    }


}
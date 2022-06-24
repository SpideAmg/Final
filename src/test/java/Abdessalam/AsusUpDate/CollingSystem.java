package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollingSystem extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(CollingSystem.class);
    @Test
    public void ColS(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        LOG.info("hover Over Motherboards And Components dropdown opened successfully");
        AsusHomePage.hoverOverCoolingFromMenu(getDriver());
        LOG.info("hover Over Cooling system selected successfully");
        waitFor(1);
        AsusHomePage.ClickOnAllSeriesFronCooling();
        LOG.info("Button All Series Cooling system clicked and displayed successfully");


    }
}

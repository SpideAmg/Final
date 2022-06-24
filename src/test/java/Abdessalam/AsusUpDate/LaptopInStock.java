package Abdessalam.AsusUpDate;

import AbdessalamPages.AllSeriesLaptopPage;
import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopInStock extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LaptopInStock.class);
    @Test
    public void LaptopInStock(){
        AsusHomePage AsusHomPage = new AsusHomePage(getDriver());
        AllSeriesLaptopPage AllSeriesLaptopPage = new AllSeriesLaptopPage(getDriver());

        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomPage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        AsusHomPage.hoverOverMenuLaptop(getDriver());
        LOG.info("hover Over Laptop success and dropdown displayed");
        AsusHomPage.clickAllSeriesFromLaptopMenu();
        LOG.info("All series Laptop clicked success and page opens");
        AllSeriesLaptopPage.clickCheckBoxInStockOnAsus();
        LOG.info("Box in stock checked and laptop in stock displayed");

    }
}

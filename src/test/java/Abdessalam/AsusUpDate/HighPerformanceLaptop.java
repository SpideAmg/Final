package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HighPerformanceLaptop extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(HighPerformanceLaptop.class);

    @Test
    public void HighPerformanceLaptop(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.hoverOverMenuLaptop(getDriver());
        LOG.info("hover Over Menu Laptop success and dropdown displayed");
        AsusHomePage.clickHighPerformanceLaptop();
        LOG.info("High Performance Laptop button clicked and Laptop displayed successfully");









//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(6) > span");
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(8) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(2) > li:nth-child(3) > a > div");
//        click("#filterWrapper > div > div.LevelThreeFilterPage__productListWrapper__rIAkj > div.LevelThreeFilterPage__productFilterWrapper__2azdO > div.LevelThreeFilterPage__productFilter__1DQH0 > div.LevelThreeFilterPage__productList__2SHal > div > div:nth-child(8) > div.SeriesFilter__title__2VI99.SeriesFilter__toggleIcon__9DTC5");
//        waitFor(2);
//        click("#filterWrapper > div > div.LevelThreeFilterPage__productListWrapper__rIAkj > div.LevelThreeFilterPage__productFilterWrapper__2azdO > div.LevelThreeFilterPage__productFilter__1DQH0 > div.LevelThreeFilterPage__productList__2SHal > div > div:nth-child(8) > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(1) > div > div.FilterCheckBox__wrapper__2QsXG > label");
    }
}

package Abdessalam.AsusUpDate;


import AbdessalamPages.AllSeriesLaptopPage;
import AbdessalamPages.AsusHomePage;
import AbdessalamPages.AsusLaptopDealPage;
import AbdessalamPages.AsusLogInPage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AddToCart extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AddToCart.class);

    @Test
    public void addtocart(){

        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusLogInPage AsusLogInPage = new AsusLogInPage(getDriver());
        AsusLaptopDealPage AsusLaptopDealPage = new AsusLaptopDealPage(getDriver());

        AsusHomePage.clickCookiesBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickLogInIcon();
        LOG.info("Log in Icon clicked");
        waitFor(1);
        AsusHomePage.clickLogInBtn();
        LOG.info("Log in Button clicked");
        waitFor(1);
        AsusLogInPage.enterEmail();
        LOG.info("Email entered successfully");
        waitFor(1);
        AsusLogInPage.enterPassWord();
        LOG.info("Password entered successfully");
        waitFor(2);
        AsusHomePage.clickBuyLaptopDeal();
        LOG.info("Buy Laptop Deal clicked");
        waitFor(1);
        AsusLaptopDealPage.clickAddToCartBtn();
        LOG.info("Add to card button clicked ann Laptop added to the cart successfully");

    }

}

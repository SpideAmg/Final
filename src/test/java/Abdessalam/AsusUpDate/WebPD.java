package Abdessalam.AsusUpDate;

import AbdessalamPages.AsusHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPD extends CommonAPI {
    @Test
    public void WebD(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        Assert.assertEquals(getPageTitle(),"ASUS USA");

    }
}

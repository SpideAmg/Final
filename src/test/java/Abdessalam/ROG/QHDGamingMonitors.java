package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QHDGamingMonitors extends CommonAPI {
    @Test
    public void QHD(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.QHD(getDriver());
        Assert.assertEquals(getPageTitle(), "The Perfect Balance | 1440p gaming monitor | ASUS US");

    }
}

package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsusLogoROGLogo extends CommonAPI {
    @Test
    public void Logos(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.Logos();
        RepublicOfGamers.rogAndAsusPagesHandle(getDriver());
        Assert.assertEquals(RepublicOfGamers.getROGInActionText(), "ROG IN ACTION");
    }
}

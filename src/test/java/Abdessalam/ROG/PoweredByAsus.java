package Abdessalam.ROG;

import AbdessalamPages.PoweredByAsusPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PoweredByAsus extends CommonAPI {
    @Test
    public void PoweredAsus(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        Assert.assertEquals(getPageTitle(),"Powered by ASUS");
        PBA.PBA(getDriver());


    }
   @Test
    public void PoweredAsusHover(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        Assert.assertEquals(getPageTitle(),"Powered by ASUS");
        PBA.HoverOverDownPage(getDriver());

    }


   @Test
    public void PoweredAsusBuildsClick(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        Assert.assertEquals(getPageTitle(),"Powered by ASUS");
        PBA.BuildsClick(getDriver());

    }


}

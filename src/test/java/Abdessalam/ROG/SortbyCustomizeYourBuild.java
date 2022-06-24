package Abdessalam.ROG;

import AbdessalamPages.PoweredByAsusPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortbyCustomizeYourBuild extends CommonAPI {
    @Test
    public void StorBy(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.AccessToPowered();
        waitFor(2);
        PBA.StorByCYB();


    }
}

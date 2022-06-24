package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessiblityHelp extends CommonAPI {
    @Test
    public void Accessible(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.Accessibility(getDriver());
        Assert.assertEquals(getPageTitle(),"Accessibility Policy | ASUS USA");

    }
}

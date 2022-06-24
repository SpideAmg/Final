package Abdessalam.ROG;

import AbdessalamPages.AsusSupportPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Support extends CommonAPI {
     @Test
    public void SupportSearchBarServiceDesk(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.Support(getDriver());
        Assert.assertEquals(getPageTitle(), "Official Support | ROG USA");
        ASP.SearchBarServiceDesk();

    }
    @Test
    public void SupportPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.Support(getDriver());
        waitFor(1);
        Assert.assertEquals(getPageTitle(), "Official Support | ROG USA");
        ASP.SupportPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ASUSTeK Computer Inc. -Support-");


    }

    @Test
    public void SupportPageShowAllProductBtn(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.Support(getDriver());
        waitFor(1);
        ASP.SupportPageShowAllProductBtn(getDriver());
        Assert.assertEquals(getPageTitle(),"Official Support | ROG USA");
    }


}

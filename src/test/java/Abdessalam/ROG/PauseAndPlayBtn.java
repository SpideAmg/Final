package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PauseAndPlayBtn extends CommonAPI {

    @Test
    public void PauseAndPlay(){
        RepublicOfGamersHomePage ROGP = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROGP.PauseAndPlay(getDriver());
    }
}

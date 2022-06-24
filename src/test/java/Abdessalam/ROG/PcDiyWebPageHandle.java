package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class PcDiyWebPageHandle extends CommonAPI {
    @Test
    public void PcDiy(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.HandlePcDiyPageSwitch(getDriver());
    }
}

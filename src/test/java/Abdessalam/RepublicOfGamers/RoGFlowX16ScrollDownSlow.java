package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import AbdessalamPages.RogFlowX16Page;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class RoGFlowX16ScrollDownSlow extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(RoGFlowX16ScrollDownSlow.class);

    @Test
    public void X16() {
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        RogFlowX16Page X16 = new RogFlowX16Page(getDriver());

        ROG.RogLow(getDriver());

    }
}
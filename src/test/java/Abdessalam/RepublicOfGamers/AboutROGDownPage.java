package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AboutROGDownPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AboutROGDownPage.class);

    @Test
    public void AboutRogDownPage(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.AboutRogDownPage(getDriver());
    }
}

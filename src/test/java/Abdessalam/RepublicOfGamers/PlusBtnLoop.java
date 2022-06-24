package Abdessalam.RepublicOfGamers;


import AbdessalamPages.ArmouryCratePage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusBtnLoop extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(PlusBtnLoop.class);

        @Test

        public void PlusIconWLoop(){
            RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
            ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

            RepublicOfGamers.clickCookiesAcceptBtn();
            LOG.info("Cookies Accepted");
            RepublicOfGamers.hoverOverInnovationMenu(getDriver());
            LOG.info("hover Over Innovation success and dropdown displayed");
            waitFor(1);
            RepublicOfGamers.clickArmoryBtn();
            LOG.info("Armory Button clicked");
            Assert.assertEquals(getPageTitle(), "Armoury-Crate | US | For Those Who Dare");
            ArmouryCratePage.LoopForThePlusIcon(getDriver());
            LOG.info("Plus Button worked and definition displayed");

        }

    }

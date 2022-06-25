package Abdessalam.RepublicOfGamers;

import AbdessalamPages.ArmouryCratePage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusIConDeviceConfigurationArmoryCrate extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(PlusIConDeviceConfigurationArmoryCrate.class);
   @Test
    public void PlusIcon(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.hoverOverInnovationMenu(getDriver());
        LOG.info("hover Over Innovation success and dropdown displayed");
        RepublicOfGamers.clickArmoryBtn();
        LOG.info("Armory button clicked page opened successfully");
        Assert.assertEquals(getPageTitle(), "Armoury-Crate | US | For Those Who Dare");
        ArmouryCratePage.scrolldown(getDriver());
        LOG.info("scroll down to Device Configuration successfully");
        ArmouryCratePage.clickLaptopPlusIcon();
        LOG.info("Laptop Plus Button Clicked and description displayed");
        ArmouryCratePage.clickMousePlusIcon();
        LOG.info("Mouse Plus Button Clicked and description displayed");
        ArmouryCratePage.clickMonitorPlusIcon();
        LOG.info("Monitor Plus Button Clicked and description displayed");
        ArmouryCratePage.clickHeadSetPlusIcon();
        LOG.info("Head Set Plus Button Clicked and description displayed");
        ArmouryCratePage.clickKeyboardPlusIcon();
        LOG.info("Keyboard Plus Button Clicked and description displayed");
        ArmouryCratePage.clickMousePadPlusIcon();
        LOG.info("Mouse pad Plus Button Clicked and description displayed");
        ArmouryCratePage.clickMotherBoardPlusIcon();
        LOG.info("Motherboard Plus Button Clicked and description displayed");
        ArmouryCratePage.clickCPULiquidCoolerPlusIcon();
        LOG.info("CPU Liquid Cooler Plus Button Clicked and description displayed");
        ArmouryCratePage.clickVGAPlusIcon();
        LOG.info("VGA Plus Button Clicked and description displayed");
    }



}

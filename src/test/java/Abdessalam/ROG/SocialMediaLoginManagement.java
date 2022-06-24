package Abdessalam.ROG;

import AbdessalamPages.ROGLogInPage;
import AbdessalamPages.ROGLogInSetting;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialMediaLoginManagement extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(SocialMediaLoginManagement.class);
    @Test
    public void checkLoginManagementSocialMediaText(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGP = new ROGLogInPage(getDriver());
        ROGLogInSetting RLS = new ROGLogInSetting(getDriver());


        ROG.ToLogIn();
        Assert.assertEquals("Account Login",LGP.getLogInPageText());
        LGP.typeEmail();
        LOG.info("Email entered successfully");
        LGP.typePassWord();
        LOG.info("Password entered successfully");
        LGP.clickLogInBtn();
        LOG.info("LOGIN button clicked successfully");
        waitFor(2);
        ROG.SettingAccess();
        waitFor(2);
        RLS.SocialMediaCheckText();
        Assert.assertEquals("Login Management",RLS.TextLManagement());

    }


}

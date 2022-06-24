package Abdessalam.ROG;

import AbdessalamPages.ROGLogInPage;
import AbdessalamPages.ROGLogInSetting;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInToSetting extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LogInToSetting.class);
    @Test()
    public void Setting(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGP = new ROGLogInPage(getDriver());

        ROG.ToLogIn();
        Assert.assertEquals("Account Login",LGP.getLogInPageText());
        LGP.typeEmail();
        LOG.info("Email entered successfully");
        LGP.typePassWord();
        LOG.info("Password entered successfully");
        LGP.clickLogInBtn();
        LOG.info("LOGIN button clicked successfully");
        waitFor(1);
        ROG.SettingAccess();
        LOG.info("setting button clicked and setting page opened successfully");
    }

    @Test
    public void AssertWelcome(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGP = new ROGLogInPage(getDriver());
        ROGLogInSetting  RLS = new ROGLogInSetting(getDriver());


        ROG.ToLogIn();
        Assert.assertEquals("Account Login",LGP.getLogInPageText());
        LGP.typeEmail();
        LOG.info("Email entered successfully");
        waitFor(2);
        LGP.typePassWord();
        LOG.info("Password entered successfully");
        LGP.clickLogInBtn();
        LOG.info("LOGIN button clicked successfully");
        waitFor(3);
        ROG.SettingAccess();
        LOG.info("setting button clicked and setting page opened successfully");
        Assert.assertEquals("Welcome, Anas!",RLS.GetWelcome());
        ROG.ClickOnMyProduct();
        LOG.info("My product dropdown opens successfully");

    }
}

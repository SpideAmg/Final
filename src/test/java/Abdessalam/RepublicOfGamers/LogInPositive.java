package Abdessalam.RepublicOfGamers;

import AbdessalamPages.ROGLogInPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPositive extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LogInPositive.class);

    @Test
    public void LogIn() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage ROGLogInPage = new ROGLogInPage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        RepublicOfGamers.clickLogInBtn();
        LOG.info("Login icon clicked dropdown opens");
        waitFor(1);
        RepublicOfGamers.clickLogInFromDropDown();
        LOG.info("login button clicked page opens");
        waitFor(1);
        Assert.assertEquals("Account Login",ROGLogInPage.getLogInPageText());
        ROGLogInPage.typeEmail();
        LOG.info("Email entered successfully");
        ROGLogInPage.typePassWord();
        LOG.info("Password entered successfully");
        ROGLogInPage.clickLogInBtn();
        LOG.info("LOGIN button clicked");
        LOG.info("connect successfully");





    }
}

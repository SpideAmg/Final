package Abdessalam.ROG;

import AbdessalamPages.ROGLogInPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInNeg extends CommonAPI {
    @Test
    public void LogInNegative() {

        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGN = new ROGLogInPage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.ToLogIn();
        LGN.Info();
        Assert.assertEquals(ROG.getTextwrong(),"Wrong account or password.");

    }
}
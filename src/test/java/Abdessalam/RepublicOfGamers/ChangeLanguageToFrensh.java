package Abdessalam.RepublicOfGamers;

import AbdessalamPages.LanguagePage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageToFrensh extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AsusIcon.class);
    @Test
            public void ChangeLanguage() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        LanguagePage LanguagePage = new LanguagePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickLanguageBtn();
        LOG.info("Language button clicked page opens");
        Assert.assertEquals(getPageTitle(),"Choose your language | ROG - Republic of Gamers | Global");
        LanguagePage.clickFranceBnt();
        waitFor(1);
        LOG.info("Language button clicked");
        LOG.info("Language changed successfully");
        LOG.info("confirmation window displayed");
        LanguagePage.clickYesBtn();
        LOG.info("Language confirmed successfully");

    }
}

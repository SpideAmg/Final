package Abdessalam.ROG;

import AbdessalamPages.ROGStoryPage;
import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ROGStory extends CommonAPI {
    @Test

    public void ROGEyesViewButtonSpecialEffects(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.scrollDownAndHoverOverOnAllBtnLoop(getDriver());

    }

    @Test

    public void ROGOurCreationButtonLeftAndRight(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.scrollDownOurCreationAndTestButtonLeftAndRight(getDriver());

    }

    @Test

    public void TheSagaContinuesButtons(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.scrollDownToSagaContinuesButtons(getDriver());



    }

    @Test

    public void InTheWorldOfROGGamerFightForFreedomPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.InTheWorldOfROGGamerFightForFreedomPageAccess(getDriver());
    }


    @Test

    public void LookInsideTheVisualUniverseOfTheRepublicOfGamersPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.LookInsideTheVisualUniverseOfTheRepublicOfGamersAccess(getDriver());

    }

    @Test

    public void ROGCitadelXvOnSteam() {
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.ROGCitadelXvOnSteamPageAccess(getDriver());

    }

    @Test

    public void privacyPolicyAndLogoPresent(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.privacyPolicyPage(getDriver());

    }

    @Test

    public void horseM4nImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.horseM4nImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "HORSEM4N - ROG SAGA");

    }

    @Test


    public void Se7enImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.Sa7enImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "SE7EN - ROG SAGA");

    }

    @Test

    public void AkiraImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.AkiraImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "AKIRA - ROG SAGA");

    }

    @Test

    public void AchtImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.AchtImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "AchT - ROG SAGA");

    }

    @Test

    public void GoImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.GoImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "GO - ROG SAGA");

    }

    @Test

    public void OmniImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.OmniImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "OMNI - ROG SAGA");

    }

    @Test

    public void PKDImageAndPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGStoryPage ROGSP = new ROGStoryPage(getDriver());

        Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.accessROGStoryPage(getDriver());
        Assert.assertEquals(getPageTitle(), "ROG SAGA");
        ROGSP.PKDImageAndLogo(getDriver());
        Assert.assertEquals(getPageTitle(), "PKD - ROG SAGA");

    }


}

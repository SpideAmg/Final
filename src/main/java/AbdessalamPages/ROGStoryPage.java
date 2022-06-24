package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ROGStoryPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ROGStoryPage.class);

    @FindBy(id = "universe")
    private WebElement ROGEyeView;

    @FindBy(xpath = "//*[@class='elementor-widget-wrap elementor-element-populated']")
    private WebElement OurCreation;

    @FindBy(xpath = "//*[@class='owl-next']")
    private WebElement RightClick;

    @FindBy(xpath = "//*[@class='owl-prev']")
    private WebElement LeftClick;

    @FindBy(xpath = "//*[@id=\"worldview\"]/div/div[2]/div/div/div[1]/div/div[2]/div/p[1]")
    private WebElement TheSaga;

    @FindBy(xpath = "//*[@id=\"bts\"]/div")
    private WebElement onTheHorizon;

    @FindBy(xpath = "//*[@id=\"bts\"]/div/div/ul/li[1]/a[3]")
    private WebElement More1;

    @FindBy(xpath = "//*[@id=\"bts\"]/div/div/ul/li[2]/a[3]")
    private WebElement More2;

    @FindBy(xpath = "//*[@id=\"bts\"]/div/div/ul/li[3]/a[3]")
    private WebElement More3;

    @FindBy(xpath = "//*[@id=\"bts\"]/div/div/ul/button/div/h3")
    private WebElement TopSecretLogo;

    @FindBy(xpath = "//*[@id=\"footer1-all\"]/div[2]/p/a[2]")
    private WebElement privacyPolicy;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[1]")
    private WebElement HorseM4n;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[2]")
    private WebElement Sa7en;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[3]")
    private WebElement Akira;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[4]")
    private WebElement Acht;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[5]")
    private WebElement Go;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[6]")
    private WebElement Omni;

    @FindBy(xpath = "//*[@id=\"gamers\"]/ul/a[7]")
    private WebElement PKD;







    public ROGStoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void scrollDownAndHoverOverOnAllBtnLoop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ROGEyeView);
        LOG.info("Scroll down to Rog Eye's View successfully");
        List<WebElement> TheList = driver.findElements(By.xpath("//*[@class='inner']"));
        for (int i = 0; i < TheList.size(); i++) {
            TheList.get(i);
            hoverOver(driver, TheList.get(i));
            LOG.info(String.valueOf("HoverOver Successfully"));
            waitFor(1);
        }

    }


    public void scrollDownOurCreationAndTestButtonLeftAndRight(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", OurCreation);
        LOG.info("Scroll down to Our Creation successfully");
        int click = 1;
        do {
            click(RightClick);
            waitFor(1);
            click++;
            LOG.info("Right Button Clicked Successfully");
        } while (click < 5);
        do {
            click(LeftClick);
            waitFor(1);
            click++;
            LOG.info("Left Button Clicked Successfully");
        } while (click < 9);
    }



    public void scrollDownToSagaContinuesButtons(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", TheSaga);
        LOG.info("Scroll down to Saga Continues successfully");
        List<WebElement> TheList = driver.findElements(By.xpath("//*[@class='anchor']"));
        for (int i = 0; i < TheList.size(); i++) {
            TheList.get(i).click();
            LOG.info(String.valueOf("Button Clicked Success"));
            waitFor(1);
        }
    }


    public void InTheWorldOfROGGamerFightForFreedomPageAccess(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", onTheHorizon);
        LOG.info("Scroll down to The Horizon successfully");
        click(More1);
        LOG.info("More button click successfully");
        LOG.info("In The World Of ROG Gamer Fight For Freedom Page opened successfully");

    }

    public void LookInsideTheVisualUniverseOfTheRepublicOfGamersAccess(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", onTheHorizon);
        LOG.info("Scroll down to The Horizon successfully");
        click(More2);
        LOG.info("More button click successfully");
        LOG.info("Look In side The Visual Universe Of The Republic Of Gamers Page opened successfully");
    }

    public void ROGCitadelXvOnSteamPageAccess(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", onTheHorizon);
        LOG.info("Scroll down to The Horizon successfully");
        click(More3);
        LOG.info("More button click successfully");
        LOG.info("ROG Citadel XV On Steam Page opened successfully");

    }

    public void privacyPolicyPage(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", onTheHorizon);
        LOG.info("Scroll down to The Horizon successfully");
        isPresent(TopSecretLogo);
        LOG.info("Top Secret Logo is displayed");
        click(privacyPolicy);
        LOG.info("Privacy Policy Page opened successfully");

    }

    public void horseM4nImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", HorseM4n);
        LOG.info("Scroll down to HorseM4n successfully");
        isInteractable(HorseM4n);
        LOG.info("HorseM4n is intractable");
        click(HorseM4n);
        LOG.info("HorseM4n Page opened successfully");

    }

    public void Sa7enImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Sa7en);
        LOG.info("Scroll down to Sa7en successfully");
        isInteractable(Sa7en);
        LOG.info("Sa7en is intractable");
        waitFor(2);
        click(Sa7en);
        LOG.info("Sa7en Page opened successfully");

    }

    public void AkiraImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Akira);
        LOG.info("Scroll down to Akira successfully");
        isInteractable(Akira);
        LOG.info("Akira is intractable");
        click(Akira);
        LOG.info("Akira Page opened successfully");

    }

    public void AchtImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Acht);
        LOG.info("Scroll down to Acht successfully");
        isInteractable(Acht);
        LOG.info("Acht is intractable");
        click(Acht);
        LOG.info("Acht Page opened successfully");

    }

    public void GoImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Go);
        LOG.info("Scroll down to Go successfully");
        isInteractable(Go);
        LOG.info("Go is intractable");
        click(Go);
        LOG.info("Go Page opened successfully");

    }

    public void OmniImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Omni);
        LOG.info("Scroll down to Omni successfully");
        isInteractable(Omni);
        LOG.info("Omni is intractable");
        click(Omni);
        LOG.info("Omni Page opened successfully");

    }

    public void PKDImageAndLogo(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", PKD);
        LOG.info("Scroll down to PKD successfully");
        isInteractable(PKD);
        LOG.info("PKD is intractable");
        click(PKD);
        LOG.info("PKD Page opened successfully");

    }


}



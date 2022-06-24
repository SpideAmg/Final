package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsusSupportPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AsusSupportPage.class);


    @FindBy(xpath = "//*[@id=\"rogProduct\"]/main/div[3]/div[2]/div[1]/svg/path")
    private WebElement closePopUpWindow;


    @FindBy(css = "//a[@id='']")
    private WebElement GotoServiceDesk;

    @FindBy(id = "search")
    private WebElement SearchBar;

    @FindBy(css = "#rogProduct > main > section.af-sp-container.af-sp-newsAndContact > div > div.partialBlock.news-block")
    private WebElement NewsImportantInformation;

    @FindBy(xpath = "//*[@id=\"allProduct\"]/div/a")
    private WebElement ShowAllProductBtn;



    public AsusSupportPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void SearchBarServiceDesk(){
        waitFor(2);
        click(closePopUpWindow);
        waitFor(1);
        click(GotoServiceDesk);
        LOG.info("Go to service desk Clicked successfully");
        waitFor(1);
        typeAndEnter(SearchBar,"DeskTop");
        LOG.info("DeskTop entered in the search bar successfully and services displayed");
        waitFor(1);


    }
    @FindBy(xpath = "//*[@id=\"rogProduct\"]/main/section[4]/div/div[2]/a")
    private WebElement morenew;

    public void SupportPage(WebDriver driver){
        waitFor(2);
        click(closePopUpWindow);
        LOG.info("Popup Window closed successfully");
        waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", NewsImportantInformation);
        LOG.info("Scroll down to News and Important Information successfully ");
        waitFor(1);
        click(morenew);
        LOG.info("More News button click successfully");

    }
    public void clickOnMoreNews(){
        click(morenew);

    }

    @FindBy(css = "head > title")
    private WebElement Title;

    public void SupportPageShowAllProductBtn(WebDriver driver){
        waitFor(2);
        click(closePopUpWindow);
        LOG.info("Windows Close");
         waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ShowAllProductBtn);
        click(ShowAllProductBtn);
        LOG.info("Show all product button clicked and product displayed");
        waitFor(1);
    }



















}

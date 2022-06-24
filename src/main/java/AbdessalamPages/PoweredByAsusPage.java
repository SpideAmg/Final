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

public class PoweredByAsusPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PoweredByAsusPage.class);


    @FindBy(css = "#hd_logo")
    private WebElement PBALogo;

    @FindBy(xpath = "//*[@id=\"sub_feature_filter\"]/li[1]")
    private WebElement AsusAura;

    @FindBy(xpath = "//*[@id=\"sub_feature_filter\"]/li[2]")
    private WebElement Armoury;



    public PoweredByAsusPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    public void PBA(WebDriver driver){
        isPresent(PBALogo);
        LOG.info("PBA Logo is present");
        waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id=\"sub_feature_filter\"]")));
        LOG.info("Scroll down successfully");

    }


        @FindBy(xpath ="//*[@id=\"footer_logo\"]/img")
        private WebElement ScrolldownPBA;

    @FindBy(css ="#product > div:nth-child(6) > figure")
    private WebElement Hover1;

    @FindBy(css ="#product > div:nth-child(7) > figure")
    private WebElement Hover2;

    @FindBy(css ="#product > div:nth-child(8) > figure")
    private WebElement Hover3;

    @FindBy(css ="#product > div:nth-child(9) > figure")
    private WebElement Hover4;


    public void HoverOverDownPage(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ScrolldownPBA);
        LOG.info("scroll down to PBA successfully");
        waitFor(1);
        hoverOver(driver,Hover1);
        LOG.info("hoverOver successfully");
        hoverOver(driver,Hover2);
        LOG.info("hoverOver successfully");
        hoverOver(driver,Hover3);
        LOG.info("hoverOver successfully");
        hoverOver(driver,Hover4);
        LOG.info("hoverOver successfully");


    }

    @FindBy(css ="#pba_content > div.owl-stage-outer > div > div:nth-child(2) > li > div.video.hd-col50.textbox_two_item.hd-w100 > a > figure")
    private WebElement builds ;

    @FindBy(css = "#pba_content > div.owl-controls > div.owl-nav > div.owl-next")
    private WebElement RightClick;

    @FindBy(css = "#pba_content > div.owl-controls > div.owl-nav > div.owl-prev")
    private WebElement LeftClick;

    public void BuildsClick(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", builds);
        int click = 1;
        do {
            click(RightClick);
            waitFor(1);
            click++;
            LOG.info("Right click success");
        }while (click<3);
        do{
            click(LeftClick);
            waitFor(1);
            click++;
            LOG.info("Left click success");
        }while (click<5);
    }


    @FindBy(css = "#hd_header > div > nav > a:nth-child(4)")
    private WebElement CYB;

    @FindBy(xpath = "//div[contains(text(),'A-Z')]")
    private WebElement dropdown;

    @FindBy(css = "#form1 > div.hdau_right > div.cf > div > div > ul > li:nth-child(2)")
    private WebElement Date;


    public void StorByCYB(){
    click(CYB);
    LOG.info("Sort by CYB button clicked");
    click(dropdown);
    LOG.info("drop down opened successfully");
    click(Date);
    LOG.info("date clicked and CYB sorted by date successfuly ");
    }



}

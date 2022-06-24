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

public class ArmouryCratePage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ArmouryCratePage.class);

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[1]/div/div[1]")
    private WebElement AuraSyncLogo;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[1]/div/div[2]")
    private WebElement EasyDeviceConfigurationLogo;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[1]/div/div[3]")
    private WebElement FastHelpUpDateLogo;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[1]/div/div[4]")
    private WebElement NewNInboxLogo;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[1]/div/div[5]")
    private WebElement SimpleAccountManagementLogo;


    @FindBy(css = "#republic > ul.clickBtn > li.laptopBtn")
    private WebElement LaptopPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.headsetBtn")
    private WebElement HeadSetPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.monitorBtn")
    private WebElement MonitorPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.keyboardBtn")
    private WebElement KeyboardPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.mousepadBtn")
    private WebElement MousePadPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.mouseBtn > img")
    private WebElement MousePlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.motherboardBtn")
    private WebElement MotherBoardPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.aioBtn")
    private WebElement CPULiquidCoolerPlusIcon;

    @FindBy(css = "#republic > ul.clickBtn > li.vgaBtn")
    private WebElement VGAPlusIcon;




    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[9]/div[2]")
    private WebElement picN1;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[9]/div[3]")
    private WebElement picN2;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[9]/div[4]")
    private WebElement picN3;

    @FindBy(xpath = "//*[@id=\"module-system-container\"]/div/div[2]/div/div[4]/div[1]/div/h2/span")
    private WebElement DeviceConfiguration;




    public ArmouryCratePage(WebDriver driver){
        PageFactory.initElements(driver, this);}




    public void hoverOverAuraSyncLogo(WebDriver driver){
        hoverOver(driver, AuraSyncLogo);
    }

    public void hoverOverEasyDeviceConfigurationLogo(WebDriver driver){
        hoverOver(driver, EasyDeviceConfigurationLogo);
    }
    public void hoverOverFastHelpUpDateLogo(WebDriver driver){
        hoverOver(driver, FastHelpUpDateLogo);
    }
    public void hoverOverNewNInboxLogo(WebDriver driver){
        hoverOver(driver, NewNInboxLogo);
    }

    public void hoverOverSimpleAccountManagementLogo(WebDriver driver){
        hoverOver(driver, SimpleAccountManagementLogo);
    }


    public void clickLaptopPlusIcon(){
        click(LaptopPlusIcon);
    }


    public void clickMonitorPlusIcon(){
        click(MonitorPlusIcon);
    }

    public void clickHeadSetPlusIcon(){
        click(HeadSetPlusIcon);
    }

    public void clickKeyboardPlusIcon(){
        click(KeyboardPlusIcon);
    }

    public void clickMousePadPlusIcon(){
        click(MousePadPlusIcon);
    }

    public void clickMousePlusIcon(){
        click(MousePlusIcon);
    }

    public void clickMotherBoardPlusIcon(){
        click(MotherBoardPlusIcon);
    }

    public void clickCPULiquidCoolerPlusIcon(){
      click(CPULiquidCoolerPlusIcon);
    }

    public void clickVGAPlusIcon(){
        click(VGAPlusIcon);
    }


    public void hoverOverPicN1(WebDriver driver){
        hoverOver(driver, picN1);
    }

    public void hoverOverPicN2(WebDriver driver){
        hoverOver(driver, picN2);
    }

    public void hoverOverPicN3(WebDriver driver){
        hoverOver(driver, picN3);
    }


    public void LoopForThePlusIcon(WebDriver driver){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", DeviceConfiguration);
        LOG.info("scroll down to Device Configuration successfully");
        waitFor(1);
        List<WebElement> TheList = driver.findElements(By.cssSelector("img[src='https://dlcdnwebimgs.asus.com/gain/40d70731-4601-4633-a994-1db7858fe0b3/']"));
        for(int i = 0; i< TheList.size(); i++) {
            TheList.get(i).click();
        }


    }
    public void scrolldown(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", DeviceConfiguration);
    }
}
package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PcDiyPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PcDiyPage.class);


    @FindBy (xpath = "//span[contains(text(),\"What's HOT\")]")
    private WebElement WhatsHot;





    public PcDiyPage(WebDriver driver){
        PageFactory.initElements(driver, this);}
}

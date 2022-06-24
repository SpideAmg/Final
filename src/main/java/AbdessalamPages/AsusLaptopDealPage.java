package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsusLaptopDealPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AsusLaptopDealPage.class);


    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
    private WebElement addToCartBtn;

    @FindBy(id = "option-label-color-277-item-181")
    private WebElement BlackBtn;

    @FindBy(id = "option-label-memory-655-item-1267")
    private WebElement HDD;
    public AsusLaptopDealPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartBtn(){

        click(BlackBtn);
        LOG.info("Color black selected");
        waitFor(1);
        click(HDD);
        LOG.info("Storage selected");
        waitFor(1);
        click(addToCartBtn);
    }



}

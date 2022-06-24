package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllSeriesLaptopPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AllSeriesLaptopPage.class);

    @FindBy(css = "#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div.SeriesFilter__filterSection__dOwkx.SeriesFilter__orderItem__3fWdO > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(1) > div > div.FilterCheckBox__wrapper__2QsXG > label")

    private WebElement checkBoxInStockOnAsus;


    public AllSeriesLaptopPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void clickCheckBoxInStockOnAsus(){
        click(checkBoxInStockOnAsus);
    }
}

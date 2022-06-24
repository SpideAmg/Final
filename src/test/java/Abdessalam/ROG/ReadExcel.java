package Abdessalam.ROG;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class ReadExcel extends CommonAPI {
    @Test

    public void searchMultipleItems(){
        RepublicOfGamersHomePage ROGP = new RepublicOfGamersHomePage(getDriver());
        ROGP.searchElementfirsTime();
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"/data/AMG-HAR.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "item");
        for (String item: items) {
            ROGP.clearSearchBar();
            ROGP.searchmultipleItem(item);
        }
    }
}

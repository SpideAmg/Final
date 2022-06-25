package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShittyPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ShittyPage.class);


    @FindBy(css = "#checkBoxOption1")
    private WebElement CheckBoxOption1;

    @FindBy(css = "#checkBoxOption2")
    private WebElement CheckBoxOption2;

    @FindBy(css = "#checkBoxOption3")
    private WebElement CheckBoxOption3;

    @FindBy(css = "#dropdown-class-example")
    private WebElement DropDown;

    @FindBy(css = "#radio-btn-example > fieldset > label:nth-child(2) > input")
    private WebElement Radio1;

    @FindBy(css = "#radio-btn-example > fieldset > label:nth-child(3) > input")
    private WebElement Radio2;

    @FindBy(css = "#radio-btn-example > fieldset > label:nth-child(4) > input")
    private WebElement Radio3;

    @FindBy(css = "#autocomplete")
    private WebElement Suggestions;

    @FindBy(xpath = "//*[@id=\"ui-id-122\"]")
    private WebElement Canada;

    @FindBy(xpath = "//*[@id=\"product\"]/tbody/tr[9]/td[1]")
    private WebElement Amount33;

    @FindBy(css = "openwindow")
    private WebElement OpenWindow;


    public ShittyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void CheckBoxOption1() {
        click(CheckBoxOption1);
    }

    public void CheckBoxOption2() {
        click(CheckBoxOption2);
    }

    public void CheckBoxOption3() {
        click(CheckBoxOption3);
    }

    public void SelectDropDown1() {
        selectFromDropdown(DropDown, "Option1");
    }

    public void SelectDropDown2() {
        selectFromDropdown(DropDown, "Option2");
    }

    public void SelectDropDown3() {
        selectFromDropdown(DropDown, "Option3");
    }

    public void selectRadio1() {
        click(Radio1);
    }

    public void selectRadio2() {
        click(Radio2);
    }

    public void selectRadio3() {
        click(Radio3);
    }

    public void typeSuggestions() {
        type(Suggestions, "Can");
    }

    public void suggestDropDown(WebDriver driver) {
        click(Suggestions);
        Suggestions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void CheckIf(){
        checkBoxIsChecked(CheckBoxOption1);
        waitFor(1);
        System.out.println(checkBoxIsChecked(CheckBoxOption1));
        checkBoxIsChecked(CheckBoxOption2);
        waitFor(1);
        System.out.println(checkBoxIsChecked(CheckBoxOption2));
        checkBoxIsChecked(CheckBoxOption3);
        waitFor(1);
        System.out.println(checkBoxIsChecked(CheckBoxOption3));
    }

//    public void switchwindow(WebDriver driver){
//        String ParentWindowHandle = driver.getWindowHandle();
//        click(OpenWindow);
//        waitFor(3);
//        String newPage = driver.getWindowHandle();
//
//        for(String NEWPAGE2 :driver.getWindowHandle()
//        {
//            getDriver().switchTo().window(NEWPAGE2);
//        }
//
//        getDriver().close();
//
//
//    }

}
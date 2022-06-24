package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsusLogInPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AsusLogInPage.class);


    @FindBy(css = "#txtMail")
    private WebElement email;

    @FindBy(css = "#txtMail")
    private WebElement fakemail;

    @FindBy(id = "txtPassword1")
    private WebElement passWord;

    @FindBy(css = "#txtPassword")
    private WebElement fakpassWord;


    public AsusLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterEmail() {
        type(email, "amganas18@gmail.com");
    }

    public void enterFakeEmail() {
        type(email, "abcd@gmail.com");
    }

    public void enterPassWord() {
        typeAndEnter(passWord, "Anes2019");

    }

    public void enterFakePassWord() {
        typeAndEnter(passWord, "Abcd123");
    }







}
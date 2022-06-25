package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class ROGLogInPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ROGLogInPage.class);


    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div[2]/div/div/div/div/form/p[1]")
    private WebElement LogInPageText;

    @FindBy(css = "#txtMail")
    private WebElement Email;

    @FindBy(id = "txtPassword1")
    private WebElement PassWord;


    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div[2]/div/div/div/div/form/div[4]/div/div/div[1]/span")
    private WebElement LogInBtn;


    public ROGLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public String getLogInPageText() {
        return getElementText(LogInPageText);
    }

    public void typeEmail() {
        type(Email, "amganas18@gmail.com");
    }

    public void typePassWord() {
        type(PassWord, "Anes2019");
    }

    public void clickLogInBtn() {
        click(LogInBtn);
        waitFor(1);
    }

    public void typeEmailfake() {
        type(Email, "amganas@gmai.com");
    }

    public void typePassWordfake() {
        type(PassWord, "Anes20144");
    }


    public void Info() {
        typeEmailfake();
        LOG.info("Fake Email entered successfully");
        typePassWordfake();
        LOG.info("Fake Password entered successfully");
        clickLogInBtn();
        LOG.info("LOGIN button clicked successfully");
        waitFor(1);
    }

}

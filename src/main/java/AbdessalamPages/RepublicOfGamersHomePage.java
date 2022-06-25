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
import org.testng.Assert;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RepublicOfGamersHomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RepublicOfGamersHomePage.class);


    @FindBy(xpath = "//*[@class='btn-asus btn-ok btn-read-ck']")
    private WebElement CookiesAcceptBtn;

    @FindBy(xpath = "//*[@id=\"rogMenu\"]/span")
    private WebElement Products;

    @FindBy(xpath = "//*[@class='SlideShow__rightButton__3C9zJ']")
    private WebElement ExploreOurProductsSlideRightBtn;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/main/h2")
    private WebElement HoverExploreOurProductsSlideRightBtn;

    @FindBy(xpath = "//*[@class='SlideShow__leftButton__2Rc32']")
    private WebElement ExploreOurProductsSlideLeftBtn;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > div.Header__iconBlock__339d9 > button")
    private WebElement SearchBtn;

    @FindBy(css = "#search")
    private WebElement SearchBar;

    @FindBy(xpath = "//*[@class='SearchExplore__title__3e_kG']")
    private WebElement ProductText;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(1) > div.headerDropDownMenuList__dropDownMenuContainer__38IYs > div:nth-child(1) > ul:nth-child(3) > li > ul > li:nth-child(1) > a")
    private WebElement ExternalGraphicsDocks2022;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[2]/div[1]/div[3]/div[1]/h3/a/span[1]")
    private WebElement RogXgMobile2022;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[1]/div[1]/h1")
    private WebElement EXTERNALGRAPHICDOCKSText;

    @FindBy(css = "#rogProduct > div > div > div > div.productTabBarContainer.ProductTabBar__productTabBarContainer__1e5nP > div.productTabBarWrapper.ProductTabBar__productTabBarWrapper__1Mza_ > div.ProductTabBar__productInfo__3Gw2U > a > h1")
    private WebElement ROGXGMobile2022Text;

    @FindBy(xpath = "//*[@class='Footer__socialItem__3v6_U']")
    private WebElement FacebookPage;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/footer/div/div[2]/ul[2]/li[2]/a/svg")
    private WebElement TwitterPage;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[1]/div[2]/div[1]/ul[2]/li/ul/li[1]/a")
    private WebElement MotherboardsFromMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div[4]/div[2]/div[1]/div/div/div[4]/div/a")
    private WebElement RogZenith;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div[6]/div/div[2]/div/a")
    private WebElement NotifyMeBtn;

    @FindBy(xpath = "//*[@id=\"rogMenu2\"]")
    private WebElement DownloadMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[3]/div[2]/div/ul/li/ul/li[1]/a")
    private WebElement WallPapersFromMenu;

    @FindBy(xpath = "//*[@id=\\\"rogProduct\\\"]/div/div/div/footer/div/img")
    private WebElement FaceBookIcon;

    @FindBy(css = "#rogMenu3 > span")
    private WebElement CommunityMenu;

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[2]/li[4]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    private WebElement NewsAndArticles;

    @FindBy(xpath = "//*[@class='Footer__language__Xv6jK Footer__footerItemName__3SrWr']")
    private WebElement LanguageBtn;

    @FindBy(css = "#rogMenu1")
    private WebElement InnovationMenu;

    @FindBy(css = "div.rogApp:nth-child(2) div.layout div.home-page div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj:nth-child(1) div.Header__headerContainer__1hIKH:nth-child(2) header.robotoFont.Header__header__32qTZ nav.Header__headerNav__3X-t4 div.Header__headerMenu__3QAOv ul.Header__headerMenuList__3_iXV li.Header__menuList__3fEko:nth-child(2) div.headerDropDownMenuList__dropDownMenuContainer__38IYs div.headerDropDownMenuList__dropDownContent__y-upa ul.headerDropDownMenuList__dropDownOList__pek2X li.headerDropDownMenuList__otherMenuList__3i0oa ul:nth-child(1) > li.dropMenuItem:nth-child(2)")
    private WebElement ArmoryBtn;

    @FindBy(xpath = "//*[@class='userButton headerPersonalBlock__accountButton__dnqUZ headerPersonalBlock__isLogin__17fMM']")
    private WebElement LogInBtn;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement LogInFromBtn;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS")
    private WebElement RecentRelease;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(1)")
    private WebElement Image1;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(2)")
    private WebElement Image2;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(3)")
    private WebElement Image3;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(4)")
    private WebElement Image4;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(5)")
    private WebElement Image5;

    @FindBy(xpath = "//*[@class='Header__asusLogo__30CFg']")
    private WebElement AsusLogo;

    @FindBy(xpath = "//span[contains(text(),\"What's HOT\")]")
    private WebElement WhatsHot;

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[2]/li[5]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    private WebElement AsusPcDiy;

    @FindBy(xpath = "//body/section[@id='get-rewards']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/a[1]")
    private WebElement LearnMoreGetRewards;

    @FindBy(xpath = "//*[@id=\"cookie-policy-info\"]/div/div[2]/div[2]")
    private WebElement CookieAcceptPcDiy;

    @FindBy(css = "#get-rewards > div.bg-white.align-center > div > h2")
    private WebElement scrooltovii;

    @FindBy(css = "#header_menu_2 > nav > ul > li:nth-child(1) > a > span")
    private WebElement HowToJoin;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement ProductsHover;

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[2]/li[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")
    private WebElement TUFClick;

    @FindBy(css = "a[class='Series__seriesSeeAll__qstE3']")
    private WebElement ClickClick;

    @FindBy(xpath = "//*[@id=\"justuno_form\"]/div/div[2]/div[2]/div/div/div")
    private WebElement SmallWindowClos;

    @FindBy(xpath = "//a[@id='rogFooter']")
    private WebElement AboutROGBtn;

    @FindBy(css = "#ar-innovation > div.ar-section-content > div.ar-nav-wrapper")
    private WebElement HoverAndClick;

    @FindBy(xpath = "//div[contains(text(),'Innovations')]")
    private WebElement Innovation;

    @FindBy(xpath = "//div[contains(text(),'Motherboards')]")
    private WebElement MotherBoards;

    @FindBy(xpath = "//div[contains(text(),'Graphics Cards')]")
    private WebElement GraphicsCards;

    @FindBy(xpath = "//div[contains(text(),'Displays')]")
    private WebElement Displays;

    @FindBy(xpath = "//div[contains(text(),'Laptops')]")
    private WebElement LapTops;

    @FindBy(xpath = "//div[contains(text(),'Phones')]")
    private WebElement Phones;

    @FindBy(css = "#ar-milestone > div.ar-section-content > div.ar-nav-wrapper")
    private WebElement DownThePage;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[1]")
    private WebElement Inception;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[2]")
    private WebElement Intuition;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[3]")
    private WebElement Vision;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[4]")
    private WebElement Immersion;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[5]")
    private WebElement Portability;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[6]")
    private WebElement Power;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[7]")
    private WebElement Precision;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[8]")
    private WebElement Ecosystem;

    @FindBy(css = "#ar-mission > div > div > div.text-wrapper > div > p")
    private WebElement OurMission;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(7) > a")
    private WebElement ClickOnPBA;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > div.Header__iconBlock__339d9 > div.headerPersonalBlock__personalWrapper__28wGT > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement SettingBtn;

    @FindBy(css = "#menu > div > div > ul > li:nth-child(9) > a")
    private WebElement myProduct;

    @FindBy(xpath="//*[@alt='search']")
    private WebElement searchBTN;

    @FindBy(id = "search")
    private WebElement Searchbarfirstt;

    @FindBy(xpath = "//*[@type='text']")
    private WebElement SearchBar2;

    @FindBy(xpath = "//*[@class='StoryFooter__storyFooterContainer__2HAX_']")
    private WebElement StoryImage;

    @FindBy(css = "button[aria-label='Learn more about Slide 2 - ROG Flow X16']")
    private WebElement ClickOnRedLine;

    @FindBy(css = " #rogContent1 > div > picture > img")
    private WebElement ClickOnX16;

    @FindBy(css = "#rogProduct > div > div > div > footer > div > div:nth-child(1) > div > div > a > svg")
    private WebElement scrolltoit;

    @FindBy(css = "#rogProduct > div:nth-child(2) > div > div > div > div > form > div.LoginPage__loginErrorMsg__3osO5")
    private WebElement Wrong;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/main/div[1]/a[1]")
    private WebElement toGo;

    @FindBy(css = "#flow_z13 > div.width-half.content > h2")
    private WebElement toView;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[6]/a/span")
    private WebElement SupportBtn;

    @FindBy(xpath = "//header/div[2]/div[1]")
    private WebElement AsusLogos;

    @FindBy(css = "#headerLayerOne > div > div.HeaderDesktop__topLeftMenu___uskw.HeaderDesktop__themeWhite__1bpoN > div:nth-child(3) > a > img.HeaderDesktop__hoverImage__3UNUD")
    private WebElement ROGLogos;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Gamer__gamerContainer__UIMyJ > div.GamerTextContent__gamerTextContent__2SGl4")
    private WebElement ROGInAction;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(5) > div.headerDropDownMenuList__dropDownMenuContainer__38IYs > div > ul > li > ul > li:nth-child(2) > a")
    private WebElement QHD;

    @FindBy(css = "#navbar-collapse > ul > li:nth-child(1) > a")
    private WebElement ROG;

    @FindBy(css = "#navbar-collapse > ul > li:nth-child(2) > a")
    private WebElement TUF;

    @FindBy(css = "#navbar-collapse > ul > li:nth-child(3) > a")
    private WebElement WhatsHott;

    @FindBy(css = "#featured-monitors > div.container > div > div > div.module-titles > div > h2")
    private WebElement FeatureMonitors;

    @FindBy(css = "#features > div.container > div > div > div.module-titles > div > h2")
    private WebElement AsusExecutiveFeatures;

    @FindBy(css = "#enhancements > div.container > div > div > div.module-titles > div > h2")
    private WebElement InGameInEnhancements;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > a > div > svg")
    private WebElement LogoROG;

    @FindBy(css = "#rogFooter2")
    private WebElement AccessibilityBtn;

    @FindBy(xpath = "//*[@id=\"Accessibility\"]/p[1]/a")
    private WebElement WCAG;

    @FindBy(xpath = "//*[@aria-label='Pause Slide']")
    private WebElement Pause;

    @FindBy(xpath = "//*[@aria-label='Play Slide']")
    private WebElement Play;

    @FindBy(xpath = "//*[@class='bagButton MiniCart__bagButton__ztixj']")
    private WebElement CardBtn;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/div[2]/div[3]/div/div")
    private WebElement CardisEmptyText;

    @FindBy(xpath = "//header/div[2]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    private WebElement MyRogEliteReward;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[1]/div[2]/div[1]/ul[2]/li/ul/li[5]/a")
    private WebElement RouterButton;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[1]/div[2]/div[1]/ul[3]/li/ul/li[7]")
    private WebElement Controller;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[2]/div/a[1]/picture[1]/img")
    private WebElement ROGKunai3;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[1]/div[2]/div[1]/ul[2]/li/ul/li[6]/a")
    private WebElement Cases;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[4]/div[2]/div/ul/li/ul/li[3]/a")
    private WebElement GlobalForum;

    @FindBy(xpath = "//*[@aria-label='Learn more about Terms of Use Notice']")
    private WebElement Term;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/footer/div/div[2]/ul[1]/li[2]")
    private WebElement Home;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[2]/div[2]/div/ul/li/ul/li[6]/a")
    private WebElement LeaderShip;






    public RepublicOfGamersHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }




    public void clickCookiesAcceptBtn() {
        click(CookiesAcceptBtn);
    }
    public void hoverOverProducts(WebDriver driver) {
        hoverOver(driver, Products);
    }
    public void clickSlideRightBtn(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", HoverExploreOurProductsSlideRightBtn);
        LOG.info("Scroll down success");
        click(ExploreOurProductsSlideRightBtn);
        LOG.info("Explore Our Products Right Button Clicked Successfully");
    }
    public void clickSlideLeftBtn() {
        click(ExploreOurProductsSlideLeftBtn);
        LOG.info("Explore Our Products left Button Clicked Successfully");
    }
    public void clickSearchBtn() {
        click(SearchBtn);
    }
    public void TypeSearchBar() {
        type(SearchBar, "SSD");
        waitFor(2);
    }
    public void ClearSearchBar() {
        clear(SearchBar);
    }
    public void TypeAndEnterSearchBarr() {
        typeAndEnter(SearchBar, "KeyBoard");
    }
    public String getTextProduct() {
        return getElementText(ProductText);
    }
    public void clickExternalGraphicsDocks2022() {
        click(ExternalGraphicsDocks2022);
    }
    public void clickRogXgMobile2022() {
        click(RogXgMobile2022);
    }
    public void hoverOverRogXgMobile2022(WebDriver driver) {
        hoverOver(driver, RogXgMobile2022);
    }
    public String getEXTERNALGRAPHICDOCKSText() {
        return getElementText(EXTERNALGRAPHICDOCKSText);
    }
    public String getROGXGMobile2022Text() {
        return getElementText(EXTERNALGRAPHICDOCKSText);
    }
    public void ClickFacebookPage(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", FacebookPage);
        LOG.info("Scroll to facebook button success");
        waitFor(1);
        click(FacebookPage);
        LOG.info("facebook button clicked and page opened successfully");
    }
    public void ClickTwitterPage() {
        click(TwitterPage);
    }
    public void clickMotherboardsFromMenu() {
        click(MotherboardsFromMenu);
    }
    public void clickRogZenith() {
        click(RogZenith);
    }
    public void clickNotifyMeBtn() {
        click(NotifyMeBtn);
    }
    public void hoverOverDownloadMenu(WebDriver driver) {
        hoverOver(driver, DownloadMenu);
    }
    public void clickWallPapersFromMenu() {
        click(WallPapersFromMenu);
    }
    public void hoverOverCommunityMenu(WebDriver driver) {
        hoverOver(driver, CommunityMenu);
    }
    public void clickNewsAndArticles() {
        click(NewsAndArticles);
    }
    public void clickLanguageBtn() {
        click(LanguageBtn);
    }
    public void hoverOverInnovationMenu(WebDriver driver) {
        hoverOver(driver, InnovationMenu);
    }
    public void clickArmoryBtn() {
        click(ArmoryBtn);

    }
    public void clickLogInBtn() {
        click(LogInBtn);
    }
    public void clickLogInFromDropDown() {
        click(LogInFromBtn);
    }
    public void ScrollDownToRecentReleases(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", RecentRelease);
    }
    public void hoverOver5Image(WebDriver driver) {
        hoverOver(driver, Image1);
        LOG.info("hover over Image1 success special effects played");
        hoverOver(driver, Image2);
        LOG.info("hover over Image2 success special effects played");
        hoverOver(driver, Image3);
        LOG.info("hover over Image3 success special effects played");
        hoverOver(driver, Image4);
        LOG.info("hover over Image4 success special effects played");
        hoverOver(driver, Image5);
        LOG.info("hover over Image5 success special effects played");
    }
    public void GoBack(WebDriver driver) {
        isInteractable(AsusLogo);
        LOG.info("Asus logo is intractable");
        click(AsusLogo);
        LOG.info("Asus logo clicked successfully");
        driver.navigate().back();
        LOG.info("navigate back success");
        driver.navigate().forward();
        LOG.info("navigate forward success");
    }
    public void hoverAndClickPcDiy(WebDriver driver) {
        clickCookiesAcceptBtn();
        hoverOver(driver, WhatsHot);
        click(AsusPcDiy);
    }
    public void HandlePcDiyPageSwitch(WebDriver driver) {
        clickCookiesAcceptBtn();
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        hoverOver(driver, WhatsHot);
        LOG.info("Hover over Whats HOT success dropdown displayed");
        click(AsusPcDiy);
        LOG.info("Asus PCDIY clicked successfully");
        Set<String> PcDiyHandle = driver.getWindowHandles();
        for (String PcDiyPage : PcDiyHandle) {
            LOG.info("PcDiyPage  :" + PcDiyPage);
            if (!PcDiyPage.equals(ROGPage)) {
                driver.switchTo().window(PcDiyPage);
                LOG.info("Window switched successfully");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", scrooltovii);
                LOG.info("Scroll down successfully");
                click(LearnMoreGetRewards);
                LOG.info("learn more and ger reward clicked");
                waitFor(1);
            }
        }
        String RateYourGearPage = driver.getWindowHandle();
        LOG.info("RateYourGearPage  - " + RateYourGearPage);
        Set<String> RateYourGearHandle = driver.getWindowHandles();
        for (String RateYourGear : RateYourGearHandle) {
            LOG.info(RateYourGear);
            if (!RateYourGear.equals(RateYourGearPage) & !RateYourGear.equals(ROGPage)) {
                driver.switchTo().window(RateYourGear);
                LOG.info("Window switch successfully");
                click(HowToJoin);
                LOG.info("How to join clicked successfully and window opened");
            }
        }
    }

    public void hovereOverProductsClickSwitchPages(WebDriver driver) {
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        hoverOver(driver, ProductsHover);
        LOG.info("Dropdown opened successfully after hover over on it");
        click(TUFClick);
        LOG.info("TUF Clicked successfully");
        Set<String> TUFGaminghandle = driver.getWindowHandles();
        for (String TUFGamingPage : TUFGaminghandle) {
            LOG.info("TUFGaming page  :" + TUFGamingPage);
            if (!TUFGamingPage.equals(ROGPage)) {
                driver.switchTo().window(TUFGamingPage);
                LOG.info("Switch to Tuf Gaming window success");
                driver.switchTo().frame("ju_iframe_775395");
                click(SmallWindowClos);
                LOG.info("Switch to frame and Close it success");
            }
        }
    }
    public void Accessibility(WebDriver driver) {
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AccessibilityBtn);
        LOG.info("scroll to Accessibility success");
        click(AccessibilityBtn);
        LOG.info("Accessibility button click success");
        Set<String> AccHelphandle = driver.getWindowHandles();
        for (String AccessibilityPage : AccHelphandle) {
            LOG.info("Accessibility Page  :" + AccessibilityPage);
            if (!AccessibilityPage.equals(ROGPage)) {
                driver.switchTo().window(AccessibilityPage);
                LOG.info("switch to Accessibility page success");
                click(WCAG);
                LOG.info("WCAG clicked page opened successfully");
            }
        }
    }
    public void ROGLogo() {
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        isPresent(LogoROG);
        isInteractable(LogoROG);
        LOG.info("Rog Logo is intractable");
        click(LogoROG);
        LOG.info("Rog Logo is present and click success");
    }
    public void QHD(WebDriver driver) {
        clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        hoverOver(driver, WhatsHot);
        LOG.info("Hover over Whats hot success and dropdown displayed");
        click(QHD);
        LOG.info("QHD clicked and page opened successfully");
        Set<String> QHDHandle = driver.getWindowHandles();
        for (String QHDPage : QHDHandle) {
            LOG.info("QHDPage  :" + QHDPage);
            if (!QHDPage.equals(ROGPage)) {
                driver.switchTo().window(QHDPage);
                LOG.info("Window switched successfully");
            }
        }
    }
    public void QHDScrollDown(WebDriver driver) {
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        hoverOver(driver, WhatsHot);
        LOG.info("Hover over whats hot success");
        click(QHD);
        LOG.info("QHD clicked successfully");
        Set<String> QHDHandle = driver.getWindowHandles();
        for (String QHDPage : QHDHandle) {
            LOG.info("QHDPage  :" + QHDPage);
            if (!QHDPage.equals(ROGPage)) {
                driver.switchTo().window(QHDPage);
                LOG.info("window switched successfully");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", FeatureMonitors);
                LOG.info("scroll down to Feature Monitors successfully");
                js.executeScript("arguments[0].scrollIntoView(true);", AsusExecutiveFeatures);
                LOG.info("scroll down to Asus Executive Features successfully");
                js.executeScript("arguments[0].scrollIntoView(true);", InGameInEnhancements);
                LOG.info("scroll down to In Game InEnhancements successfully");
            }
        }
    }
    public void Logos() {
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        click(AsusLogos);
        LOG.info("Clicked on Asus logo successfully");
    }
    public void rogAndAsusPagesHandle(WebDriver driver){
        String AsusPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + AsusPage);
        isPresent(ROGLogos);
        click(ROGLogos);
        LOG.info("ROG logo clicked");
        waitFor(1);
        Set<String> ROGHandle = driver.getWindowHandles();
        for (String ROGPage : ROGHandle) {
            LOG.info("ROGPage  :" + ROGPage);
            if (!ROGPage.equals(AsusPage)) {
                driver.switchTo().window(ROGPage);
                LOG.info("Page switched successfully");
//                JavascriptExecutor js = (JavascriptExecutor) driver;
//                js.executeScript("arguments[0].scrollIntoView(true);", ROGInAction);
//                waitFor(1);
            }
        }
    }
    public String getROGInActionText() {
        return getElementText(ROGInAction);
    }
    public void AboutROGMidlePage(WebDriver driver) {
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AboutROGBtn);
        LOG.info("Scroll down to About rog success");
        click(AboutROGBtn);
        LOG.info("About rog Button clicked");
        Set<String> AboutHandle = driver.getWindowHandles();
        for (String AboutPage : AboutHandle) {
            if (!AboutPage.equals(ROGPage)) {
                driver.switchTo().window(AboutPage);
                LOG.info("Page switched successfully");
                waitFor(1);
                js.executeScript("arguments[0].scrollIntoView(true);", HoverAndClick);
                click(Innovation);
                LOG.info("Innovation clicked");
                click(MotherBoards);
                LOG.info("MotherBoards clicked");
                click(GraphicsCards);
                LOG.info("GraphicsCards clicked");
                click(Displays);
                LOG.info("Displays clicked");
                click(LapTops);
                LOG.info("LapTops clicked");
                click(Phones);
                LOG.info("Phones clicked");
            }
        }
    }
    public void AboutRogDownPage(WebDriver driver) {
        clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        String ROGPage = driver.getWindowHandle();
        LOG.info("ParentWindow  - " + ROGPage);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AboutROGBtn);
        LOG.info("Scrolled to About ROG button successfully");
        click(AboutROGBtn);
        LOG.info("About ROG button clicked successfully new window open");
        Set<String> AboutHandle = driver.getWindowHandles();
        for (String AboutPage : AboutHandle) {
            LOG.info("AboutPage  :" + AboutPage);
            if (!AboutPage.equals(ROGPage)) {
                driver.switchTo().window(AboutPage);
                LOG.info("Window switched successfully");
                waitFor(1);
                Assert.assertEquals(getElementText(OurMission), "Unite gamers of diverse backgrounds to achieve their potential together in play." +
                        " Through innovative technology and exceptional experiences, we can push boundaries to create a world without limits.");
                js.executeScript("arguments[0].scrollIntoView(true);", DownThePage);
                LOG.info("Scrolled to Down successfully");
                click(Inception);
                LOG.info("Inception clicked");
                click(Intuition);
                LOG.info("Intuition clicked");
                click(Vision);
                LOG.info("Vision clicked");
                click(Immersion);
                LOG.info("Immersion clicked");
                click(Portability);
                LOG.info("Portability clicked");
                click(Power);
                LOG.info("Power clicked");
                click(Precision);
                LOG.info("Precision clicked");
                click(Ecosystem);
                LOG.info("Ecosystem clicked");
            }
        }
    }
    public void AccessToPowered(){
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        waitFor(3);
        click(ClickOnPBA);
        LOG.info("PBA clicked successfully and page opened");
    }
    public void Support(WebDriver driver){
        clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        waitFor(2);
        click(SupportBtn);
        LOG.info("Support Icon Clicked");
    }
    public void TheList(WebDriver driver){
        click(toGo);
        LOG.info("ToGo button clicked successfully");
        waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", toView);
        LOG.info("Scroll down to view");
        List<WebElement> TheList = driver.findElements(By.xpath("//*[@class='nav']"));
        for(int i = 0; i< TheList.size(); i++) {
            TheList.get(i).click();
            LOG.info("Button Clicked successfully");
        }
    }
    public void ToLogIn(){
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        clickLogInBtn();
        LOG.info("Login Icon clicked and drop down displayed");
        clickLogInFromDropDown();
        LOG.info("login Button clicked");
    }
    public String getTextwrong() {
        return getElementText(Wrong);
    }

    public void SettingAccess(){
        clickLogInBtn();
        LOG.info("LOGIN ICON clicked successfully");
        click(SettingBtn);
        LOG.info("Setting button clicked successfully");
    }
    public void ClickOnMyProduct(){
        click(myProduct);
    }
    public void RogLow(WebDriver driver){
        clickCookiesAcceptBtn();
        LOG.info("Cookies Accepted");
        click(ClickOnRedLine);
        LOG.info("Cookies on the red line success");
        click(ClickOnX16);
        LOG.info("X16 clicked successfully page opened");
        waitFor(1);
        for(int i=0;i<6000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,8)", "scrolltoit");
            LOG.info("Scroll down successfully and special effects played");
        }
    }
    public void accessROGStoryPage(WebDriver driver){
        clickCookiesAcceptBtn();
        LOG.info("Cookies button clicked and Accepted successfully");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", StoryImage);
        LOG.info("Scroll down to Story image Successfully");
        click(StoryImage);
        LOG.info("Story image clicked successfully");
        LOG.info("ROG Story page opened successfully");
    }
    public void searchElementfirsTime(){
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        click(searchBTN);
        LOG.info("Search Button clicked and Search Bar displayed");
        typeAndEnter(Searchbarfirstt,"desktop");
        LOG.info("desktop entered and page opens successfully");
    }
    public void clearSearchBar(){
        clear(SearchBar2);
        LOG.info("clear search bar success");
    }
    public void searchmultipleItem(String item){
        typeAndEnter(SearchBar2, item);
        LOG.info("type in search bar and enter success");
    }

    public void PauseAndPlay(WebDriver driver){
        clickCookiesAcceptBtn();
        LOG.info("Cookies accepted");
        click(Pause);
        LOG.info("Pause button clicked and video stopped playing successfully");
        click(Play);
        LOG.info("Play button clicked and video Start playing successfully");
    }




    public void clickOnCardBtn(){
        click(CardBtn);
    }
    public String CardisEmptyText(){
       return getElementText(CardisEmptyText);
    }

    public void ClickOnMyRogEliteReward(){
        click(MyRogEliteReward);
    }

    public void ClickOnRouterBtn(){
        click(RouterButton);
    }
    public void clickOnController(){
        click(Controller);
    }
    public void ClickOnRogKunai3(){
        click(ROGKunai3);
    }

    public void ClickonCases(){
        click(Cases);
    }
    public void ClickOnGlobalForum(){
        click(GlobalForum);
    }

    public void scrollAndClickTerm(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Term);
        click(Term);

    }

    public void scrollAndClickHome(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Home);
        click(Home);

    }

    public void displayLeaderShip(){
        click(LeaderShip);

    }

}

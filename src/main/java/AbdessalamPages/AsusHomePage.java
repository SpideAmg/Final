package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AsusHomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AsusHomePage.class);

    @FindBy(css = "#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck")
    private WebElement cookieBtn;

    @FindBy(css = "head > title")
    private WebElement headTitle;

    @FindBy(css = "#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN")
    private WebElement logInIcon;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[10]/div/div[2]/div[1]")
    private WebElement logInBtn;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[10]/div/div[2]/div[2]/a")
    private WebElement checkMyOrderBnt;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[10]/div/div[2]/div[3]/a")
    private WebElement myWishlistBnt;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[10]/div/div[2]/div[4]/a")
    private WebElement shoppingFAQsBnt;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[8]")
    private WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[5]")
    private WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[6]/div/div[1]/div/input")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[3]/div/a")
    private WebElement registerBtn;

    @FindBy(xpath = "//*[@class='ProductCardNormal__button__peEUy']")
    private WebElement buyLaptopDeal;

    @FindBy(css = "#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(12) > span")
    private WebElement MenuMotherBoardsAndComponents;

    @FindBy(xpath = "//*[@id=\"dropDownMenu\"]/div/div[1]/ul[1]/li[1]")
    private WebElement motherBoardsFromMenu;

    @FindBy(xpath = "//*[@class='HeaderLevelOneDropDownMenu__active__1wFkk HeaderLevelOneDropDownMenu__context__2Y8F9']")
    private WebElement AMDChipsetBrandFromMenu;

    @FindBy(xpath = "//li[contains(text(),'Cooling')]")
    private WebElement CoolingBtn;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[14]/div/div[1]/ul[2]/li[2]/a/div")
    private WebElement AllSeriesFromCooling;

    @FindBy(xpath = "//*[@id=\"OfficialFooterWrapper\"]/div[1]/div[2]/div/ul/li[1]/a/img")
    private WebElement FacebookLogo;

    @FindBy(xpath = "//*[@id=\"OfficialFooterWrapper\"]/div[1]/div[2]/div/ul/li[2]/a/img")
    private WebElement TwitterLogo;

    @FindBy(xpath = "//*[@id=\"OfficialFooterWrapper\"]/div[1]/div[2]/div/ul/li[3]/a/img")
    private WebElement LinkedInLogo;

    @FindBy(xpath = "//*[@id=\"OfficialFooterWrapper\"]/div[1]/div[2]/div/ul/li[4]/a/img")
    private WebElement PinterestLogo;

    @FindBy(xpath = "//*[@id=\"OfficialFooterWrapper\"]/div[1]/div[2]/div/ul/li[5]/a/img")
    private WebElement EdgeUpLogo;

    @FindBy(xpath = "//*[@id=\"OfficialFooterWrapper\"]/div[1]/div[2]/div/ul/li[6]/a/img")
    private WebElement GlassDoorLogo;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[9]")
    private WebElement MenuDisplaysAndDesktops;

    @FindBy(css="#dropDownMenu > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul.HeaderLevelOneDropDownMenu__menuColumn__17p1m.HeaderLevelOneDropDownMenu__productLevelTwo__pPSIj > li.HeaderLevelOneDropDownMenu__productLevelItemSelect__2VFHX.menuPDLevelTwo")
    private WebElement MonitorFromMenu;

    @FindBy(xpath = "//*[@id=\"dropDownMenu\"]/div/div[1]/ul[3]/li[8]/a/div")
    private WebElement EyeCareFromMenu;

    @FindBy(xpath= "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[1]/div")
    private WebElement SupportBtn;

    @FindBy(xpath= "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/div/div[1]/div/div/a[5]")
    private WebElement DriversAndManuals;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    private WebElement searchBarModelNamee;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    private WebElement searchBarModelName;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[3]")
    private WebElement Mobile;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[5]/div/div[1]/ul[3]/li[2]/a/div")
    private WebElement PhoneAllSeriesFromMenu;

    @FindBy(css = "#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div:nth-child(1) > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(2) > div > div > label")
    private WebElement CheckBoxGamingPhone;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[6]")
    private WebElement MenuLaptop;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[8]/div/div[1]/ul[2]/li[3]/a/div/text()")
    private WebElement HighPerformanceLaptop;

    @FindBy(xpath = "//*[@class='HeaderLevelOneDropDownMenu__productCategoryList__2sZyn HeaderLevelOneDropDownMenu__productLevel3Item__YN8c5 menuPDLevelThree']")
    private WebElement IntelByChipsetBrand;

    @FindBy(css = "#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(18)")
    private WebElement AccessoriesMenu;

    @FindBy(xpath = "//*[@alt='Wireless Keyboards']")
    private WebElement wirelessKeyboards;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[8]/div/div[1]/ul[3]/li[2]/a/div")
    private WebElement allSeriesFromLaptopMenu;

    @FindBy(xpath = "//*[@id=\"dropDownMenu\"]/div/div[1]/ul[1]/li[2]")
    private WebElement miceAndMousePads;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[20]/div/div[1]/ul[3]/li[2]/a/div")
    private WebElement allSeriesFromMiceAndMousePads;

    @FindBy(css = "#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(11) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul.HeaderLevelOneDropDownMenu__menuColumn__17p1m.HeaderLevelOneDropDownMenu__productLevelTwo__pPSIj > li.HeaderLevelOneDropDownMenu__productLevelItemSelect__2VFHX")
    private WebElement miniPcFromMenu;

    @FindBy(css = "#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(11) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(3) > li:nth-child(2) > a > div")
    private WebElement allSeriesMiniPcFromMenu;

    @FindBy(css = "#dropDownMenu > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul.HeaderLevelOneDropDownMenu__menuColumn__17p1m.HeaderLevelOneDropDownMenu__productLevelTwo__pPSIj > li.HeaderLevelOneDropDownMenu__productLevelItemSelect__2VFHX.menuPDLevelTwo")
    private WebElement homeFromLaptopMenu;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[8]/div/div[1]/ul[3]/li[2]/a/div")
    private WebElement allSeriesFromLaptopHomeMenu;

    @FindBy(xpath = "//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[14]/div/div[1]/ul[3]/li[4]/a/div")
    private WebElement ProArtMotherboards;

    @FindBy(css = "#headerLayerOne > div > div.HeaderDesktop__topRightMenu__1mYR1.HeaderDesktop__themeWhite__1bpoN > div:nth-child(2) > div > span")
    private WebElement GamingBtn;

    @FindBy(xpath = "//*[@id=\"headerLayerOne\"]/div/div[2]/div[2]/div/span")
    private WebElement TufGamingFromMenu;

    @FindBy(xpath = "//*[@class='HeaderDesktop__hoverImage__3UNUD']")
    private WebElement ROGIcon;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[1]/div[5]/div[1]")
    private WebElement getDealsText;



//    @FindBy(xpath) = ""
//    private WebElement





    public AsusHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickCookiesBtn() {
        click(cookieBtn);
    }


    public void clickLogInIcon() {
        click(logInIcon);
    }

    public void clickLogInBtn() {
        click(logInBtn);
    }

    public void clickCheckMyOrderBtn() {
        click(checkMyOrderBnt);
    }

    public void clickMyWishlistBnt() {
        click(myWishlistBnt);
    }

    public void clickShoppingFAQsBnt() {
        click(shoppingFAQsBnt);
    }

    public void clickCartIcon() {
        click(cartIcon);
    }

    public void clickSearchIcon() {
        click(searchIcon);
    }

    public void MousetypeAndEnterInSearchBar() {
        typeAndEnter(searchBar, "Mouse");
    }

    public void clickRegisterBtn() {
        click(registerBtn);
    }

    public void clickBuyLaptopDeal() {
        click(buyLaptopDeal);
    }

    public void hoverOverMotherBoardsAndComponentsMenu(WebDriver driver) {
        hoverOver(driver, MenuMotherBoardsAndComponents);
    }

    public void hoverOverMotherBoardsFromMenu(WebDriver driver) {
        hoverOver(driver, motherBoardsFromMenu);
    }

    public void clickAMDChipsetBrandFromMenu() {
        click(AMDChipsetBrandFromMenu);
    }

    public void hoverOverMenuLaptop(WebDriver driver) {
        hoverOver(driver, MenuLaptop);
    }

    public String getAMDMotherBoardsPageTitle() {
        return getPageTitle();
    }

    public void hoverOverCoolingFromMenu(WebDriver driver){
        hoverOver(driver,CoolingBtn);
    }

    public void ClickOnAllSeriesFronCooling(){
        click(AllSeriesFromCooling);
    }

    public void ClickFacebookLogo(){
        click(FacebookLogo);
    }
    public String getFacebookPageTitle(){
       return getPageTitle();
    }

    public void ClickTwitterLogo(){
        click(TwitterLogo);
    }

    public void ClickLinkedInLogo(){
        click(LinkedInLogo);
    }

    public void ClickPinterestLogo(){
        click(PinterestLogo);
    }

    public void ClickEdgeUpLogo(){
        click(EdgeUpLogo);
    }

    public void ClickGlassDoorLogo(){
        click(GlassDoorLogo);
    }

    public void hoverOverMenuDisplaysAndDesktops(WebDriver driver){
        hoverOver(driver,MenuDisplaysAndDesktops);
    }

    public void hoverOverMonitorFromMenu(WebDriver driver){
        hoverOver(driver,MonitorFromMenu);
    }

    public void clickEyeCareFromMenu(){
        click(EyeCareFromMenu);
    }

    public void hoverOverSupportBtn(WebDriver driver){
        hoverOver(driver,SupportBtn);
    }

    public void clickDriversAndManuals(){
        click(DriversAndManuals);
    }
    public void typeSearchBarModelName(){
        type(searchBarModelName,"GTX1660TI");
    }



    public void clicksearchBarModelNamee(){
        click(searchBarModelNamee);
    }

    public void hoverOverMobile(WebDriver driver){
        hoverOver(driver, Mobile);
    }

    public void clickPhoneAllSeriesFromMenu(){
        click(PhoneAllSeriesFromMenu);
    }

    public void clickCheckBoxGamingPhone(){
        click(CheckBoxGamingPhone);
    }

    public void checkIfBoxCheckedGaming(){
        checkBoxIsChecked(CheckBoxGamingPhone);
    }

    public void clickHighPerformanceLaptop(){
        click(HighPerformanceLaptop);
    }

    public void clickIntelByChipsetBrand(){
        click(IntelByChipsetBrand);
    }

    public void hoverOverAccessoriesMenu(WebDriver driver){
        hoverOver(driver,AccessoriesMenu);
    }

    public void clickWirelessKeyboards(){
        click(wirelessKeyboards);
    }

    public void clickAllSeriesFromLaptopMenu(){
        click(allSeriesFromLaptopMenu);
    }

    public void hoverOverMiceAndMousePads(WebDriver driver){
        hoverOver(driver,miceAndMousePads);
    }

    public void clickAllSeriesFromMiceAndMousePads(){
        click(allSeriesFromMiceAndMousePads);
    }

    public void hoverOverMiniPcFromMenu(WebDriver driver){
        hoverOver(driver,miniPcFromMenu);
    }

    public void clickAllSeriesMiniPcFromMenu(){
        click(allSeriesMiniPcFromMenu);
    }

    public void hoverOverHomeFromLaptopMenu(WebDriver driver){
        hoverOver(driver,homeFromLaptopMenu);
    }

    public void ClickAllSeriesFromLaptopHomeMenu(){
        click(allSeriesFromLaptopHomeMenu);
    }

    public void clickProArtMotherboards(){
        click(ProArtMotherboards);
    }

    public void hoverOverGamingBtn(WebDriver driver){
        hoverOver(driver,GamingBtn);
    }

    public void clickTufGamingFromDropDown(){
        click(TufGamingFromMenu);
    }

    public void clickROGIcon(){
        click(ROGIcon);
    }



    public String getDealsText(){

        return getElementText(getDealsText);
    }




}


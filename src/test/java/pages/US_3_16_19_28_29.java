package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_3_16_19_28_29 {

        public US_3_16_19_28_29() {

            PageFactory.initElements(Driver.getDriver(),this);
        }

    // US_003 ait locate'ler

    //HomePage>Login
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement homePageLogin;

    //HomePage>Subscribe pop-up
    @FindBy(xpath = "//div[@id='subscriptionModal']//div/i")
    public WebElement subscribePopupExit;


    //HomePage>All CAtegories Dropdown Menu
    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement allCategories;

    //HomePage>All categories > Computer & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[1]")
    public WebElement computerAndAccessoriesItem;

    //HomePage>All categories > Electronics Devices
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[2]")
    public WebElement electronicsDevicesItem;

    //HomePage>All categories > Watches & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[3]")
    public WebElement watchesAndAccessoriesItem;

    //HomePage>All categories > Fashions
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[4]")
    public WebElement fashionsItem;

    //HomePage>All categories > Toys,Kids & Babies
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[5]")
    public WebElement toysAndKidsAndBabiesItem;

    //HomePage>All categories > Bag & Shoes
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[6]")
    public WebElement bagAndShoesItem;

    //HomePage>All categories > Lifestyle & Home
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[7]")
    public WebElement lifestyleAndHomeItem;

    //HomePage>All categories > TV & Home Appliances
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[8]")
    public WebElement tvAndHomeAppliancesItem;

    //HomePage>All categories > Auto Mobiles & bikes
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[9]")
    public WebElement autoMobilesAndBikesItem;

    //HomePage>All categories > Computer & Accessories Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[1]")
    public WebElement computerAndAccessoriesMenu;

    //HomePage>All categories > Electronics Devices Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[2]")
    public WebElement electronicsDevicesMenu;

    //HomePage>All categories > Watches & Accessories Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[3]")
    public WebElement watchesAndAccessoriesMenu;

    //HomePage>All categories > Fashions Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[4]")
    public WebElement fashionsMenu;

    //HomePage>All categories > Toys,Kids & Babies Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[5]")
    public WebElement toysAndKidsAndBabiesMenu;

    //HomePage>All categories > Bag & Shoes Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[6]")
    public WebElement bagAndShoesMenu;

    //HomePage>All categories > Lifestyle & Home Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[7]")
    public WebElement lifestyleAndHomeMenu;

    //HomePage>All categories > TV & Home Appliances Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[8]")
    public WebElement tvAndHomeAppliancesMenu;

    //HomePage>All categories > Auto Mobiles & bikes Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[9]")
    public WebElement autoMobilesAndBikesMenu;

    // US_016 ait locate'ler

    //HomePage>Login > Email
    @FindBy(xpath = "//input[@id='text']")
    public WebElement emailTextBox;

    //HomePage>Login > Password
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    //HomePage>Login > Sign In Button
    @FindBy(xpath = "//*[@id=\"sign_in_btn\"]")
    public WebElement signInButton;

    //HomePage>Login > Sign In Button> Dashboard
    @FindBy(xpath = "(//span[@class='d-inline-block lh-1 ']/a)[1]")
    public WebElement dashBoard;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement purchaseHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Title
    @FindBy(xpath = "//h3[text()='Purchase History']")
    public WebElement purchaseHistoryTitle;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History
    @FindBy(xpath = "//div[@class='nice-select amaz_select3']")
    public WebElement purchaseHistoryAllHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>All History
    @FindBy(xpath = "(//ul[@class='list']/li)[1]")
    public WebElement purchaseHistoryAllHistoryAllHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Pending Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[2]")
    public WebElement purchaseHistoryAllHistoryPendingOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Confirmed Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[3]")
    public WebElement purchaseHistoryAllHistoryConfirmedOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Completed Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[4]")
    public WebElement purchaseHistoryAllHistoryCompletedOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Refused&Cancelled Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[5]")
    public WebElement purchaseHistoryAllHistoryRefusedAndCancelledOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action
    @FindBy(xpath = "(//a[@class='amazy_status_btn'])[1]")
    public WebElement purchaseHistoryAction;



    }


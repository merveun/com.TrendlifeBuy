package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_17_30_36 {

    public US_17_30_36() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US_17 **
    //Dashboard
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButonu;

    //MyOrderButonu
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[3]")
    public WebElement myOrderButonu;



    // url > Subscribe pop-up
    @FindBy(css ="#subscriptionModal > div > div.close_modal > i")
    public WebElement subscribePopupExit;

    // All Categories Dropdown Menu
    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement allCategories;

    //loginButonu
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButonu;

    //boxEmail
    @FindBy(xpath = "//input[@id='text']")
    public WebElement boxEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement boxPassword;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement buttonSignIn;

    @FindBy(linkText = "https://qa.trendlifebuy.com/login")
    public WebElement linkRegisterPage;


    @FindBy(xpath= "//input[@class='form-control category_box_input']")
    public WebElement aramabutonu;

    //US17-----TC002
    @FindBy (xpath = "//button[@id='home-tab']" )
    public WebElement buttonAll;

    @FindBy (xpath ="//button[@class='nav-link active']" )
    public WebElement buttonToPay;

    @FindBy (xpath = "//button[@id='Ship-tab'] ")
    public WebElement buttonToShip;

    @FindBy(xpath = "//button[@id='Receive-tab'] ")
    public WebElement buttonToReceive;

    //-----US17-----TC03-----

    @FindBy(xpath = "//div[@id='myTabContent']")
    public WebElement bilgiAlani;

    //------US17----TC04
    @FindBy (xpath = "//option[text()='Last 5 orders']")
    public WebElement last5Orders;

    @FindBy (xpath = "//option[text()='Last 20 orders']")
    public WebElement last2Orders;

    @FindBy (xpath = "//option[text()='Last 40 orders']")
    public WebElement last4Orders;


    //-------------------------------------US30----------------------------------------------//
    //TC01

    @FindBy (xpath = "//i[@class='fa fa-bell']")
    public WebElement iconNotification;

    @FindBy(xpath = "//a[@class='primary-btn radius_30px text_white  fix-gr-bg']")
    public WebElement buttonSetting;

    @FindBy (id="text")
    public WebElement adminBoxMail;


    @FindBy (id ="password")
    public WebElement adminBoxPassword;

    @FindBy (id = "sign_in_btn")
    public WebElement adminBoxSignIn;


    @FindBy(linkText = "https://trendlifebuy.com/admin/login")
    public WebElement linkAdmin;

    @FindBy (xpath = "//a[@class='notification-content notification_read_btn']")
    public WebElement ilkbildirim;












}

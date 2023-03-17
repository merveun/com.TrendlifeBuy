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

    //------US17----TC04-----

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

    @FindBy(xpath = "//h4[text()='Notifications']")
    public WebElement notificationyazisi;

    //personel notification sayfasındaki mesaj tipi
    @FindBy (xpath = "//span[@class='checkmark']")
    public WebElement buttonType;

    @FindBy (xpath = "//div[text()='Updated successfully!']")
    public WebElement messageUptadeSuccsess;

        //div[@class='toast-title']

    @FindBy  (xpath = "//a[text()='Read all']")
    public WebElement buttonReadAll;

    @FindBy (xpath = "//a[text()='View']")
    public WebElement buttonView;

    @FindBy (xpath = "//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement pagesView;

    //-----------------------------------------------US36-----------
    //--------TC01------
    @FindBy (xpath = "//span[text()='Gift Card']")
    public WebElement buttonGiftCArd;

    @FindBy (xpath = "//a[text()='Gift Card List']")
    public WebElement buttonGiftCardList;
    //------TC02--------

    @FindBy(xpath = "//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement giftCardAlani;
    //-----TC03------

    @FindBy(xpath = "//div[@class='slider round']")
    public WebElement typeStatus;

   @FindBy(xpath = " //div[@class='toast toast-success']")
    public WebElement mmessageToast;
   //-----TC05-------

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement buttonAction;

    @FindBy(xpath = "(//div[@class='dropdown CRM_dropdown'])[2]")
    public WebElement buttonSelect;
      //  (//button[@class='btn btn-secondary dropdown-toggle'])[1]
    @FindBy(xpath = "(//a[text()='View'])[3]")
    public WebElement buttonViewAdmin;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/admin/giftcard/edit/21'])[2]")
    public WebElement buttonEdit;
          // (//a[text()='Edit'])[2]  (//a[@class='dropdown-item edit_brand'])[4]
    @FindBy(xpath = "(//a[text()='Delete'])[2]")
    public WebElement buttonDelete;
   //-------TC06------

    @FindBy(xpath = "//td[text()='friends']")
    public WebElement friendsCard;

    @FindBy (xpath = "//div[@class='main-title d-md-flex']")
    public WebElement nameFriends;
    //----TC07-------

    @FindBy(xpath = "//span[text()='Inactive']")
    public WebElement textInactive;
    //------TC08------

    @FindBy (xpath = "//button[@class='dt-button buttons-print']")
    public WebElement buttonPrint;
    //------TC09------

    @FindBy(xpath = "//div[@class='main-title']")
    public WebElement textEditGifCard;
    //-------TC11----

    @FindBy (xpath = "//input[@class='primary_input_field']")
    public WebElement editName;

    @FindBy(xpath = "//input[@id='selling_price']")
    public WebElement editSelling;

    @FindBy (xpath = "//button[@id='submit_btn']")
    public WebElement buttonEditUpdate;


    //----TC12-------
    @FindBy(id = "dataDeleteBtn")
    public WebElement buttonDeleteSon;

































}

package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.security.auth.x500.X500Principal;
import java.util.List;

public class US_1_11_12_18_25_31_38 {

    public US_1_11_12_18_25_31_38() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // url > Subscribe pop-up exit butonu
    @FindBy(css = "#subscriptionModal > div > div.close_modal > i")
    public WebElement PopupExitButon;

    //blog > home
    @FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[2]/a")
    public WebElement headerBlogLinki;

    //readmore > blog > home
    @FindBy(xpath = "//a[@class=\"amazy_readMore_link\"]")
    public WebElement readmorelinki;

    @FindBy(xpath = "//input[@placeholder=\"Search posts\"]")
    public WebElement searchpostsbox;


    @FindBy(xpath = "//a[text()=\"Nature \"]")
    public WebElement categoryBloglari;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/ul/li[2]")
    public WebElement keywordBloglari;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/a")
    public WebElement popularPostBloglari;


    @FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[4]")
    public WebElement contact_link;

    @FindBy(xpath = "//span[text()=\"Call or WhatsApp:\"]")
    public WebElement CallOrWhatsApp;

    @FindBy(xpath = "//span[text()=\"Get in touch:\"]")
    public WebElement GetInTouch;


    @FindBy(xpath = "//span[text()=\"Social Media:\"]")
    public WebElement SocialMedia;


    @FindBy(xpath = "//span[text()=\"Head office:\"]")
    public WebElement HeadOffice;


    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement ContactName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement emailAddress;

    @FindBy(xpath = "//div[@class=\"nice-select amaz_select2 style2 wide mb_30 nc_select\"]")
    public WebElement SelectDropDown;

    @FindBy(xpath = "//li[text()=\"Customer\"]")
    public WebElement instalion;


    @FindBy(xpath = "//input[@class=\"nice-select-search\"]")
    public WebElement selectsearchbox;


    @FindBy(xpath = "//div[@class=\"col-lg-12 text-right send_query_btn\"]")
    public WebElement sendbutton;


    @FindBy(xpath = "//i[@class=\"fab fa-facebook\"]")
    public WebElement facebookikon;


    @FindBy(xpath = "//i[@class=\"fab fa-twitter\"]")
    public WebElement twitterikon;


    @FindBy(xpath = "//i[@class=\"fab fa-linkedin-in\"]")
    public WebElement instagramikon;


    @FindBy(xpath = "//i[@class=\"fab fa-instagram\"]")
    public WebElement linkedlnikon;


    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[2]/div/div/div/div/div[3]/div[1]/div/span/a[1]")
    public WebElement loginButon;


    @FindBy(xpath = "//input[@placeholder=\"Email address\"]")
    public WebElement emailAddres;


    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement password;

    @FindBy(id = "//button[text()='Sign In']]")
    public WebElement logingirisbutonu;


    @FindBy(xpath = "//a[text()=\"Dashboard\"]")
    public WebElement dashboardLinki;


    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[3]/ul/li[4]")
    public WebElement myorderlinki;

    @FindBy(xpath = "//a[text()=\"Order Details\"]")
    public WebElement orderDetails;

    @FindBy(xpath = "//h4[text()=\"Package : 23030911313658\"]")
    public WebElement orderDetailsgirildi;


    @FindBy(xpath = "//h4[text()=\"Order ID:  \"]")
    public WebElement orderID;

    @FindBy(xpath = "//p[text()=\" 2023-03-09 23:36:31\"]")
    public WebElement orderDate;

    @FindBy(xpath = "//h4[text()=\"Order amount: \"]")
    public WebElement orderAmount;

    @FindBy(xpath = "//h4[text()=\"Package : 23030911313658\"]")
    public WebElement package2;

    @FindBy(xpath = "//h4[text()=\"Price: $ 303\"]")
    public WebElement price;

    //h4[text()="Shipping Info "]
    @FindBy(xpath = "//h4[text()=\"Shipping Info \"]")
    public WebElement shippingInfo;


    @FindBy(xpath = "//h4[text()=\"Billing Info \"]")
    public WebElement billingInfo;

    @FindBy(xpath = "//h4[text()=\"Payment Info \"]")
    public WebElement paymentInfo;


    @FindBy(xpath = "//h4[text()=\"Ordered\"]")
    public WebElement ordered;

    @FindBy(xpath = "//h4[text()=\"Processing\"]")
    public WebElement processing;

    @FindBy(xpath = "//h4[text()=\"Recieved\"]")
    public WebElement recieved;

    @FindBy(xpath = "//h4[text()=\"Delivered\"]")
    public WebElement delivered;

    @FindBy(xpath = "//h5[text()=\"Payment Status\"]")
    public WebElement pending;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div[1]/div/p")
    public WebElement orderedText;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div[2]/div/p")
    public WebElement processingText;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div[3]/div/p")
    public WebElement shippedText;
    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div[4]/div/p")
    public WebElement recievedText;
    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[2]/div[5]/div/p")
    public WebElement deliveredText;


    @FindBy(xpath = "//a[text()=\"Cancel Order\"]")
    public WebElement cancelOrder;

    @FindBy(xpath = "//div//h3[text()=\"Select cancel reason\"]")
    public WebElement selectCancelReason;

    @FindBy(xpath = "//a[text()=\"/ Logout\"]")
    public WebElement logOutbutonu;

    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/my-wishlist\"][1])")
    public WebElement logOutSidebar;


    // ADMIN LOCATELERI

    @FindBy(xpath = "//input[@placeholder=\"Email address\"]")
    public WebElement adminEmailAddress;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement adminPassword;


    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    public WebElement adminSignIn;

    //span[text()="Dashboard"]

    @FindBy(xpath = "//span[text()=\"Dashboard\"]")
    public WebElement adminDashboardlinki;

    @FindBy(id = "profile_pic")
    public WebElement adminProfilgorsel;

    @FindBy(xpath = "//h5[text()=\"Admin120\"]")
    public WebElement profilNameBilgisi;



    @FindBy(xpath = "//a[text()=\"My Profile\"]")
    public WebElement myprofillinki;

    @FindBy(xpath = "//a[text()=\"Log out\"]")
    public WebElement logoutlinki;



    @FindBy(xpath = "//input[@id=\"first_name\"]")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id=\"date_of_birth\"]")
    public WebElement dateofbirth;

    @FindBy(xpath = "//input[@id=\"last_name\"]")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id=\"phone\"]")
    public WebElement phonenumber;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement email;


    @FindBy(xpath = "//button[@id=\"update_info\"]")
    public  WebElement updatenowbutton;


    @FindBy(xpath = "//div[@id=\"toast-container\"]")
    public WebElement updatesuccess;


    @FindBy(xpath = "//a[@id=\"address_list_tab\"]")
    public  WebElement addresslinki;

    @FindBy(xpath = "//h3[text()=\"Address\"]")
    public WebElement addressayfasionay;

    @FindBy(xpath = "//a[@class=\"primary-btn radius_30px mr-10 fix-gr-bg add_new_address\"]")
    public WebElement addnewaddressbutonu;

    @FindBy(xpath = "//span[text()=\"Admin Reports\"]")
    public WebElement adminreports;

    @FindBy(xpath = "//a[text()=\"Keywords search\"]")
    public WebElement keywordsearch;


    @FindBy(xpath = "//input[@placeholder=\"Quick Search\"]")
    public WebElement quicksearch;


    @FindBy(xpath = "//td[text()=\"No matching records found\"]")
    public WebElement quicksearchverigeldimi;


    @FindBy(xpath = "//section[@class=\"admin-visitor-area up_st_admin_visitor\"]")
    public WebElement keyboardlistesi;

    @FindBy(xpath = "//th[text()=\"Keywords\"]")
    public WebElement keywordbasligi;

    @FindBy(xpath = "//th[text()=\"Number of time\"]")
    public WebElement numberofTime;


    @FindBy(xpath = "//*[@id=\"home\"]/div[1]/div[2]/div[2]/a")
    public WebElement orderdetails;

    @FindBy(xpath = "//h5[text()=\"Ordered\"]")
    public WebElement orderdetailseegidildimi;


    @FindBy(xpath = "//div[@class=\"nice-select primary_input3 radius_3px style6 open\"]")
    public WebElement country;


    @FindBy(xpath = "//*[@id=\"order_cancel_form\"]/div/div[1]/div/div")
    public  WebElement reasonOneClick;

    @FindBy(xpath = "//*[@id=\"order_cancel_form\"]/div/div[1]/div/div/div/input")
    public WebElement reasonSearch;

    @FindBy(xpath = "(//button[text()=\"Send\"])")
    public WebElement reasonSend;

    @FindBy(xpath = "//a[text()=\"Order Cancelled\"]")
    public  WebElement orderCancelled;

    @FindBy(xpath = "//li[text()=\"ra.deneme\"]")
    public WebElement raDeneme;


    @FindBy(xpath = "//a[@data-dt-idx=\"2\"]")
    public WebElement sayfalararasigecis;

    @FindBy(xpath = "//div[text()=\"Showing 11 to 20 of 129 entries\"]")
    public WebElement sayfalararasigecisonay;

    @FindBy(xpath = "//*[@id=\"userSearchTable\"]/tbody/tr")
    public List<WebElement> satirSayisi;


    @FindBy(xpath = "//input[@id=\"address_name\"]")
    public WebElement nameAddnewAddress;

    @FindBy(xpath = "//input[@id=\"customer_phn\"]")
    public WebElement phoneNumberAddnewAddress;
    @FindBy(xpath = "//input[@id=\"Email_Address1\"]")
    public WebElement emailAddnewAddress;

    @FindBy(xpath = "//input[@id=\"Address\"]")
    public WebElement addressAddnewAddress;

    @FindBy(xpath ="//*[@id=\"address_form\"]/div/div[5]/div/div")
    public WebElement dropcountry;

    @FindBy(xpath = "//*[@id=\"address_form\"]/div/div[5]/div/div/div/input")
    public WebElement selectcountry;

    @FindBy(xpath = "//li[text()=\"Turkey\"]")
    public WebElement countrysecilen;

    @FindBy(xpath = "//*[@id=\"address_form\"]/div/div[6]/div/div/span")
    public  WebElement selectcıty;

    @FindBy(xpath = "//*[@id=\"address_form\"]/div/div[6]/div/div/div/input")
    public WebElement cityyaz;

    @FindBy(xpath = "//*[@id=\"address_form\"]/div/div[7]/div/div")
    public  WebElement selectIlce;

    @FindBy(xpath = "//*[@id=\"address_form\"]/div/div[7]/div/div/div/input")
    public WebElement ilceyaz;

    @FindBy(xpath = "//input[@id=\"postal_code\"]")
    public WebElement postacode;

    @FindBy(xpath = "//button[@class=\"primary-btn semi_large2 fix-gr-bg float-none\"]")
    public WebElement save;

    @FindBy(xpath = "//li[text()=\"Kayseri\"]")
    public  WebElement citysecilen;

    @FindBy(xpath = "//li[text()=\"Develi\"]")
    public  WebElement ilcesecilen;



@FindBy(xpath = "//div[@class=\"table-responsive\"]")
    public WebElement addressgöründümü;






}





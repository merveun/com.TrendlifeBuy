package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath = "//h3[text()=\"Select cancel reason\"]")
    public WebElement selectCancelReason;

}





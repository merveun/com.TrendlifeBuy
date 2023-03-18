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
    public  WebElement categoryBloglari;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/ul/li[2]")
    public  WebElement keywordBloglari;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/a")
    public WebElement popularPostBloglari;


    @FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[4]")
    public WebElement contact_link;

    @FindBy(xpath = "//span[text()=\"Call or WhatsApp:\"]")
    public  WebElement CallOrWhatsApp;

    @FindBy(xpath = "//span[text()=\"Get in touch:\"]")
    public WebElement GetInTouch;


    @FindBy(xpath = "//span[text()=\"Social Media:\"]")
    public WebElement SocialMedia;


    @FindBy(xpath = "//span[text()=\"Head office:\"]")
    public WebElement HeadOffice;


    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement ContactName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public  WebElement emailAddress;

    @FindBy(xpath = "//div[@class=\"nice-select amaz_select2 style2 wide mb_30 nc_select open\"]")
    public  WebElement SelectDown;

    @FindBy(xpath = "//li[text()=\"Customer\"]")
    public  WebElement instalion;


}





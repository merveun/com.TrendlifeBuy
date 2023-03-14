package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_04_05_06_09_15_24_pages {

    public US_04_05_06_09_15_24_pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Home page --> pop up
    @FindBy(css = "#subscriptionModal > div > div.close_modal > i")
    public WebElement PopupExit;

    //Home page --> My Account
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    //Home page --> Order Status
    @FindBy(xpath = "//a[text()='Order Status']")
    public WebElement orderStatus;

    //Home page --> Referral
    @FindBy(xpath = "//a[text()='Referral']")
    public WebElement referral;

    //Home page --> Coupons
    @FindBy(xpath = "//a[text()='Coupons']")
    public WebElement coupons;

    //Home page subnemu--> About Us
    @FindBy(xpath = "(//a[text()='About Us'])[3]")
    public WebElement aboutUs;

    //Home page subnemu--> Contact Us link
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUs;

    //Home page subnemu--> Career  link
    @FindBy(xpath = "//a[text()='Career']")
    public WebElement career;

    //Home page subnemu--> Refund Policy link
    @FindBy(xpath = "//a[text()='Refund Policy']")
    public WebElement refundPolicy;

    //Home page subnemu--> Terms & Condition link
    @FindBy(xpath = "//a[text()='Terms & Condition']")
    public WebElement termsCondition;

    //Home page subnemu--> Google Play button
    @FindBy(xpath = "//a[@class='google_play_box d-flex align-items-center mb_10']")
    public WebElement googlePlayButton;

    //Home page subnemu--> Apple Store button
    @FindBy(xpath = "//*[h4='Apple Store']")
    public WebElement appleStoreButton;


    //Home page subnemu--> Go To Top
    @FindBy(xpath = "//a[@title= 'Go to Top']")
    public WebElement goToTop;

    //Home page --> Search Your Item Box
    @FindBy(xpath = "//input[@class='form-control category_box_input']")
    public WebElement searchBox;

    //Home page subnemu--> facebook icon
    @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;


    //Home page subnemu--> twitter icon
    @FindBy(xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterIcon;


    //Home page subnemu--> liknedin icon
    @FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;


    //Home page subnemu--> instagram icon
    @FindBy(xpath = "//*[@class='fab fa-instagram']")
    public WebElement instagramIcon;


    //Home page bodynemu--> Trending Products
    @FindBy(xpath = "//h3[text()='Trending Products']")
    public WebElement trendingProducts;

    //Home page bodynemu--> Hot Categories
    @FindBy(xpath = "//h3[text()='Hot  Categories']")
    public WebElement hotCategories;

    //Home page bodynemu--> House Appliances
    @FindBy(xpath = "//h4[text()='House Appliances']")
    public WebElement houseAppliances;





    //Home page bodynemu-->Recommendation For You
    @FindBy(xpath = "//h4[text()='Recommendation For You']")
    public WebElement recommendtaionForYou;


    //Home page bodynemu-->Top Brand
    @FindBy(xpath = "//h3[text()='Top Brand']")
    public WebElement topBrand;

    //Home page bodynemu-->Popular Searches
    @FindBy(xpath = "//h3[text()='Popular Searches']")
    public WebElement popularSearches;

    //Home page bodynemu-->Trendlifebuy | ONLINE SHOPPING
    @FindBy(xpath = "//h3[text()='Trendlifebuy | ONLINE SHOPPING']")
    public WebElement trenbuylifeOnlineShopping;


//Home page bodynemu-->Trending products viewAll
    @FindBy(xpath = "(//a[@class='title_link d-flex align-items-center lh-1'])[1]")
    public WebElement viewAll_trendingProducts;



//Home page bodynemu-->Hot Categories viewAll
    @FindBy(xpath = "(//span[text()='View All'])[2]")
    public WebElement viewAll_hotcategories;


//Home page subnemu-->More Deals
    @FindBy(xpath = "(//span[@class='title_text'])[3]")
    public WebElement moreDealsButton;



//Home page subnemu-->Load More
    @FindBy(id = "loadmore")
    public WebElement loadMoreButton;























}
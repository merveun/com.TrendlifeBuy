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
    public WebElement HomePageLogin;

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







    }


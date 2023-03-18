package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_2_35 {
    public US_2_35() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Homepage/popup
    @FindBy(css = "#subscriptionModal > div > div.close_modal > i")
    public WebElement popupclose;

    //Homepage/Header > playstore button
    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement playstoreButton;

    //Homepage/Header > appstore button
    @FindBy(xpath = "//span[text()='App store']")
    public WebElement appstoreButton;

    //Homepage/Header > track your order button
    @FindBy(xpath = "(//a[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[2]")
    public WebElement trackyourorderButton;

    //Homepage/Header > compare button
    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement compareButton;

    //Homepage/Header > wishlist button
    @FindBy(xpath = "//span[text()='Wishlist (']")
    public WebElement wishlistButton;


    //Homepage/Header > cart button
    @FindBy(xpath = "//span[text()='Cart (']")
    public WebElement cartButton;

    //Homepage/Header > logo
    @FindBy(xpath = "(//img[@src=\"https://qa.trendlifebuy.com/public/uploads/settings/63985b425a3e6.png\"])[1]")
    public WebElement logo;

    //Homepage/Header/Menu > home button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    public WebElement homeButton;

    //Homepage/Header/Menu > blog button
    @FindBy(xpath = "(//a[text()='Blog'])[1]")
    public WebElement blogButton;

    //Homepage/Header/Menu > aboutus button
    @FindBy(xpath = "(//a[text()='About Us'])[1]")
    public WebElement aboutusButton;

    //Homepage/Header/Menu > contact button
    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactButton;

    //Homepage/Header_right > login button
    @FindBy(xpath = "(//a[text()=\"Login\"])[1]")
    public WebElement userloginButton;

    //Homepage/Header_right > register button
    @FindBy(xpath = "//a[text()='/ Register']")
    public WebElement registerButton;

    //Homepage/Header_right > new user zone button
    @FindBy(xpath = "//span[text()='New User Zone']")
    public WebElement newuserzoneButton;

    //Homepage/Header > searchbox
    @FindBy(xpath = "(//input[@id='inlineFormInputGroup'])[1]")
    public WebElement searchBox2;

   //Homepage/Search Query Area
    @FindBy(xpath = "//h3[@class='branding_text']")
    public WebElement searchQuery;

    //Admin Panel> Left Menu > Products Button
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productButton;

    //Admin Panel> Left Menu > Products Button > Product List
    @FindBy(xpath = "//a[text()='Product List']")
    public WebElement productListButton;

    //Admin Panel> Left Menu > Products Button > Product List > Product List Text
    @FindBy(xpath = " //h3[text()='Product List']")
    public WebElement productListText;

}

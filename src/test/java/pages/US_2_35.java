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
    @FindBy(xpath = "(//i[@class=\"ti-close\"])[1]")
    public WebElement popupclose;

    //Homepage/Header > playstore button
    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement playstoreButton;

    //Homepage/Header > appstore button
    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement appstoreButton;

    //Homepage/Header > track your order button
    @FindBy(xpath = "//span[text()='Track Your Order']")
    private WebElement trackyourorderButton;

    //Homepage/Header > compare button
    @FindBy(xpath = "//span[text()='Compare(']")
    private WebElement compareButton;

    //Homepage/Header > wishlist button
    @FindBy(xpath = "//span[text()='Wishlist (']")
    private WebElement wishlistButton;


    //Homepage/Header > cart button
    @FindBy(xpath = "//span[text()='Cart (']")
    private WebElement cartButton;

    //Homepage/Header > logo
    @FindBy(xpath = "(//img[@src=\"https://qa.trendlifebuy.com/public/uploads/settings/63985b425a3e6.png\"])[1]")
    private WebElement logo;

    //Homepage/Header/Menu > home button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement homeButton;

    //Homepage/Header/Menu > blog button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement blogButton;

    //Homepage/Header/Menu > aboutus button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement aboutusButton;

    //Homepage/Header/Menu > contact button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement contactButton;

    //Homepage/Header_right > login button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement loginButton;

    //Homepage/Header_right > register button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement registerButton;

    //Homepage/Header_right > new user zone button
    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/\"])[1]")
    private WebElement newuserzoneButton;

    //Homepage/Header > searchbox
    @FindBy(xpath = "(//input[@class=\"form-control category_box_input\"]")
    private WebElement searchBox;



}

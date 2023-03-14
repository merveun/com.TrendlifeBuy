package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_001_011_018_025_031_038 {

    public US_001_011_018_025_031_038() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    // url > Subscribe pop-up exit butonu
    @FindBy(css = "#subscriptionModal > div > div.close_modal > i")
    public WebElement PopupExit;

    //blog > home
    @FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[2]/a")
    public WebElement headerBlogLinki;

    //readmore > blog > home
    @FindBy(xpath = "//a[@class=\"amazy_readMore_link\"]")
    public WebElement readmorelinki;















}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_14_21_23_33 {

    public US_14_21_23_33() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    // US_014 ait locate'ler
    // // url > Subscribe pop-up

    @FindBy(xpath ="//div[@class='newsletter_form_inner']//i[@class='ti-close']")
    public WebElement subscribePopupExit;

    // About Us Menusu
    @FindBy (xpath = "(//a[normalize-space()='About Us'])[1]")
    public WebElement aboutUsMenu;

    @FindBy (xpath = "//div[@class='section__title2']")
    public WebElement qualityReasonblePrices;

    @FindBy (xpath = "//div[@class='about_counter_area section_spacing6']//div[@class='container']")
    public WebElement visibleNumbersAndBoards;

    @FindBy (xpath = "//div[@class='about_value_textBox']")
    public WebElement onlineShoppingEasyWrite;

    @FindBy (xpath = "//div[@class='col-12']//div[@class='section__title2 mb_35']")
    public WebElement teamMemberText;

    @FindBy (xpath = "(//div[@class='col-lg-3 col-md-6'])[1]")
    public WebElement viesibleRobertPattinson;

    @FindBy (xpath = "(//div[@class='col-lg-3 col-md-6'])[2]")
    public WebElement viesibleJohnnyDepp;

    @FindBy (xpath = "(//div[@class='col-lg-3 col-md-6'])[3]")
    public WebElement viesibleJasonStatham;

    @FindBy (xpath = "(//div[@class='col-lg-3 col-md-6'])[4]")
    public WebElement viesibleHarryCooper;

    // US_21 features










}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_20_27_32_40 {

    public US_08_20_27_32_40() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name='login']")
    public WebElement yadminEmailTextBox;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement yadminPasswordTextBox;


    @FindBy (xpath = "//button[text()='Sign In']")
    public WebElement yadminSignInButton;



    @FindBy(xpath = "//th[text()='Action']")
    public WebElement actionText;



    @FindBy(xpath = "//div[@class='nice-select primary_select mb-15'][1]")
    public WebElement   categoryDropDownList;

    //xpath = "//div[@class='nice-select primary_select mb-15'][1]"
    ////*[@id='category_id']
    ////select[@id='category_id']

    @FindBy(xpath = "//li[text()='Select One']")
    public WebElement selectOneOption;

    @FindBy(xpath = "//li[text()='Installation ']")
    public WebElement installationOption;
    @FindBy(xpath = "//li[text()='Technical ']")
    public WebElement technicalOption;
    @FindBy(xpath = "//li[text()='Others ']")
    public WebElement othersOption;

    @FindBy(xpath = "//*[@id='main-content']/section/div/div/div[1]/form/div/div[2]/div/div")
    public WebElement priorityDropdownList;
//xpath = "//select[@id='priority_id']"

    @FindBy(xpath = "/html/body/div[2]/div/section/div/div/div[1]/form/div/div[2]/div/div/ul/li[1]")
    public WebElement selectOnePriorityOption;

    @FindBy(xpath = "//li[text()='High ']")
    public WebElement highOption;
    @FindBy(xpath = "//li[text()='Medium ']")
    public WebElement mediumOption;
    @FindBy(xpath = "//li[text()='Low ']")
    public WebElement lowOption;

    @FindBy(xpath = "/html/body/div[2]/div/section/div/div/div[1]/form/div/div[3]/div/div")
    public WebElement statusDropdown;

    @FindBy(xpath = "//*[@id='main-content']/section/div/div/div[1]/form/div/div[3]/div/div/ul/li[1]")
    public WebElement selectOneStatusOption;

    @FindBy(xpath = "//li[text()='Pending ']")
    public WebElement pendingOption;
    @FindBy(xpath = "//li[text()='Completed ']")
    public WebElement completedOption;
    @FindBy(xpath = "//li[text()='Closed ']")
    public WebElement closedOption;
    @FindBy(xpath = "//li[text()='On Going ']")
    public WebElement ongoingOption;

    @FindBy(xpath = "//button[@id='search_btn']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Admin129  ']")
    public WebElement userAgentText;

    @FindBy(xpath = "//th[text()='Subject']")
    public WebElement subjectText;

    @FindBy(xpath = "//th[text()='Category']")
    public WebElement categoryText;

    @FindBy(xpath = "//th[text()='User Name']")
    public WebElement userNameText;

    @FindBy(xpath = "//th[text()='Priority']")
    public WebElement priorityText;

    @FindBy(xpath = "//th[text()='User Agent']")
    public WebElement userAgenttText;


    @FindBy(xpath = "//th[text()='Status']")
    public WebElement statusText;

    /*@FindBy(xpath = "//th[text()='Action']")
    public WebElement actionText;*/

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboardText;

    @FindBy (xpath = "//span[@class='fas fa-th']")
    public WebElement adminDashboardButton;

    @FindBy(xpath = "//*[text()='Summary ']")
    public WebElement summaryText;

    @FindBy(xpath = "//span[@class='menu_seperator'][2]")
    public  WebElement userManagesText;

    @FindBy(xpath = "//*[text()='Customer'][1]")
    public WebElement customerButton;

    @FindBy(xpath = "//*[text()='All Customer'][1]")
    public WebElement allCustomerButton;

    @FindBy(xpath = "//*[text()='Human Resource']")
    public WebElement humanResourceButton;

    @FindBy(xpath = "//*[text()='Staff']")
    public WebElement staffButton;

    @FindBy(xpath = "//span[@class='menu_seperator'][3]")
    public WebElement orderManagesText;

    @FindBy(xpath = "//*[text()='Order Manage']")
    public WebElement orderManagesButton;

    @FindBy(xpath = "//*[text()='Total Order'][1]")
    public WebElement totalOrderButton;

    @FindBy(xpath = "//span[@class='menu_seperator'][4]")
    public WebElement productManageText;

    @FindBy(xpath = "//*[text()='Products'][1]")
    public WebElement productsButton;

    @FindBy(xpath = "//*[text()='Product List']")
    public WebElement productListButton;

    @FindBy(xpath = "//span[@class='menu_seperator'][5]")
    public WebElement promotionalText;

    @FindBy(xpath = "//*[text()='New User Zone']")
    public WebElement newUsereZoneButton;

    @FindBy(xpath = "//*[text()='Gift Card List']")
    public WebElement giftCardListButton;

    @FindBy(xpath = "//*[text()='Marketing']")
    public WebElement marketingButton;

    @FindBy(xpath = "//*[text()='Gift Card']")
    public WebElement giftCardButton;

    @FindBy(xpath = "//span[@class='menu_seperator'][6]")
    public WebElement financeText;

    @FindBy(xpath = "//*[text()='Account']")
    public WebElement accountButton;

    @FindBy(xpath = "//span[@class='menu_seperator'][7]")
    public WebElement contentText;

    @FindBy(xpath = "//*[text()='Income']")
    public WebElement incomeButton;

    @FindBy(xpath = "//*[text()='Admin Reports']")
    public WebElement adminReportButton;

    @FindBy(xpath = "//*[text()='Visitor'][1]")
    public WebElement visitorButton;

    @FindBy(xpath = "//*[text()='Support Ticket'][1]")
    public WebElement supportTicketButton;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement statusButton;
//============================================8=============================================
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(id = "order_number")
    public WebElement orderTrackingNumberTextbox;

    @FindBy(xpath = "//button[text()='Track Now']")
    public WebElement trackNowButton;

    @FindBy(xpath = "//*[*='Order ID:  ']")
    public WebElement orderID;

    @FindBy(xpath = "//*[*='Track Your Order']")
    public WebElement trackYourOrderButton;

//=============================================================20===================================================

    @FindBy(xpath= "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[7]/a[1]")
    public WebElement myCouponsLink;

    @FindBy(xpath = "//h4[text()='Add Coupons']")
    public WebElement addCouponsText;

    @FindBy(className = "primary_input3 rounded-0 style2  flex-fill")
    public WebElement codeTextbox;

    @FindBy(xpath = "//*[text()='Add Coupon']")
    public WebElement addCouponButton;

    @FindBy(xpath = "//*[text()='Coupon129']")
    public WebElement coupon129Text;

    @FindBy(className= "gj-cursor-pointer coupon_delete_btn")
    public WebElement deleteButton;

    @FindBy(id ="dataDeleteBtn")
    public WebElement deletePopupButton;

    @FindBy(xpath = "//th[text()='Coupon Value']")
    public WebElement couponValueText;



}

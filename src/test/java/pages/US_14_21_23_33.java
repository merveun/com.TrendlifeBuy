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
    public WebElement PopupExit;

    // About Us Menusu
    @FindBy (xpath = "(//a[normalize-space()='About Us'])[1]")
    public WebElement AboutUsMenu;

    @FindBy (xpath = "//div[@class='section__title2']")
    public WebElement qualityReasonblePrices;

    @FindBy (xpath = "//div[@class='about_counter_area section_spacing6']//div[@class='container']")
    public WebElement visibleNumbersAndBoards;

    @FindBy (xpath = "(//div[@class='about_value_textBox'])[1]")
    public WebElement onlineShoppingEasyWrite;

    @FindBy (xpath = "(//div[@class='container'])[8]")
    public WebElement teamMemberText;

    @FindBy (xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleRobertPattinson;

    @FindBy (xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleJohnnyDepp;

    @FindBy (xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleJasonStatham;

    @FindBy (xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleHarryCooper;

    // *************************US_21 features*******************************
    @FindBy (xpath = "(//a[text()='Login'])[1]")
    public WebElement SLoginButton;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement SemailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement SpasswordTextBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement SsignInButton;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement SdashBoard;

    @FindBy(xpath = "//a[normalize-space()='Refund & Dispute']")
    public WebElement SrefundDispute;

    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[1]")
    public WebElement OrderID;

    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[2]")
    public WebElement OrderDate;

    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[3]")
    public WebElement statusPending;

    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[4]")
    public WebElement requestSentDate;

    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[5]")
    public WebElement OrderAmount;

    @FindBy(xpath = "(//a[contains(@class,'amaz_primary_btn style2 text-nowrap')][normalize-space()='View Details'])[1]")
    public WebElement SViewDetailsButton;

    @FindBy(xpath = "(//div[contains(@class,'justify-content-between theme_border')])[1]")
    public WebElement CurrentStatusOfTheOrder;

    @FindBy(xpath = "//h5[normalize-space()='Start']")
    public WebElement StartVisible;

    @FindBy(xpath = "(//h5[normalize-space()='Processing'])[1]")
    public WebElement ProcessingVisible;

    @FindBy(xpath = "(//h5[normalize-space()='Complete'])[1]")
    public WebElement CompletedVisible;

    @FindBy(xpath = "(//div[@class='dashboard_white_box style3 rounded-0 bg-white mb_20'])[1]")
    public WebElement StartOperator;

    @FindBy(xpath = "(//div[@class='dashboard_white_box style3 rounded-0 bg-white mb_20'])[2]")
    public WebElement ProcessingOperator;

    @FindBy(xpath = "(//div[@class='dashboard_white_box style3 rounded-0 bg-white mb_20'])[3]")
    public WebElement CompletedOperator;

    @FindBy(xpath = "(//h4[normalize-space()='Pick Up Info'])[1]")
    public WebElement PickUpInfo;

    // *************************US_23 features*******************************

    @FindBy(xpath = "//a[normalize-space()='Support Ticket']")
    public WebElement supportTicket;

    @FindBy(xpath = "//a[normalize-space()='Support Ticket']")
    public WebElement supportTicketPage;

    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[1]")
    public WebElement AllSubmittedTicketList;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center'][normalize-space()='View'])[1]")
    public WebElement SViewButton;

    @FindBy(xpath = "(//span[normalize-space()='Status'])[1]")
    public WebElement sCustomerStatusInformation;

    @FindBy(xpath = "//button[@id='replay_box_toggler']")
    public WebElement SReplyButton;

    @FindBy(xpath = "//button[@id='replay_box_toggler']")
    public WebElement SReplyTextBox;

    @FindBy(xpath = "//button[normalize-space()='+ Reply now']")
    public WebElement SReplyNowButton;

    @FindBy(xpath = "(//div[@class='ticket_view_box theme_border gray_color_1 radius_5px mb_20'])[9]")
    public WebElement SticketAnswerBox;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SallTicketLink;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
    public WebElement AllTicketSearchButton;

    @FindBy(xpath = "(//li[normalize-space()='Pending'])[1]")
    public WebElement SPendingLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SPendingBox;

    @FindBy(xpath = "(//li[normalize-space()='On Going'])[1]")
    public WebElement SOnGoingLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SOnGoingBox;


    @FindBy(xpath = "(//li[normalize-space()='Completed'])[1]")
    public WebElement SCompletedLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SCompletedBox;
    @FindBy(xpath = "(//li[normalize-space()='Closed'])[1]")
    public WebElement SClosedLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SClosedBox;

    @FindBy(xpath = "(//a[normalize-space()='+ Add New'])[1]")
    public WebElement SAddNewButton;

    @FindBy(xpath = "(//div[@class='dashboard_white_box style4 bg-white mb_25'])[1]")
    public WebElement SCreateNewTicket;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement SSubjectBox;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[1]")
    public WebElement SCategoryBox;

    @FindBy(xpath = "//li[@data-value='55']")
    public WebElement SCategoryBoxOptions;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[2]")
    public WebElement SPriorityBox;

    @FindBy(xpath = "//li[@data-value='33']")
    public WebElement SPriorityBoxOptions;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement SDescriptionBox;

    @FindBy(xpath = "//button[text()='+ Create Now']")
    public WebElement SCreateNowButton;

    @FindBy(xpath = "(//div[@class='dashboard_white_box style5 bg-white mb_25'])[1]")
    public WebElement SCustomerInformation;

    @FindBy(xpath = "//a[normalize-space()='Pending']")
    public WebElement SCustomerPending;
    @FindBy(xpath = "//a[normalize-space()='Very Low']]")
    public WebElement SCustomerVeryLow;
    @FindBy(xpath = "//a[normalize-space()='New Category']")
    public WebElement SCustomerVeryCategory;



    //****************US_33*****************
    // Admin Page
    @FindBy(xpath = "//input[@name='login']")
    public WebElement SAdminName;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement SAdminPassword;
    @FindBy (xpath = "//button[text()='Sign In']")
    public WebElement SadminSignInButton;

    @FindBy (xpath = "//span[normalize-space()='Customer']")
    public WebElement SadminCustomerButton;

    @FindBy (xpath = "//a[contains(@href,'https://trendlifebuy.com/customer/all-customer-list')]")
    public WebElement SadminAllCustomerButton;

    @FindBy (xpath = "//div[@id='all_customer']")
    public WebElement SadminAllCustomerPage;

    @FindBy (xpath = "(//table[@id='allCustomerTable'])[1]")
    public WebElement SadminAllCustomerTable;

    @FindBy (xpath = "(//div[@class='slider round'])[1]")
    public WebElement SadminSliderActiveButton;

    @FindBy (xpath = "(//a[normalize-space()='Active Customer'])[1]")
    public WebElement SadminActiveCustomer;

    @FindBy (xpath = "(//div[@class='tab-content'])[1]")
    public WebElement SadminActiveCustomerPage;

    @FindBy (xpath = "(//td[contains(text(),'1')])[7]")
    public WebElement SadminCustomerPlusButton;

    @FindBy (xpath = "//div[@class='dropdown CRM_dropdown show']//button[@id='dropdownMenu2']")
    public WebElement SadminActiveCustomerSelectButton;

    @FindBy (xpath = "(//button[@id='dropdownMenu2'])[12]")
    public WebElement SadminActiveCustomerSelectLink;

    @FindBy (xpath = "(//a[contains(@type,'button')][normalize-space()='Details'])[12]")
    public WebElement SadminActiveCustomerDetails;

    @FindBy (xpath = "(//a[contains(@type,'button')][normalize-space()='Edit'])[12]")
    public WebElement SadminActiveCustomerEdit;

    @FindBy (xpath = "(//div[@class='white_box_50px box_shadow_white'])[1]")
    public WebElement SadminActiveCustomerEditBasicInfo;
    @FindBy (xpath = "//button[@id='save_button_parent']")
    public WebElement SadminActiveCustomerEditUpdate;


    @FindBy (xpath = "(//a[contains(@type,'button')][normalize-space()='Delete'])[12]")
    public WebElement SadminActiveCustomerDelete;

    @FindBy (xpath = "//div[@class='row justify-content-center']//div[@class='white_box_50px box_shadow_white']")
    public WebElement SadminDetailsCustomerProfilePage;

    @FindBy (xpath = "//div[@class='col-lg-12 student-details']")
    public WebElement SadminDetailsCustomerProfileInform;

    @FindBy (xpath = "(//a[normalize-space()='wallet histories'])[1]")
    public WebElement SadminDetaileWalletHistoriesButton;

    @FindBy (xpath = "//div[@class='row mt-2']//div[@class='white_box_50px box_shadow_white']")
    public WebElement SadminWalletHistoriesBox;

    @FindBy (xpath = "(//a[normalize-space()='Addresses'])[1]")
    public WebElement SadminAddressesButton;

    @FindBy (xpath = "(//div[@class='col-lg-12 student-details'])[1]")
    public WebElement SadminAddressesBox;

    @FindBy (xpath = "//input[@aria-controls='allCustomerTable']")
    public WebElement SadminqQuickSearch;


    @FindBy (xpath = "(//a[normalize-space()='Inactive customer'])[1]")
    public WebElement SadminInactiveCustomerButton;

    @FindBy (xpath = "(//div[@class='tab-content'])[1]")
    public WebElement SadminInactiveCustomerList;

    @FindBy (xpath = "(//td[contains(text(),'1')])[19]")
    public WebElement SadminInactiveCustomerPlus;

    @FindBy (xpath = "//span[@class='dtr-data']//button[@id='dropdownMenu2']")
    public WebElement SadminInactiveCustomerSelect;

    @FindBy (xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    public WebElement SadminInactiveCustomerSelectBox;

    @FindBy (xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//a[@type='button'][normalize-space()='Delete']")
    public WebElement SadminInactiveCustomerDelete;

    @FindBy (xpath = "//a[@id='delete_link']")
    public WebElement SadminInactiveCustomerDeleteLink;

    @FindBy (xpath = "//a[normalize-space()='Create Customer']")
    public WebElement SadminCreateCustomer;

    @FindBy (xpath = "//h3[normalize-space()='Add New Customer']")
    public WebElement SadminCreateCustomerPage;

    @FindBy (xpath = "(//td[contains(text(),'1')])[1]")
    public WebElement SadminCreateFirstCustomerPlus;

    @FindBy (xpath = "//span[@class='dtr-data']//button[@id='dropdownMenu2']")
    public WebElement SadminCreateFirstCustomerSelect;

    @FindBy (xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    public WebElement SadminCreateFirstCustomerSelectBox;











}

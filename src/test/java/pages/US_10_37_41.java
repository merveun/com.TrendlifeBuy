package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_10_37_41 {
    public US_10_37_41() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // US_037 ait locate'ler

    // url > Subscribe pop-up
    @FindBy(css ="#subscriptionModal > div > div.close_modal > i")
    public WebElement subscribePopupExit;

    // All Categories Dropdown Menu
    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement allCategories;

    // All categories > Computer & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[1]")
    public WebElement computerAndAccessoriesMenu;

    // All categories > Computer & Accessories > Computer
    @FindBy(xpath = "(//a[text()='Computer'])[1]")
    public WebElement computerMenu;

    // All categories > Computer & Accessories > Computer > firstProduct
    @FindBy(xpath = "(//div[@class='col-xl-4 col-lg-4 col-md-6 col-6'])[1]")
    public WebElement firstProduct;

    // All categories > Computer & Accessories > Computer > firstProduct > Add to cart Button
    @FindBy (xpath = "(//div/a[text()='Add to Cart'])[1]")
    public WebElement addToCartButton;

    // After click add to cart button, opened pop-up > View Cart Button
    @FindBy (xpath = "//div/a[text()='View cart']")
    public WebElement viewCartButton;

    // Cart > text of "Shipping charge free from"
    @FindBy (xpath = "//h5[text()='Shipping charge free from ']")
    public WebElement shippinChargeFreeFromText;

    // Cart > text of Order Summary
    @FindBy (xpath = "//div/h3[text()='Order Summary']")
    public WebElement orderSummartText;

    // Cart > text of Subtotal
    @FindBy (xpath = "//div[@class='subtotal_lists']//h4[text()='Subtotal']")
    public WebElement subtotalText;

    // Cart > text of Shipping Charge
    @FindBy (xpath = "//div[@class='subtotal_lists']//h4[text()='Shipping Charge']")
    public WebElement shippingChargeText;

    // Cart > text of Discount
    @FindBy (xpath = "//div[@class='subtotal_lists']//h4[text()='Discount']")
    public WebElement discountText;

    // Cart > Total Text > behind Order Summary
    @FindBy(xpath = "//div[@class='single_total_left flex-fill']/span[text()='Total']")
    public WebElement totalText;

    // Cart > text of VAT/TAX/GST
    @FindBy (xpath = "//div[@class='subtotal_lists']//h4[text()='VAT/TAX/GST']")
    public WebElement vatTaxGstText;

    // Cart > Added Subtotal of Product
    @FindBy(xpath = "//div[@class='col-lg col-4 order-3 order-lg-0 my-3 my-lg-0']/h4")
    public WebElement subTotalOfProduct;

    // Cart > Proceed to checkout Button
    @FindBy (xpath = "//div/a[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;


    // Cart > Continue Button
    @FindBy (xpath = "//div/a[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    // Cart > Green Discount Box %
    @FindBy (xpath = "//div[@class='col-lg col-4 order-1 order-lg-0 my-3 my-lg-0']/span[@class='green_badge text-nowrap']")
    public WebElement discountGreenBox;

    // Cart > behind green discount box , Price
    @FindBy (xpath = "//div[@class='col-lg col-4 order-1 order-lg-0 my-3 my-lg-0']/h4")
    public WebElement priceOfProduct;

    // Cart > TotalPrice
    @FindBy(xpath = "(//div[@class='single_total_right']/span)[5]")
    public WebElement totalPrice;

    //Cart > Value of Quantity
    @FindBy (xpath = "//input[@class='count_single_item input-number qty']")
    public WebElement quantityValue;

    // Cart > Decrease QuantityButton
    @FindBy (xpath = "//button[@class='count_single_item inumber_decrement change_qty']")
    public WebElement quantityDecreaseButton;

    // cart > Increase QuantityButton
    @FindBy (xpath = "//button[@class='count_single_item number_increment change_qty']")
    public WebElement quantityIncreaseButton;

    // Cart > Delete Product which is in cart
    @FindBy(xpath = "//div/span[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer']")
    public WebElement deleteProductButton;

    // -------------------->> US_037 Locators <<--------------------

    // Admin Login Page > Email TextBox
    @FindBy(xpath = "//input[@name='login']")
    public WebElement adminEmailTextBox;

    // Admin Login Page > Password TextBox
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordTextBox;

    // Admin Login Page > Sing In Button
    @FindBy (xpath = "//button[text()='Sign In']")
    public WebElement adminSignInButton;

    // Admin Dashboard > Graphics
    @FindBy(xpath = "(//canvas)[1]")
    public List<WebElement> adminProductsGraphic;

    // Admin Dashboard > List Headers
    @FindBy(xpath = "//div[@class='col-lg-6 col-md-6 col-sm-6']")
    public List<WebElement> ListHeaders;

    // Admin New Customers List > Details first Button
    @FindBy(xpath = "(//tr//a[@type='button'])[1]")
    public WebElement detailsNewCustomersButton;

    // Admin New Customers List > Lates Order first Button
    @FindBy(xpath = "(//tr//a[@type='button'])[11]")
    public WebElement latestOrderDetailsButton;

    // Admin New Customer List > First customer's name
    @FindBy(xpath = "((//tbody/tr)[11]/td)[2]")
    public WebElement nameCustomer;

    // Admin Latest Order List > First Order ID
    @FindBy(xpath = "((//tbody/tr)[41]/td/a)[1]")
    public WebElement orderId;

    // Customer Profile > Customer's Name
    @FindBy (xpath = "(//tbody/tr/td)[2]")
    public WebElement customersNameFromProfile;

    // OrderManage Page > Order ID H3
    @FindBy (xpath = "//div[@class='main-title d-flex']//h3")
    public WebElement orderIDFromOrderManage;

    // Admin Dashboard > Navbar > Support Ticket DropDown
    @FindBy (xpath = "//div[@class='nav_title']//span[text()='Support Ticket']")
    public WebElement supportTicketDropDown;

    // Admin Dashboard > Support Ticket Button ,under the Support Ticket dropdown
    @FindBy(xpath = "//li[@class='mm-active']//a[text()='Support Ticket']")
    public WebElement supportTicketLinkMenu;

    // Tickets > Add new Button
    @FindBy(id = "add_new")
    public WebElement addNewButtonOnTicketPage;

    // New Ticket > Error Messages "The subject field is required."
    @FindBy(id = "error_subject")
    public WebElement subjectErrorMessage;

    // New Ticket > Error Messages "The category id field is required."
    @FindBy(id = "error_category_id")
    public WebElement categoryErrorMessage;

    // New Ticket > Error Messages "The priority id field is required."
    @FindBy(id = "error_priority_id")
    public WebElement priorityErrorMessage;

    // New Ticket > Error Messages "The status field is required."
    @FindBy(id = "error_status")
    public WebElement statusErrorMessage;

    // New Ticket > Error Messages "The description field is required."
    @FindBy(id = "error_message")
    public WebElement descriptionErrorMessage;

    // New Ticket > Submit Create Ticket
    @FindBy(xpath = "//i[@class='ti-check']")
    public WebElement createTicketButton;

    // New Ticket > Browser Div List
    @FindBy(xpath = "//div[@class='primary_file_uploader']")
    public List<WebElement> browserDivList;

    // New Ticket > Add Browser Button
    @FindBy(xpath = "//button[@id='ticket_file_add']")
    public WebElement addBrowserButton;

    // New Ticket > Delete Browser Button
    @FindBy(xpath = "//button[@class='primary-btn delete-ticket-message-attach small fix-gr-bg custom_plus_btn']")
    public WebElement deleteBrowserButton;

    // New Ticket > Subject TextBox
    @FindBy(id = "subject")
    public WebElement subjectTextBox;

    // New Ticket > CategoryList
    @FindBy(xpath = "(//ul[@class='list'])[2]/li")
    public List<WebElement> categoryList;

    // New Ticket > PriorityList
    @FindBy (xpath = "(//ul[@class='list'])[3]/li")
    public List<WebElement> priorityList;

    // New Ticket > User List
    @FindBy(xpath = "(//ul[@class='list'])[4]/li")
    public List<WebElement> userList;

    // New Ticket > Status List
    @FindBy(xpath = "(//ul[@class='list'])[5]/li")
    public List<WebElement> statusList;

    // New Ticket > Assign to List
    @FindBy(xpath = "(//ul[@class='list'])[6]/li")
    public List<WebElement> assignToList;

    // New Ticket > Category List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[2]")
    public WebElement categoryListButton;

    // New Ticket > priority List Butonu;
    @FindBy (xpath = "(//span[@class='current'])[3]")
    public WebElement priorityListButton;

    // New Ticket > user List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[4]")
    public WebElement userListButton;

    // New Ticket > status List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[5]")
    public WebElement statusListButton;

    // Support Ticket > Status List Button
    @FindBy(xpath = "(//span[@class='current'])[4]")
    public WebElement statusListButtonOnSupportTicket;

    // New Ticket > assignTo List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[6]")
    public WebElement assignToListButton;

    // New Ticket > attach Browser textBox;
    @FindBy(xpath = "//input[@id='ticket_file']")
    public WebElement attachFileBox;

    // New Ticket > description TextBox;
    @FindBy(xpath = "//div[@role='textbox']/p")
    public WebElement descriptionTextBox;

    // Ticket List > First Subject of Ticket
    @FindBy(xpath = "(//tr/td/a)[1]")
    public WebElement firstSubjectofTicket;

    // Support Ticket > Category Current Text
    @FindBy(xpath = "(//div[@class='primary_input mb-25']//span[@class='current'])[1]")
    public WebElement categoryListCurrentText;

    // Support Ticket > Priority Current Text;
    @FindBy (xpath = "(//div[@class='primary_input mb-25']//span[@class='current'])[2]")
    public WebElement priorityListCurrentText;

    // Support Ticket > statusList Current Text;
    @FindBy (xpath = "(//div[@class='primary_input mb-25']//span[@class='current'])[3]")
    public WebElement statusListCurrentText;










}

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















}

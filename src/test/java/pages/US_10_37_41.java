package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_10_37_41 {
    public US_10_37_41() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // US_037 ait locate'ler

    // url > Subscribe pop-up
    @FindBy(xpath = "(//div[@class='close_modal']//i[@class='ti-close'])[1]")
    public WebElement subscribePopupExit;

    // All Categories Dropdown Menu
    @FindBy(xpath = "//div/a[@class='Categories_togler']")
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

    // Cart > text of VAT/TAX/GST
    @FindBy (xpath = "//div[@class='subtotal_lists']//h4[text()='VAT/TAX/GST']")
    public WebElement vatTaxGstText;

}

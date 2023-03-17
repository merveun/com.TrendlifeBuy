package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_20_27_32_40 {

    public US_08_20_27_32_40() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
        @FindBy(xpath = "//a[@href='https://qa.trendlifebuy.com/login'][1]")
        public WebElement loginButton;

       @FindBy(xpath = "//input[@name='login']")
       public WebElement emailTextBox;

       @FindBy(xpath = "//input[@placeholder='Min. 8 Character']")
       public WebElement passwordTextBox;

      @FindBy(id = "sign_in_btn")
       public WebElement signInButton;

       @FindBy(xpath = "//*[*='Dashboard']")
        public WebElement dashboardButton;

       @FindBy(xpath = "//*[*='Track Your Order']")
       public WebElement trackYourOrderButton;

       @FindBy(id = "order_number")
        public WebElement orderTrackingNumberTextbox;

      @FindBy(xpath = "//button[text()='Track Now']")
      public WebElement trackNowButton;

      @FindBy(xpath = "//*[*='Order ID:  ']")
         public WebElement orderID;

      //============================US_20=================================0

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

      @FindBy(xpath = "//th[text()='Store Name']")
      public WebElement storeNameText;

      @FindBy(xpath = "//th[text()='Coupon Code']")
      public WebElement couponCodeText;

      @FindBy(xpath = "//th[text()='Validity']")
      public WebElement validityText;

      @FindBy(xpath = "//th[text()='Action']")
      public WebElement actionText;

      //==============================27===================================================00

      @FindBy(xpath = "//div[@class='product_thumb_upper'][1]")
      public WebElement firstProduct;

      @FindBy(xpath = "//a[@class='add_cart add_to_cart addToCartFromThumnail'][1]")
      public WebElement addtoCartButton;

      @FindBy(xpath = "//*[text()='Add To Cart']")
      public WebElement addtoCartPopupButton;

      @FindBy(xpath = "//*[text()='View cart']")
       public WebElement viewCartPopupButton;

      @FindBy(xpath = "//*[text()='Proceed to checkout']")
        public WebElement proceedtoCheckoutButton;

      @FindBy(xpath = "//*[text()='Continue To Shipping']")
      public WebElement continuetoShippingButton;

      @FindBy(xpath = "//*[text()='Shipping Method']")
        public WebElement shippingMethodText;

      @FindBy(xpath = "//*[text()='Continue To Payment']")
      public  WebElement continuetoPaymentButton;

      @FindBy(xpath = "//*[text()='Free Shipping']")
        public WebElement freeShippingRadioButton;

      @FindBy(xpath = "//*[text()='Payment']")
      public WebElement paymentText;

      @FindBy(xpath = "//*[text()='Pay now']")
        public WebElement payNowButton;

      @FindBy(xpath = "//*[text()='Same as shipping address']")
        public WebElement sameasShippingAddressRadioButton;

      @FindBy(xpath = "//*[text()='Thank you for your purchase!']")
        public WebElement thankYouForYourPurchaseText;

      @FindBy(xpath = "//*[text()='Continue Shopping']")
      public WebElement continueShoppingButton;






}

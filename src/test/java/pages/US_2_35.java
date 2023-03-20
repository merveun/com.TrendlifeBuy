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
    @FindBy(xpath = "//h3[text()='Product List']")
    public WebElement productListText;


    @FindBy(xpath = "(//th[text()='SL'])[1]")
    public WebElement SlText;

    @FindBy(xpath = "(//th[text()='Name'])[1]")
    public WebElement NameText;

    @FindBy(xpath = "(//th[text()='Product Type'])[1]")
    public WebElement ProductTypeText;

    @FindBy(xpath = "(//th[text()='Brand'])[1]")
    public WebElement BrandText;

    @FindBy(xpath = "(//th[text()='Image'])[1]")
    public WebElement ImageText;

    @FindBy(xpath = "(//th[text()='Stock'])[1]")
    public WebElement StockText;

    @FindBy(xpath = "(//th[text()='Status'])[1]")
    public WebElement StatusText;

    @FindBy(xpath = "(//th[text()='Action'])[1]")
    public WebElement ActionText;

    @FindBy(xpath = "//a[@id='product_list_id']")
    public WebElement ProductListButton2;

    @FindBy(xpath = "//a[@id='product_alert_id']")
    public WebElement AlertListButton2;

    @FindBy(xpath = "//a[@id='product_stock_out_id']")
    public WebElement OutOfStockListButton2;

    @FindBy(xpath = "//a[@id='product_disabled_id']")
    public WebElement DisabledButton2;

    @FindBy(xpath = "//a[@id='product_sku_id']")
    public WebElement ProductSkuButton2;

    @FindBy(xpath = "(//div[@class='main-title d-md-flex'])[2]")
    public WebElement alertListHead;

    @FindBy(xpath = "//h3[text()='Product List']")
    public WebElement productListHead;

    @FindBy(xpath = "//h3[text()='Out Of Stock List']")
    public WebElement outofListHead;

    //
    @FindBy(xpath = "//h3[text()='Disabled Product List']")
    public WebElement disabledListHead;

    @FindBy(xpath = "//h3[text()='Product By SKU']")
    public WebElement skuListHead;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement productsearchbox;

    @FindBy(xpath = "//input[@placeholder='Quick Search']")
    public WebElement quickSearch;

    @FindBy(xpath = "//div[@id='mainProductTable_info']")
    public WebElement totalentries;

    //Switch tusu
    @FindBy(xpath = "//div[@class='slider round']")
    public WebElement togglecheckbox;

    //SUCCESS ALERT ON PRODUCT LİST
    @FindBy(xpath = "//div[text()='Updated successfully!']")
    public WebElement successAlert;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement plus;

    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[2]")
    public WebElement selectplus;

    @FindBy(xpath = "(//a[@class='dropdown-item product_detail'])[2]")
    public WebElement viewplus;

    @FindBy(xpath = "//h4[text()='Exclusive Bag 1 Details']")
    public WebElement viewdetails;

    @FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[3]")
    public WebElement editbutton;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/products/1/clone '])[1]")
    public WebElement clonebutton;

    @FindBy(xpath = "(//a[@class='dropdown-item delete_product'])[2]")
    public WebElement deletebutton;

    //ÜRÜN GÜNCEL BİLGİSİ > FİYAT
    @FindBy(xpath = "///input[@id='selling_price']")
    public WebElement sellingprice;

    //ÜRÜN GÜNCEL BİLGİSİ > STOK
    @FindBy(xpath = "//input[@id='single_stock']")
    public WebElement single_stock;

    //ürün stok yazısı
    @FindBy(xpath = "//label[@for='single_stock']")
    public WebElement stockhead;

    //ürün fiyat yazısı

    @FindBy(xpath = "(//label[@class='primary_input_label'])[22]")
    public WebElement pricehead;

    //radio button > product type
    @FindBy(xpath = "//input[@id='variant_prod']")
    public WebElement productTypeRadioButton2;

    //update button

    @FindBy(xpath = "//button[@class='primary_btn_2 mt-5 text-center saveBtn']")
    public WebElement updatebutton;





}

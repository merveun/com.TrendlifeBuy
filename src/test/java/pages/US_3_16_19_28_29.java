package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_3_16_19_28_29 {

        public US_3_16_19_28_29() {

            PageFactory.initElements(Driver.getDriver(),this);
        }

    // US_003 ait locate'ler

    //HomePage>Login
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement homePageLogin;

    //HomePage>Subscribe pop-up
    @FindBy(xpath = "//div[@id='subscriptionModal']//div/i")
    public WebElement subscribePopupExit;

    //HomePage>TextBox
    @FindBy(xpath = "(//input[@id='inlineFormInputGroup'])[1]")
    public WebElement homePageTextBox;

    //HomePage>TextBox>Samsung
    @FindBy(xpath = "//h4[@class='m-0 search_product_name']")
    public WebElement homePageTextBoxSamsung;

    //HomePage>TextBox>Samsung>WishList Button
    @FindBy(xpath = "//a[@id='wishlist_btn']")
    public WebElement homePageTextBoxSamsungWishListButton;

    //HomePage>All CAtegories Dropdown Menu
    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement allCategories;

    //HomePage>All categories > Computer & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[1]")
    public WebElement computerAndAccessoriesItem;

    //HomePage>All categories > Electronics Devices
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[2]")
    public WebElement electronicsDevicesItem;

    //HomePage>All categories > Watches & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[3]")
    public WebElement watchesAndAccessoriesItem;

    //HomePage>All categories > Fashions
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[4]")
    public WebElement fashionsItem;

    //HomePage>All categories > Toys,Kids & Babies
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[5]")
    public WebElement toysAndKidsAndBabiesItem;

    //HomePage>All categories > Bag & Shoes
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[6]")
    public WebElement bagAndShoesItem;

    //HomePage>All categories > Lifestyle & Home
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[7]")
    public WebElement lifestyleAndHomeItem;

    //HomePage>All categories > TV & Home Appliances
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[8]")
    public WebElement tvAndHomeAppliancesItem;

    //HomePage>All categories > Auto Mobiles & bikes
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[9]")
    public WebElement autoMobilesAndBikesItem;

    //HomePage>All categories > Computer & Accessories Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[1]")
    public WebElement computerAndAccessoriesMenu;

    //HomePage>All categories > Electronics Devices Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[2]")
    public WebElement electronicsDevicesMenu;

    //HomePage>All categories > Watches & Accessories Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[3]")
    public WebElement watchesAndAccessoriesMenu;

    //HomePage>All categories > Fashions Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[4]")
    public WebElement fashionsMenu;

    //HomePage>All categories > Toys,Kids & Babies Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[5]")
    public WebElement toysAndKidsAndBabiesMenu;

    //HomePage>All categories > Bag & Shoes Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[6]")
    public WebElement bagAndShoesMenu;

    //HomePage>All categories > Lifestyle & Home Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[7]")
    public WebElement lifestyleAndHomeMenu;

    //HomePage>All categories > TV & Home Appliances Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[8]")
    public WebElement tvAndHomeAppliancesMenu;

    //HomePage>All categories > Auto Mobiles & bikes Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[9]")
    public WebElement autoMobilesAndBikesMenu;

    // US_016 ait locate'ler

    //HomePage>Login > Email
    @FindBy(xpath = "//input[@id='text']")
    public WebElement emailTextBox;

    //HomePage>Login > Password
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    //HomePage>Login > Sign In Button
    @FindBy(xpath = "//*[@id=\"sign_in_btn\"]")
    public WebElement signInButton;

    //HomePage>Login > Sign In Button> Dashboard
    @FindBy(xpath = "(//span[@class='d-inline-block lh-1 ']/a)[1]")
    public WebElement dashBoard;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement purchaseHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Title
    @FindBy(xpath = "//h3[text()='Purchase History']")
    public WebElement purchaseHistoryTitle;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History
    @FindBy(xpath = "//div[@class='nice-select amaz_select3']")
    public WebElement purchaseHistoryAllHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>All History
    @FindBy(xpath = "(//ul[@class='list']/li)[1]")
    public WebElement purchaseHistoryAllHistoryAllHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Pending Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[2]")
    public WebElement purchaseHistoryAllHistoryPendingOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Confirmed Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[3]")
    public WebElement purchaseHistoryAllHistoryConfirmedOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Completed Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[4]")
    public WebElement purchaseHistoryAllHistoryCompletedOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Refused&Cancelled Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[5]")
    public WebElement purchaseHistoryAllHistoryRefusedAndCancelledOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Order Summary
    @FindBy(xpath = "(//button[@class='amazy_status_btn purchase_show'])[1]")
    public WebElement purchaseHistoryActionOrderSummary;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Invoice Download
    @FindBy(xpath = "(//a[@class='amazy_status_btn'])[1]")
    public WebElement purchaseHistoryActionInvoiceDownload;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Order Summary Check
    @FindBy(xpath = "//h5[text()='Order Summary']")
    public WebElement purchaseHistoryActionOrderSummaryCheck;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Order Summary Check Exit
    @FindBy(xpath = "(//button[@class='close_modal_icon'])[1]")
    public WebElement purchaseHistoryActionOrderSummaryCheckExit;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Invoice DownloadThen

    @FindBy(xpath = "//*[@id=\"download\"]")
    public WebElement purchaseHistoryActionInvoiceDownloadThen;

    // US_019 ait locate'ler

    //HomePage>Login > Sign In Button> Dashboard> My Wallet
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center '])[1]")
    public WebElement myWallet;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Title
    @FindBy(xpath = "//h4[text()='My Wallet']")
    public WebElement myWalletTitle;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Total Balance
    @FindBy(xpath = "//span[text()='Total Balance']")
    public WebElement myWalletTotalBalance;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Running Balance
    @FindBy(xpath = "//h4[text()='Running Balance']")
    public WebElement myWalletRunningBalance;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Pending Balance
    @FindBy(xpath = "//h4[text()='Pending Balance']")
    public WebElement myWalletPendingBalance;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Recharge Wallet
    @FindBy(xpath = "//h4[text()='Recharge Wallet']")
    public WebElement myWalletRechargeWallet;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Recharge Wallet>Recharge Amount
    @FindBy(xpath = "//h3[text()='Recharge Amount']")
    public WebElement myWalletRechargeWalletRechargeAmount;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Recharge Wallet>Recharge Amount>TextBox
    @FindBy(xpath = "//input[@name='recharge_amount']")
    public WebElement myWalletRechargeWalletRechargeAmountTextBox;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Recharge Wallet>Recharge Amount>Cancel
    @FindBy(xpath = "//h5[text()='Cancel']")
    public WebElement myWalletRechargeWalletRechargeAmountCancel;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Recharge Wallet>Recharge Amount>AddFund
    @FindBy(xpath = "//button[text()='Add Fund']")
    public WebElement myWalletRechargeWalletRechargeAmountAddFund;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet>Recharge Wallet>Recharge Amount>AddFund>My Wallet Recharge
    @FindBy(xpath = "//h4[text()='My wallet recharge']")
    public WebElement myWalletRechargeWalletRechargeAmountAddFundMyWalletRecharge;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Date
    @FindBy(xpath = "//th[text()='Date']")
    public WebElement myWalletWalletRechargeHistoryDate;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Trx Id
    @FindBy(xpath = "//th[text()='Trx Id']")
    public WebElement myWalletWalletRechargeHistoryTrxId;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Amount
    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement myWalletWalletRechargeHistoryAmount;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Type
    @FindBy(xpath = "//th[text()='Type']")
    public WebElement myWalletWalletRechargeHistoryType;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Payment Method
    @FindBy(xpath = "//th[text()='Payment Method']")
    public WebElement myWalletWalletRechargeHistoryPaymentMethod;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Status
    @FindBy(xpath = "//th[text()='Status']")
    public WebElement myWalletWalletRechargeHistoryStatus;

    //HomePage>Login > Sign In Button> Dashboard> My Wallet> Wallet Recharge History>Approved
    @FindBy(xpath = "//a[text()='Approved']")
    public WebElement myWalletWalletRechargeHistoryApproved;

// US_028 ait locate'ler

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[2]")
    public WebElement myWishList;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items
    @FindBy(xpath = "//div[@class='dashboard_wishlist_grid mb_40']")
    public WebElement myWishListItems;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>New
    @FindBy(xpath = "(//div[@class='nice-select amaz_select4'])[2]")
    public WebElement myWishListItemsNew;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>New>New
    @FindBy(xpath = "//li[text()='New']")
    public WebElement myWishListItemsNewNew;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>New>Old
    @FindBy(xpath = "//li[text()='Old']")
    public WebElement myWishListItemsNewOld;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>New>Price (Low to high)
    @FindBy(xpath = "//li[text()='Price (Low to high)']")
    public WebElement myWishListItemsNewPriceLowtoHigh;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>New>Price (High to low)
    @FindBy(xpath = "//li[text()='Price (High to low)']")
    public WebElement myWishListItemsNewPriceHightoLow;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>ShowItems
    @FindBy(xpath = "(//div[@class='nice-select amaz_select4'])[1]")
    public WebElement myWishListItemsShowItems;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>ShowItems>Show8Items
    @FindBy(xpath = "//li[text()='Show 8 Item’s']")
    public WebElement myWishListItemsShowItems8;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>ShowItems>Show12Items
    @FindBy(xpath = "//li[text()='Show 12 Item’s']")
    public WebElement myWishListItemsShowItems12;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>ShowItems>Show16Items
    @FindBy(xpath = "//li[text()='Show 16 Item’s']")
    public WebElement myWishListItemsShowItems16;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>ShowItems>Show24Items
    @FindBy(xpath = "//li[text()='Show 24 Item’s']")
    public WebElement myWishListItemsShowItems24;

    //HomePage>Login > Sign In Button> Dashboard> My Wishlist>Items>ShowItems>Show32Items
    @FindBy(xpath = "//li[text()='Show 32 Item’s']")
    public WebElement myWishListItemsShowItems32;

    //HomePage>Login > Sign In Button> WishList
    @FindBy(xpath = "(//a[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[4]")
    public WebElement wishList;

    //HomePage>Login > Sign In Button> Compare
    @FindBy(xpath = "(//a[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[3]")
    public WebElement compare;

    //HomePage>Login > Sign In Button> WishList>1.ürün
    @FindBy(xpath = "(//a[@class='thumb'])[1]")
    public WebElement wishListBirinciUrun;

    //HomePage>Login > Sign In Button> WishList>2.ürün
    @FindBy(xpath = "(//a[@class='thumb'])[2]")
    public WebElement wishListikinciUrun;

    //HomePage>Login > Sign In Button> Compare>1.ürün
    @FindBy(xpath = "//a[@class='thumb']")
    public WebElement compareBirinciUrun;

    //HomePage>Login > Sign In Button> WishList>1.ürün>Compare ikonu
    @FindBy(xpath = "(//a[@class='addToCompareFromThumnail'])[1]")
    public WebElement wishListBirinciUrunCompare;

    //HomePage>Login > Sign In Button> WishList>2.ürün>Compare ikonu
    @FindBy(xpath = "(//a[@class='addToCompareFromThumnail'])[2]")
    public WebElement wishListikinciUrunCompare;

    //HomePage>Login > Sign In Button> WishList>1.ürün>Compare ikonu>Add to compare
    @FindBy(xpath = "//a[@class='single_wish_compare']")
    public WebElement wishListBirinciUrunCompareAddtoCompare;

    //HomePage>Login > Sign In Button> WishList>1.ürün>Show ikonu
    @FindBy(xpath = "(//a[@class='quickView'])[1]")
    public WebElement wishListBirinciUrunShow;

    //HomePage>Login > Sign In Button> WishList>1.ürün>Show ikonu>Show penceresi
    @FindBy(xpath = "//div[@id='productShow']")
    public WebElement wishListBirinciUrunShowPenceresi;

    //HomePage>Login > Sign In Button> WishList>4.ürün>Delete ikonu
    @FindBy(xpath = "(//i[@class='ti-trash'])[3]")
    public WebElement wishListDorduncuUrunDelete;

    //HomePage>Login > Sign In Button> WishList>4.ürün>Delete ikonu
    @FindBy(xpath = "//h5[text()='Showing  1 - 3  Of 3 Results']")
    public WebElement wishListDorduncuUrunDeleteYedek;

    //HomePage>Login > Sign In Button> WishList>4.ürün>Delete ikonu>Delete Butonu
    @FindBy(xpath = "//button[@id='dataDeleteBtn']")
    public WebElement wishListDorduncuUrunDeleteButonu;

    //HomePage>Login > Sign In Button> WishList>4.ürün>Delete ikonu>Delete Butonu Kapatma
    @FindBy(xpath = "(//button[@class='close_modal_icon'])[1]")
    public WebElement wishListDorduncuUrunDeleteButonuKapatma;

    //HomePage>Login > Sign In Button> WishList>4.ürün ekleme
    @FindBy(xpath = "(//img[@title='HP 15s-gr515AU AMD Athlon 3050U 15.6\" HD Laptop'])[1]")
    public WebElement wishListDorduncuUrunEkleme;

    //HomePage>Login > Sign In Button> WishList>4.ürün
    @FindBy(xpath = "(//div[@class='product_thumb_upper'])[3]")
    public WebElement wishListDorduncuUrun;

    //HomePage>Login > Sign In Button> WishList>4.ürün ekleme wishlist ikonu
    @FindBy(xpath = "(//a[@id='wishlistbtn_29'])[2]")
    public WebElement wishListDorduncuUrunEklemeWishListIkonu;

    //HomePage>Login > Sign In Button> WishList>ListSize
    @FindBy (xpath = "//div[@class='product_widget5 style3 bg-white']")
    public List<WebElement>  productsInWishList;

    //HomePage>Login > Sign In Button> WishList>Showing Result
    @FindBy(xpath = "//div[@id='productShow']//h5")
    public List<WebElement>  productsInWishListshowingResult;

    //HomePage>Login > Sign In Button> WishList>2.ürün Add to Cart
    @FindBy(xpath = "(//div[@class='stars justify-content-center'])[2]")
    public WebElement  wishListAddttoCart;

    //HomePage>Login > Sign In Button> WishList>2.ürün Add to Cart
    @FindBy(xpath = "(//a[@class='add_cart add_to_cart addToCartFromThumnail'])[2]")
    public WebElement  wishListAddttoCartClick;


    //HomePage>Login > Sign In Button> WishList>2.ürün Add to Cart>View cart
    @FindBy(xpath = "(//div[@class='d-flex flex-column gap_10']/a)[1]")
    public WebElement  wishListAddttoCartViewCart;

    //HomePage>Login > Sign In Button> WishList>2.ürün Add to Cart>View cart>Cart
    @FindBy(xpath = "(//li[@class='list-group-item px-0 px-lg-3 mb_10'])[2]")
    public WebElement  wishListAddttoCartViewCartCart;



    // US_029 ait locate'ler

    //AdminHomePage>Login > Email
    @FindBy(xpath = " //input[@id='text']")
    public WebElement AdemailTextBox;

    //AdminHomePage>Login > Password
    @FindBy(xpath = "//input[@id='password']")
    public WebElement AdpasswordTextBox;

    //AdminHomePage>Login > Sign In Button
    @FindBy(xpath = "//*[@id=\"sign_in_btn\"]")
    public WebElement AdsignInButton;

    //AdminHomePage>Login > Sign In Button>Dashboard
    @FindBy(xpath = "//div[@class='nav_icon_small']")
    public WebElement AdDashboard;

    //AdminHomePage>Login > Sign In Button>Dashboard>Search
    @FindBy(xpath = "//input[@id='search']")
    public WebElement AdSearch;

    //AdminHomePage>Login > Sign In Button>Dashboard>Menu ikonu
    @FindBy(xpath = "//div[@class='collaspe_icon open_miniSide']/i")
    public WebElement AdMenuikonu;

    //AdminHomePage>Login > Sign In Button>Dashboard>Mini_Sidebar
    @FindBy(xpath = "//nav[@class='sidebar mini_sidebar']")
    public WebElement AdMiniSidebar;

    //AdminHomePage>Login > Sign In Button>Dashboard>Sidebar
    @FindBy(xpath = "//nav[@class='sidebar']")
    public WebElement AdSidebar;

    //AdminHomePage>Login > Sign In Button>Dashboard>Website
    @FindBy(xpath = "//a[text()='Website']")
    public WebElement AdWEbsite;

    //AdminHomePage>Login > Sign In Button>Dashboard>Today
    @FindBy(xpath = "(//ul[@class='nav']/li)[1]")
    public WebElement AdToday;

    //AdminHomePage>Login > Sign In Button>Dashboard>This Week
    @FindBy(xpath = "(//ul[@class='nav']/li)[2]")
    public WebElement AdThisWeek;

    //AdminHomePage>Login > Sign In Button>Dashboard>This Month
    @FindBy(xpath = "(//ul[@class='nav']/li)[3]")
    public WebElement AdThisMonth;

    //AdminHomePage>Login > Sign In Button>Dashboard>This Year
    @FindBy(xpath = "(//ul[@class='nav']/li)[4]")
    public WebElement AdThisYear;

    //AdminHomePage>Login > Sign In Button>Dashboard>Visitor
    @FindBy(xpath = "//h1[@class='gradient-color2 total_visitors']")
    public WebElement AdVisitor;














    }


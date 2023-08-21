package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.US_3_16_19_28_29;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class US_3_16_19_28_29_StepDef {
    Actions actions = new Actions(Driver.getDriver());
    US_3_16_19_28_29 pages;
    String expectedUrun = "";
    String actualUrun = "";

    @Given("Kullanici Anasayfa {string} 'ine gider.")
    public void kullanici_anasayfa_ine_gider(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("Subscribe popup kapatilir")
    public void subscribe_popup_kapatilir() {
        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.subscribePopupExit, 10);
        pages.subscribePopupExit.click();
    }

    @Then("All Categories dropdown menu’yu tiklar")
    public void all_categories_dropdown_menu_yu_tiklar() {
        pages = new US_3_16_19_28_29();
        pages.allCategories.click();
    }

    @Then("All Categories menusu altindaki tum kategorileri goruntulenir")
    public void all_categories_menusu_altindaki_tum_kategorileri_goruntulenir() {
        pages = new US_3_16_19_28_29();
        assertTrue(pages.computerAndAccessoriesItem.isDisplayed());
        assertTrue(pages.electronicsDevicesItem.isDisplayed());
        assertTrue(pages.watchesAndAccessoriesItem.isDisplayed());
        assertTrue(pages.fashionsItem.isDisplayed());
        assertTrue(pages.toysAndKidsAndBabiesItem.isDisplayed());
        assertTrue(pages.bagAndShoesItem.isDisplayed());
        assertTrue(pages.lifestyleAndHomeItem.isDisplayed());
        assertTrue(pages.tvAndHomeAppliancesItem.isDisplayed());
        assertTrue(pages.autoMobilesAndBikesItem.isDisplayed());


    }

    @And("All Categories menusu altindaki tum kategorilerin aktif oldugu dogrulanir")
    public void all_categories_menusu_altindaki_tum_kategorilerin_aktif_oldugu_dogrulanir() {
        pages = new US_3_16_19_28_29();
        pages.computerAndAccessoriesItem.click();
        assertTrue(pages.computerAndAccessoriesMenu.isEnabled());
        pages.electronicsDevicesItem.click();
        assertTrue(pages.electronicsDevicesMenu.isEnabled());
        pages.watchesAndAccessoriesItem.click();
        assertTrue(pages.watchesAndAccessoriesMenu.isEnabled());
        pages.fashionsItem.click();
        assertTrue(pages.fashionsMenu.isEnabled());
        pages.toysAndKidsAndBabiesItem.click();
        assertTrue(pages.toysAndKidsAndBabiesMenu.isEnabled());
        pages.bagAndShoesItem.click();
        assertTrue(pages.bagAndShoesMenu.isEnabled());

        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN)
                .perform();

        pages.lifestyleAndHomeItem.click();
        assertTrue(pages.lifestyleAndHomeMenu.isEnabled());
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN)
                .perform();
        pages.tvAndHomeAppliancesItem.click();
        assertTrue(pages.tvAndHomeAppliancesMenu.isEnabled());
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN)
                .perform();

        pages.autoMobilesAndBikesItem.click();
        pages.autoMobilesAndBikesMenu.isEnabled();

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        pages = new US_3_16_19_28_29();
        pages.homePageLogin.click();

    }

    @Then("Gecerli bir {string} ve {string} girer")
    public void gecerli_bir_ve_girer(String string, String string2) {
        pages = new US_3_16_19_28_29();
        pages.emailTextBox.sendKeys(ConfigReader.getProperty("customerEmailM"));
        ReusableMethod.bekle(1);
        pages.passwordTextBox.sendKeys(ConfigReader.getProperty("customerPasswordM"));
        ReusableMethod.bekle(1);

    }

    @Then("Signed in butonuna basar")
    public void signed_in_butonuna_basar() {
        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.signInButton.click();
        ReusableMethod.bekle(1);
    }

    @Then("DashBoard butonuna tiklar")
    public void dash_board_butonuna_tiklar() {
        pages = new US_3_16_19_28_29();
        pages.dashBoard.click();

    }

    @Then("Purchase History Linki tiklanir")
    public void purchase_history_linki_tiklanir() {
        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.purchaseHistory.click();


    }

    @Then("Purchase History sayfasina yonlendirdigi dogrulanir")
    public void purchase_history_sayfasina_yonlendirdigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        assertTrue(pages.purchaseHistoryTitle.isDisplayed());

    }

    @Then("All History dropdown tiklanir")
    public void all_history_dropdown_tiklanir() {

        pages = new US_3_16_19_28_29();
        pages.purchaseHistoryAllHistory.click();

    }

    @Then("ilgili seceneklere gore filtrelendigi gorulur")
    public void ilgili_seceneklere_gore_filtrelendigi_gorulur() {

        pages = new US_3_16_19_28_29();
        assertTrue(pages.purchaseHistoryAllHistoryAllHistory.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryPendingOrders.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryConfirmedOrders.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryCompletedOrders.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryRefusedAndCancelledOrders.isDisplayed());

    }

    @Then("Siparis ozetlerinin goruntulenebildigi dogrulanir")
    public void siparis_ozetlerinin_goruntulenebildigi_dogrulanir() {

        pages = new US_3_16_19_28_29();

        pages.purchaseHistoryActionOrderSummary.click();
        ReusableMethod.bekle(2);
        assertTrue(pages.purchaseHistoryActionOrderSummaryCheck.isDisplayed());
        pages.purchaseHistoryActionOrderSummaryCheckExit.click();

    }

    @Then("Siparis faturasinin indirildigi dogrulanir")
    public void siparis_faturasinin_indirildigi_dogrulanir() {

        pages = new US_3_16_19_28_29();

        actions.keyDown(Keys.ALT).perform();
        ReusableMethod.bekle(2);
        pages.purchaseHistoryActionInvoiceDownload.click();
        ReusableMethod.bekle(8);
        actions.keyUp(Keys.ALT).perform();
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\84230310103459.pdf";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }

    @Then("My Wallet Linki tiklanir")
    public void my_wallet_linki_tiklanir() {

        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.myWallet.click();
    }

    @Then("My Wallet sayfasina yonlendirdigi dogrulanir")
    public void my_wallet_sayfasina_yonlendirdigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        assertTrue(pages.myWalletTitle.isDisplayed());
    }

    @Then("My Wallet sayfasinda ilgili boardlarinin gorunurlugu dogrulanir")
    public void my_wallet_sayfasinda_ilgili_boardlarinin_gorunurlugu_dogrulanir() {

        pages = new US_3_16_19_28_29();
        assertTrue(pages.myWalletTotalBalance.isDisplayed());
        assertTrue(pages.myWalletRunningBalance.isDisplayed());
        assertTrue(pages.myWalletPendingBalance.isDisplayed());
    }

    @Then("Recharge Wallet butonunun goruntulenebildigi dogrulanir")
    public void recharge_wallet_butonunun_goruntulenebildigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        assertTrue(pages.myWalletRechargeWallet.isDisplayed());
    }

    @Then("Recharge Wallet butonu tiklanir")
    public void recharge_wallet_butonu_tiklanir() {
        pages = new US_3_16_19_28_29();
        pages.myWalletRechargeWallet.click();
    }

    @Then("Recharge Amount penceresinin acildigi dogrulanir")
    public void recharge_amount_penceresinin_acildigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmount, 5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmount.isDisplayed());
    }

    @Then("Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanir")
    public void recharge_amount_sekmesinde_tutar_girebilebilen_bir_text_box_in_oldugu_dogrulanir() {
        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmount, 5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmountTextBox.isDisplayed());
    }

    @Then("Recharge Amount sekmesinde Cancel butonunun oldugu dogrulanir")
    public void recharge_amount_sekmesinde_cancel_butonunun_oldugu_dogrulanir() {

        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmountCancel, 5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmountCancel.isDisplayed());
    }

    @Then("Recharge Amount sekmesinde Cancel butonunun iptal islemi yapabildigi dogrulanir")
    public void recharge_amount_sekmesinde_cancel_butonunun_iptal_islemi_yapabildigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        pages.myWalletRechargeWalletRechargeAmountCancel.click();
        assertTrue(pages.myWalletTitle.isDisplayed());
    }

    @Then("Add Fund butonunun goruntulenebildigi dogrulanir")
    public void add_fund_butonunun_goruntulenebildigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmountAddFund, 5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmountAddFund.isDisplayed());
    }

    @Then("TextBoxa {string} deger girilir")
    public void text_boxa_deger_girilir(String string) {
        pages = new US_3_16_19_28_29();
        pages.myWalletRechargeWalletRechargeAmountTextBox.sendKeys(ConfigReader.getProperty("moneyM"));

    }

    @Then("Add Fund butonuna tiklanir")
    public void add_fund_butonuna_tiklanir() {
        pages = new US_3_16_19_28_29();
        pages.myWalletRechargeWalletRechargeAmountAddFund.click();

    }

    @Then("İlgili sayfaya yonlendirildigi dogrulanir")
    public void i̇lgili_sayfaya_yonlendirildigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        assertTrue(pages.myWalletRechargeWalletRechargeAmountAddFundMyWalletRecharge.isDisplayed());
    }

    @Then("Wallet Recharge History listesinde ilgili sutunlarin oldugu dogrulanir")
    public void wallet_recharge_history_listesinde_ilgili_sutunlarin_oldugu_dogrulanir() {
        pages = new US_3_16_19_28_29();
        ReusableMethod.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethod.bekle(2);
        assertTrue(pages.myWalletWalletRechargeHistoryDate.isDisplayed());
        assertTrue(pages.myWalletWalletRechargeHistoryTrxId.isDisplayed());
        assertTrue(pages.myWalletWalletRechargeHistoryAmount.isDisplayed());
        assertTrue(pages.myWalletWalletRechargeHistoryType.isDisplayed());
        assertTrue(pages.myWalletWalletRechargeHistoryPaymentMethod.isDisplayed());
        assertTrue(pages.myWalletWalletRechargeHistoryStatus.isDisplayed());
    }

    @Then("Wallet Recharge History listesinde cuzdan hareketlerinin varligi dogrulanir")
    public void wallet_recharge_history_listesinde_cuzdan_hareketlerinin_varligi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletWalletRechargeHistoryApproved, 5);
        assertTrue(pages.myWalletWalletRechargeHistoryApproved.isDisplayed());
    }

    @Then("My Wishlist Linki tiklanir")
    public void my_wishlist_linki_tiklanir() {

        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.myWishList.click();

    }

    @Then("My Wishlist sayfasina yonlendirdigi dogrulanir")
    public void my_wishlist_sayfasina_yonlendirdigi_dogrulanir() {

        assertTrue(Driver.getDriver().getCurrentUrl().contains("my-wishlist"));
    }

    @Then("My Wishlist sayfasinda kullanicinin begendigi ürünlerin listelendigi dogrulanir")
    public void my_wishlist_sayfasinda_kullanicinin_begendigi_ürünlerin_listelendigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethod.waitForClickablility(pages.myWishListItems, 5);
        assertTrue(pages.myWishListItems.isDisplayed());
    }

    @Then("Urunlerin ilgili seceneklerine göre siralanarak listelendigi dogrulanir")
    public void urunlerin_ilgili_seceneklerine_göre_siralanarak_listelendigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        pages.myWishListItemsNew.click();
        ReusableMethod.waitForClickablility(pages.myWishListItemsNewNew, 5);
        assertTrue(pages.myWishListItemsNewNew.isDisplayed());
        assertTrue(pages.myWishListItemsNewOld.isDisplayed());
        assertTrue(pages.myWishListItemsNewPriceLowtoHigh.isDisplayed());
        assertTrue(pages.myWishListItemsNewPriceHightoLow.isDisplayed());

    }

    @Then("Urunlerin listeleme sayisini ilgili seceneklerine göre degistirilebilir oldugu dogrulanir")
    public void urunlerin_listeleme_sayisini_ilgili_seceneklerine_göre_degistirilebilir_oldugu_dogrulanir() {
        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        pages.myWishListItemsShowItems.click();
        ReusableMethod.waitForClickablility(pages.myWishListItemsShowItems8, 5);
        assertTrue(pages.myWishListItemsShowItems8.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems12.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems16.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems24.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems32.isDisplayed());
    }

    @Then("Wishlist Linki tiklanir")
    public void wishlist_linki_tiklanir() {

        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.wishList,5);
        pages.wishList.click();
        ReusableMethod.bekle(2);
    }

    @Then("Buradaki urunlerin uzerine gelindiginde Compare ikonunun gorundugu dogrulanir")
    public void buradaki_urunlerin_uzerine_gelindiginde_compare_ikonunun_gorundugu_dogrulanir() {

        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(pages.wishListikinciUrun).perform();
        ReusableMethod.bekle(1);
        assertTrue(pages.wishListikinciUrunCompare.isDisplayed());
    }

    @Then("Compare ikonuna tiklandiginda ilgili urunu Compare sayfasina yükledigi dogrulanir")
    public void compare_ikonuna_tiklandiginda_ilgili_urunu_compare_sayfasina_yukledigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        pages.wishListikinciUrunCompare.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethod.bekle(8);
        pages.compare.click();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();

        assertTrue(pages.compareBirinciUrun.isDisplayed());

    }

    @Then("Buradaki urunlerin uzerine gelindiginde Show ikonunun gorundugu dogrulanir")
    public void buradaki_urunlerin_uzerine_gelindiginde_show_ikonunun_gorundugu_dogrulanir() {
        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(pages.wishListBirinciUrun).perform();
        ReusableMethod.bekle(1);
        assertTrue(pages.wishListBirinciUrunShow.isDisplayed());
    }

    @Then("Show ikonuna tiklandiginda ilgili ürünün show penceresi acildigi dogrulanir")
    public void show_ikonuna_tiklandiginda_ilgili_urunun_show_penceresi_acildigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        pages.wishListBirinciUrunShow.click();
        ReusableMethod.waitForClickablility(pages.wishListBirinciUrunShowPenceresi, 5);
        assertTrue(pages.wishListBirinciUrunShowPenceresi.isDisplayed());

    }

    @Then("Buradaki urunlerin uzerine gelindiginde Delete ikonunun gorundugu dogrulanir")
    public void buradaki_urunlerin_uzerine_gelindiginde_delete_ikonunun_gorundugu_dogrulanir() {

        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();
        ReusableMethod.waitForClickablility(pages.wishListDorduncuUrun, 5);
        actions.moveToElement(pages.wishListDorduncuUrun).perform();
        ReusableMethod.bekle(2);
        assertTrue(pages.wishListDorduncuUrunDelete.isDisplayed());
    }

    @Then("Delete ikonuna tiklandiginda ilgili ürünün Wishlist'ten silindigi dogrulanir")
    public void delete_ikonuna_tiklandiginda_ilgili_urunun_wishlist_ten_silindigi_dogrulanir() {

        pages = new US_3_16_19_28_29();
        System.out.println("silinmeden önceki size = >"+pages.productsInWishList.size());
        pages.wishListDorduncuUrunDelete.click();
        pages.wishListDorduncuUrunDeleteButonu.click();
        ReusableMethod.waitForClickablility(pages.wishListDorduncuUrunDeleteButonuKapatma, 5);
        pages.wishListDorduncuUrunDeleteButonuKapatma.click();
        int actualSize=pages.productsInWishList.size();
        Assert.assertTrue(actualSize==2);

    }
    @Then("Yeni urun Wishliste eklenir")
    public void yeni_urun_wishliste_eklenir() {
        pages = new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.homePageTextBox, 10);
        pages.homePageTextBox.sendKeys("Samsung");
        ReusableMethod.waitForClickablility(pages.homePageTextBoxSamsung, 3);
        pages.homePageTextBoxSamsung.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.waitForClickablility(pages.homePageTextBoxSamsungWishListButton, 5);
        actions.moveToElement(pages.homePageTextBoxSamsungWishListButton).perform();
        ReusableMethod.bekle(2);
        pages.homePageTextBoxSamsungWishListButton.click();
        ReusableMethod.waitForClickablility(pages.wishList, 5);

    }
    @Then("Buradaki urunlerin uzerine gelindiginde Add to Cart ikonunun gorundugu dogrulanir")
    public void buradaki_urunlerin_uzerine_gelindiginde_add_to_cart_ikonunun_gorundugu_dogrulanir() {

        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(pages.wishListikinciUrun).perform();
        ReusableMethod.bekle(1);
        assertTrue(pages.wishListAddttoCart.isDisplayed());
    }
    @Then("Buradaki urunlerin uzerine gelindiginde Add to Cart ikonunu tiklanir.")
    public void buradaki_urunlerin_uzerine_gelindiginde_add_to_cart_ikonunu_tiklanir() {
        pages = new US_3_16_19_28_29();
        ReusableMethod.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(1);
        actions.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
        ReusableMethod.bekle(1);
        actions.moveToElement(pages.wishListAddttoCart).perform();
        //ReusableMethod.waitForClickablility(pages.wishListAddttoCartClick,5);
        pages.wishListAddttoCartClick.click();
    }
    @Then("Wishlist'te ki urunu Cart sayfasina ekledigi dogrulanir")
    public void wishlist_te_ki_urunu_cart_sayfasina_ekledigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        pages.wishListAddttoCartViewCart.click();
        assertTrue(pages.wishListAddttoCartViewCartCart.isDisplayed());
    }
    @Given("Kullanici Admin Anasayfa {string} 'ine gider.")
    public void kullanici_admin_anasayfa_ine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
    }
    @Then("Admin panelinin URL'ine erisilebilir oldugu dogrulanir")
    public void admin_panelinin_url_ine_erisilebilir_oldugu_dogrulanir() {
        //System.out.println(Driver.getDriver().getCurrentUrl()); https://trendlifebuy.com/admin/login
        String actualAdUrl=Driver.getDriver().getCurrentUrl();
        String expectedAdUrl="https://trendlifebuy.com/admin/login";
        assertEquals(actualAdUrl,expectedAdUrl);
    }
    @Then("Gecerli bir admin {string} ve {string} girer")
    public void gecerli_bir_admin_ve_girer(String string, String string2) {

        pages = new US_3_16_19_28_29();
        pages.AdemailTextBox.sendKeys(ConfigReader.getProperty("adminEmailM"));
        ReusableMethod.bekle(1);
        pages.AdpasswordTextBox.sendKeys(ConfigReader.getProperty("adminPasswordM"));
        ReusableMethod.bekle(1);
    }
    @Then("Signed\\(ad) in butonuna basar")
    public void signed_ad_in_butonuna_basar() {

        pages = new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.AdsignInButton.click();
        ReusableMethod.bekle(3);
    }
    @Then("Admin Dashboard sayfasina login olundugu dogrulanir")
    public void admin_dashboard_sayfasina_login_olundugu_dogrulanmali() {


        String actualAdUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualAdUrl);
        String expectedAdUrl="https://trendlifebuy.com/admin-dashboard";
        assertEquals(actualAdUrl,expectedAdUrl);
    }
    @Then("Sayfanin ust bolumunde Search TextBox'inin gorunur oldugu dogrulanir")
    public void sayfanin_ust_bolumunde_search_text_box_inin_gorunur_oldugu_dogrulanir() {
        pages = new US_3_16_19_28_29();
        assertTrue(pages.AdSearch.isDisplayed());
    }
    @Then("Search TextBox'i kullanilarak site icinde arama yapilabildigi dogrulanmali")
    public void search_text_box_i_kullanilarak_site_icinde_arama_yapilabildigi_dogrulanmali() {
        pages = new US_3_16_19_28_29();
        pages.AdSearch.sendKeys("New Customers",Keys.ENTER);
    }
    @Then("Menu ikonuna tiklandiginda Dashboard Side Bar'inin daralip genisledigi dogrulanmali")
    public void menu_ikonuna_tiklandiginda_dashboard_side_bar_inin_daralip_genisledigi_dogrulanmali() {

        pages = new US_3_16_19_28_29();
        pages.AdMenuikonu.click();
        assertTrue(pages.AdMiniSidebar.isDisplayed());
        pages.AdMenuikonu.click();
        assertTrue(pages.AdSidebar.isDisplayed());
    }
    @Then("Website botununa tiklanir")
    public void website_botununa_tiklanir() {

    }
    @Then("Sitenin kullanici arayuzune yonlendirdigi dogrulanmali")
    public void sitenin_kullanici_arayuzune_yonlendirdigi_dogrulanmali() {
        pages = new US_3_16_19_28_29();
        String ilkSayfaWHD=Driver.getDriver().getWindowHandle();
        pages.AdWEbsite.click();

        Set<String> ikiSayfaninWHDegerleriSeti=Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD="";

        for (String eachWHD:ikiSayfaninWHDegerleriSeti) {
            if (!eachWHD.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

        String expectedCusUrl="https://trendlifebuy.com/";
        String actualCusUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedCusUrl,actualCusUrl);
    }
    @Then("İlgili butonlarina sirayla tiklandiginda Summary Boarddaki verilerin secilen degere gore degistigi dogrulanir")
    public void i̇lgili_butonlarina_sirayla_tiklandiginda_summary_boarddaki_verilerin_secilen_degere_gore_degistigi_dogrulanir() {
        pages = new US_3_16_19_28_29();
        pages.AdToday.click();
        String visitor= Driver.getDriver().findElement(By.xpath("//h1[@class='gradient-color2 total_visitors']")).getText();
        System.out.println("Visitor=" +visitor);

    }
    @Then("İlgili butonlara tiklandiginda ilgili sayfalara yonlendirdigi dogrulanmali")
    public void i̇lgili_butonlara_tiklandiginda_ilgili_sayfalara_yonlendirdigi_dogrulanmali() {

        pages = new US_3_16_19_28_29();
        String ilkSayfaWHD="";
        String expAdminUrl="";
        String actAdminUrl="";

        ReusableMethod.waitForVisibility(pages.AdVisitor,10);
        ilkSayfaWHD=Driver.getDriver().getWindowHandle();
        pages.AdTotalOrder.click();
        ReusableMethod.bekle(2);
        Set<String> ikiSayfaninWHDegerleriSeti=Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD="";

        for (String eachWHD:ikiSayfaninWHDegerleriSeti) {
            if (!eachWHD.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
        expAdminUrl="https://trendlifebuy.com/ordermanage/total-sales-list";
        actAdminUrl=Driver.getDriver().getCurrentUrl();
        assertEquals(expAdminUrl,actAdminUrl);
        Driver.getDriver().switchTo().window(ikinciSayfaWHD).close();
        Driver.getDriver().switchTo().window(ilkSayfaWHD);


        ReusableMethod.waitForVisibility(pages.AdVisitor,10);
        pages.AdTotalPendingOrder.click();
        ReusableMethod.bekle(2);
        ikiSayfaninWHDegerleriSeti=Driver.getDriver().getWindowHandles();

        for (String eachWHD:ikiSayfaninWHDegerleriSeti) {
            if (!eachWHD.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
        expAdminUrl="https://trendlifebuy.com/ordermanage/total-sales-list";
        actAdminUrl=Driver.getDriver().getCurrentUrl();
        assertEquals(expAdminUrl,actAdminUrl);
        Driver.getDriver().switchTo().window(ikinciSayfaWHD).close();
        Driver.getDriver().switchTo().window(ilkSayfaWHD);

        ReusableMethod.waitForVisibility(pages.AdVisitor,10);
        pages.AdTotalCompletedOrder.click();
        ReusableMethod.bekle(2);
        ikiSayfaninWHDegerleriSeti=Driver.getDriver().getWindowHandles();

        for (String eachWHD:ikiSayfaninWHDegerleriSeti) {
            if (!eachWHD.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
        expAdminUrl="https://trendlifebuy.com/ordermanage/total-sales-list";
        actAdminUrl=Driver.getDriver().getCurrentUrl();
        assertEquals(expAdminUrl,actAdminUrl);
        Driver.getDriver().switchTo().window(ikinciSayfaWHD).close();
        Driver.getDriver().switchTo().window(ilkSayfaWHD);

        ReusableMethod.waitForVisibility(pages.AdVisitor,10);
        pages.AdVisitor.click();
        ReusableMethod.bekle(2);
        expAdminUrl="https://trendlifebuy.com/admin-report/visitor-report";
        actAdminUrl=Driver.getDriver().getCurrentUrl();
        assertEquals(expAdminUrl,actAdminUrl);

        Driver.getDriver().navigate().back();

        ReusableMethod.waitForVisibility(pages.AdVisitor,10);
        pages.AdTotalSubcriber.click();
        ReusableMethod.bekle(2);
        expAdminUrl="https://trendlifebuy.com/marketing/subscribers";
        actAdminUrl=Driver.getDriver().getCurrentUrl();
        assertEquals(expAdminUrl,actAdminUrl);

        Driver.getDriver().navigate().back();


    }

}

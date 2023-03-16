package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_3_16_19_28_29;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class US_3_16_19_28_29_StepDef {
    Actions actions = new Actions(Driver.getDriver());
    US_3_16_19_28_29 pages;
    String ilkSayfaHandleDegeri;


    @Given("Kullanici Anasayfa {string} 'ine gider.")
    public void kullanici_anasayfa_ine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Subscribe popup kapatilir")
    public void subscribe_popup_kapatilir() {
    pages= new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.subscribePopupExit,10);
        pages.subscribePopupExit.click();
    }
    @Then("All Categories dropdown menu’yu tiklar")
    public void all_categories_dropdown_menu_yu_tiklar() {
        pages= new US_3_16_19_28_29();
        pages.allCategories.click();
    }
    @Then("All Categories menusu altindaki tum kategorileri goruntulenir")
    public void all_categories_menusu_altindaki_tum_kategorileri_goruntulenir() {
        pages= new US_3_16_19_28_29();
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
    pages= new US_3_16_19_28_29();
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
        pages= new US_3_16_19_28_29();
        pages.homePageLogin.click();

    }
    @Then("Gecerli bir {string} ve {string} girer")
    public void gecerli_bir_ve_girer(String string, String string2) {
        pages= new US_3_16_19_28_29();
        pages.emailTextBox.sendKeys(ConfigReader.getProperty("customerEmailM"));
        ReusableMethod.bekle(1);
        pages.passwordTextBox.sendKeys(ConfigReader.getProperty("customerPasswordM"));
        ReusableMethod.bekle(1);

    }
    @Then("Signed in butonuna basar")
    public void signed_in_butonuna_basar() {
        pages= new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.signInButton.click();
        ReusableMethod.bekle(1);
    }
    @Then("DashBoard butonuna tiklar")
    public void dash_board_butonuna_tiklar() {
        pages= new US_3_16_19_28_29();
        pages.dashBoard.click();

    }
    @Then("Purchase History Linki tiklanir")
    public void purchase_history_linki_tiklanir() {
        pages= new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.purchaseHistory.click();
        ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();

    }
    @Then("Purchase History sayfasina yonlendirdigi dogrulanir")
    public void purchase_history_sayfasina_yonlendirdigi_dogrulanir() {

        pages= new US_3_16_19_28_29();
        assertTrue(pages.purchaseHistoryTitle.isDisplayed());

    }
    @Then("All History dropdown tiklanir")
    public void all_history_dropdown_tiklanir() {

        pages= new US_3_16_19_28_29();
        pages.purchaseHistoryAllHistory.click();

    }
    @Then("ilgili seceneklere gore filtrelendigi gorulur")
    public void ilgili_seceneklere_gore_filtrelendigi_gorulur() {

        pages= new US_3_16_19_28_29();
        assertTrue(pages.purchaseHistoryAllHistoryAllHistory.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryPendingOrders.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryConfirmedOrders.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryCompletedOrders.isDisplayed());
        assertTrue(pages.purchaseHistoryAllHistoryRefusedAndCancelledOrders.isDisplayed());

    }

    @Then("Siparis ozetlerinin goruntulenebildigi dogrulanir")
    public void siparis_ozetlerinin_goruntulenebildigi_dogrulanir() {

        pages= new US_3_16_19_28_29();

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

        pages= new US_3_16_19_28_29();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.myWallet.click();
    }
    @Then("My Wallet sayfasina yonlendirdigi dogrulanir")
    public void my_wallet_sayfasina_yonlendirdigi_dogrulanir() {

        pages= new US_3_16_19_28_29();
        assertTrue(pages.myWalletTitle.isDisplayed());
    }
    @Then("My Wallet sayfasinda ilgili boardlarinin gorunurlugu dogrulanir")
    public void my_wallet_sayfasinda_ilgili_boardlarinin_gorunurlugu_dogrulanir() {

        pages= new US_3_16_19_28_29();
        assertTrue(pages.myWalletTotalBalance.isDisplayed());
        assertTrue(pages.myWalletRunningBalance.isDisplayed());
        assertTrue(pages.myWalletPendingBalance.isDisplayed());
    }
    @Then("Recharge Wallet butonunun goruntulenebildigi dogrulanir")
    public void recharge_wallet_butonunun_goruntulenebildigi_dogrulanir() {
        pages= new US_3_16_19_28_29();
        assertTrue(pages.myWalletRechargeWallet.isDisplayed());
    }
    @Then("Recharge Wallet butonu tiklanir")
    public void recharge_wallet_butonu_tiklanir() {
        pages= new US_3_16_19_28_29();
        pages.myWalletRechargeWallet.click();
    }
    @Then("Recharge Amount penceresinin acildigi dogrulanir")
    public void recharge_amount_penceresinin_acildigi_dogrulanir() {
        pages= new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmount,5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmount.isDisplayed());
    }
    @Then("Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanir")
    public void recharge_amount_sekmesinde_tutar_girebilebilen_bir_text_box_in_oldugu_dogrulanir() {
        pages= new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmount,5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmountTextBox.isDisplayed());
    }
    @Then("Recharge Amount sekmesinde Cancel butonunun oldugu dogrulanir")
    public void recharge_amount_sekmesinde_cancel_butonunun_oldugu_dogrulanir() {

        pages= new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmountCancel,5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmountCancel.isDisplayed());
    }
    @Then("Recharge Amount sekmesinde Cancel butonunun iptal islemi yapabildigi dogrulanir")
    public void recharge_amount_sekmesinde_cancel_butonunun_iptal_islemi_yapabildigi_dogrulanir() {

        pages= new US_3_16_19_28_29();
        pages.myWalletRechargeWalletRechargeAmountCancel.click();
        assertTrue(pages.myWalletTitle.isDisplayed());
    }
    @Then("Add Fund butonunun goruntulenebildigi dogrulanir")
    public void add_fund_butonunun_goruntulenebildigi_dogrulanir() {

        pages= new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletRechargeWalletRechargeAmountAddFund,5);
        assertTrue(pages.myWalletRechargeWalletRechargeAmountAddFund.isDisplayed());
    }
    @Then("TextBoxa {string} deger girilir")
    public void text_boxa_deger_girilir(String string) {
        pages= new US_3_16_19_28_29();
        pages.myWalletRechargeWalletRechargeAmountTextBox.sendKeys(ConfigReader.getProperty("moneyM"));

    }
    @Then("Add Fund butonuna tiklanir")
    public void add_fund_butonuna_tiklanir() {
        pages= new US_3_16_19_28_29();
        pages.myWalletRechargeWalletRechargeAmountAddFund.click();

    }
    @Then("İlgili sayfaya yonlendirildigi dogrulanir")
    public void i̇lgili_sayfaya_yonlendirildigi_dogrulanir() {
        pages= new US_3_16_19_28_29();
        assertTrue(pages.myWalletRechargeWalletRechargeAmountAddFundMyWalletRecharge.isDisplayed());
    }
    @Then("Wallet Recharge History listesinde ilgili sutunlarin oldugu dogrulanir")
    public void wallet_recharge_history_listesinde_ilgili_sutunlarin_oldugu_dogrulanir() {
        pages= new US_3_16_19_28_29();
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

        pages= new US_3_16_19_28_29();
        ReusableMethod.waitForClickablility(pages.myWalletWalletRechargeHistoryApproved,5);
        assertTrue(pages.myWalletWalletRechargeHistoryApproved.isDisplayed());
    }

    @Then("My Wishlist Linki tiklanir")
    public void my_wishlist_linki_tiklanir() {

        pages= new US_3_16_19_28_29();
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
        pages= new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethod.waitForClickablility(pages.myWishListItems,5);
        assertTrue(pages.myWishListItems.isDisplayed());
    }
    @Then("Urunlerin ilgili seceneklerine göre siralanarak listelendigi dogrulanir")
    public void urunlerin_ilgili_seceneklerine_göre_siralanarak_listelendigi_dogrulanir() {
        pages= new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        pages.myWishListItemsNew.click();
        ReusableMethod.waitForClickablility(pages.myWishListItemsNewNew,5);
        assertTrue(pages.myWishListItemsNewNew.isDisplayed());
        assertTrue(pages.myWishListItemsNewOld.isDisplayed());
        assertTrue(pages.myWishListItemsNewPriceLowtoHigh.isDisplayed());
        assertTrue(pages.myWishListItemsNewPriceHightoLow.isDisplayed());

    }
    @Then("Urunlerin listeleme sayisini ilgili seceneklerine göre degistirilebilir oldugu dogrulanir")
    public void urunlerin_listeleme_sayisini_ilgili_seceneklerine_göre_degistirilebilir_oldugu_dogrulanir() {
        pages= new US_3_16_19_28_29();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        pages.myWishListItemsShowItems.click();
        ReusableMethod.waitForClickablility(pages.myWishListItemsShowItems8,5);
        assertTrue(pages.myWishListItemsShowItems8.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems12.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems16.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems24.isDisplayed());
        assertTrue(pages.myWishListItemsShowItems32.isDisplayed());
    }

}

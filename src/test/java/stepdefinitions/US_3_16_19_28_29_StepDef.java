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
        pages.emailTextBox.sendKeys(ConfigReader.getProperty("customerEmail"));
        ReusableMethod.bekle(1);
        pages.passwordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));
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

        pages= new US_3_16_19_28_29();
        //assertTrue(pages.purchaseHistoryActionInvoiceDownload.isEnabled());
        pages.purchaseHistoryActionInvoiceDownload.click();

        Set<String> tumWHDegerleriSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD="";

        for (String eachWhd:tumWHDegerleriSeti
        ) {
            if (!eachWhd.equals(ilkSayfaHandleDegeri))
                ikinciSayfaWHD=eachWhd;
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

        Driver.getDriver().switchTo().window(ikinciSayfaWHD).close();

        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);



    }


}

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

import static org.junit.Assert.assertTrue;

public class US_3_16_19_28_29_StepDef {

    US_3_16_19_28_29 pages;


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
        Actions actions = new Actions(Driver.getDriver());
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
}

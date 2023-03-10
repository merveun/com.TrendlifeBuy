package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.US_10_37_41;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class US_10_37_41_StepDef {

    US_10_37_41 pages;

    @Given("kullanici {string} sayfasina git")
    public void kullanici_sayfasina_git(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("subscribe popup kapatilir")
    public void subscribe_popup_kapatilir() {
        ReusableMethod.bekle(8);
        pages.subscribePopupExit.click();
    }
    @Then("All categories butonuna tiklar")
    public void all_categories_butonuna_tiklar() {
        ReusableMethod.waitForClickablility(pages.allCategories,10);
        pages.allCategories.click();
    }
    @Then("copmuter ve accessories menusunun uzerinde bekler")
    public void copmuter_ve_accessories_menusunun_uzerinde_bekler() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pages.computerAndAccessoriesMenu).perform();

    }
    @Then("computer menusune tiklar")
    public void computer_menusune_tiklar() {
        pages.computerMenu.click();
    }
    @Then("ilk urunun uzerinde bekler")
    public void ilk_urunun_uzerinde_bekler() {
        ReusableMethod.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pages.firstProduct).perform();
        pages.addToCartButton.click();

    }
    @Then("add to cart butonuna tiklar")
    public void add_to_cart_butonuna_tiklar() {
        ReusableMethod.bekle(1);
        pages.addToCartButton.click();

    }
    @Then("view cart butonuna tiklar")
    public void view_cart_butonuna_tiklar() {
        pages.viewCartButton.click();
    }
    @Then("gerekli yazilarin gorunur oldugunu dogrular")
    public void gerekli_yazilarin_gorunur_oldugunu_dogrular() {

    }

}

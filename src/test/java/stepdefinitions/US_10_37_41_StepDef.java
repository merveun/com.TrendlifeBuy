package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
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
        pages = new US_10_37_41();
        ReusableMethod.waitForClickablility(pages.subscribePopupExit,10);
        pages.subscribePopupExit.click();

        /*JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",pages.subscribePopupExit);*/



    }
    @Then("All categories butonuna tiklar")
    public void all_categories_butonuna_tiklar() {
       //Driver.getDriver().findElement(By.xpath("//div/a[@class='Categories_togler']")).click();
        pages = new US_10_37_41();
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

    @Then("acilen yeni sekmeye gecer")
    public void acilen_yeni_sekmeye_gecer() {
        String origin = Driver.getDriver().getWindowHandle();
        String yeniSekme = "";
        for (String handle : Driver.getDriver().getWindowHandles()) {
            if(!origin.equals(handle))
            {
                yeniSekme=handle;
            }
        }
        Driver.getDriver().switchTo().window(yeniSekme);
    }
    @Then("ilk urunun uzerinde bekler")
    public void ilk_urunun_uzerinde_bekler() {
        Actions actions = new Actions(Driver.getDriver());
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN)
                .perform();
        pages = new US_10_37_41();
        actions.moveToElement(pages.firstProduct).perform();


    }
    @Then("add to cart butonuna tiklar")
    public void add_to_cart_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.addToCartButton.click();

    }
    @Then("view cart butonuna tiklar")
    public void view_cart_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.viewCartButton.click();
    }
    @Then("gerekli yazilarin gorunur oldugunu dogrular")
    public void gerekli_yazilarin_gorunur_oldugunu_dogrular() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.shippinChargeFreeFromText.isDisplayed());
        softAssert.assertTrue(pages.orderSummartText.isDisplayed());
        softAssert.assertTrue(pages.subtotalText.isDisplayed());
        softAssert.assertTrue(pages.shippingChargeText.isDisplayed());
        softAssert.assertTrue(pages.discountText.isDisplayed());
        softAssert.assertTrue(pages.vatTaxGstText.isDisplayed());
        softAssert.assertAll();
    }

    @Then("adet degisiminin yapilabildigini dogrula")
    public void adet_degisiminin_yapilabildigini_dogrula() {
        pages=new US_10_37_41();
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitForClickablility(pages.quantityIncreaseButton,5);
        pages.quantityIncreaseButton.click();
        ReusableMethod.bekle(1);
        System.out.println(pages.quantityValue.getAttribute("value"));
        softAssert.assertTrue(pages.quantityValue.getAttribute("value").equals("2"));
        pages.quantityDecreaseButton.click();
        ReusableMethod.bekle(1);
        softAssert.assertTrue(pages.quantityValue.getAttribute("value").equals("1"));
        softAssert.assertAll();
    }

    @Then("total ucretin degisebilir oldugunu dogrular")
    public void total_ucretin_degisebilir_oldugunu_dogrular() {
        pages = new US_10_37_41();
        int productPrice = ReusableMethod.onlyTakeNumberandParseInteger(pages.subTotalOfProduct.getText());

        int totalPrice = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalPrice.getText());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productPrice,totalPrice);

        pages.quantityIncreaseButton.click();
        ReusableMethod.bekle(1);
        productPrice = ReusableMethod.onlyTakeNumberandParseInteger(pages.subTotalOfProduct.getText());

        totalPrice = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalPrice.getText());
        softAssert.assertEquals(productPrice,totalPrice);

        pages.quantityDecreaseButton.click();
        ReusableMethod.bekle(1);
        productPrice = ReusableMethod.onlyTakeNumberandParseInteger(pages.subTotalOfProduct.getText());

        totalPrice = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalPrice.getText());
        softAssert.assertEquals(productPrice,totalPrice);

        softAssert.assertAll();


    }
    @Then("urun fiyati ve indirimin oraninin gorunur oldugunu dogrular")
    public void urun_fiyati_ve_indirimin_oraninin_gorunur_oldugunu_dogrular() {
        pages = new US_10_37_41();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.discountGreenBox.isDisplayed());
        softAssert.assertTrue(pages.priceOfProduct.isDisplayed());
        softAssert.assertAll();
    }

    @Then("Proceed to checkout butonuna tiklar")
    public void proceed_to_checkout_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.proceedToCheckoutButton.click();

    }
    @Then("ilgili sayfaya gidildigini dogrular")
    public void ilgili_sayfaya_gidildigini_dogrular() {
        String expectedUrl ="https://qa.trendlifebuy.com/checkout";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }



    @Then("continue shopping butonuna tiklar")
    public void continue_shopping_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.continueShoppingButton.click();

    }
    @Then("anasayfaya gidildigini dogrular")
    public void anasayfaya_gidildigini_dogrular() {
        String expectedUrl = ConfigReader.getProperty("url");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }


    @Then("urun silme butonuna tiklar")
    public void urun_silme_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.deleteProductButton.click();
        ReusableMethod.bekle(1);

    }
    @Then("total fiyatin degistigini dogrular")
    public void total_fiyatin_degistigini_dogrular() {
        int expectedTotal =0;
        int actualTotal = ReusableMethod.onlyTakeNumberandParseInteger(pages.totalPrice.getText());
        ReusableMethod.bekle(1);
        Assert.assertEquals(actualTotal,expectedTotal);
    }
    @Then("sayfayi kapat")
    public void sayfayi_kapat() {
        Driver.quitDriver();
    }

}

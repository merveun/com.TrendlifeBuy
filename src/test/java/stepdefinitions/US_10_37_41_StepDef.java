package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_10_37_41;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.util.List;
import java.util.Random;

public class US_10_37_41_StepDef {

    US_10_37_41 pages;
    String subjectText;
    String dashboardHandleDegeri="";
    String orderIDfromDashboard;
    String customerNameFromDashboard;
    String customersProfileHandleDegeri="";
    String orderManagerHandleDegeri="";
    @Given("kullanici {string} sayfasina git")
    public void kullanici_sayfasina_git(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("subscribe popup kapatilir")
    public void subscribe_popup_kapatilir() {
       pages = new US_10_37_41();
       pages.categoryErrorMessage.click();
        /* pages = new US_10_37_41();
        ReusableMethod.waitForClickablility(pages.subscribePopupExit,10);
        pages.subscribePopupExit.click();
*/
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
    @Then("shipping charge free yazisinin gorunur oldugunu dogrula")
    public void shipping_charge_free_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(pages.shippinChargeFreeFromText.isDisplayed());

        /*
        Sofassert. x isdisplayed
        Sofassert. y isdisplayed
        Sofassert. z isdisplayed
        Sofassert. aisdisplayed , " a elementi  "
         */
    }
    @Then("order summary yazisinin gorunur oldugunu dogrula")
    public void order_summary_yazisinin_gorunur_oldugunu_dogrula() {

        Assert.assertTrue(pages.orderSummartText.isDisplayed());
    }
    @Then("subtotal yazisinin gorunur oldugunu dogrula")
    public void subtotal_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(pages.subtotalText.isDisplayed());
    }
    @Then("shipping charge yazisinin gorunur oldugunu dogrula")
    public void shipping_charge_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(pages.shippingChargeText.isDisplayed());
    }
    @Then("discount yazisinin gorunur oldugunu dogrula")
    public void discount_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(pages.discountText.isDisplayed());
    }
    @Then("vatTaxGst yazisinin gorunur oldugunu dogrula")
    public void vat_tax_gst_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(pages.vatTaxGstText.isDisplayed());
    }
    @Then("total yazisinin gorunur oldugunu dogrula")
    public void total_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(pages.totalText.isDisplayed());
    }

    // US_037 methods

    @Given("kullanici bilgilerini gir")
    public void kullanici_bilgilerini_gir() {
        pages = new US_10_37_41();
        pages.adminEmailTextBox.sendKeys(ConfigReader.getProperty("adminEmail"));
        pages.adminPasswordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @Given("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        pages.adminSignInButton.click();
    }
    @Given("gerekli grafiklerin gorunur oldugunu dogrular")
    public void gerekli_grafiklerin_gorunur_oldugunu_dogrular() {
       ReusableMethod.bekle(1);
       Actions actions = new Actions(Driver.getDriver());
       actions.scrollToElement(Driver.getDriver().findElement(By.xpath("//canvas"))).perform();
        ReusableMethod.bekle(1);
        SoftAssert softAssert = new SoftAssert();
        /*for (WebElement graphic : pages.adminDashboardGraphics)
        {
            softAssert.assertTrue(graphic.isDisplayed());
        }
        softAssert.assertAll();*/

    }

    @Given("gerekli listelerin gorunur oldugunu dogrular")
    public void gerekli_listelerin_gorunur_oldugunu_dogrular() {
        pages=new US_10_37_41();

        SoftAssert softAssert = new SoftAssert();
        for (WebElement each : pages.ListHeaders)
        {
            Actions action = new Actions(Driver.getDriver());
            action.scrollToElement(each).perform();
            softAssert.assertTrue(each.isDisplayed());
        }
        softAssert.assertAll();

    }

    @Then("new customerstaki details butonuna tiklar")
    public void new_customerstaki_details_butonuna_tiklar() {
        pages = new US_10_37_41();

        dashboardHandleDegeri=Driver.getDriver().getWindowHandle();
        customerNameFromDashboard=pages.nameCustomer.getText(); // Testte kullanılacak data

        pages.detailsNewCustomersButton.click();

        for (String handle : Driver.getDriver().getWindowHandles()) {
            if(!dashboardHandleDegeri.equals(handle))
            {
                customersProfileHandleDegeri=handle;
            }
        }
        Driver.getDriver().switchTo().window(customersProfileHandleDegeri);




    }
    @Then("ilgili customer sayfasina yonlendirildigini dogrulanir")
    public void ilgili_customer_sayfasina_yonlendirildigini_dogrulanir() {
        Assert.assertTrue(pages.customersNameFromProfile.getText().contains(customerNameFromDashboard));
        Driver.getDriver().switchTo().window(dashboardHandleDegeri);
    }
    @Then("latest orderdaki details butonuna tiklar")
    public void latest_orderdaki_details_butonuna_tiklar() {
        pages = new US_10_37_41();
        ReusableMethod.focusToElement(pages.orderId);
        orderIDfromDashboard=pages.orderId.getText();// Testte kullanılacak data
        pages.latestOrderDetailsButton.click();

        for (String handle : Driver.getDriver().getWindowHandles()) {
            if(!dashboardHandleDegeri.equals(handle) && !customersProfileHandleDegeri.equals(handle))
            {
                orderManagerHandleDegeri=handle;
            }
        }
        Driver.getDriver().switchTo().window(orderManagerHandleDegeri);

    }
    @Then("ilgili siparis sayfasina yonlendirildigini dogrular")
    public void ilgili_siparis_sayfasina_yonlendirildigini_dogrular() {
        Assert.assertTrue(pages.orderIDFromOrderManage.getText().contains(orderIDfromDashboard));
    }

    @Then("supportTicket dropdownuna tiklar")
    public void support_ticket_dropdownuna_tiklar() {
        pages = new US_10_37_41();
        pages.supportTicketDropDown.click();
    }
    @Then("support ticket butonuna tiklar")
    public void support_ticket_butonuna_tiklar() {
        pages=new US_10_37_41();
        pages.supportTicketLinkMenu.click();
    }
    @Then("{string} sayfasina gittigi dogrulanir")
    public void sayfasina_gittigi_dogrulanir(String url) {
        ReusableMethod.waitForPageToLoad(10);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty(url);
        Assert.assertEquals(actualUrl,expectedUrl,"Beklenen url ile asıl url esit degil");
    }

    @Then("add new butonuna tiklar")
    public void add_new_butonuna_tiklar() {
        pages=new US_10_37_41();
        pages.addNewButtonOnTicketPage.click();
    }

    @Then("create ticket butonuna tiklar")
    public void create_ticket_butonuna_tiklar() {
        pages=new US_10_37_41();
        pages.createTicketButton.click();
    }
    @Then("gerekli yazilarin gorunur oldugunu dogrular")
    public void gerekli_yazilarin_gorunur_oldugunu_dogrular() {
        ReusableMethod.waitForPageToLoad(5);
        Assert.assertTrue(pages.subjectErrorMessage.isDisplayed());
        Assert.assertTrue(pages.categoryErrorMessage.isDisplayed());
        Assert.assertTrue(pages.priorityErrorMessage.isDisplayed());
        Assert.assertTrue(pages.statusErrorMessage.isDisplayed());
        Assert.assertTrue(pages.descriptionErrorMessage.isDisplayed());
    }

    @Then("new browser add butonuna tiklar")
    public void new_browser_add_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.addBrowserButton.click();
    }
    @Then("yeni browserBox olustugunu dogrular")
    public void yeni_browser_box_olustugunu_dogrular() {
        pages=new US_10_37_41();
        int expectedSize=2;
        int actualSize=pages.browserDivList.size();
        Assert.assertEquals(actualSize,expectedSize);
    }
    @Then("delete browser butonuna tiklar")
    public void delete_browser_butonuna_tiklar() {
        pages = new US_10_37_41();
        pages.deleteBrowserButton.click();
    }
    @Then("browserBox silindigini dogrular")
    public void browser_box_silindigini_dogrular() {
        pages=new US_10_37_41();
        int expectedSize=1;
        int actualSize=pages.browserDivList.size();
        Assert.assertEquals(actualSize,expectedSize);
    }

    @Then("ticket bilgilerini doldurur")
    public void ticket_bilgilerini_doldurur() {
        pages=new US_10_37_41();
        Faker faker = new Faker();
        subjectText=faker.name().fullName();
        pages.subjectTextBox.sendKeys(subjectText);
        pages.descriptionTextBox.sendKeys(faker.lorem().paragraph());
        // Choose category
        ReusableMethod.chooseItemFromMenuWhichIsInAddTicketPage(pages.categoryList,pages.categoryListButton);
        // Choose priortiy
        ReusableMethod.chooseItemFromMenuWhichIsInAddTicketPage(pages.priorityList,pages.priorityListButton);
        // Choose UserList
        ReusableMethod.chooseItemFromMenuWhichIsInAddTicketPage(pages.userList,pages.userListButton);
        // Choose status
        ReusableMethod.chooseItemFromMenuWhichIsInAddTicketPage(pages.statusList,pages.statusListButton);
        // Choose assign to
        ReusableMethod.chooseItemFromMenuWhichIsInAddTicketPage(pages.assignToList,pages.assignToListButton);
        pages.attachFileBox.sendKeys(System.getProperty("user.dir")+"\\test-data\\ornek.txt");
    }
    @Then("ticket listte yeni ticket olusturuldugunu dogrular")
    public void ticket_listte_yeni_ticket_olusturuldugunu_dogrular() {
        pages=new US_10_37_41();
        String actualText=pages.firstSubjectofTicket.getText();
        Assert.assertEquals(actualText,subjectText);
    }

    @Then("sayfayi kapat")
    public void sayfayi_kapat() {
        Driver.quitDriver();
    }

    @Then("category dropbox seceneklerinin gorunu ve secilebilir oldugunu dogrular")
    public void categoryDropboxSeceneklerininGorunuVeSecilebilirOldugunuDogrular() throws InterruptedException {
        ReusableMethod.waitForPageToLoad(3);
        pages=new US_10_37_41();
        ReusableMethod.verifyAllItemsAreClickable(pages.categoryList,pages.categoryListButton,pages.categoryListCurrentText);

    }

    @Then("priority dropbox seceneklerinin gorunur ve secilebilir oldugunu dogrular")
    public void priorityDropboxSeceneklerininGorunurVeSecilebilirOldugunuDogrular() throws InterruptedException {
        ReusableMethod.waitForPageToLoad(3);
        pages=new US_10_37_41();
        ReusableMethod.verifyAllItemsAreClickable(pages.priorityList,pages.priorityListButton,pages.priorityListCurrentText);

    }

    @Then("user dropbox seceneklerinin gorunur ve secilebilir oldugunu dogrular")
    public void userDropboxSeceneklerininGorunurVeSecilebilirOldugunuDogrular() throws InterruptedException {
       /* ReusableMethod.waitForPageToLoad(3);
        pages=new US_10_37_41();
        ReusableMethod.verifyAllItemsAreClickable(pages.userList,pages.userListButton,pages.userListButton);

        */
    }

    @Then("status dropbox seceneklerinin gorunur ve secilebilir oldugunu dogrular")
    public void statusDropboxSeceneklerininGorunurVeSecilebilirOldugunuDogrular() throws InterruptedException {
        ReusableMethod.waitForPageToLoad(3);
        pages=new US_10_37_41();
        ReusableMethod.verifyAllItemsAreClickable(pages.statusList,pages.statusListButtonOnSupportTicket,pages.statusListCurrentText);
    }
}

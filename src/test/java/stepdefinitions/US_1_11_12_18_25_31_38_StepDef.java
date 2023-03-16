package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.US_10_37_41;
import pages.US_1_11_12_18_25_31_38;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.io.StringReader;
import java.security.Key;
import java.util.List;

public class US_1_11_12_18_25_31_38_StepDef {

    WebElement driver;
    US_1_11_12_18_25_31_38 pages = new US_1_11_12_18_25_31_38();


    String kullaniciEmail;
    String kullaniciIsim;
    String password;
    Faker faker = new Faker();
    Actions actions;

    @Given("kullanici trendlifeUrl anasayfaya gider")
    public void kullanici_trendlife_url_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("subscribe popupu kapatilir")
    public void subscribe_popupu_kapatilir() {

        pages = new US_1_11_12_18_25_31_38();
        ReusableMethod.waitForClickablility(pages.PopupExitButon, 5);
        pages.PopupExitButon.click();


    }


    @Then("istenen sayfaya gittigi dogrulanir")
    public void istenen_sayfaya_gittigi_dogrulanir() {

        String expectedUrl = "https://qa.trendlifebuy.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Then("Anasayfada title in Trendlifebuy Online Shopping oldugunu kontrol eder")
    public void anasayfadaTitleInTrendlifebuyOnlineShoppingOldugunuKontrolEder() {

        pages = new US_1_11_12_18_25_31_38();
        String expectedtitle = "Trendlifebuy Online Shopping";
        String actualtitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);


    }


    // US 011 TESTLERİ


    @Given("Anasayfada Header kisminda {string}   linkine tiklanir.")
    public void anasayfadaHeaderKismindaLinkineTiklanir(String arg0) {

        pages = new US_1_11_12_18_25_31_38();
        ReusableMethod.waitForClickablility(pages.PopupExitButon, 10);
        pages.PopupExitButon.click();
        pages.headerBlogLinki.click();
    }

    @Then("Blog sayfasinda oldugu dogrulanir")
    public void blog_sayfasinda_oldugu_dogrulanir() {

        String expectedUrl = "https://qa.trendlifebuy.com/blog";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);


    }


    @Then("Read More linkine tiklandiginda ilgili sayfaya yonlendirildigi dogrulanir")
    public void readMoreLinkineTiklandigindaIlgiliSayfayaYonlendirildigiDogrulanir() {


        pages = new US_1_11_12_18_25_31_38();
        pages.readmorelinki.click();

        String expectedUrl = "nature-connection-exercise--perceive-and-receive";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

    @Given("sayfada asagi yonde inilir")
    public void sayfadaAsagiYondeInilir() {

        Actions actions = new Actions(Driver.getDriver());

        actions.
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();

    }


    @Then("SearchPostBox kutusunda blog araması icin blog ismi girilir")
    public void searchpostboxKutusundaBlogAramasıIcinBlogIsmiGirilir() {

        pages = new US_1_11_12_18_25_31_38();

        pages.searchpostsbox.sendKeys("Society – The soil in which we grow", Keys.ENTER);


    }

    @Then("Searchboxa girilen blogun arandigi dogru blog un geldigi dogrulanir")
    public void searchboxaGirilenBlogunArandigiDogruBlogUnGeldigiDogrulanir() {

        pages = new US_1_11_12_18_25_31_38();

        String expectedBlogAramasiUrl = "https://qa.trendlifebuy.com/blog?query=Society+%E2%80%93+The+soil+in+which+we+grow";
        String actualBlogAramasiUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualBlogAramasiUrl.contains(expectedBlogAramasiUrl));

    }

    @Then("Category bölümündeki baslıklara tiklanir ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void categoryBölümündekiBaslıklaraTiklanirIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {


        pages.categoryBloglari.click();

        String expectedCategoryLink = "Nature ";
        String actualCategoryLink = pages.categoryBloglari.getText();
        Assert.assertTrue(actualCategoryLink.contains(expectedCategoryLink));
        ReusableMethod.bekle(3);

    }

    @Then("Keyword bolumundeki basliklara tiklanir  da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void keywordBolumundekiBasliklaraTiklanirDaIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {

        pages = new US_1_11_12_18_25_31_38();

        pages.keywordBloglari.click();

        String expectedKeywordUrl = "https://qa.trendlifebuy.com/blog/category/posts/nature-7";
        String actualKeywordUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualKeywordUrl.contains(expectedKeywordUrl));


    }

    @And("{int} saniye beklenir")
    public void saniyeBeklenir(int arg0) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("Popular Posts bolumundeki basliklar da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void popularPostsBolumundekiBasliklarDaIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {


        pages = new US_1_11_12_18_25_31_38();
        pages.popularPostBloglari.click();

        String expectedPopularpostBlogUrl = "https://qa.trendlifebuy.com/blog/post/connecting-to-care";
        String actualPopularpostBlogUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualPopularpostBlogUrl.contains(expectedPopularpostBlogUrl));


    }

    @Then("Anasayfada Header kisminda Contact {string}   linkine tiklanir.")
    public void anasayfadaHeaderKismindaContactLinkineTiklanir(String arg0) {


        pages = new US_1_11_12_18_25_31_38();
        pages.contact_link.click();

    }


    @Then("Contact sayfasinda Call or WhatsApp gorunur oldugunu dogrula")
    public void contactSayfasindaCallOrWhatsAppGorunurOldugunuDogrula() {

        Assert.assertTrue(pages.CallOrWhatsApp.isDisplayed());


    }

    @Then("Get in touch,Social Media, Head office yazilarinin gorunur oldugunu dogrula")
    public void getInTouchSocialMediaHeadOfficeYazilarininGorunurOldugunuDogrula() {

        pages = new US_1_11_12_18_25_31_38();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.GetInTouch.isDisplayed());
        softAssert.assertTrue(pages.SocialMedia.isDisplayed());
        softAssert.assertTrue(pages.HeadOffice.isDisplayed());
        softAssert.assertAll();


    }

    @And("Get in Touch bolumundeki Text Box'lara Name, E-mail, Messages ve Customer,Installation,Product Returns kısımları kriterlere uygun  doldurulur")
    public void getInTouchBolumundekiTextBoxLaraNameEMailMessagesVeCustomerInstallationProductReturnsKısımlarıKriterlereUygunDoldurulur() {

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();


        pages.ContactName.sendKeys(faker.name().fullName());
        pages.emailAddress.sendKeys(faker.internet().emailAddress());


        pages.selectsearchbox.sendKeys("Customer");
        pages.selectsearchbox.click();


        //DEVAM EDİLECEK DROPDOWN MENU YAPILACAK

    }


    @Then("Send Message butonuna tiklanir")
    public void sendMessageButonunaTiklanir() {

        pages.sendbutton.click();


    }

    @Then("Emailin başarili bir şekilde gönderildigi dogrulanir")
    public void emailinBaşariliBirŞekildeGönderildigiDogrulanir() {

    }


    @Then("Contact sayfasindaki sosyal medya \\(Facebook,Twitter,Linkedln,Instagram) ikonlarinin gorunur oldugunu dogrula")
    public void contactSayfasindakiSosyalMedyaFacebookTwitterLinkedlnInstagramIkonlarininGorunurOldugunuDogrula() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).
                perform();

        Assert.assertTrue(pages.facebookikon.isDisplayed());
        Assert.assertTrue(pages.twitterikon.isDisplayed());
        Assert.assertTrue(pages.instagramikon.isDisplayed());
        Assert.assertTrue(pages.linkedlnikon.isDisplayed());


    }

    @Then("Contact sayfasindaki sosyal medya \\(Facebook,Twitter,Linkedln,Instagram) ikonlarina tiklaninca ilgili sayfaya yonlendirilir ve dogrulanir")
    public void contactSayfasindakiSosyalMedyaFacebookTwitterLinkedlnInstagramIkonlarinaTiklanincaIlgiliSayfayaYonlendirilirVeDogrulanir() {


        pages.twitterikon.click();

        String expectedurl = "https://twitter.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedurl));
        ReusableMethod.bekle(3);
        Driver.getDriver().navigate().back();


        ReusableMethod.bekle(3);
        pages.facebookikon.click();

        String expectedUrl = "https://www.facebook.com/";
        String actualUrl2 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl));
        ReusableMethod.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethod.bekle(3);

        pages.linkedlnikon.click();

        String expectedUrl3 = "https://www.linkedln.com/";
        String actualUrl3 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl));
        ReusableMethod.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethod.bekle(3);


        String expectedUrl4 = "https://www.instagram.com/";
        String actualUrl4 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl));
        ReusableMethod.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethod.bekle(3);


    }

    // US_18 ###########################
    @Then("Login butonuna tiklar")
    public void loginButonunaTiklar() {

        ReusableMethod.loginTrendlife(ConfigReader.getProperty("customerEmailAlas"), ConfigReader.getProperty("customerPasswordAlas"));
    }


    @Then("Dashboard linkine tiklanir sayfaya yönlendirilir")
    public void dashboard_linkine_tiklanir_sayfaya_yönlendirilir() {

        pages.dashboardLinki.click();
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethod.bekle(2);

    }

    @Then("MyOrder linkine tiklanir")
    public void my_order_linkine_tiklanir() {

        pages.myorderlinki.click();
    }

    @Then("My Order sayfasindaki urun boardindan Order Details butonuna tiklanir")
    public void my_order_sayfasindaki_urun_boardindan_order_details_butonuna_tiklanir() {

        pages.orderDetails.click();


    }

    @Then("My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.")
    public void my_order_sayfasindaki_urun_boardindan_order_details_butonuna_tiklayinca_ilgili_siparisin_detay_sayfasina_gidildigi_dogrulanmali() {

        String actualOrderDetails = pages.orderDetailsgirildi.getText();
        String expectedOrderDetails = "Package";
        Assert.assertTrue(actualOrderDetails.contains(expectedOrderDetails));

    }


    @Then("Order Details sayfasinda ilgili siparisin Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info,Billing Info, Payment Info bilgilerinin goruntulendigi dogrulanmali")
    public void orderDetailsSayfasindaIlgiliSiparisinOrderIDStatusOrderDateOrderAmountPackagePriceShippingInfoBillingInfoPaymentInfoBilgilerininGoruntulendigiDogrulanmali() {

        SoftAssert  softAssert=new SoftAssert();
        softAssert.assertTrue(pages.orderID.isDisplayed());
        softAssert.assertTrue(pages.orderDate.isDisplayed());
        softAssert.assertTrue(pages.orderAmount.isDisplayed());
        softAssert.assertTrue(pages.price.isDisplayed());
        softAssert.assertTrue(pages.shippingInfo.isDisplayed());
        softAssert.assertTrue(pages.billingInfo.isDisplayed());
        softAssert.assertTrue(pages.paymentInfo.isDisplayed());
        softAssert.assertAll();


    }

    @Then("Order Details sayfasinda ilgili siparis süreci ile ilgili Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.")
    public void orderDetailsSayfasindaIlgiliSiparisSüreciIleIlgiliPendingProcessingShippedRecievedDeliveredAsamalariGörünürOlduguDogrulanmali() {

        actions=new Actions(Driver.getDriver());




        SoftAssert  softAssert=new SoftAssert();
        softAssert.assertTrue(pages.processing.isDisplayed());

        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();

        softAssert.assertTrue(pages.shippingInfo.isDisplayed());
        softAssert.assertTrue(pages.recieved.isDisplayed());
        softAssert.assertTrue(pages.delivered.isDisplayed());
        softAssert.assertTrue(pages.pending.isDisplayed());

        softAssert.assertAll();


    }

    @Then("Order Details sayfasinda Pending, Processing, Shipped, Recieved, Delivered asamalarinin aciklamalarini iceren textlerin görünür oldugu kontrol edilmeli")
    public void orderDetailsSayfasindaPendingProcessingShippedRecievedDeliveredAsamalarininAciklamalariniIcerenTextlerinGörünürOlduguKontrolEdilmeli() {


        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(pages.orderedText.isDisplayed());
       softAssert.assertTrue(pages.processingText.isDisplayed());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();
       softAssert.assertTrue(pages.shippedText.isDisplayed());
       softAssert.assertTrue(pages.recievedText.isDisplayed());
       softAssert.assertTrue(pages.deliveredText.isDisplayed());


    }

    @Then("\\(Eger tamamlanmamis bir siparis ise) My Order sayfasindaki Cancel Order butonunun görünür oldugu ve Select cancel reason penceresine yönlendirme yaptigi dogrulanmali.")
    public void egerTamamlanmamisBirSiparisIseMyOrderSayfasindakiCancelOrderButonununGörünürOlduguVeSelectCancelReasonPenceresineYönlendirmeYaptigiDogrulanmali() {



        pages=new US_1_11_12_18_25_31_38();
        pages.cancelOrder.click();
        Assert.assertTrue(pages.selectCancelReason.isDisplayed());



    }
}

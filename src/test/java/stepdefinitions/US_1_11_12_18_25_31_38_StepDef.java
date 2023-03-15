package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US_001_011_018_025_031_038;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.awt.dnd.DragGestureRecognizer;

public class US_1_11_12_18_25_31_38_StepDef {

    US_001_011_018_025_031_038 pages=new US_001_011_018_025_031_038();

    String expectedUrl;
    String actualUrl;



    @Then("istenen sayfaya gittigi dogrulanir")
    public void istenen_sayfaya_gittigi_dogrulanir() {


        expectedUrl="https://qa.trendlifebuy.com/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }



    @Then("Anasayfada title in Trendlifebuy Online Shopping oldugunu kontrol eder")
    public void anasayfadaTitleInTrendlifebuyOnlineShoppingOldugunuKontrolEder() {

        pages=new US_001_011_018_025_031_038();
        String expectedtitle="Trendlifebuy Online Shopping";
        String actualtitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualtitle,expectedtitle);


    }



    // US 011 TESTLERİ

    @Then("subscribe popupu kapatilir")
    public void subscribePopupuKapatilir() {

        pages=new US_001_011_018_025_031_038();
        ReusableMethod.waitForClickablility(pages.PopupExit,10);
        pages.PopupExit.click();


    }



    @Given("Anasayfada Header kisminda {string}   linkine tiklanir.")
    public void anasayfadaHeaderKismindaLinkineTiklanir(String arg0) {

        pages= new US_001_011_018_025_031_038();
        ReusableMethod.waitForClickablility(pages.PopupExit,10);
        pages.PopupExit.click();
        pages.headerBlogLinki.click();
    }

    @Then("Blog sayfasinda oldugu dogrulanir")
    public void blog_sayfasinda_oldugu_dogrulanir() {

        expectedUrl="https://qa.trendlifebuy.com/blog";
        actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);



    }
    @Then("Read More linkine tiklar")
    public void readMoreLinkineTiklar() {
        pages=new US_001_011_018_025_031_038();
        pages.readmorelinki.click();
    }

    @Then("Read More linkine tiklandiginda ilgili sayfaya yonlendirildigi dogrulanir")
    public void readMoreLinkineTiklandigindaIlgiliSayfayaYonlendirildigiDogrulanir() {


        pages=new US_001_011_018_025_031_038();
        pages.readmorelinki.click();

        String expectedUrl="nature-connection-exercise--perceive-and-receive";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

    @Given("sayfada asagi yonde inilir")
    public void sayfadaAsagiYondeInilir() {

        Actions actions=new Actions(Driver.getDriver());

        actions.
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();

    }


    @And("SearchPostBox kutusunda blog araması icin blog ismi girilir")
    public void searchpostboxKutusundaBlogAramasıIcinBlogIsmiGirilir() {

        pages=new US_001_011_018_025_031_038();
        pages.searchboxkutusu.sendKeys("Society – The soil in which we grow",Keys.ENTER);
        pages.searchboxkutusu.click();




    }

    @Then("Searchboxa girilen blogun arandigi dogru blog un geldigi dogrulanir")
    public void searchboxaGirilenBlogunArandigiDogruBlogUnGeldigiDogrulanir() {
pages=new US_001_011_018_025_031_038();

        String expectedKelime="Society – The soil in which we grow";
        String actualKelime=pages.arananlogismi.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));


    }




    @Given("Category bolumundeki baslikllar tiklanir ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void categoryBolumundekiBaslikllarTiklanirIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {

        pages=new US_001_011_018_025_031_038();
        pages.categorTiklananblog.click();

        String expectedUrl="https://qa.trendlifebuy.com/blog/category/posts/nature-7";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

    @Then("sayfada  bir birim asagi yonde inilir")
    public void sayfadaBirBirimAsagiYondeInilir() {

        Actions actions=new Actions(Driver.getDriver());

        actions.
                sendKeys(Keys.PAGE_DOWN).perform();
    }


    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }
    @Given("Keyword bolumundeki basliklara tiklanir  da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void keywordBolumundekiBasliklaraTiklanirDaIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {

        pages=new US_001_011_018_025_031_038();

        pages.keywordProgramminglinki.click();

        String expectedTiklananUrl2="https://qa.trendlifebuy.com/blog?tag=blog";
        String actualTiklananUrl2=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTiklananUrl2.contains(expectedTiklananUrl2));


    }


    @Then("Popular Posts bolumundeki basliklar da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir")
    public void popularPostsBolumundekiBasliklarDaIlgiliBloglarinGoruntulendigiKontrolEdilirDogrulanir() {





    }
}

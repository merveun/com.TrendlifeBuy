package stepdefinitions;

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


}

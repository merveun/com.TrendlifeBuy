package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_1_11_12_18_25_31_38;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class US_1_11_12_18_25_31_38_StepDef {

    US_1_11_12_18_25_31_38 pages=new US_1_11_12_18_25_31_38();
    String expectedtitle;






    @Given("kullanici trendlifeUrl anasayfaya gider")
    public void kullanici_trendlife_url_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("subscribe popupu kapatilir")
    public void subscribe_popupu_kapatilir() {

        pages=new US_1_11_12_18_25_31_38();
        ReusableMethod.waitForClickablility(pages.subscribePopupExit,5);
        pages.subscribePopupExit.click();


    }
    @Then("istenen sayfaya gittigi dogrulanir")
    public void istenen_sayfaya_gittigi_dogrulanir() {


        String expectedUrl="https://qa.trendlifebuy.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);


    }


    @Then("Siteye girerken title'ın Trendlifebuy Online Shopping olduğundan emin olunmalıdır.")
    public void siteyeGirerkenTitleInTrendlifebuyOnlineShoppingOlduğundanEminOlunmalıdır() {

        pages=new US_1_11_12_18_25_31_38();

        String expectedKelime="Trendlifebuy Online Shopping";
        String actualKelime=Driver.getDriver().getTitle();
        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }
}

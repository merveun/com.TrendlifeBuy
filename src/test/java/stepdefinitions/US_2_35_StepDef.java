package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.US_2_35;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class US_2_35_StepDef {

    US_2_35 pages;

    @Given("go to the {string}")
    public void go_to_the(String url) {
        getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("close the popup")
    public void close_the_popup() {
        pages = new US_2_35();
        ReusableMethod.bekle(10);
        pages.popupclose.click();
    }

    @Then("click on playstore button")
    public void click_on_playstore_button(){
        pages = new US_2_35();
        pages.playstoreButton.click();
    }

    @And("verify that the playstore link opens")
    public void verify_that_the_playstore_link_opens(){
        pages = new US_2_35();
        String expectedUrl="https://play.google.com/store/games";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("click on appstore button")
    public void click_on_appstore_button(){
        pages = new US_2_35();
        pages.appstoreButton.click();
    }

    @And("verify that the appstore link opens")
    public void verify_that_the_appstore_link_opens(){
        pages = new US_2_35();
        String expectedUrl="https://www.apple.com/app-store/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("close browser")
    public void closeBrowser() {
        pages = new US_2_35();
        ReusableMethod.bekle(5);
        Driver.closeDriver();
    }
}

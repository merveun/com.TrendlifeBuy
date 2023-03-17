package stepdefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US_08_20_27_32_40;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.getDriver;


public class US_08_20_27_32_40_StepDef {

    US_08_20_27_32_40 ypages;




    @Given("Admin login sayfasina {string} gidilir.")
    public void adminLoginSayfasinaGidilir(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @Then("Email adresi textboxina {string} girilir.")
    public void emailAdresiTextboxinaGirilir(String mail) {
        ypages = new US_08_20_27_32_40();
        ypages.emailTextBox.sendKeys(ConfigReader.getProperty("yadminmail"));

    }
}



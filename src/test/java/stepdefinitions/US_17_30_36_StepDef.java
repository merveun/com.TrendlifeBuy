package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.US_10_37_41;
import pages.US_17_30_36;
import pages.US_3_16_19_28_29;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import static utilities.Driver.getDriver;

public class US_17_30_36_StepDef {
    US_17_30_36 dashboardPages = new US_17_30_36();

    Actions actions = new Actions(getDriver());
    SoftAssert softAssert = new SoftAssert();


    public void userLoginMetodu() {
        dashboardPages.loginButonu.click();
        dashboardPages.boxEmail.sendKeys(ConfigReader.getProperty("rumeysaUserMail"));
        dashboardPages.boxPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        dashboardPages.buttonSignIn.click();


    }


    @Given("{string} sayfasinda login olur")
    public void sayfasinda_login_olur(String string) {
        getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethod.waitForClickablility(dashboardPages.subscribePopupExit, 10);
        dashboardPages.subscribePopupExit.click();
        userLoginMetodu();


    }

    @Then("Dashboard butonuna tiklar")
    public void dashboard_butonuna_tiklar() {
        dashboardPages.dashboardButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Then("My order butonuna tiklar")
    public void my_order_butonuna_tiklar() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", dashboardPages.myOrderButonu);
    }

    @Then("My order linkine gittiği test edilir")
    public void my_order_linkine_gittiği_test_edilir() {
        String actualUrl = getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/my-purchase-orders";

        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();


    }
    // US17--TC002


    @Given("All-To butonuna tiklar ve urunlerin gorundugunu test eder")
    public void all_to_butonuna_tiklar_ve_urunlerin_gorundugunu_test_eder() {
        dashboardPages.buttonAll.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2000);
        softAssert.assertTrue(dashboardPages.buttonAll.isDisplayed());
        softAssert.assertAll();


    }

    @Then("Pay-To butonuna tiklar ve urunlerin gorundugunu test eder")
    public void pay_to_butonuna_tiklar_ve_urunlerin_gorundugunu_test_eder() {
        dashboardPages.buttonToPay.click();
        ReusableMethod.bekle(2000);
        dashboardPages.buttonToPay.isDisplayed();

    }

    @Then("Ship-To butonuna tiklar ve urunlerin gorundugunu test eder")
    public void ship_to_butonuna_tiklar_ve_urunlerin_gorundugunu_test_eder() {
        dashboardPages.buttonToShip.click();
        ReusableMethod.bekle(2000);
        dashboardPages.buttonToShip.isDisplayed();

    }

    @Then("Recieve butonuna tiklar ve urunlerin gorundugunu test eder")
    public void recieve_butonuna_tiklar_ve_urunlerin_gorundugunu_test_eder() {
        dashboardPages.buttonToReceive.click();
        ReusableMethod.bekle(2000);
        dashboardPages.buttonToReceive.isDisplayed();

    }

    //---------US17-----TC003-------

    @Then("Order ID butonuna tiklar gorundugunu test eder")
    public void order_ıd_butonuna_tiklar_gorundugunu_test_eder() {
        dashboardPages.bilgiAlani.isDisplayed();


    }

    @Then("Status butonuna tiklar gorundugunu test eder")
    public void status_butonuna_tiklar_gorundugunu_test_eder() {

    }

    @Then("Order date butonuna tiklar gorundugunu test eder")
    public void order_date_butonuna_tiklar_gorundugunu_test_eder() {

    }

    @Then("ORder amount butonuna tiklar gorundugunu test eder")
    public void o_rder_amount_butonuna_tiklar_gorundugunu_test_eder() {

    }

    @Then("Paid by butonuna tiklar gorundugunu test eder")
    public void paid_by_butonuna_tiklar_gorundugunu_test_eder() {

    }


    @Then("Last5 orders butonuna tiklar ve gorundugunu test eder")
    public void last5_orders_butonuna_tiklar_ve_gorundugunu_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("last20 orders butonuna tiklar ve gorundugunu test eder")
    public void last20_orders_butonuna_tiklar_ve_gorundugunu_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("last40 orders butonuna tiklar ve gorundugunu test eder")
    public void last40_orders_butonuna_tiklar_ve_gorundugunu_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //------US17----TC05

    @Then("Prev butonuna tıklar geri gittiğini test eder")
    public void prev_butonuna_tıklar_geri_gittiğini_test_eder() {

    }

    @Then("Next butonuna tıklar ileri gittiğini test eder.")
    public void next_butonuna_tıklar_ileri_gittiğini_test_eder() {

    }


    //----------------------------------------------US30------------------------------------------------------//

    //----TC01

    public void adminLoginMetodu() {
        dashboardPages.adminBoxMail.sendKeys(ConfigReader.getProperty("rumeysaAdminMail"));
        dashboardPages.adminBoxPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        dashboardPages.adminBoxSignIn.click();
    }

    @Given("Login on the {string} page.")
    public void login_on_the_page(String string) {
        getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminLoginMetodu();
        ReusableMethod.bekle(15);
    }

    @Then("Click on the notifications icon.")
    public void click_on_the_notifications_icon() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", dashboardPages.iconNotification);
    }

    @And("Tests that notifications appears.")
    public void tests_that_notifications_appears() {
        softAssert.assertTrue(dashboardPages.notificationyazisi.isDisplayed());
        softAssert.assertAll();
    }

    //-----TC02----------
    @Given("clicks the settings button")
    public void clicks_the_settings_button() {
        dashboardPages.buttonSetting.click();
    }

    @And("Verifies that you are going to the user-notification page")
    public void verifies_that_you_are_going_to_the_user_notification_page() {
        String actualUrlNotification = getDriver().getCurrentUrl();
        String expectedUrlNotification = "https://trendlifebuy.com/generalsetting/user-notification";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(actualUrlNotification, expectedUrlNotification);
        softAssert.assertAll();
    }

    //-----TC03--------
    @Given("deactivates it by clicking on the message type of the first notification")
    public void deactivates_it_by_clicking_on_the_message_type_of_the_first_notification() {
        dashboardPages.buttonType.click();
        ReusableMethod.bekle(5);
        softAssert.assertTrue(dashboardPages.messageUptadeSuccsess.isDisplayed());
        softAssert.assertAll();

    }

    @And("Activates by clicking on the message type of the first notification.")
    public void activates_by_clicking_on_the_message_type_of_the_first_notification() {
        dashboardPages.buttonType.click();
        softAssert.assertTrue(dashboardPages.messageUptadeSuccsess.isDisplayed());
        softAssert.assertAll();

    }
    //-----TC04--------

    //@Given("Clicks the Read All button")
    // public void clicks_the_read_all_button() {
    //  dashboardPages.buttonReadAll.click();

    //}
    // @And("tests that notifications are cleared")
    // public void tests_that_notifications_are_cleared() {
    //   softAssert.assertTrue(dashboardPages.);

    // }

    //-----TC05--------

    @Given("clicks the view button")
    public void clicks_the_view_button() {
        dashboardPages.buttonView.click();

    }

    @And("tests that notifications go to the page they opened.")
    public void tests_that_notifications_go_to_the_page_they_opened() {
        softAssert.assertTrue(dashboardPages.pagesView.isDisplayed());
        softAssert.assertAll();

    }


}


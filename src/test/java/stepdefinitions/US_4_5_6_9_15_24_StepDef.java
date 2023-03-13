package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.US_4_5_6_9_15_24_pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class US_4_5_6_9_15_24_StepDef {

    US_4_5_6_9_15_24_pages pages = new US_4_5_6_9_15_24_pages();

    //Url page
    @Given("go to {string}")
    public void go_to(String string) {
        getDriver().get(ConfigReader.getProperty("url"));
    }

    // Popup closed
    @Then("close popup")
    public void close_pop_up() {
        ReusableMethod.waitForClickablility(pages.PopupExit, 10);
        pages.PopupExit.click();


    }

    // Scroll down
    @Then("scroll down")
    public void scroll_down() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);

    }

    @And("quit driver")
    public void quitDriver() {
        Driver.quitDriver();
    }

    @Then("verify required texts are visible")
    public void verify_required_texts_are_visible() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.myAccount.isDisplayed());
        softAssert.assertTrue(pages.orderStatus.isDisplayed());
        softAssert.assertTrue(pages.referral.isDisplayed());
        softAssert.assertTrue(pages.coupons.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    //
    @Then("click My Account link")
    public void click_my_account_link() {
        ReusableMethod.waitToSee(1);
        pages.myAccount.click();
        ReusableMethod.logIn(ConfigReader.getProperty("validEmail_Murat"), ConfigReader.getProperty("validPassword_Murat"));

    }

    @And("verify My Account page is opened")
    public void verifyMyAccountPageIsOpened() {
        String actualPageUrl = driver.getCurrentUrl();
        String expectedUrl = "http://qa.trendlifebuy.com/profile";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(expectedUrl, actualPageUrl);

    }

    @And("click Order Status link")
    public void clickOrderStatusLink() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(3);
        pages.orderStatus.click();
        }

    @And("verify Order Status page is opened")
    public void verifyOrderStatusPageIsOpened() {
        String actualPageUrl = driver.getCurrentUrl();
        String expectedUrl = "http://qa.trendlifebuy.com/my-purchase-orders";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(expectedUrl, actualPageUrl);
    }

    @And("click Referral link")
    public void clickReferralLink() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(3);
        pages.referral.click();

    }

    @And("verify Referral page is opened")
    public void verifyReferralPageIsOpened() {

        String actualPageUrl = driver.getCurrentUrl();
        String expectedUrl = "http://qa.trendlifebuy.com/profile/referral";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(expectedUrl, actualPageUrl);

    }

    @And("click Coupons link")
    public void clickCouponsLink() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(3);
        pages.coupons.click();

    }

    @And("verify Coupons page is opened")
    public void verifyCouponsPageIsOpened() {
        String actualPageUrl = driver.getCurrentUrl();
        String expectedUrl = "http://qa.trendlifebuy.com/profile/coupons";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(expectedUrl, actualPageUrl);

    }

    @Then("verify About Us link is visible")
    public void verifyAboutUsLinkIsVisible() {

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(pages.aboutUs.isDisplayed());

    }


    @Then("verify Contact Us link is visible")
    public void verifyContactUsLinkIsVisible() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(pages.contactUs.isDisplayed());


    }


    @Then("verify Career link is visible")
    public void verifyCareerLinkIsVisible() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(pages.career.isDisplayed());
    }

    @Then("verify Refund Policy link is visible")
    public void verifyRefundPolicyLinkIsVisible() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(pages.refundPolicy.isDisplayed());
    }

    @Then("verify Terms & Condition link is visible")
    public void verifyTermsConditionLinkIsVisible() {
        ReusableMethod.waitToSee(2);
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(pages.termsCondition.isDisplayed());
    }

}

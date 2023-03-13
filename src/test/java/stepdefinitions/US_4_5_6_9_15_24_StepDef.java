package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
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

    //Scenario: TC_101
    @Then("verify required links in TC_101 are visible")
    public void verify_required_texts_in_TC_101_are_visible() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.myAccount.isDisplayed());
        softAssert.assertTrue(pages.orderStatus.isDisplayed());
        softAssert.assertTrue(pages.referral.isDisplayed());
        softAssert.assertTrue(pages.coupons.isDisplayed());
        ReusableMethod.waitToSee(2);
        softAssert.assertAll();
    }


    //Scenario: TC_102
    @Then("verify the clicked links in TC_102 navigates to relevant pages")
    public void verifytheclickedlinksinTC_102navigatestorelevantpages() {
        SoftAssert softAssert = new SoftAssert();

        ReusableMethod.waitToSee(1);
        pages.myAccount.click();
        ReusableMethod.logIn(ConfigReader.getProperty("validEmail_Murat"), ConfigReader.getProperty("validPassword_Murat"));
        String myAccount_actualPageUrl = driver.getCurrentUrl();
        String myAccount_expectedUrl = "https://qa.trendlifebuy.com/profile";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(myAccount_expectedUrl, myAccount_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(3);
        pages.orderStatus.click();
        String orderStatus_actualPageUrl = driver.getCurrentUrl();
        String orderStatus_expectedUrl = "https://qa.trendlifebuy.com/my-purchase-orders";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(orderStatus_expectedUrl, orderStatus_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(3);
        pages.referral.click();
        String referral_actualPageUrl = driver.getCurrentUrl();
        String referral_expectedUrl = "https://qa.trendlifebuy.com/profile/referral";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(referral_expectedUrl, referral_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(3);
        pages.coupons.click();
        String coupons_actualPageUrl = driver.getCurrentUrl();
        String coupons_expectedUrl = "https://qa.trendlifebuy.com/profile/coupons";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(coupons_expectedUrl, coupons_actualPageUrl);
        softAssert.assertAll();

    }


    @Then("verify required links in TC_103 are visible")
    public void verifyRequiredLinksInTC_103AreVisible() {
        SoftAssert softAssert = new SoftAssert();

        // softAssert.assertTrue(pages.aboutUs.isDisplayed());
        softAssert.assertTrue(pages.contactUs.isDisplayed());
        softAssert.assertTrue(pages.career.isDisplayed());
        softAssert.assertTrue(pages.refundPolicy.isDisplayed());
        softAssert.assertTrue(pages.termsCondition.isDisplayed());

        softAssert.assertAll();
    }
    /*
        @Then("click About Us link")
        public void clickAboutUsLink() {
            ReusableMethod.scrolldown();
            ReusableMethod.waitToSee(2);
            pages.aboutUs.click();


        }

        @Then("verify About Us page is opened")
        public void verifyAboutUsPageIsOpened() {

        }
    */


    @Then("verify the clicked links in TC_104 navigates to relevant pages")
    public void verifyTheClickedLinksInTC_104NavigatesToRelevantPages() {

        SoftAssert softAssert = new SoftAssert();
        String aboutUs_actualPageUrl = driver.getCurrentUrl();
        String aboutUs_expectedUrl = "https://qa.trendlifebuy.com/about-us";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(aboutUs_expectedUrl, aboutUs_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.contactUs.click();
        String contactUs_actualPageUrl = driver.getCurrentUrl();
        String contactUs_expectedUrl = "https://qa.trendlifebuy.com/con212tact-us";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(contactUs_expectedUrl, contactUs_actualPageUrl);

        ReusableMethod.waitToSee(3);
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.career.click();
        String career_actualPageUrl = driver.getCurrentUrl();
        String career_expectedUrl = "https://qa.trendlifebuy.com/career";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(career_expectedUrl, career_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.refundPolicy.click();
        String refundPolicy_actualPageUrl = driver.getCurrentUrl();
        String refundPolicy_expectedUrl = "qa.trendlifebuy.com/return-exchange";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(refundPolicy_expectedUrl, refundPolicy_actualPageUrl);
    }

    @Then("click Terms & Condition link")
    public void clickTermsConditionLink() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.termsCondition.click();
        String termsCondition_actualPageUrl = driver.getCurrentUrl();
        String termsCondition_expectedUrl = "https://qa.trendlifebuy.com/terms-condition";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(termsCondition_expectedUrl, termsCondition_actualPageUrl);

        softAssert.assertAll();
    }


    @Then("verify Google Play button is visible")
    public void verifyGooglePlayButtonIsVisible() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.googlePlayButton.isDisplayed();


    }

    @Then("verify Apple Store button is visible")
    public void verifyAppleStoreButtonIsVisible() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.appleStoreButton.isDisplayed();
    }
//------------------------
    @Then("click Google Play button")
    public void clickGooglePlayButton() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.googlePlayButton.click();
    }

    @And("verify Google Play Store page is opened")
    public void verifyGooglePlayStorePageIsOpened() {
        String actualPageUrl = driver.getCurrentUrl();
        String expectedUrl = "https://play.google.com/store/games";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(expectedUrl, actualPageUrl);

    }

    @Then("click Apple Store button")
    public void clickAppleStoreButton() {
        ReusableMethod.waitToSee(2);
        pages.appleStoreButton.click();
    }

    @And("verify Apple Store page is opened")
    public void verifyAppleStorePageIsOpened() {
        String actualPageUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.apple.com/app-store/";
        SoftAssert softAssert = new SoftAssert();
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(expectedUrl, actualPageUrl);

    }

    @Then("navigate back")
    public void navigateBack() {
        driver.navigate().back();
        ReusableMethod.waitToSee(2);
    }

    @Then("click Go To Top button")
    public void clickGoToTopButton() {
        pages.goToTop.click();
        ReusableMethod.waitToSee(3);
    }

    @And("verify top of the home page is visible")
    public void verifyTopOfTheHomePageIsVisible() {
        ReusableMethod.waitToSee(2);
        Assert.assertTrue(pages.searchBox.isDisplayed());
    }

    @Then("verify required icons are visible")
    public void verify_required_icons_are_visible() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.facebookIcon.isDisplayed());
        softAssert.assertTrue(pages.twitterIcon.isDisplayed());
        softAssert.assertTrue(pages.linkedinIcon.isDisplayed());
        softAssert.assertTrue(pages.instagramIcon.isDisplayed());
        softAssert.assertAll();


    }


    @Then("verify clicked icons navigate to relevant pages")
    public void verifyClickedIconsNavigateToRelevantPages() {
        SoftAssert softAssert = new SoftAssert();

        pages.facebookIcon.click();
        String fb_actualPageUrl = driver.getCurrentUrl();
        String fb_expectedUrl = "https://www.facebook.com/";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(fb_expectedUrl, fb_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);

        pages.twitterIcon.click();
        String tw_actualPageUrl = driver.getCurrentUrl();
        String tw_expectedUrl = "https://twitter.com/";
        ReusableMethod.waitToSee(3);
        softAssert.assertEquals(tw_expectedUrl, tw_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);


        pages.linkedinIcon.click();
        String lnkd_actualPageUrl = driver.getCurrentUrl();
        String lnkd_expectedUrl = "https://www.linkedin.com/";
        ReusableMethod.waitToSee(3);
        softAssert.assertEquals(lnkd_expectedUrl, lnkd_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);

        pages.instagramIcon.click();
        String ins_actualPageUrl = driver.getCurrentUrl();
        String ins_expectedUrl = "https://www.instagram.com/";
        ReusableMethod.waitToSee(3);
        softAssert.assertEquals(ins_expectedUrl, ins_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
        softAssert.assertAll();


    }


}

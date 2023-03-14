package stepdefinitions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_04_05_06_09_15_24_pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class US_04_05_06_09_15_24_StepDef {

    US_04_05_06_09_15_24_pages pages = new US_04_05_06_09_15_24_pages();

    //Url page
    @Given("go to {string}")
    public void go_to(String string) {
        getDriver().get(ConfigReader.getProperty("url"));
    }

    // Popup closed
    @Then("close popup")
    public void close_pop_up() {
        ReusableMethod.waitForClickablility(pages.PopupExit, 15);
        pages.PopupExit.click();


    }

    // Scroll down
    @Then("scroll down")
    public void scroll_down() {
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);

    }

    @Then("scroll down bypixel_600")
    public void scroll_down_by_pixel_600() {
        ReusableMethod.scrolldown_600();
        ReusableMethod.waitToSee(2);
    }

    @Then("scroll down bypixel_2000")
    public void scrollDownBypixel_2000() {
        ReusableMethod.scrolldown_bypixel_2000();
        ReusableMethod.waitToSee(2);
    }

    @Then("scroll down bypixel_5500")
    public void scrollDownBypixel_5500() {

        //ReusableMethod.waitToSee(2);
    }

    @Then("scroll down for Load More")
    public void scrollDownForLoadMore() {
        ReusableMethod.scrolldown_for_Load_More();
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

    //Scenario: TC_103
    @Then("verify required links in TC_103 are visible")
    public void verifyRequiredLinksInTC_103AreVisible() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(pages.aboutUs.isDisplayed());
        softAssert.assertTrue(pages.contactUs.isDisplayed());
        softAssert.assertTrue(pages.career.isDisplayed());
        softAssert.assertTrue(pages.refundPolicy.isDisplayed());
        softAssert.assertTrue(pages.termsCondition.isDisplayed());

        softAssert.assertAll();
    }


    //Scenario: TC_104
    @Then("verify the clicked links in TC_104 navigates to relevant pages")
    public void verifyTheClickedLinksInTC_104NavigatesToRelevantPages() {

        SoftAssert softAssert = new SoftAssert();
        pages.aboutUs.click();
        String aboutUs_actualPageUrl = driver.getCurrentUrl();
        String aboutUs_expectedUrl = "https://qa.trendlifebuy.com/about-us";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(aboutUs_expectedUrl, aboutUs_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.contactUs.click();
        String contactUs_actualPageUrl = driver.getCurrentUrl();
        String contactUs_expectedUrl = "https://qa.trendlifebuy.com/contact-us";
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
        String refundPolicy_expectedUrl = "https://qa.trendlifebuy.com/return-exchange";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(refundPolicy_expectedUrl, refundPolicy_actualPageUrl);

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.termsCondition.click();
        String termsCondition_actualPageUrl = driver.getCurrentUrl();
        String termsCondition_expectedUrl = "https://qa.trendlifebuy.com/terms-condition";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(termsCondition_expectedUrl, termsCondition_actualPageUrl);

        softAssert.assertAll();
    }

    //Scenario: TC_105
    @Then("verify Google Play  and Apple Store buttons are visible")
    public void verifyGooglePlayAndAppleStoreButtonsAreVisible() {
        SoftAssert softAssert = new SoftAssert();

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        softAssert.assertTrue(pages.googlePlayButton.isDisplayed());
        ReusableMethod.waitToSee(2);
        softAssert.assertTrue(pages.appleStoreButton.isDisplayed());

        softAssert.assertAll();
    }

    //Scenario: TC_106
    @Then("verify Google Play and Apple Store buttons navigate to relevant pages after clicking")
    public void verifyGooglePlayAndAppleStoreButtonsNavigateToRelevantPagesAfterClicking() {
        SoftAssert softAssert = new SoftAssert();

        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.googlePlayButton.click();
        String googlePlayButton_actualPageUrl = driver.getCurrentUrl();
        String googlePlayButton_expectedUrl = "https://play.google.com/store/games";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(googlePlayButton_expectedUrl, googlePlayButton_actualPageUrl);
        ReusableMethod.waitToSee(2);
        driver.navigate().back();

        ReusableMethod.waitToSee(2);
        pages.appleStoreButton.click();
        String appleStoreButton_actualPageUrl = driver.getCurrentUrl();
        String appleStoreButton_expectedUrl = "https://www.apple.com/app-store/";
        ReusableMethod.waitToSee(2);
        softAssert.assertEquals(appleStoreButton_expectedUrl, appleStoreButton_actualPageUrl);

        softAssert.assertAll();
    }

    //Scenario: TC_107

    @Then("verify clicking Go To Top button goes top of the home page")
    public void verifyclickingGoToTopButtonGoesTopOfTheHomePage() {
        SoftAssert softAssert = new SoftAssert();

        pages.goToTop.click();
        ReusableMethod.waitToSee(3);
        Assert.assertTrue(pages.searchBox.isDisplayed());

        softAssert.assertAll();
    }

    //Scenario: TC_108
    @Then("verify required icons are visible")
    public void verify_required_icons_are_visible() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(pages.facebookIcon.isDisplayed());
        softAssert.assertTrue(pages.twitterIcon.isDisplayed());
        softAssert.assertTrue(pages.linkedinIcon.isDisplayed());
        softAssert.assertTrue(pages.instagramIcon.isDisplayed());

        softAssert.assertAll();


    }

    //Scenario: TC_109
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

    //Scenario: TC_110
    @Then("verify required links in TC_110 are visible")
    public void verifyRequiredLinksInTC_AreVisible() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(pages.trendingProducts.isDisplayed());
        softAssert.assertTrue(pages.hotCategories.isDisplayed());
        softAssert.assertTrue(pages.houseAppliances.isDisplayed());
        softAssert.assertTrue(pages.recommendtaionForYou.isDisplayed());
        softAssert.assertTrue(pages.topBrand.isDisplayed());
        softAssert.assertTrue(pages.popularSearches.isDisplayed());
        softAssert.assertTrue(pages.trenbuylifeOnlineShopping.isDisplayed());

        softAssert.assertAll();
    }

    //Scenario: TC_111
    @Then("Verify that the View All button redirects to the relevant page")
    public void verifyThatTheViewAllButtonRedirectsToTheRelevantPage() {
        SoftAssert softAssert = new SoftAssert();


        pages.viewAll_trendingProducts.click();
        String viewAll_trendingProducts_actualPageUrl = driver.getCurrentUrl();
        String expected_trend_url = "https://qa.trendlifebuy.com/category/best_deals?item=product";
        softAssert.assertTrue(viewAll_trendingProducts_actualPageUrl.contains(expected_trend_url));
        ReusableMethod.waitToSee(2);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);

        pages.viewAll_hotcategories.click();
        String viewAll_hotcategories_actualPageUrl = driver.getCurrentUrl();
        String expected_hot_url = "https://qa.trendlifebuy.com/category";
        softAssert.assertTrue(viewAll_hotcategories_actualPageUrl.contains(expected_hot_url));
        ReusableMethod.waitToSee(2);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);

        softAssert.assertAll();


    }

    //Scenario: TC_112
    @Then("Verify that the More Deal button redirects to the relevant page")
    public void verifyThatTheMoreDealButtonRedirectsToTheRelevantPage() {
        pages.moreDealsButton.click();
        String moreDeals_actualUrl = driver.getCurrentUrl();
        System.out.println(moreDeals_actualUrl);
        String moreDeals_expectedUrl = "https://qa.trendlifebuy.com/category/furnitures?item=category";
        Assert.assertTrue(moreDeals_expectedUrl.contains(moreDeals_actualUrl));

    }
    //Scenario: TC_113

    @Then("verify that more products are seen as the Load More button is clicked")
    public void verifyThatMoreProductsAreSeenAsTheLoadMoreButtonIsClicked() {

        //System.out.println(pages.loadMoreButton.getLocation());
        int loc1= ReusableMethod.onlyTakeNumberandParseInteger(String.valueOf(pages.loadMoreButton.getLocation()));
        //System.out.println(loc1);
        ReusableMethod.waitToSee(2);
        pages.loadMoreButton.click();
        ReusableMethod.waitToSee(3);
        //System.out.println(pages.loadMoreButton.getLocation());
        int loc2= ReusableMethod.onlyTakeNumberandParseInteger(String.valueOf(pages.loadMoreButton.getLocation()));
        //System.out.println(loc2);
        Assert.assertTrue(loc2>loc1);

    }




}






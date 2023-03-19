package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US_04_05_06_09_15_24_pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import static java.nio.file.Files.getAttribute;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class US_04_05_06_09_15_24_StepDef {

    US_04_05_06_09_15_24_pages pages = new US_04_05_06_09_15_24_pages();

    //--> Reusable Step Definitions
    //Url page
    @Given("go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
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

    @Then("scroll down for View All")
    public void scrollDownForViewAll() {
        ReusableMethod.scrolldown_600();
        ReusableMethod.waitToSee(2);
    }


    @Then("scroll down for More Deal button")
    public void scrollDownForMoreDealButton() {
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

    @And("terminate test")
    public void terminateTest() {
        Driver.quitDriver();
    }

    @Then("navigate page back")
    public void navigatePageBack() {
        ReusableMethod.navigateback();
        ReusableMethod.waitToSee(3);
    }

    Actions actions = new Actions(Driver.getDriver());

    //-------------------------
    //Scenario: TC_101
    @Then("verify My Account link is visible")
    public void verifyMyAccountLinkIsVisible() {
        Assert.assertTrue(pages.myAccount.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Order Status link is visible")
    public void verifyOrderStatusLinkIsVisible() {
        Assert.assertTrue(pages.orderStatus.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Referral link is visible")
    public void verifyReferralLinkIsVisible() {
        Assert.assertTrue(pages.referral.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Coupons link is visible")
    public void verifyCouponsLinkIsVisible() {
        Assert.assertTrue(pages.coupons.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_102


    @Then("verify My Account link navigates to the the relevant page after clicking")
    public void verifyMyAccountLinkNavigatesToTheTheRelevantPageAfterClicking() {
        pages.myAccount.click();
        ReusableMethod.signIn(ConfigReader.getProperty("validEmail_Murat"), ConfigReader.getProperty("validPassword_Murat"));
        String myAccount_actualPageUrl = driver.getCurrentUrl();
        String myAccount_expectedUrl = "https://qa.trendlifebuy.com/profile";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(myAccount_expectedUrl, myAccount_actualPageUrl);
    }

    @Then("verify Order Status link navigates to the the relevant page after clicking")
    public void verifyOrderStatusLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(5);
        pages.orderStatus.click();
        String orderStatus_actualPageUrl = driver.getCurrentUrl();
        String orderStatus_expectedUrl = "https://qa.trendlifebuy.com/my-purchase-orders";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(orderStatus_expectedUrl, orderStatus_actualPageUrl);
    }

    @Then("verify Referral link navigates to the the relevant page after clicking")
    public void verifyReferralLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(2);
        pages.referral.click();
        String referral_actualPageUrl = driver.getCurrentUrl();
        String referral_expectedUrl = "https://qa.trendlifebuy.com/profile/referral";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(referral_expectedUrl, referral_actualPageUrl);
    }

    @Then("verify Coupons link navigates to the the relevant page after clicking")
    public void verifyCouponsLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(2);
        pages.coupons.click();
        String coupons_actualPageUrl = driver.getCurrentUrl();
        String coupons_expectedUrl = "https://qa.trendlifebuy.com/profile/coupons";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(coupons_expectedUrl, coupons_actualPageUrl);
    }


    //Scenario: TC_103
    @Then("verify required links in TC_103 are visible")
    public void verifyRequiredLinksInTC_103AreVisible() {


    }

    @Then("verify About Us link is visible")
    public void verifyAboutUsLinkIsVisible() {
        Assert.assertTrue(pages.aboutUs.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Contact Us link is visible")
    public void verifyContactUsLinkIsVisible() {
        Assert.assertTrue(pages.contactUs.isDisplayed());
        ReusableMethod.waitToSee(2);


    }

    @Then("verify Career link is visible")
    public void verifyCareerLinkIsVisible() {
        Assert.assertTrue(pages.career.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Refund Policy Us link is visible")
    public void verifyRefundPolicyUsLinkIsVisible() {
        Assert.assertTrue(pages.refundPolicy.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Terms & Condition link is visible")
    public void verifyTermsConditionLinkIsVisible() {
        Assert.assertTrue(pages.termsCondition.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_104
    @Then("verify the clicked links in TC_104 navigates to relevant pages")
    public void verifyTheClickedLinksInTC_104NavigatesToRelevantPages() {


    }


    @Then("verify About Us link navigates to the the relevant page after clicking")
    public void verifyAboutUsLinkNavigatesToTheTheRelevantPageAfterClicking() {

        pages.aboutUs.click();
        String aboutUs_actualPageUrl = driver.getCurrentUrl();
        String aboutUs_expectedUrl = "https://qa.trendlifebuy.com/about-us";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(aboutUs_expectedUrl, aboutUs_actualPageUrl);
    }

    @Then("verify Contact Us link navigates to the the relevant page after clicking")
    public void verifyContactUsLinkNavigatesToTheTheRelevantPageAfterClicking() {

        ReusableMethod.waitToSee(2);
        pages.contactUs.click();
        String contactUs_actualPageUrl = driver.getCurrentUrl();
        String contactUs_expectedUrl = "https://qa.trendlifebuy.com/contact-us";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(contactUs_expectedUrl, contactUs_actualPageUrl);
    }

    @Then("verify Career link navigates to the the relevant page after clicking")
    public void verifyCareerLinkNavigatesToTheTheRelevantPageAfterClicking() {
        ReusableMethod.waitToSee(3);
        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);
        pages.career.click();
        String career_actualPageUrl = driver.getCurrentUrl();
        String career_expectedUrl = "https://qa.trendlifebuy.com/career";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(career_expectedUrl, career_actualPageUrl);
    }

    @Then("verify Refund Policy Us link navigates to the the relevant page after clicking")
    public void verifyRefundPolicyUsLinkNavigatesToTheTheRelevantPageAfterClicking() {

        ReusableMethod.waitToSee(2);
        pages.refundPolicy.click();
        String refundPolicy_actualPageUrl = driver.getCurrentUrl();
        String refundPolicy_expectedUrl = "https://qa.trendlifebuy.com/return-exchange";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(refundPolicy_expectedUrl, refundPolicy_actualPageUrl);
    }

    @Then("verify Terms & Condition link navigates to the the relevant page after clicking")
    public void verifyTermsConditionLinkNavigatesToTheTheRelevantPageAfterClicking() {

        ReusableMethod.waitToSee(2);
        pages.termsCondition.click();
        String termsCondition_actualPageUrl = driver.getCurrentUrl();
        String termsCondition_expectedUrl = "https://qa.trendlifebuy.com/terms-condition";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(termsCondition_expectedUrl, termsCondition_actualPageUrl);
    }

    //Scenario: TC_105
    @Then("verify Google Play button is visible")
    public void verifyGooglePlayButtonIsVisible() {
        Assert.assertTrue(pages.googlePlayButton.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Apple Store button is visible")
    public void verifyAppleStoreButtonIsVisible() {
        Assert.assertTrue(pages.appleStoreButton.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_106
    @Then("verify Google Play and Apple Store buttons navigate to relevant pages after clicking")
    public void verifyGooglePlayAndAppleStoreButtonsNavigateToRelevantPagesAfterClicking() {


        ReusableMethod.scrolldown();
        ReusableMethod.waitToSee(2);

        driver.navigate().back();


        ReusableMethod.waitToSee(2);


    }


    @Then("verify Google Play button navigates to relevant page after clicking")
    public void verifyGooglePlayButtonNavigatesToRelevantPageAfterClicking() {
        pages.googlePlayButton.click();
        String googlePlayButton_actualPageUrl = driver.getCurrentUrl();
        String googlePlayButton_expectedUrl = "https://play.google.com/store/games";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(googlePlayButton_expectedUrl, googlePlayButton_actualPageUrl);
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Apple Store button navigates to relevant page after clicking")
    public void verifyAppleStoreButtonNavigatesToRelevantPageAfterClicking() {
        pages.appleStoreButton.click();
        String appleStoreButton_actualPageUrl = driver.getCurrentUrl();
        String appleStoreButton_expectedUrl = "https://www.apple.com/app-store/";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(appleStoreButton_expectedUrl, appleStoreButton_actualPageUrl);
    }


    //Scenario: TC_107

    @Then("verify clicking Go To Top button goes top of the home page")
    public void verifyclickingGoToTopButtonGoesTopOfTheHomePage() {


        pages.goToTop.click();
        ReusableMethod.waitToSee(3);
        Assert.assertTrue(pages.searchBox.isDisplayed());


    }

    //Scenario: TC_108
    @Then("verify facebook icon is visible")
    public void verifyFacebookIconIsVisible() {
        Assert.assertTrue(pages.facebookIcon.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify twitter icon is visible")
    public void verifyTwitterIconIsVisible() {
        Assert.assertTrue(pages.twitterIcon.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify linkedin icon is visible")
    public void verifyLinkedinIconIsVisible() {
        Assert.assertTrue(pages.linkedinIcon.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify instagram icon is visible")
    public void verifyInstagramIconIsVisible() {
        Assert.assertTrue(pages.instagramIcon.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_109
    @Then("verify clicked icons navigate to relevant pages")
    public void verifyClickedIconsNavigateToRelevantPages() {


    }

    @Then("verify facebook icon navigates to relevant page after clicking")
    public void verifyFacebookIconNavigatesToRelevantPageAfterClicking() {
        pages.facebookIcon.click();
        String fb_actualPageUrl = driver.getCurrentUrl();
        String fb_expectedUrl = "https://www.facebook.com/";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(fb_actualPageUrl, fb_expectedUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify twitter icon navigates to relevant page after clicking")
    public void verifyTwitterIconNavigatesToRelevantPageAfterClicking() {

        pages.twitterIcon.click();
        String tw_actualPageUrl = driver.getCurrentUrl();
        String tw_expectedUrl = "https://twitter.com/";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(tw_expectedUrl, tw_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify linkedin icon navigates to relevant page after clicking")
    public void verifyLinkedinIconNavigatesToRelevantPageAfterClicking() {

        pages.linkedinIcon.click();
        String lnkd_actualPageUrl = driver.getCurrentUrl();
        String lnkd_expectedUrl = "https://www.linkedin.com/";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(lnkd_expectedUrl, lnkd_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify instagram icon navigates to relevant page after clicking")
    public void verifyInstagramIconNavigatesToRelevantPageAfterClicking() {

        pages.instagramIcon.click();
        String ins_actualPageUrl = driver.getCurrentUrl();
        String ins_expectedUrl = "https://www.instagram.com/";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(ins_expectedUrl, ins_actualPageUrl);
        driver.navigate().back();
        ReusableMethod.waitToSee(3);
    }

    //Scenario: TC_110
    @Then("verify Trending Products link is visible")
    public void verifyTrendingProductsLinkIsVisible() {
        Assert.assertTrue(pages.trendingProducts.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Hot Categories link is visible")
    public void verifyHotCategoriesLinkIsVisible() {
        Assert.assertTrue(pages.hotCategories.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify House Appliances link is visible")
    public void verifyHouseAppliancesLinkIsVisible() {
        Assert.assertTrue(pages.houseAppliances.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Recommendation For You link is visible")
    public void verifyRecommendationForYouLinkIsVisible() {
        Assert.assertTrue(pages.recommendtaionForYou.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Top Brand link is visible")
    public void verifyTopBrandLinkIsVisible() {
        Assert.assertTrue(pages.topBrand.isDisplayed());
        ReusableMethod.waitToSee(2);

    }

    @Then("verify Popular Searches link is visible")
    public void verifyPopularSearchesLinkIsVisible() {
        Assert.assertTrue(pages.popularSearches.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("verify Trendlifebuy|ONLINE SHOPPING link is visible")
    public void verifyTrendlifebuyONLINESHOPPINGLinkIsVisible() {
        Assert.assertTrue(pages.trenbuylifeOnlineShopping.isDisplayed());
        ReusableMethod.waitToSee(2);
    }


    //Scenario: TC_111
    @Then("Verify that the View All button redirects to the relevant page")
    public void verifyThatTheViewAllButtonRedirectsToTheRelevantPage() {

        pages.viewAll_trendingProducts.click();
        String viewAll_trendingProducts_actualPageUrl = driver.getCurrentUrl();
        String expected_trend_url = "https://qa.trendlifebuy.com/category/best_deals?item=product";
        ReusableMethod.waitToSee(2);
        Assert.assertTrue(viewAll_trendingProducts_actualPageUrl.contains(expected_trend_url));

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
        int loc1 = ReusableMethod.onlyTakeNumberandParseInteger(String.valueOf(pages.loadMoreButton.getLocation()));
        //System.out.println(loc1);
        ReusableMethod.waitToSee(2);
        pages.loadMoreButton.click();
        ReusableMethod.waitToSee(3);
        //System.out.println(pages.loadMoreButton.getLocation());
        int loc2 = ReusableMethod.onlyTakeNumberandParseInteger(String.valueOf(pages.loadMoreButton.getLocation()));
        //System.out.println(loc2);
        Assert.assertTrue(loc2 > loc1);

    }

    //Scenario: TC_114

    @Then("click log in")
    public void clickLogIn() {
        pages.logInButton.click();
    }

    @Then("verify that after clicking Here link next to Password navigates to relevant page")
    public void verifyThatAfterClickingHereLinkNextToPasswordNavigatesToRelevantPage() {
        pages.clickHereToReset.click();
        Assert.assertTrue(pages.resetPasswordSendButton.isDisplayed());
    }

    //Scenario: TC_115
    @Then("verify that after clicking Sign Up next to next to Don't have an Account? navigates to relevant page")
    public void verifyThatAfterClickingSignUpNextToNextToDonTHaveAnAccountNavigatesToRelevantPage() {
        pages.signUp.click();
        Assert.assertTrue(pages.signUpText.isDisplayed());
    }

    //Scenario: TC_116 to TC_119
    @Then("type valid email")
    public void typeValidEmail() {
        pages.emailBox.sendKeys(ConfigReader.getProperty("validEmail_Murat"));
    }

    @And("type valid password")
    public void typeValidPassword() {
        pages.passwordBox.sendKeys(ConfigReader.getProperty("validPassword_Murat"));
    }

    @Then("click sign in")
    public void clickSignIn() {
        pages.signInButton.click();
        ReusableMethod.waitToSee(3);
    }

    @Then("verify that navigates to Home Page")
    public void verifyThatNavigatesToHomePage() {
        Assert.assertTrue(pages.dashboardLink.isDisplayed());

    }

    @Then("verify that Welcome message is displayed")
    public void verifyThatWelcomeMessageIsDisplayed() {
        Assert.assertTrue(pages.succesMessage.isDisplayed());
        ReusableMethod.waitToSee(2);
    }

    @Then("type incorrect email")
    public void typeIncorrectEmail() {
        pages.emailBox.sendKeys(ConfigReader.getProperty("incorrectEmail_Murat"));
    }

    @And("type incorrect password")
    public void typeIncorrectPassword() {
        pages.passwordBox.sendKeys(ConfigReader.getProperty("incorrectPassword_Murat"));
    }

    @Then("verify that These credentials do not match our records text is displayed")
    public void verifyThatTheseCredentialsDoNotMatchOurRecordsTextIsDisplayed() {
        Assert.assertTrue(pages.wrongDataText.isDisplayed());
    }

    //Scenario: TC_120
    @Then("Verify that the Remember me checkbox is clickable")
    public void verifyThatTheRememberMeCheckboxIsClickable() {
        pages.rememberMeCheckBox.click();
        // ReusableMethod.waitToSee(2);
        Assert.assertTrue(pages.rememberMeCheckBox1.isSelected());

    }

    @Then("move to product one")
    public void movetoProductOne() {
        actions.moveToElement(pages.product1).perform();
        ReusableMethod.waitToSee(5);
    }

    @Then("click product one")
    public void clickProductOne() {

        pages.product1.click();
        ReusableMethod.scrolldown_600();
        ReusableMethod.waitToSee(3);
        pages.compareButtonProductPage.click();
        ReusableMethod.waitToSee(3);
    }

    @Then("click product two")
    public void clickProductTwo() {

        pages.product2.click();
        ReusableMethod.scrolldown_600();
        ReusableMethod.waitToSee(1);
        pages.compareButtonProductPage.click();
        ReusableMethod.waitToSee(1);
    }

    @Then("click compare button")
    public void clickCompareButton() {
        pages.compareButtonHomePage.click();
    }

    //--verifies two selected products pictures
    @Then("verify pictures of products are displayed")
    public void verifyPicturesOfProductAreDisplayed() {

        Assert.assertTrue(pages.comparedProduct1.isDisplayed());
        Assert.assertTrue(pages.comparedProduct2.isDisplayed());
    }

    @Then("verify content information of products are displayed")
    public void verifyContentInformationOfProductsAreDisplayed() {
        WebElement contentInfo_product1 = pages.comparisonList1;
        WebElement contentInfo_product2 = pages.comparisonList2;
        String a = contentInfo_product1.getText();
        String b = contentInfo_product2.getText();
        Assert.assertFalse(a.isEmpty() & b.isEmpty());

    }


    @Then("all-in-one logIn")
    public void allInOneLogIn() {
    clickLogIn();
    typeValidEmail();
    typeValidPassword();
    clickSignIn();
    }

    @Then("click reset compare button")
    public void clickResetCompareButton() {
        pages.compareReset.click();
        ReusableMethod.waitToSee(2);
    }

    @Then("verify product compare page is empty")
    public void verifyProductComparePageIsEmpty() {
        Assert.assertTrue(pages.compareListEmptyText.isDisplayed());


    }
}






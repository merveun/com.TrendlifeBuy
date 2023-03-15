package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.US_14_21_23_33;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class US_14_21_23_33_StepDef {

    US_14_21_23_33 pages;

    @Given("The application extension is entered into the browser")
    public void  url (String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethod.bekle(10);
    }

    @Then("The Subscribe popup closes")
    public void the_subscribe_popup_closes() {
        pages = new US_14_21_23_33();
        ReusableMethod.waitForClickablility(pages.subscribePopupExit,10);
        pages.subscribePopupExit.click();
    }

    @Then("Verifies that About Us tab is click")
    public void verifies_that_about_us_tab_is_click() {
        pages = new US_14_21_23_33();
        ReusableMethod.waitForClickablility(pages.aboutUsMenu,10);
        pages.aboutUsMenu.click();
    }

    @Then("Verify that QUALITY AND REASONABLE PRICES is visible on the About Us page")
    public void verify_that_quality_and_reasonable_prices_is_visible_on_the_about_us_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.qualityReasonblePrices.isDisplayed());
        ReusableMethod.bekle(10);
        softAssert.assertAll();

    }

    @Then("Verified that their numbers are visible on Client Worldwide, Successful Project, Work Employed, Planning Services boards on the About Us page")
    public void verified_that_their_numbers_are_visible_on_client_worldwide_successful_project_work_employed_planning_services_boards_on_the_about_us_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.visibleNumbersAndBoards.isDisplayed());
        ReusableMethod.bekle(10);
        softAssert.assertAll();

    }

    @Then("Verify that the text Online Shopping Easy Cost-Efficient is visible on the About Us page")
    public void verify_that_the_text_online_shopping_easy_cost_efficient_is_visible_on_the_about_us_page() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.onlineShoppingEasyWrite.isDisplayed());
        ReusableMethod.bekle(10);
        softAssert.assertAll();
    }


    @Then("Verify that Team Member text is visible on the About Us page")
    public void verify_that_team_member_text_is_visible_on_the_about_us_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.teamMemberText.isDisplayed());
        ReusableMethod.bekle(10);
        softAssert.assertAll();
    }

    @Then("The About Us page should verify that the characters, statuses and images of Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible on the page")
    public void the_about_us_page_should_verify_that_the_characters_statuses_and_images_of_robert_pattison_johnny_depp_jason_statham_bradley_cooper_are_visible_on_the_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.viesibleRobertPattinson.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleRobertPattinson,10).click();

        softAssert.assertTrue(pages.viesibleJohnnyDepp.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleJohnnyDepp,10).click();

        softAssert.assertTrue(pages.viesibleJasonStatham.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleJasonStatham,10).click();

        softAssert.assertTrue(pages.viesibleHarryCooper.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleHarryCooper,10).click();

        softAssert.assertAll();

    }

    @Then("The pages is closed")
    public void the_pages_is_closed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

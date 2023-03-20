package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_14_21_23_33;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class US_14_21_23_33_StepDef {

    US_14_21_23_33 pages;

    @Given("The application extension is entered {string} into the browser")
    public void theApplicationExtensionIsEnteredIntoTheBrowser(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
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
        ReusableMethod.bekle(5);
        softAssert.assertAll();

    }

    @Then("Verified that their numbers are visible on Client Worldwide, Successful Project, Work Employed, Planning Services boards on the About Us page")
    public void verified_that_their_numbers_are_visible_on_client_worldwide_successful_project_work_employed_planning_services_boards_on_the_about_us_page(String visibleWrite) {
        /*
       String actualVisibleWrite = Driver.getDriver().switchTo().alert().getText();
       Assert.assertEquals(visibleWrite,actualVisibleWrite);

         */

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.visibleNumbersAndBoards.isDisplayed());
        ReusableMethod.bekle(5);

    }

    @Then("Verify that the text Online Shopping Easy Cost-Efficient is visible on the About Us page")
    public void verify_that_the_text_online_shopping_easy_cost_efficient_is_visible_on_the_about_us_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.onlineShoppingEasyWrite.isDisplayed());
        ReusableMethod.bekle(5);

    }


    @Then("Verify that Team Member text is visible on the About Us page")
    public void verify_that_team_member_text_is_visible_on_the_about_us_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.teamMemberText.isDisplayed());
        ReusableMethod.bekle(5);


    }

    @Then("The user verifies the characters, statuses and images of Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible on the page")
    public void theUserVerifiesTheCharactersStatusesAndImagesOfRobertPattisonJohnnyDeppJasonStathamBradleyCooperAreVisibleOnThePage() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.viesibleRobertPattinson.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleRobertPattinson,5).click();

        softAssert.assertTrue(pages.viesibleJohnnyDepp.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleJohnnyDepp,5).click();

        softAssert.assertTrue(pages.viesibleJasonStatham.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleJasonStatham,5).click();

        softAssert.assertTrue(pages.viesibleHarryCooper.isDisplayed());
        ReusableMethod.waitForClickablility(pages.viesibleHarryCooper,5).click();

        softAssert.assertAll();
    }

    @Then("The pages is closed")
    public void the_pages_is_closed() {
        Driver.closeDriver();

    }

    // US_21 Stepdefinitions

    @Then("Click on the Login button")
    public void click_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Type valid Email and Password")
    public void type_valid_email_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click the Sign In button")
    public void click_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click on the Dashboard link on the page that opens")
    public void click_on_the_dashboard_link_on_the_page_that_opens() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that the Refund & Dispute page is accessible")
    public void verify_that_the_refund_dispute_page_is_accessible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("On the page that opens, it is displayed in the Return List of the products whose return process has been initiated")
    public void on_the_page_that_opens_it_is_displayed_in_the_return_list_of_the_products_whose_return_process_has_been_initiated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify the addresses of the Order ID, Order Date, Status, Request Submission Date and Order Amount in the Refund List")
    public void verify_the_addresses_of_the_order_id_order_date_status_request_submission_date_and_order_amount_in_the_refund_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("On the details page opened with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.")
    public void on_the_details_page_opened_with_the_view_details_button_it_should_be_verified_that_the_current_status_of_the_order_whose_return_request_is_opened_can_be_viewed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("On the opened details page, it should be verified that at least one of the Start, Processing and Complete states are active.")
    public void on_the_opened_details_page_it_should_be_verified_that_at_least_one_of_the_start_processing_and_complete_states_are_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that Texts with explanations of Start, Processing and Complete states are visible on the opened details page")
    public void verify_that_texts_with_explanations_of_start_processing_and_complete_states_are_visible_on_the_opened_details_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("It should be verified that the Pick Up Info information is displayed on the details page that opens")
    public void it_should_be_verified_that_the_pick_up_info_information_is_displayed_on_the_details_page_that_opens() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    // US_23 Stepdifinations

    @Then("Verify that the All Submitted Ticket List is visible on the Support Ticket page")
    public void verify_that_the_all_submitted_ticket_list_is_visible_on_the_support_ticket_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("In the All Submitted Ticket List, it should be verified that the Tickets are listed with the Ticket ID, Subject, Priority, Last Update information")
    public void in_the_all_submitted_ticket_list_it_should_be_verified_that_the_tickets_are_listed_with_the_ticket_id_subject_priority_last_update_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The View button is clicked on the Action column in the All Submitted Ticket List, it should be verified that the data of the relevant Ticket is displayed on the Show page that opens")
    public void the_view_button_is_clicked_on_the_action_column_in_the_all_submitted_ticket_list_it_should_be_verified_that_the_data_of_the_relevant_ticket_is_displayed_on_the_show_page_that_opens() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("On the show page where the ticket information is displayed, it should be verified that the Status, Priority, Category information of the ticket is displayed")
    public void on_the_show_page_where_the_ticket_information_is_displayed_it_should_be_verified_that_the_status_priority_category_information_of_the_ticket_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("It should be verified that the response returned to the Ticket opened on the Show page is displayed")
    public void it_should_be_verified_that_the_response_returned_to_the_ticket_opened_on_the_show_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("It should be verified that the ticket can be answered with the Reply button on the Show page")
    public void it_should_be_verified_that_the_ticket_can_be_answered_with_the_reply_button_on_the_show_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("It should be verified that the Tickets shown in the All Submitted Ticket List are can be filtered according to All Ticket, Pending, On Going, Completed, Closed information")
    public void it_should_be_verified_that_the_tickets_shown_in_the_all_submitted_ticket_list_are_can_be_filtered_according_to_all_ticket_pending_on_going_completed_closed_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("It should be verified that the Create new ticket page is accessed with the Add New button")
    public void it_should_be_verified_that_the_create_new_ticket_page_is_accessed_with_the_add_new_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("By entering Subject, Category, Priority and Description, it should be verified that a new ticket is opened with the Create new button")
    public void by_entering_subject_category_priority_and_description_it_should_be_verified_that_a_new_ticket_is_opened_with_the_create_new_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    // US_33 Stepdefinitions



}

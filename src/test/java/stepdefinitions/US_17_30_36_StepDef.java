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

import java.awt.geom.RectangularShape;

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
        Assert.assertTrue(dashboardPages.notificationyazisi.isDisplayed());

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

    //------------------------------------------------------US36--------------------------------------------------//

    //TC01
    @Then("Click on Gift Card drapdown")
    public void click_on_gift_card_drapdown() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        dashboardPages.buttonGiftCArd.click();
    }
    @Then("clicks the gift card list button")
    public void clicks_the_gift_card_list_button() {
        dashboardPages.buttonGiftCardList.click();
    }
    @Then("tests that the gift card page is opened")
    public void tests_that_the_gift_card_page_is_opened() {
        String actualUrlNotification = getDriver().getCurrentUrl();
        String expectedUrlNotification = "https://trendlifebuy.com/admin/giftcard";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(actualUrlNotification,expectedUrlNotification);

    }
    //------TC02
    @Then("Tests that the gift card list is visible from the gift card page.")
    public void tests_that_the_gift_card_list_is_visible_from_the_gift_card_page() {
        Assert.assertTrue(dashboardPages.giftCardAlani.isDisplayed());

    }
    //-----TC03

    @Then("Clicks the Name button, tests that it is sorted")
    public void clicks_the_name_button_tests_that_it_is_sorted() {

    }
    @Then("Clicks the Sku button, tests that it is sorted")
    public void clicks_the_sku_button_tests_that_it_is_sorted() {

    }
    @Then("Clicks the Thumnail image button, tests that it is sorted")
    public void clicks_the_thumnail_image_button_tests_that_it_is_sorted() {

    }
    @Then("Clicks the Selling Price button, tests that it is sorted")
    public void clicks_the_selling_price_button_tests_that_it_is_sorted() {

    }
    @Then("Clicks on the Number Price button, tests that it is sorted")
    public void clicks_on_the_number_price_button_tests_that_it_is_sorted() {

    }
    @Then("Clicks on the Number Of Sale button, tests that it is sorted")
    public void clicks_on_the_number_of_sale_button_tests_that_it_is_sorted() {

    }
    @Then("Clicks on the Status button, tests that it is sorted")
    public void clicks_on_the_status_button_tests_that_it_is_sorted() {

    }

    //----TC04-------


    @Then("clicks to deactivate the status part of the first gift card")
    public void clicks_to_deactivate_the_status_part_of_the_first_gift_card() {
        dashboardPages.typeStatus.click();
        ReusableMethod.bekle(3000);
    }
    @Then("tests that it is passive")
    public void tests_that_it_is_passive() {
        Assert.assertTrue(dashboardPages.mmessageToast.isDisplayed());

    }
    @Then("clicks to activate the status part of the first gift card")
    public void clicks_to_activate_the_status_part_of_the_first_gift_card() {
        dashboardPages.typeStatus.click();
        ReusableMethod.bekle(3000);

    }
    @Then("tests that it is active")
    public void tests_that_it_is_active() {
        Assert.assertTrue(dashboardPages.mmessageToast.isDisplayed());

    }
    //---------TC05-----

    @Then("clicks the actions button of the first gift card")
    public void clicks_the_actions_button_of_the_first_gift_card() {
        dashboardPages.buttonAction.click();
    }
    @Then("clicks the select button in the opened section")
    public void clicks_the_select_button_in_the_opened_section() {
        dashboardPages.buttonSelect.click();
    }
    @Then("tests that the page appears")
    public void tests_that_the_page_appears() {
        Assert.assertTrue(dashboardPages.buttonViewAdmin.isDisplayed());
    }
    @Then("clicks the edit button")
    public void clicks_the_edit_button() {
        Assert.assertTrue(dashboardPages.buttonEdit.isDisplayed());
    }
    @Then("clicks the delete button")
    public void clicks_the_delete_button() {
        Assert.assertTrue(dashboardPages.buttonDelete.isDisplayed());
    }

    //-------TC06------


    @Then("clicks the view buttonn")
    public void clicks_the_view_buttonn() {
        dashboardPages.buttonViewAdmin.click();
        ReusableMethod.bekle(2000);

    }
    @Then("Verifies that the name part and the name in the gift card list are the same in the opened page")
    public void verifies_that_the_name_part_and_the_name_in_the_gift_card_list_are_the_same_in_the_opened_page() {

        String actualName = getDriver().getCurrentUrl();
        String expectedName = "friends";
        ReusableMethod.waitToSee(2);
        Assert.assertEquals(actualName,expectedName);

    }



    //-----TC07-----




    @Then("take a  screenshot status to friends")
    public void take_a_screenshot_status_to_friends() {
        //dashboardPages.typeStatus.getScreenshotAs(dashboardPages.typeStatus.)

    }
    @Then("Verifies that the status section and the status in the gift card list are the same in the opened page")
    public void verifies_that_the_status_section_and_the_status_in_the_gift_card_list_are_the_same_in_the_opened_page() {

    }
    @Then("take a  screenshot status to giftcard")
    public void take_a_screenshot_status_to_giftcard() {

        //ekran görüntsü almayı çağır

    }

    //-----TC08----


    @Then("clicks the print button and it is verified that it redirects to the page")
    public void clicks_the_print_button_and_it_is_verified_that_it_redirects_to_the_page() {
        dashboardPages.buttonPrint.click();


    }

    //-----TC09------
    @Then("Click on the edit button and verify that it goes to the page")
    public void click_on_the_edit_button_and_verify_that_it_goes_to_the_page() {
        dashboardPages.buttonEdit.click();
        ReusableMethod.bekle(3000);
        Assert.assertTrue(dashboardPages.textEditGifCard.isDisplayed());
        ReusableMethod.bekle(9000);


    }

    //------TC10------
    @Then("clicks the select button of the first giftcard")
    public void clicks_the_select_button_of_the_first_giftcard() {

    }

    @Then("Tests that the name information appears")
    public void tests_that_the_name_information_appears() {

    }
    @Then("Tests that SKU information appears")
    public void tests_that_sku_information_appears() {

    }
    @Then("Tests that Thumbnail Image information appears")
    public void tests_that_thumbnail_image_information_appears() {

    }
    @Then("Tests that Selling Price information appears")
    public void tests_that_selling_price_information_appears() {

    }
    @Then("Tests that Shipping Methods information appears")
    public void tests_that_shipping_methods_information_appears() {

    }
    @Then("Tests that Galary Image information appears")
    public void tests_that_galary_image_information_appears() {

    }
    @Then("Tests that Discount information appears")
    public void tests_that_discount_information_appears() {

    }
    @Then("Tests that Discount Type information appears")
    public void tests_that_discount_type_information_appears() {

    }
    @Then("Tests that the status information appears")
    public void tests_that_the_status_information_appears() {

    }
    @Then("Tests that Discount Period information appears")
    public void tests_that_discount_period_information_appears() {

    }
    @Then("Tests that tag information appears")
    public void tests_that_tag_information_appears() {

    }

    //-----TC11--------

    //


    @Then("clicks the select button in the popup section")
    public void clicks_the_select_button_in_the_popup_section() {
        dashboardPages.buttonSelect.click();
        ReusableMethod.bekle(2000);
    }
    @Then("click the edit button")
    public void click_the_edit_button() {
        dashboardPages.buttonEdit.click();
        ReusableMethod.bekle(3000);
        // JavascriptExecutor js = (JavascriptExecutor) getDriver();
        //js.executeScript("arguments[0].click();", dashboardPages.buttonEdit);
        //ReusableMethod.bekle(2000);
    }
    @Then("Change name on edit page")
    public void change_name_on_edit_page() {
        dashboardPages.editName.sendKeys(ConfigReader.getProperty("editNamee"));
        ReusableMethod.bekle(2000);
        dashboardPages.editSelling.sendKeys(ConfigReader.getProperty("editSelling"));
        ReusableMethod.bekle(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        dashboardPages.buttonEditUpdate.click();
        ReusableMethod.bekle(5000);
    }
    @Then("click the update button")
    public void click_the_update_button() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        dashboardPages.buttonEditUpdate.click();
        ReusableMethod.bekle(5000);
    }
    @Then("Go to gift card page")
    public void go_to_gift_card_page() {
        ReusableMethod.navigateback();
        ReusableMethod.bekle(2000);
    }
    @Then("confirmed to have changed")
    public void confirmed_to_have_changed() {
        Assert.assertTrue(dashboardPages.messageUptadeSuccsess.isDisplayed());
    }

    //------TC12------

    @Then("Clicks the actions button of the gift card named -flower")
    public void clicks_the_actions_button_of_the_gift_card_named_flower() {
        dashboardPages.buttonAction.click();


    }

    @Then("click the delete button")
    public void click_the_delete_button() {
        dashboardPages.buttonAction.click();
        ReusableMethod.bekle(2000);
        dashboardPages.buttonSelect.click();
        ReusableMethod.bekle(2000);
        dashboardPages.buttonDelete.click();


    }
    @Then("Click the delete button in the pop-up.")
    public void click_the_delete_button_in_the_pop_up() {
        dashboardPages.buttonDeleteSon.click();
        ReusableMethod.bekle(2000);

    }
    @Then("The green pop up is verified.")
    public void the_green_pop_up_is_verified() {

    }


    //------TC13
    @Then("quick clicks the search button")
    public void quick_clicks_the_search_button() {

    }
    @Then("Writes the name of the gift card named -friends")
    public void writes_the_name_of_the_gift_card_named_friends() {

    }
    @Then("the result is verified")
    public void the_result_is_verified() {

    }



    //---------14-------------



    @Then("Tests going to the Create Gift Card page")
    public void tests_going_to_the_create_gift_card_page() {

    }


    //------------15


    @Then("Add New butonuna tıklar")
    public void add_new_butonuna_tıklar() {

    }
    @Then("Name,Verify that Tag Texts are visible.")
    public void name_verify_that_tag_texts_are_visible() {

    }
    @Then("SKU,Verify that Tag Texts are visible.")
    public void sku_verify_that_tag_texts_are_visible() {

    }
    @Then("Thumbnail Image, Verify that Tag Texts are visible.")
    public void thumbnail_image_verify_that_tag_texts_are_visible() {

    }
    @Then("Selling Price,Verify that Tag Texts are visible.")
    public void selling_price_verify_that_tag_texts_are_visible() {

    }
    @Then("Shipping Methods,Verify that Tag Texts are visible.")
    public void shipping_methods_verify_that_tag_texts_are_visible() {

    }
    @Then("Galary Image,Verify that Tag Texts are visible.")
    public void galary_image_verify_that_tag_texts_are_visible() {

    }
    @Then("Discount,Verify that Tag Texts are visible.")
    public void discount_verify_that_tag_texts_are_visible() {

    }
    @Then("Discount Type,Verify that Tag Texts are visible.")
    public void discount_type_verify_that_tag_texts_are_visible() {

    }
    @Then("Status,Verify that Tag Texts are visible.")
    public void status_verify_that_tag_texts_are_visible() {

    }
    @Then("Discount Period Verify that Tag Texts are visible.")
    public void discount_period_verify_that_tag_texts_are_visible() {

    }
    @Then("Tag Verify that Tag Texts are visible.")
    public void tag_verify_that_tag_texts_are_visible() {

    }


    //-------TC16------



    @Then("Click the Add New button;")
    public void click_the_add_new_button() {

    }
    @Then("Name, SKU, Thumbnail Image, Selling Price, Shipping Methods, Galary Image, Discount,")
    public void name_sku_thumbnail_image_selling_price_shipping_methods_galary_image_discount() {

    }
    @Then("Discount Type, Discount Period, Tag and Description")
    public void discount_type_discount_period_tag_and_description() {

    }
    @Then("When the desired information is entered in the Text Boxes and the Status is selected,and the Save button is clicked;It should be verified that a new Gift Card has been created.")
    public void when_the_desired_information_is_entered_in_the_text_boxes_and_the_status_is_selected_and_the_save_button_is_clicked_it_should_be_verified_that_a_new_gift_card_has_been_created() {

    }









}


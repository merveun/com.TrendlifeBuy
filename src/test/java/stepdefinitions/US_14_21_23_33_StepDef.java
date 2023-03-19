package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_14_21_23_33;
import pages.US_2_35;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class US_14_21_23_33_StepDef {
    US_14_21_23_33 pages;
    Actions actions = new Actions(Driver.getDriver());


    @Given("go to the browser {string}")
    public void goToTheBrowser(String url) {
        pages= new US_14_21_23_33();
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("close popup windows")
    public void closePopupWindows() {
        pages= new US_14_21_23_33();
        ReusableMethod.waitForClickablility(pages.PopupExit, 15);
        pages.PopupExit.click();
    }

    @And("terminate the test")
    public void terminateTheTest() {
        pages= new US_14_21_23_33();
        Driver.quitDriver();
    }

    @Then("verify AboutUsPage link is visible")
    public void verifyAboutUsPageLinkIsVisible() {
        pages= new US_14_21_23_33();

        pages.AboutUsMenu.click();
        ReusableMethod.waitToSee(2);

        String aboutUs_actualAboutUsUrl = driver.getCurrentUrl();
        String aboutUs_expectedAboutUsUrl = "https://qa.trendlifebuy.com/about-us";
        ReusableMethod.waitToSee(3);
        Assert.assertEquals(aboutUs_expectedAboutUsUrl, aboutUs_actualAboutUsUrl);
    }


    @Then("verify QUALITY AND REASONABLE PRICES is visible")
    public void verify_quality_and_reasonable_prices_is_visible() {
        pages= new US_14_21_23_33();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();

        Assert.assertTrue(pages.qualityReasonblePrices.isDisplayed());
        ReusableMethod.waitToSee(5);
    }

    @Then("verify Client Worldwide, Successful Project, Work Employed, Planning Services numbers are visible")
    public void verifyClientWorldwideSuccessfulProjectWorkEmployedPlanningServicesNumbersAreVisible() {
        pages= new US_14_21_23_33();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();
        ReusableMethod.waitToSee(5);

        assertTrue(pages.visibleNumbersAndBoards.isDisplayed());
        ReusableMethod.waitToSee(5);

    }

    @Then("verify ONLINE SHOPPING EASY AND COST-EFFICIENT is visible")
    public void verifyONLINESHOPPINGEASYANDCOSTEFFICIENTIsVisible() {
        pages= new US_14_21_23_33();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();

        Assert.assertTrue(pages.onlineShoppingEasyWrite.isDisplayed());
        ReusableMethod.bekle(5);
        
    }
    @Then("verify TEAM MEMBER is visible")
    public void verifyTEAMMEMBERIsVisible() {
        pages= new US_14_21_23_33();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(pages.teamMemberText.isDisplayed());
        ReusableMethod.bekle(5);
        
    }
    @Then("verify Robert Pattinson image by clicking")
    public void verifyRobertPattinsonImageByClicking() {
        pages= new US_14_21_23_33();

        String expectedtext="Robert Pattinson";
        String actualtext =pages.viesibleRobertPattinson.getText();
        Assert.assertTrue(actualtext.contains(expectedtext));
        Assert.assertTrue(pages.viesibleRobertPattinson.isDisplayed());

        pages.viesibleRobertPattinson.click();
        ReusableMethod.bekle(5);

    }
    @And("verify Johnny Depp image by clicking")
    public void verifyJohnnyDeppImageByClicking() {
        pages= new US_14_21_23_33();

        String expectedtext="Johnny Depp";
        String actualtext =pages.viesibleJohnnyDepp.getText();
        Assert.assertTrue(actualtext.contains(expectedtext));
        Assert.assertTrue(pages.viesibleJohnnyDepp.isDisplayed());

        pages.viesibleJohnnyDepp.click();
        ReusableMethod.bekle(5);
    }

    @And("verify Jason Statham image by clicking")
    public void verifyJasonStathamImageByClicking() {
        pages= new US_14_21_23_33();

        String expectedtext="Jason Statham";
        String actualtext =pages.viesibleJasonStatham.getText();
        Assert.assertTrue(actualtext.contains(expectedtext));
        Assert.assertTrue(pages.viesibleJasonStatham.isDisplayed());

        pages.viesibleJasonStatham.click();
        ReusableMethod.bekle(5);
        
    }

    @And("verify Harry Cooper image by clicking")
    public void verifyHarryCooperImageByClicking() {
        pages= new US_14_21_23_33();

        String expectedtext="HarryCooper";
        String actualtext =pages.viesibleHarryCooper.getText();
        Assert.assertTrue(actualtext.contains(expectedtext));
        Assert.assertTrue(pages.viesibleHarryCooper.isDisplayed());

        pages.viesibleHarryCooper.click();
        ReusableMethod.bekle(5);

    }
//******************* US_21/US_23 Stepdefinitions ************

    @Then("the login button is click")
    public void theLoginButtonIsClick() {
        pages= new US_14_21_23_33();
        pages.SLoginButton.click();
        ReusableMethod.bekle(2);
    }
    @Then("enter a valid {string} and {string}")
    public void enterAValidAnd(String arg0, String arg1) {
        pages= new US_14_21_23_33();
        pages.SemailTextBox.sendKeys(ConfigReader.getProperty("SuserName"));
        ReusableMethod.bekle(2);
        pages.SpasswordTextBox.sendKeys(ConfigReader.getProperty("SuserPassword"));
        ReusableMethod.bekle(2);
    }
    @And("the Signed in button is click")
    public void theSignedInButtonIsClick() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);

        pages.SsignInButton.click();
        ReusableMethod.bekle(2);
    }
    @Then("click the DashBoard button")
    public void clickTheDashBoardButton() {
        pages= new US_14_21_23_33();
        pages.SdashBoard.click();

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
    }
    //******************* US_21 Refund & Dispute ************
    @Then("click Refund & Dispute and verified that it redirects to Refund & Dispute page")
    public void clickRefundDisputeAndVerifiedThatItRedirectsToRefundDisputePage() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.SrefundDispute.click();
    }
    @Then("verified that it whose return process is initiated are displayed in the Return List")
    public void verifiedThatItWhoseReturnProcessIsInitiatedAreDisplayedInTheReturnList() {

        pages= new US_14_21_23_33();
        assertTrue(pages.SrefundDispute.isDisplayed());
    }
    @Then("verify Order ID information is visible")
    public void verifyOrderIDInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.OrderID.isDisplayed());
    }
    @Then("verify Order Date information is visible")
    public void verifyOrderDateInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.OrderDate.isDisplayed());
    }
    @Then("verify Status information is visible")
    public void verifyStatusInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.statusPending.isDisplayed());
    }
    @Then("verify Request Sent Date information is visible")
    public void verifyRequestSubmissionDateUsInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.requestSentDate.isDisplayed());
    }
    @Then("verify Order Amount information is visible")
    public void verifyOrderAmountInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.OrderAmount.isDisplayed());
    }
    @Then("click View Details")
    public void clickViewDetails() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.ViewDetailsButton.click();
    }
    @Then("verify current status of the order information is visible")
    public void verifyCurrentStatusOfTheOrderInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.CurrentStatusOfTheOrder.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verify operator is active from Start visible")
    public void verifyOperatorIsActiveFromStartVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.StartVisible.isDisplayed());
        ReusableMethod.bekle(2);
    }

    @Then("verify operator is active from Processing visible")
    public void verifyOperatorIsActiveFromProcessingVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.ProcessingVisible.isDisplayed());
        ReusableMethod.bekle(2);
    }

    @Then("verify operator is active from Completed visible")
    public void verifyOperatorIsActiveFromCompletedVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.CompletedVisible.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verify Start operator and explanation visible")
    public void verifyStartOperatorAndExplanationVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.StartOperator.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verify Processing operator and explanation visible")
    public void verifyProcessingOperatorAndExplanationVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.ProcessingOperator.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verify Completed operator and explanation visible")
    public void verifyCompletedOperatorAndExplanationVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.CompletedOperator.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verify Pick Up Info information is visible")
    public void verifyPickUpInfoInformationIsVisible() {
        pages= new US_14_21_23_33();
        assertTrue(pages.PickUpInfo.isDisplayed());
        ReusableMethod.bekle(2);
    }
    //******************* US_23 Support Ticket ************
    @Then("click Support Ticket and verified that it redirects to Support Ticket page")
    public void clickSupportTicketAndVerifiedThatItRedirectsToSupportTicketPage() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.supportTicket.click();
        ReusableMethod.bekle(2);

        assertTrue(pages.supportTicketPage.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verify All Submitted Ticket List is visible")
    public void verifyAllSubmittedTicketListIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(pages.AllSubmittedTicketList.isDisplayed());
        ReusableMethod.bekle(2);
        
    }
    @Then("Verify that all categories under the All Submitted Ticket menu are seen")
    public void verifyThatAllCategoriesUnderTheAllSubmittedTicketMenuAreSeen() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(pages.AllSubmittedTicketList.isDisplayed());
        ReusableMethod.bekle(2);
        
    }

    @Then("click View button")
    public void clickViewButton() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SViewButton.click();
        ReusableMethod.bekle(2);
    }
    @Then("verify Ticket informations is visible")
    public void verifyTicketInformationsIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(pages.ticketInformationsPage.isDisplayed());
        ReusableMethod.bekle(2);
        
    }

    @Then("click Reply button")
    public void clickReplyButton() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN)
               .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        pages.SReplyButton.click();
        ReusableMethod.bekle(3);
        
    }

    @Then("verify ticket can be answered form is visible")
    public void verifyTicketCanBeAnsweredFormIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SReplyTextBox.click();
        ReusableMethod.bekle(3);

        String expectedSwrite="Hello World";
        String actualSwrite= driver.getTitle();
        Assert.assertEquals(expectedSwrite, actualSwrite);
        ReusableMethod.bekle(3);

        pages.SReplyNowButton.click();
        ReusableMethod.bekle(3);

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();

        assertTrue(pages.SticketAnswerBox.isDisplayed());
        ReusableMethod.bekle(2);


    }

    @Then("click All Ticket button")
    public void clickAllTicketButton() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SallTicketLink.click();
        ReusableMethod.bekle(3);

        
    }

    @Then("choose Pending link and click Pending information is visible")
    public void choosePendingLinkAndClickPendingInformationIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SPendingLink.click();
        ReusableMethod.bekle(3);

        assertTrue(pages.SPendingLink.isDisplayed());
        ReusableMethod.bekle(3);
        
    }

    @Then("choose On Going link and click On Going information is visible")
    public void chooseOnGoingLinkAndClickOnGoingInformationIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SOnGoingLink.click();
        ReusableMethod.bekle(3);

        assertTrue(pages.SOnGoingLink.isDisplayed());
        ReusableMethod.bekle(3);
        
    }

    @Then("choose Completed link and click Completed information is visible")
    public void chooseCompletedLinkAndClickCompletedInformationIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SCompletedLink.click();
        ReusableMethod.bekle(3);

        assertTrue(pages.SCompletedLink.isDisplayed());
        ReusableMethod.bekle(3);
    }

    @Then("choose Closed link and click Closed information is visible")
    public void chooseClosedLinkAndClickClosedInformationIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SClosedLink.click();
        ReusableMethod.bekle(3);

        assertTrue(pages.SClosedLink.isDisplayed());
        ReusableMethod.bekle(3);
    }

    @Then("click Add New button")
    public void clickAddNewButton() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SAddNewButton.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify Create new ticket page is visible")
    public void verifyCreateNewTicketPageIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(3);

        assertTrue(pages.SCreateNewTicket.isDisplayed());
        ReusableMethod.bekle(3);

    }

    @Then("verify Subject is visible and write text")
    public void verifySubjectIsVisibleAndWriteText() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SSubjectBox.click();
        ReusableMethod.bekle(3);

        String expectedChoose="FS Automation Engineer ";
        String actualChoose= pages.SSubjectBox.getText();
        Assert.assertTrue(actualChoose.contains(expectedChoose));
        ReusableMethod.bekle(3);

    }

    @Then("verify Category is visible and write text")
    public void verifyCategoryIsVisibleAndWriteText() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SCategoryBox.click();
        ReusableMethod.bekle(3);

        String expectedChoose="FS Automation Engineer ";
        String actualChoose= pages.SCategoryBox.getText();
        Assert.assertTrue(actualChoose.contains(expectedChoose));
        ReusableMethod.bekle(3);

    }

    @Then("verify Priority is visible and write text")
    public void verifyPriorityIsVisibleAndWriteText() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SPriorityBox.click();
        ReusableMethod.bekle(3);

        String expectedChoose="FS Automation Engineer ";
        String actualChoose= pages.SPriorityBox.getText();
        Assert.assertTrue(actualChoose.contains(expectedChoose));
        ReusableMethod.bekle(3);

    }

    @Then("verify Description is visible and write text")
    public void verifyDescriptionIsVisibleAndWriteText() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SDescriptionBox.click();
        ReusableMethod.bekle(3);

        String expectedChoose="Hello";
        String actualChoose= pages.SDescriptionBox.getText();
        Assert.assertTrue(actualChoose.contains(expectedChoose));
        ReusableMethod.bekle(3);
    }

    @Then("click Creat Now button")
    public void clickCreatNowButton() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SCreateNowButton.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify that a new ticket list is visible")
    public void verifyThatANewTicketListIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(pages.AllSubmittedTicketList.isDisplayed());
        ReusableMethod.bekle(2);

    }

    @Then("verify Status,Priority, and Category information is visible")
    public void verifyStatusPriorityAndCategoryInformationIsVisible() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SCustomerPending.click();
        ReusableMethod.bekle(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SCustomerVeryLow.click();
        ReusableMethod.bekle(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SCustomerVeryCategory.click();
        ReusableMethod.bekle(2);
    }

    
//**********************US_33 Stepdefinitions ****************
    
    @Given("go to the browser is {string}")
    public void goToTheBrowserIs(String urlAdmin) {
        pages= new US_14_21_23_33();
        Driver.getDriver().get(ConfigReader.getProperty(urlAdmin));
    }


    @Then("enter a valid the {string} and {string}")
    public void enterAValidTheAnd(String arg0, String arg1) {
        pages= new US_14_21_23_33();
        pages.SAdminName.sendKeys(ConfigReader.getProperty("SAdminName"));
        ReusableMethod.bekle(2);
        pages.SAdminPassword.sendKeys(ConfigReader.getProperty("SAdminPassword"));
        ReusableMethod.bekle(2);
        
    }
    @And("the Signed in the button is click")
    public void theSignedInTheButtonIsClick() {
        pages= new US_14_21_23_33();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.SadminSignInButton.click();
        ReusableMethod.bekle(2);
        
    }
    @Then("clicks in the Customer button")
    public void clicksInTheCustomerButton() {
        pages= new US_14_21_23_33();

        pages.SadminCustomerButton.click();
        ReusableMethod.bekle(3);
    }

    @Then("clicks the All Customer and verified that it All Customer page")
    public void clicksTheAllCustomerAndVerifiedThatItAllCustomerPage() {
        pages= new US_14_21_23_33();

        pages.SadminAllCustomerButton.click();
        ReusableMethod.bekle(3);

        assertTrue(pages.SadminAllCustomerPage.isDisplayed());
        ReusableMethod.bekle(2);
    }

    @Then("clicks in the All Customer")
    public void clicksInTheAllCustomer() {
        pages= new US_14_21_23_33();

        pages.SadminAllCustomerButton.click();
        ReusableMethod.bekle(3);
    }

    @Then("verified that the All Customer List is visible")
    public void verifiedThatTheAllCustomerListIsVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminAllCustomerTable.isDisplayed());
        ReusableMethod.bekle(2);
    }
    @Then("verified that the active state of the customer has changed visible")
    public void verifiedThatTheActiveStateOfTheCustomerHasChangedVisible() {
        pages= new US_14_21_23_33();

        pages.SadminSliderActiveButton.click();
        ReusableMethod.bekle(3);
        
    }

    @Then("clicks Active Customer")
    public void clicksActiveCustomer() {
        pages= new US_14_21_23_33();

        pages.SadminActiveCustomer.click();
        ReusableMethod.bekle(3);
    }

    @Then("verified that the Active Customer List is visible")
    public void verifiedThatTheActiveCustomerListIsVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminActiveCustomerPage.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("clicks first customer plus button")
    public void clicksFirstCustomerPlusButton() {
        pages= new US_14_21_23_33();

        pages.SadminCustomerPlusButton.click();
        ReusableMethod.bekle(3);
    }
    @And("clicks SELECT button")
    public void clicksSELECTButton() {
        pages= new US_14_21_23_33();

        pages.SadminActiveCustomerSelectButton.click();
        ReusableMethod.bekle(3);
    }
    @Then("verified that the DETAILS,EDIT,DELETE are visible")
    public void verifiedThatTheDETAILSEDITDELETEAreVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminActiveCustomerSelectLink.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("clicks DETAILS button")
    public void clicksDETAILSButton() {
        pages= new US_14_21_23_33();

        pages.SadminActiveCustomerDetails.click();
        ReusableMethod.bekle(3);
    }
    @Then("verified that the Customer Profile is visible")
    public void verifiedThatTheCustomerProfileIsVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminDetailsCustomerProfilePage.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @And("verified that the Customer Profile and informations is visible")
    public void verifiedThatTheCustomerProfileAndInformationsIsVisible() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        assertTrue(pages.SadminDetailsCustomerProfileInform.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("verify ORDERS,WALLET HISTORIES,ADDRESSES are visible")
    public void verifyORDERSWALLETHISTORIESADDRESSESAreVisible() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        assertTrue(pages.SadminDetailsCustomerProfileInform.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("click WALLET HISTORIES is visible")
    public void clickWALLETHISTORIESIsVisible() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        pages.SadminDetaileWalletHistoriesButton.click();
        ReusableMethod.bekle(3);
    }

    @Then("Verify that the requested information is properly sorted on the Wallet Histories page.")
    public void verifyThatTheRequestedInformationIsProperlySortedOnTheWalletHistoriesPage() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        assertTrue(pages.SadminWalletHistoriesBox.isDisplayed());
        ReusableMethod.bekle(3);
    }

    @Then("click ADDRESSES is visible")
    public void clickADDRESSESIsVisible() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        pages.SadminAddressesButton.click();
        ReusableMethod.bekle(3);
        assertTrue(pages.SadminAddressesButton.isDisplayed());
    }
    @Then("Verify that the requested information is properly sorted on the ADDRESSES page")
    public void verifyThatTheRequestedInformationIsProperlySortedOnTheADDRESSESPage() {
        pages= new US_14_21_23_33();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        assertTrue(pages.SadminAddressesBox.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("click Quick Search Text Box is to search by email")
    public void clickQuickSearchTextBoxIsToSearchByEmail() {
        pages= new US_14_21_23_33();

        pages.SadminqQuickSearch.click();
        ReusableMethod.bekle(3);

        String actualSadminqQuickSearch = pages.SadminqQuickSearch.getText();
        String expectedSadminqQuickSearch = "hasanozsoy3474@gmail.com";
        Assert.assertTrue(actualSadminqQuickSearch.contains(expectedSadminqQuickSearch));
        ReusableMethod.bekle(3);
    }
    @Then("click EDIT button")
    public void clickEDITButton() {
        pages= new US_14_21_23_33();

        pages.SadminActiveCustomerEdit.click();
        ReusableMethod.bekle(3);
    }
    @And("verify that the Update Customer and Basic Info Information is visible")
    public void verifyThatTheUpdateCustomerAndBasicInfoInformationIsVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminActiveCustomerEditBasicInfo.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("click UPDATE button")
    public void clickUPDATEButton() {
        pages= new US_14_21_23_33();

        pages.SadminActiveCustomerEditUpdate.click();
        ReusableMethod.bekle(3);
        
    }

    @And("verify Updated successfully is visible")
    public void verifyUpdatedSuccessfullyIsVisible() {
      // BUG
    }

    @Then("clicks InActive Customer and verified that the InActive Customer List is visible")
    public void clicksInActiveCustomerAndVerifiedThatTheInActiveCustomerListIsVisible() {
        pages= new US_14_21_23_33();

        pages.SadminInactiveCustomerButton.click();
        ReusableMethod.bekle(3);
        assertTrue(pages.SadminInactiveCustomerList.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("clicks InActive Customer page first customer plus button")
    public void clicksInActiveCustomerPageFirstCustomerPlusButton() {
        pages= new US_14_21_23_33();

        pages.SadminInactiveCustomerPlus.click();
        ReusableMethod.bekle(3);
    }
    @And("clicks InActive SELECT button")
    public void clicksInActiveSELECTButton() {
        pages= new US_14_21_23_33();

        pages.SadminInactiveCustomerSelect.click();
        ReusableMethod.bekle(3);
    }
    @Then("verify InActive DETAILS,EDIT,DELETE are visible")
    public void verifyInActiveDETAILSEDITDELETEAreVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminInactiveCustomerSelectBox.isDisplayed());
        ReusableMethod.bekle(3);
    }

    @Then("click CUSTOMER DELETE button")
    public void clickCUSTOMERDELETEButton() {
        pages= new US_14_21_23_33();

        pages.SadminInactiveCustomerDelete.click();
        ReusableMethod.bekle(3);
    }
    @Then("click DELETE box button")
    public void clickDELETEBoxButton() {
        pages= new US_14_21_23_33();

        pages.SadminInactiveCustomerDeleteLink.click();
        ReusableMethod.bekle(3);
        
    }

    @And("verify DELETE Successfully is visible")
    public void verifyDELETESuccessfullyIsVisible() {
      // BUG
    }

    @Then("clicks Create Customer")
    public void clicksCreateCustomer() {
        pages= new US_14_21_23_33();

        pages.SadminCreateCustomer.click();
        ReusableMethod.bekle(3);
        
    }

    @And("verify Create Customer List is visible")
    public void verifyCreateCustomerListIsVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminCreateCustomerPage.isDisplayed());
        ReusableMethod.bekle(3);
    }
    @Then("clicks Create Customer first customer plus button")
    public void clicksCreateCustomerFirstCustomerPlusButton() {
        pages= new US_14_21_23_33();

        pages.SadminCreateFirstCustomerPlus.click();
        ReusableMethod.bekle(3);
    }

    @And("clicks Create Customer page SELECT button")
    public void clicksCreateCustomerPageSELECTButton() {
        pages= new US_14_21_23_33();

        pages.SadminCreateFirstCustomerSelect.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify Create Customer page DETAILS,EDIT,DELETE are visible")
    public void verifyCreateCustomerPageDETAILSEDITDELETEAreVisible() {
        pages= new US_14_21_23_33();

        assertTrue(pages.SadminCreateFirstCustomerSelectBox.isDisplayed());
        ReusableMethod.bekle(3);
    }
}

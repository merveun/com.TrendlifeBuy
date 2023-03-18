package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US_2_35;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethod.logIn;

public class US_2_35_StepDef {

    US_2_35 pages;

    @Given("go to the {string}")
    public void go_to_the(String url) {
        getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("close the popup")
    public void close_the_popup() {
        pages = new US_2_35();
        ReusableMethod.waitForClickablility(pages.popupclose,5);
        pages.popupclose.click();
    }

    @Then("click on playstore button")
    public void click_on_playstore_button(){
        pages = new US_2_35();
        pages.playstoreButton.click();
    }

    @And("verify that the playstore link opens")
    public void verify_that_the_playstore_link_opens(){
        pages = new US_2_35();
        String expectedUrl="https://play.google.com/store/games";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("click on appstore button")
    public void click_on_appstore_button(){
        pages = new US_2_35();
        pages.appstoreButton.click();
    }

    @And("verify that the appstore link opens")
    public void verify_that_the_appstore_link_opens(){
        pages = new US_2_35();
        String expectedUrl="https://www.apple.com/app-store/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("close browser")
    public void closeBrowser() {
        pages = new US_2_35();
        Driver.closeDriver();
    }

    @Then("click on trackyourorder button")
    public void clickOnTrackyourorderButton() {
        pages = new US_2_35();
        pages.trackyourorderButton.click();
    }

    @And("verify that the trackyourorder link opens")
    public void verifyThatTheTrackyourorderLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/track-order";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("click on compare button")
    public void clickOnCompareButton() {
        pages = new US_2_35();
        pages.compareButton.click();
    }

    @And("verify that the compare link opens")
    public void verifyThatTheCompareLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/compare";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        
    }

    @Then("click on Wishlist button")
    public void clickOnWishlistButton() {
        pages = new US_2_35();
        pages.wishlistButton.click();
    }

    @And("verify that the Wishlist link opens")
    public void verifyThatTheWishlistLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/my-wishlist";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on cart button")
    public void clickOnCartButton() {
        pages = new US_2_35();
        pages.cartButton.click();
    }

    @And("verify that the cart link opens")
    public void verifyThatTheCartLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/cart";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on logo image")
    public void clickOnLogoImage() {
        pages = new US_2_35();
        pages.logo.click();
    }

    @And("verify that the homepage link opens")
    public void verifyThatTheHomepageLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("enter in the search box")
    public void enterInTheSearchBox() {
        pages = new US_2_35();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(pages.searchBox2).sendKeys(ConfigReader.getProperty("searchkey")).sendKeys(Keys.ENTER).perform();
    }

    @And("verify that visibility of search query text")
    public void verifyThatVisibilityOfProductAmount() {
        pages = new US_2_35();
        String expectedkeys= ConfigReader.getProperty("searchkey");
        String actualkeys= pages.searchQuery.getText();
        Assert.assertTrue(actualkeys.contains(expectedkeys));

    }

    @Then("click on login button")
    public void clickOnLoginButton() {
        pages = new US_2_35();
        ReusableMethod.waitForClickablility(pages.userloginButton,1);
        pages.userloginButton.click();

    }

    @And("verify that the login link opens")
    public void verifyThatTheLoginLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/login";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on register button")
    public void clickOnRegisterButton() {
        pages = new US_2_35();
        pages.registerButton.click();

    }

    @And("verify that the register link opens")
    public void verifyThatTheRegisterLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/register";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on home button")
    public void clickOnHomeButton() {
        pages = new US_2_35();
        pages.homeButton.click();

    }

    @And("verify that the home link opens")
    public void verifyThatTheHomeLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on blog button")
    public void clickOnBlogButton() {
        pages = new US_2_35();
        pages.blogButton.click();

    }

    @And("verify that the blog link opens")
    public void verifyThatTheBlogLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/blog";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on about us button")
    public void clickOnAboutUsButton() {
        pages = new US_2_35();
        pages.aboutusButton.click();
    }

    @And("verify that the about us link opens")
    public void verifyThatTheAboutUsLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/about-us";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on contact button")
    public void clickOnContactButton() {
        pages = new US_2_35();
        pages.contactButton.click();

    }

    @And("verify that the contact link opens")
    public void verifyThatTheContactLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/contact-us";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("click on New User Zone button")
    public void clickOnNewUserZoneButton() {
        pages = new US_2_35();
        pages.newuserzoneButton.click();

    }

    @And("verify that the New User Zone link opens")
    public void verifyThatTheNewUserZoneLinkOpens() {
        pages = new US_2_35();
        String expectedUrl="https://qa.trendlifebuy.com/new-user-zone/new-user-svnmy";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("login as a user")
    public void loginAsUser() {
        ReusableMethod.logIn("merveunal9444@gmail.com","2TnTELupi2J7bqQ");
    }


}

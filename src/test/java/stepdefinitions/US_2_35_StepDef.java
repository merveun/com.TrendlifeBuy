package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US_2_35;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import static org.junit.Assert.assertEquals;
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
        pages.searchBox2.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("laptop").sendKeys(Keys.ENTER).perform();
        //actions.click(pages.searchBox2).sendKeys(ConfigReader.getProperty("searchkey")).sendKeys(Keys.ENTER).perform();
    }

    @And("verify that visibility of search query text")
    public void verifyThatVisibilityOfProductAmount() {
        pages = new US_2_35();
        String expectedkeys= ConfigReader.getProperty("searchkey");
        String actualkeys= pages.searchQuery.getText().toLowerCase();
        System.out.println(actualkeys);
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


    @Then("login as a admin")
    public void loginAsAAdmin() {
        pages = new US_2_35();
        ReusableMethod.logIn("admin010@trendlifebuy.com","Trendlife123");
    }

    @Given("go to admin panel {string}")
    public void goToAdminPanel(String urlAdmin) {
        getDriver().get(ConfigReader.getProperty("urlAdmin"));
    }

    @Then("click on product button")
    public void clickOnProductButton() {
        pages = new US_2_35();
        pages.productButton.click();


    }

    @Then("click on product list button")
    public void clickOnProductListButton() {
        pages = new US_2_35();
        pages.productListButton.click();
    }

    @And("verify that the visibility of product list")
    public void verifyThatTheVisibilityOfProductList() {
        pages = new US_2_35();
        ReusableMethod.waitForVisibility(pages.productListText,2);
        Assert.assertTrue(pages.productListText.isDisplayed());
    }

    @And("verify that all product feature headings")
    public void verifyThatAllProductFeatureHeadings() {
        pages = new US_2_35();
        ReusableMethod.waitForVisibility(pages.NameText,2);
        assertTrue(pages.SlText.isDisplayed());
        assertTrue(pages.NameText.isDisplayed());
        assertTrue(pages.ProductTypeText.isDisplayed());
        assertTrue(pages.BrandText.isDisplayed());
        assertTrue(pages.ImageText.isDisplayed());
        assertTrue(pages.StockText.isDisplayed());
        assertTrue(pages.StatusText.isDisplayed());
    }

    @And("verify that all prdouct list buttons are displayed")
    public void verifyThatAllPrdouctListButtons() {
        pages = new US_2_35();
        ReusableMethod.waitForClickablility(pages.ProductListButton2,2);
        ReusableMethod.waitForVisibility(pages.productListHead,2);
        assertTrue(pages.ProductListButton2.isDisplayed());
        assertTrue(pages.AlertListButton2.isDisplayed());
        assertTrue(pages.OutOfStockListButton2.isDisplayed());
        assertTrue(pages.DisabledButton2.isDisplayed());
        assertTrue(pages.ProductSkuButton2.isDisplayed());
    }

    @And("verify that all prdouct list buttons go to the relevant page")
    public void verifyThatAllPrdouctListButtonsGoToTheRelevantPage() {
        pages = new US_2_35();
        //String productListPage = driver.getWindowHandle();
        pages.AlertListButton2.click();
        ReusableMethod.waitForVisibility(pages.alertListHead,1);
        String expectedpage = "Alert List";
        String actualpage  = pages.alertListHead.getText();
        Assert.assertEquals(actualpage,expectedpage);
        //driver.switchTo().window(productListPage);

        pages.ProductListButton2.click();
        ReusableMethod.waitForVisibility(pages.productListHead,1);
        String expectedpage1 = "Product List";
        String actualpage1 = pages.productListHead.getText();
        Assert.assertEquals(actualpage1,expectedpage1);


        pages.OutOfStockListButton2.click();
        ReusableMethod.waitForVisibility(pages.outofListHead,1);
        String expectedpage2 = "Out Of Stock List";
        String actualpage2 = pages.outofListHead.getText();
        Assert.assertEquals(actualpage2,expectedpage2);


        pages.DisabledButton2.click();
        ReusableMethod.waitForVisibility(pages.disabledListHead,1);
        String expectedpage3 = "Disabled Product List";
        String actualpage3 = pages.disabledListHead.getText();
        Assert.assertEquals(actualpage3,expectedpage3);


        pages.ProductSkuButton2.click();
        ReusableMethod.waitForVisibility(pages.skuListHead,1);
        String expectedpage4 = "Product By SKU";
        String actualpage4 = pages.skuListHead.getText();
        Assert.assertEquals(actualpage4,expectedpage4);

    }

    @Then("wait for searchbox is visible")
    public void waitForSearchboxIsVisible() {
        pages = new US_2_35();
        ReusableMethod.waitForVisibility(pages.quickSearch,1);
    }

    @Then("write on seearchbox keyword")
    public void writeOnSeearchboxKeyword() {
        pages = new US_2_35();
        pages.quickSearch.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("laptop").sendKeys(Keys.ENTER).perform();
        ReusableMethod.bekle(2);
    }

    @And("tests that search from the search bar")
    public void testsThatSearchFromTheSearchBar() {
        pages = new US_2_35();

        By totalentries2 = By.xpath("//div[@id='mainProductTable_info']");
        List<WebElement> myElements = driver.findElements(totalentries2);
        for(WebElement e : myElements) {
            System.out.println(e.getText());
        }
        Assert.assertTrue(totalentries2.toString().contains("entries"));
    }

    @Then("switch toggle and verify status chanching")
    public void switchToggle() {
        pages = new US_2_35();
        ReusableMethod.waitForVisibility(pages.togglecheckbox,1);
        pages.togglecheckbox.click();
        ReusableMethod.bekle(2);
        String actualAlert = driver.switchTo().alert().getText();
        String expectedAlert = "Updated successfully!";
        Assert.assertEquals(actualAlert,expectedAlert);

        //Assert.assertTrue(pages.successAlert.isDisplayed());
    }


    @Then("click on plus button")
    public void clickOnPlusButton() {
        pages = new US_2_35();
        ReusableMethod.waitForVisibility(pages.plus,2);
        pages.plus.click();

    }

    @Then("click on select button")
    public void clickOnSelectButton() {
        pages = new US_2_35();
        pages.selectplus.click();
        ReusableMethod.bekle(2);
    }

    @And("verify that view button is displayed")
    public void verifyThatViewButtonIsDisplayed() {
        pages = new US_2_35();
        Assert.assertTrue(pages.viewplus.isDisplayed());
    }

    @Then("click on view button")
    public void clickOnViewButton() {
        pages = new US_2_35();
        ReusableMethod.bekle(1);
        pages.viewplus.click();
    }

    @And("verify that product details is displayed")
    public void verifyThatProductDetailsIsDisplayed() {
        pages = new US_2_35();
        ReusableMethod.waitForVisibility(pages.viewdetails,2);
        Assert.assertTrue(pages.viewdetails.getText().contains("Details"));
    }


    @And("verify that edit button is displayed")
    public void verifyThatEditButtonIsDisplayed() {
        pages = new US_2_35();
        ReusableMethod.bekle(1);
        Assert.assertTrue(pages.editbutton.isDisplayed());
    }

    @Then("click on edit button")
    public void clickOnEditButton() {
        pages = new US_2_35();
        pages.editbutton.click();
    }

    @And("verify that edit button go to relevant page")
    public void verifyThatEditButtonGoToRelevantPage() {
        pages = new US_2_35();
        String expectedUrl = "https://trendlifebuy.com/products/1/edit";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @And("verify that clone button is displayed")
    public void verifyThatCloneButtonIsDisplayed() {
        pages = new US_2_35();
        Assert.assertTrue(pages.clonebutton.isDisplayed());
    }

    @Then("click on clone button")
    public void clickOnCloneButton() {
        pages = new US_2_35();
        pages.clonebutton.click();
        ReusableMethod.bekle(2);
    }

    @And("verify that clone button go to relevant page")
    public void verifyThatCloneButtonGoToRelevantPage() {
        pages = new US_2_35();
        String expecteddata = "https://trendlifebuy.com/products/1/clone";
        String actualdata = driver.getCurrentUrl();
        ReusableMethod.bekle(2);
        Assert.assertEquals(actualdata,expecteddata);
    }
}

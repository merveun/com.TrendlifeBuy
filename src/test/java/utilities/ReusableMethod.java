package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;
import pages.US_1_11_12_18_25_31_38;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

import static utilities.Driver.driver;

public class ReusableMethod {

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                bekle(1);
            }
        }
    }

    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });

        return element;

    }

    // Bir stringi sadece rakam olarak birakir ve integer'a cast eder.
    public static int onlyTakeNumberandParseInteger(String number) {
        return Integer.parseInt(number.replaceAll("\\D", ""));
    }


    // ScrollDown_End_Of_Page --> Murat
    public static void scrolldown() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    public static void scrolldown_600() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

    }
    public static void scrolldown_bypixel_2000() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");

    }


    public static void logIn(String userEmailAddress, String userPassword) {
        WebElement userEmailTextBox = driver.findElement(By.xpath("//input[@name='login']"));
        WebElement useremailTesxtBox = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement signInbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));
        userEmailTextBox.sendKeys(userEmailAddress);
        useremailTesxtBox.sendKeys(userPassword);
        ReusableMethod.waitToSee(1);
        signInbutton.click();
    }


    // Sayfa üzerinde istenilen elemente gider
    public static void focusToElement(WebElement element)
    {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(element);
    }

    public static void scrolldown_for_Load_More() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5500)");

    }

       public static void waitToSee(int second) {
               try {
                   Thread.sleep(second * 1000L);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }

          public static void signIn(String userEmailAddress, String userPassword){
               WebElement userEmailTextBox = driver.findElement(By.xpath("//input[@name='login']"));
               WebElement useremailTesxtBox = driver.findElement(By.xpath("//input[@name='password']"));
               WebElement signInbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));
               userEmailTextBox.sendKeys(userEmailAddress);
               useremailTesxtBox.sendKeys(userPassword);
               ReusableMethod.waitToSee(1);
               signInbutton.click();
           }


    public static void navigateback() {
        driver.navigate().back();
    }






































// ABDURRAHMAN LOGİN

    public static void loginTrendlife(String username,String password){

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        US_1_11_12_18_25_31_38 pages = new US_1_11_12_18_25_31_38();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        pages.PopupExitButon.click();
        pages.loginButon.click();
        pages.emailAddres.sendKeys(username);
        pages.password.sendKeys(password);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(3);

        pages.userSignin.click();

    }


    //ABDURRAHMAN ADMIN LOGIN

    public static void adminLoginTrendlife(String username,String password){

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        US_1_11_12_18_25_31_38 pages = new US_1_11_12_18_25_31_38();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        pages.adminEmailAddress.sendKeys(username);
        pages.adminPassword.sendKeys(password);
        ReusableMethod.bekle(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.adminSignIn.click();

    }






    public static Select select(WebElement ddm) {

        Select select;
        return select = new Select(ddm);
    }

    public static Random random() { //

        Random random;
        return random = new Random();
    }

    //Auto gun ay yil secim












    public static Faker getFaker() {

        Faker faker;
        return faker = new Faker();
    }

    public static Actions getActions() {

        Actions actions;
        return actions = new Actions(Driver.getDriver());
    }

        // Uyarı veren alertlerde ekran goruntusu alma
    public static String getScreenshotWebElement(String name, WebElement element) throws IOException {

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File source = element.getScreenshotAs(OutputType.FILE);
        // EKRAN GORUNTUSU NUN TAM YOLU
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + date + ".png";
        File finalDestination = new File(wElementSS);

        //EKRAN GORUNTUSU VERILEN YOLA KAYDEDER
        FileUtils.copyFile(source, finalDestination);
        return wElementSS;
    }

    // Its choose random item from requested menu which is in "add ticket page"
    public static void chooseItemFromMenuWhichIsInAddTicketPage(List<WebElement> listOfMenu,WebElement buttonOfMenu){
        waitForClickablility(buttonOfMenu,5);
        Random random = new Random();
        int index = random.nextInt(1,5);
        buttonOfMenu.click();
        Actions actions = new Actions(Driver.getDriver());
        waitForClickablility(listOfMenu.get(index),5);
        listOfMenu.get(index).click();
    }

    public static void verifyAllItemsAreClickable(List<WebElement> listOfMenu,WebElement buttonOfMenu,WebElement currentText) throws InterruptedException {
        buttonOfMenu.click();
        for (WebElement each : listOfMenu)
        {
            String actualText=each.getText();
            try{
                each.click();
            }
            catch (Exception e)
            {
                waitForClickablility(each,5);
                each.click();
            }
            Thread.sleep(500);
            Assert.assertEquals(actualText,currentText.getText());
            buttonOfMenu.click();
            waitForClickablility(each,5);
        }
    }


































    //--- EXPECTED URL OF LINKSS
    public static String purchaseHistoryPageUrl(String expectedUrl) {
        String purchaseHistoryPageUrl = "https://qa.trendlifebuy.com/my-purchase-histories";
        return purchaseHistoryPageUrl;
    }

    public static String myWishlistPageUrl(String expectedUrl) {
        String myWishlistPageUrl = "https://qa.trendlifebuy.com/my-wishlist";
        return myWishlistPageUrl;
    }

    public static String myOrderPageUrl(String expectedUrl) {
        String myOrderPageUrl = "https://qa.trendlifebuy.com/my-purchase-orders";
        return myOrderPageUrl;
    }

    public static String giftPageUrl(String expectedUrl) {
        String giftPageUrl = "https://qa.trendlifebuy.com/purchased-gift-cards";
        return giftPageUrl;
    }

    public static String myWalletPageUrl(String expectedUrl) {
        String myWalletPageUrl = "https://qa.trendlifebuy.com/wallet/customer/my-wallet-index";
        return myWalletPageUrl;
    }

    public static String myCouponsPageUrl(String expectedUrl) {
        String myCouponsPageUrl = "https://qa.trendlifebuy.com/profile/coupons";
        return myCouponsPageUrl;
    }

    public static String refundDisputePageUrl(String expectedUrl) {
        String refundDisputePageUrl = "https://qa.trendlifebuy.com/refund/my-refund-list";
        return refundDisputePageUrl;
    }

    public static String myAccountPageUrl(String expectedUrl) {
        String myAccountPageUrl = "https://qa.trendlifebuy.com/profile";
        return myAccountPageUrl;
    }

    public static String digitalProductsPageUrl(String expectedUrl) {
        String digitalProductsPageUrl = "https://qa.trendlifebuy.com/digital-products";
        return digitalProductsPageUrl;
    }

    public static String referralPageUrl(String expectedUrl) {
        String referralPageUrl = "https://qa.trendlifebuy.com/profile/referral";
        return referralPageUrl;
    }

    public static String supportTicketPageUrl(String expectedUrl) {
        String supportTicketPageUrl = "https://qa.trendlifebuy.com/support-ticket";
        return supportTicketPageUrl;
    }

    public static String notificationPageUrl(String expectedUrl) {
        String notificationPageUrl = "https://qa.trendlifebuy.com/profile/notifications";
        return notificationPageUrl;
    }
    public static String notificationView_PageUrl(String expectedUrl) {
        String notificationView_PageUrl = "https://qa.trendlifebuy.com/my-purchase-order-details/";
        return notificationView_PageUrl;
    }


    public static String notificationSetting_PageUrl(String expectedUrl) {
        String notificationSetting_PageUrl = "https://qa.trendlifebuy.com/profile/notification_setting";
        return notificationSetting_PageUrl;
    }


    // ScrollDown_End_Of_Page --> Murat

    public static void scrolldown_DownViewAll() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }


    public static void scrolldown_SideBarMenu() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }


    public static void scrolldown_NotificationsSettingMenu() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }




}


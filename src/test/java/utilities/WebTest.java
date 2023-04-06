package utilities;

import org.openqa.selenium.WebDriver;

public class WebTest {
    WebDriver driver = null;
    BasePageWeb basePage;
    public String browser;


    @Parameters({ "Browser" })
    public WebTest(String browser) {
        this.browser = browser;
    }


    @BeforeClass
    public void navigateToUrl() {
        switch (browser) {

            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "FF":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                driver = null;
                break;
        }
        driver.get("https://demosite.executeautomation.com/Login.html");

    }

    @Test
    public void loginToWebApp() {

        basePage = new BasePageWeb(driver);
        basePage.enterUsername("admin")
                .enterPassword("admin")
                .clickLoginButton();

        driver.quit();
    }
}

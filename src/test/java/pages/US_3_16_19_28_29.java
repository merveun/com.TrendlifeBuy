package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_3_16_19_28_29 {

        public US_3_16_19_28_29() {

            PageFactory.initElements(Driver.getDriver(),this);
        }

    // US_003 ait locate'ler

    //HomePage>Login
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement HomePageLogin;









    }


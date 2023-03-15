package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1_11_12_18_25_31_38 {

    public US_1_11_12_18_25_31_38() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // url > Subscribe pop-up exit butonu
    @FindBy(css ="#subscriptionModal > div > div.close_modal > i")
    public WebElement subscribePopupExit;



}

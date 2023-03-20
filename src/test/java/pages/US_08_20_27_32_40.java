package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_20_27_32_40 {

    public US_08_20_27_32_40() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "xpath = //input[@id='text']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(id = "sign_in_btn")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Support Ticket'][1]")
    public WebElement supportTicketButton;

    @FindBy(xpath = "//*[text()='My Tickets']")
    public WebElement myTicketsButton;

    @FindBy(xpath = "//*[text()='Ticket List']")
    public WebElement ticketListText;

}

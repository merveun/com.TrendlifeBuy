package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_22_26 {
    public US_22_26() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    // url > Subscribe
    @FindBy(xpath ="//div[@class='newsletter_form_inner']//i[@class='ti-close']")
    public WebElement subscribeclose;

    @FindBy(xpath = "//span/a[text()='Login']")
    public WebElement Loginlink;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement usarnamemail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//div/button[contains(text(),'Sign')]")
    public WebElement signinbutton;

    @FindBy(xpath = "//span/a[text()='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath= "(//a[@class='position-relative d-flex align-items-center'])[7]")
    public WebElement myaccount;

    @FindBy(xpath = "//*[@id='file']")
    public WebElement choose;

    @FindBy(xpath = "//div[@class='profile_white_box bg-white']")
    public WebElement dashboradmenu;


    @FindBy(xpath="(//button[@class='amaz_primary_btn style2 rounded-0  text-uppercase  text-center min_200'])[1]")
    public WebElement updateclick;

    @FindBy(xpath = "//*[@id='Info-tab']")
    public WebElement Basicinfo;

    @FindBy(xpath="//*[@id='Address-tab']")
    public WebElement Adress;

    @FindBy(xpath="//*[@id='first_name']")
    public WebElement firsname;

    @FindBy(xpath="//*[@id='last_name']")
    public WebElement lastname;

    @FindBy(xpath="//*[@id='email']")
    public WebElement email;

    @FindBy(xpath="//*[@id='phone']")
    public WebElement phonenumber;

    @FindBy(xpath="//*[@id='start_datepicker']")
    public WebElement dateBirth;

    @FindBy(xpath="//*[@id='textarea']")
    public WebElement Description;

    @FindBy(xpath="//*[@id='toast-container']/div[1]")
    public WebElement UpdateMesaage;

    @FindBy(xpath="//*[@id='toast-container']/div[1]/div[2]")
    public WebElement UpdateMesaageresim;

    @FindBy(xpath="//*[@id='ui-datepicker-div']/table[1]/tbody[1]/tr[5]/td[4]/a[1]")
    public WebElement yearclik;

    @FindBy(xpath="//*[@id='Password-tab']")
    public WebElement changepasword;

    @FindBy(xpath="//*[@id='currentPassword']")
    public WebElement currentpassword;

    @FindBy(xpath="//*[@id='newPass']")
    public WebElement newpassword;

    @FindBy(xpath="//*[@id='rePass' ]")
    public WebElement repassword;

    @FindBy(xpath="//*[@id='update_pass']/div[1]/div[4]/button[1]")
    public WebElement passwordupdate;

    @FindBy(xpath="//*[@id='toast-container']/div[1]/div[2]")
    public WebElement passwordupdatemessage;

    @FindBy(className = "table.amazy_table")
    public WebElement adrestable;

    @FindBy(xpath = "//button[@class='amazy_status_btn edit_address']")
    public WebElement adresedit;

    @FindBy(xpath = "//button[normalize-space()='Update']")
    public WebElement adreseditupdate;

    @FindBy(xpath="//input[@id='address_name_edit']")
    public WebElement adreseditname;

    @FindBy(css= "#Email_Address_edit")
    public WebElement adreseditemail;

    @FindBy(css= "#customer_phn_edit")
    public WebElement adreseditphone;

    @FindBy(xpath= "(//*[text()='Select from options'])[16]")
    public WebElement adreseditcountry;

    @FindBy(xpath = "(//*[text()='Select from options'])[15]")
    public WebElement adreseditstate;

    @FindBy(xpath = "(//*[text()='Select from options'])[17]")
    public WebElement adreseditcity;

    @FindBy(xpath = "//*[@id='postal_code_edit']")
    public WebElement adreseditpostacode;

    @FindBy(xpath = "//*[@id='address_edit']")
    public WebElement adreseditstreet;//*[@id="toast-container"]/div[1]/div[2]


    @FindBy(xpath = "//*[@id='toast-container']/div[1]/div[2]")
    public WebElement adreseditupdatemessage;

    @FindBy(xpath = "//*[@id='address_form_edit']/div[1]/div[1]/button[1]/i[1]")
    public WebElement adreseditexit;

    @FindBy(xpath = "//a[@class='add_new_address amaz_primary_btn style2 rounded-0 text-uppercase text-center min_200']")
    public WebElement adresnew;

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement adresnewcreate;

    @FindBy(xpath = "//label[2]//span[1]")
    public WebElement billingadresradio;//input[@id='address_name']

    @FindBy(xpath = "//input[@id='address_name']")
    public WebElement adadresname;

    @FindBy(xpath = "//input[@id='Email_Address1']")
    public WebElement adadresemail;

    @FindBy(xpath = "//input[@id='customer_phn']")
    public WebElement adadresphone;

    @FindBy(xpath="(//*[text()='United States'])[2]")
    public WebElement adadrescountry;

    @FindBy(xpath="(//*[@class='nice-select-search'])[3]")
    public WebElement ulkeIsmiYaz;

    @FindBy(xpath="(//*[text()='Turkey'])[2]")
    public WebElement countryTurkey;




    @FindBy(xpath = "(//*[text()='Select from options'])[3]")
    public WebElement adadresstade;

    @FindBy(xpath="(//*[@class='nice-select-search'])[4]")
    public WebElement sehirIsmiYaz;

    @FindBy(xpath="(//*[text()='Adana'])[2]")
    public WebElement stadeadana;


    @FindBy(xpath = "(//*[text()='Select from options'])[4]")
    public WebElement adadresscity;

    @FindBy(xpath="(//*[@class='nice-select-search'])[4]")
    public WebElement cityIsmiYaz;

    @FindBy(xpath="(//*[text()='Ceyhan'])[2]")
    public WebElement cityceyhan;

    @FindBy(xpath="//*[@id='postal_code']")
    public WebElement adadresspostacode;

    @FindBy(xpath="//*[@id='address']")
    public WebElement adadressstreedadres;

    @FindBy(xpath="//*[@id='address_form']/div[1]/div[3]/div[9]/button[1]")
    public WebElement adadrescreatebuton;

    @FindBy(xpath="//*[@id='toast-container']/div[1]/div[2]")
    public WebElement adadressstreedadresmessage;

}

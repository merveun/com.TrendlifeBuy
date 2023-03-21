package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.US_08_20_27_32_40;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class US_08_20_27_32_40_StepDef {
    US_08_20_27_32_40 ypages = new US_08_20_27_32_40();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

//=================================================40================================================================
    @Given("Kullanici {string} sayfasina giris yaparak login sayfasini acar.")
    public void kullanici_sayfasina_giris_yaparak_login_sayfasini_acar(String admin) {
        Driver.getDriver().get(ConfigReader.getProperty(admin));
    }

    @Then("Gecerli email adresini mail textboxina girer")
    public void gecerliEmailAdresiniMailTextboxinaGirer() {
        ypages.yadminEmailTextBox.sendKeys("admin129@trendlifebuy.com");
    }

    @Then("Gecerli Passwordu password textboxina  girer")
    public void gecerliPassworduPasswordTextboxinaGirer() {

        ypages.yadminPasswordTextBox.sendKeys("Trendlife123");
    }
   /* @Then("Gecerli email adresini mail textboxina {string} girer")
    public void gecerli_email_adresini_mail_textboxina_girer(String mail) {
        ypages=new US_08_20_27_32_40();
        ypages.yadminEmailTextBox.sendKeys(ConfigReader.getProperty(mail));
    }*/
    /*@Then("Gecerli Passwordu password textboxina {string} girer")
    public void gecerli_passwordu_password_textboxina_girer(String password) {
        ypages.yadminPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
    }*/
    @Then("Sign in butonu tiklaniry.")
    public void sign_in_butonu_tiklaniry() {
        ypages.yadminSignInButton.click();
    }

    @Then("Category dropdown i tiklanir.")
    public void categoryDropdownITiklanir() throws InterruptedException {
        ypages.categoryDropDownList.click();
        Thread.sleep(2000);

    }



    @And("Select One, Installation,Technical, Others seceneklerinin gorunur oldugu dogrulanir")
    public void selectOneInstallationTechnicalOthersSeceneklerininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.selectOneOption.isDisplayed());
        Assert.assertTrue(ypages.installationOption.isDisplayed());
        Assert.assertTrue(ypages.technicalOption.isDisplayed());
        Assert.assertTrue(ypages.othersOption.isDisplayed());
    }

    @And("Select One, Installation,Technical, Others secilebilir oldugu dogrulanmali")
    public void selectOneInstallationTechnicalOthersSecilebilirOlduguDogrulanmali() throws InterruptedException {
        ypages.installationOption.click();
        Thread.sleep(1000);
        ypages.categoryDropDownList.click();
        Thread.sleep(1000);
        ypages.technicalOption.click();
        Thread.sleep(1000);
        ypages.categoryDropDownList.click();
        Thread.sleep(1000);
        ypages.othersOption.click();
        Thread.sleep(1000);
        ypages.categoryDropDownList.click();
        Thread.sleep(1000);
        ypages.selectOneOption.click();
        Thread.sleep(1000);
    }

    @Then("Priority dropdown i tiklanir.")
    public void priorityDropdownITiklanir() {

        ypages.priorityDropdownList.click();

    }

    @And("Select One, High, Medium, Low seceneklerinin gorunur oldugu dogrulanir")
    public void selectOneHighMediumLowSeceneklerininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.selectOnePriorityOption.isDisplayed());
        Assert.assertTrue(ypages.highOption.isDisplayed());
        Assert.assertTrue(ypages.mediumOption.isDisplayed());
        Assert.assertTrue(ypages.lowOption.isDisplayed());
    }

    @And("Select One, High, Medium, Low secilebilir oldugu dogrulanmali")
    public void selectOneHighMediumLowSecilebilirOlduguDogrulanmali() throws InterruptedException {
        ypages.highOption.click();
        Thread.sleep(1000);
        ypages.priorityDropdownList.click();
        Thread.sleep(1000);
        ypages.mediumOption.click();
        Thread.sleep(1000);
        ypages.priorityDropdownList.click();
        Thread.sleep(1000);
        ypages.lowOption.click();
        Thread.sleep(1000);
        ypages.priorityDropdownList.click();
        Thread.sleep(1000);
        ypages.selectOnePriorityOption.click();
        Thread.sleep(1000);
    }

    @Then("Status dropdown i tiklanir.")
    public void statusDropdownITiklanir() {

        ypages.statusDropdown.click();
    }

    @And("Select One, Pending, On Going, Completed, Closed seceneklerinin gorunur oldugu dogrulanir")
    public void selectOnePendingOnGoingCompletedClosedSeceneklerininGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(ypages.selectOneStatusOption.isDisplayed());
        Assert.assertTrue(ypages.completedOption.isDisplayed());
        Assert.assertTrue(ypages.ongoingOption.isDisplayed());
        Assert.assertTrue(ypages.closedOption.isDisplayed());
        Assert.assertTrue(ypages.pendingOption.isDisplayed());

    }

    @And("Select One, Pending, On Going, Completed, Closed secilebilir oldugu dogrulanmali")
    public void selectOnePendingOnGoingCompletedClosedSecilebilirOlduguDogrulanmali() throws InterruptedException {
        ypages.pendingOption.click();
        Thread.sleep(1000);
        ypages.statusDropdown.click();
        Thread.sleep(1000);
        ypages.completedOption.click();
        Thread.sleep(1000);
        ypages.statusDropdown.click();
        Thread.sleep(1000);
        ypages.ongoingOption.click();
        Thread.sleep(1000);
        ypages.statusDropdown.click();
        Thread.sleep(1000);
        ypages.closedOption.click();
        Thread.sleep(1000);
        ypages.statusDropdown.click();
        Thread.sleep(1000);
        ypages.selectOneStatusOption.click();
        Thread.sleep(1000);


    }

    @Then("Installation secenegi secilir")
    public void installationSecenegiSecilir() throws InterruptedException {
        ypages.installationOption.click();
        Thread.sleep(1000);
    }

    @Then("High secenegi secilir")
    public void highSecenegiSecilir() throws InterruptedException {
        ypages.highOption.click();
        Thread.sleep(1000);
    }

    @Then("Pending secenegi secilir")
    public void pendingSecenegiSecilir() throws InterruptedException {
        ypages.pendingOption.click();
        Thread.sleep(1000);
    }

    @And("Search butonu tiklanir.")
    public void searchButonuTiklanir() throws InterruptedException {
        ypages.searchButton.click();
        Thread.sleep(1000);
    }

    @Then("Ticket list de ticket goruldugu dogrulanir.")
    public void ticketListDeTicketGorulduguDogrulanir() {
        String exp="Admin129";
        String act =ypages.userAgentText.getText();
        Assert.assertTrue(act.contains(exp));
    }

    @Then("Subject, Category, User Name, priority, User Agent, Status, Agent Asign, Action basliklari altinda listelendigi dogrulanir")
    public void subjectCategoryUserNamePriorityUserAgentStatusAgentAsignActionBasliklariAltindaListelendigiDogrulanir() {
        Assert.assertTrue(ypages.subjectText.isDisplayed());
        Assert.assertTrue(ypages.categoryText.isDisplayed());
        Assert.assertTrue(ypages.userNameText.isDisplayed());
        Assert.assertTrue(ypages.priorityText.isDisplayed());
        Assert.assertTrue(ypages.userAgenttText.isDisplayed());
        Assert.assertTrue(ypages.statusText.isDisplayed());
        Assert.assertTrue(ypages.actionText.isDisplayed());

    }






    //===================================================32========================================================


    @Then("Dashboard Side Bar'da Dashboard menu basligini gorulmeli")
    public void dashboardSideBarDaDashboardMenuBasliginiGorulmeli() {
        Assert.assertTrue(ypages.dashboardText.isDisplayed());
    }

    @Then("Dashboard menu butonu tiklanir.")
    public void dashboardMenuButonuTiklanir() {
        ypages.adminDashboardButton.click();
    }

    @And("Admin-dashboard sayfasına yonlendirdigi dogrulanir.")
    public void adminDashboardSayfasınaYonlendirdigiDogrulanir() {
        String exp="Summary";
        String act = ypages.summaryText.getText();
        Assert.assertTrue(act.equals(exp));
    }

    @Then("User Manages kategorisinin gorunur oldugu dogrulanir")
    public void userManagesKategorisininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.userManagesText.isDisplayed());
    }

    @Then("Customer butonu tiklanir.")
    public void customerButonuTiklanir() throws InterruptedException {
        ypages.customerButton.click();
        Thread.sleep(2000);
    }

    @Then("All customer butonunun gorulmesi beklenir.")
    public void allCustomerButonununGorulmesiBeklenir() {
        Assert.assertTrue(ypages.allCustomerButton.isDisplayed());
    }

    @Then("Customer butonu tekrar tiklanir")
    public void customerButonuTekrarTiklanir() throws InterruptedException {
        ypages.customerButton.click();
        Thread.sleep(2000);
    }

    @Then("Menunun kapandıgı dogrulanir.")
    public void menununKapandıgıDogrulanir() {
        Assert.assertFalse(ypages.allCustomerButton.isDisplayed());
    }

    @Then("Human Resource butonu tiklanir")
    public void humanResourceButonuTiklanir() throws InterruptedException {
        ypages.humanResourceButton.click();
        Thread.sleep(2000);
    }

    @Then("Staff butonunun goruldugu dogrulanir")
    public void staffButonununGorulduguDogrulanir() {
        Assert.assertTrue(ypages.staffButton.isDisplayed());
    }

    @Then("Human  Resource butonu tekrar tiklanir")
    public void humanResourceButonuTekrarTiklanir() throws InterruptedException {
        ypages.humanResourceButton.click();
        Thread.sleep(1000);
    }

    @And("Human resource menusunun kapandigi dogrulanir.")
    public void humanResourceMenusununKapandigiDogrulanir() {
        Assert.assertFalse(ypages.staffButton.isDisplayed());
    }

    @Then("Order Manages kategorisinin gorunur oldugu dogrulanir.")
    public void orderManagesKategorisininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.orderManagesText.isDisplayed());
    }

    @Then("Order Manage butonu tiklanir.")
    public void orderManageButonuTiklanir() throws InterruptedException {
        ypages.orderManagesButton.click();
        Thread.sleep(1000);
    }

    @Then("Menusunun acilarak Total order in goruldugu dogrulanir.")
    public void menusununAcilarakTotalOrderInGorulduguDogrulanir() {
        Assert.assertTrue(ypages.totalOrderButton.isDisplayed());
    }

    @Then("Order manage butonu tekrar tiklanir.")
    public void orderManageButonuTekrarTiklanir() throws InterruptedException {
        ypages.orderManagesButton.click();
        Thread.sleep(1000);
    }

    @Then("Menunun kapandigi Total order in gorulmedigi dogrulanir.")
    public void menununKapandigiTotalOrderInGorulmedigiDogrulanir() {
        Assert.assertFalse(ypages.totalOrderButton.isDisplayed());
    }

    @Then("Product Manage kategorisinin gorunur oldugu dogrulanir.")
    public void productManageKategorisininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.productManageText.isDisplayed());
    }

    @Then("Product Manage butonu tiklanir.")
    public void productManageButonuTiklanir() throws InterruptedException {
        ypages.productsButton.click();
        Thread.sleep(1000);
    }

    @Then("Product Manage menusunun acilarak Product List in goruldugu dogrulanir.")
    public void productManageMenusununAcilarakProductListInGorulduguDogrulanir() {
        Assert.assertTrue(ypages.productListButton.isDisplayed());
    }

    @Then("Product Manage butonu tekrar tiklanir.")
    public void productManageButonuTekrarTiklanir() throws InterruptedException {
        ypages.productsButton.click();
        Thread.sleep(1000);
    }

    @Then("Menunun kapandigi Product List in gorulmedigi dogrulanir.")
    public void menununKapandigiProductListInGorulmedigiDogrulanir() {
        Assert.assertFalse(ypages.productListButton.isDisplayed());
    }

    @Then("Promotional kategorisinin gorunur oldugu dogrulanir")
    public void promotionalKategorisininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.promotionalText.isDisplayed());
    }

    @Then("Marketing butonu tiklanir.")
    public void marketingButonuTiklanir() throws InterruptedException {
        ypages.marketingButton.click();
        Thread.sleep(1000);
    }

    @Then("New User Zone Button butonunun gorulmesi beklenir.")
    public void newUserZoneButtonButonununGorulmesiBeklenir() {
        Assert.assertTrue(ypages.newUsereZoneButton.isDisplayed());
    }

    @Then("Marketing butonu tekrar tiklanir")
    public void marketingButonuTekrarTiklanir() throws InterruptedException {
        ypages.marketingButton.click();
        Thread.sleep(1000);
    }

    @Then("Marketing menunun kapandigi dogrulanir.")
    public void marketingMenununKapandigiDogrulanir() {
        Assert.assertFalse(ypages.newUsereZoneButton.isDisplayed());
    }

    @Then("Gift Card butonu tiklanir")
    public void giftCardButonuTiklanir() throws InterruptedException {
        ypages.giftCardButton.click();
        Thread.sleep(1000);
    }

    @Then("Gift Card List butonunun goruldugu dogrulanir")
    public void giftCardListButonununGorulduguDogrulanir() {
        Assert.assertTrue(ypages.giftCardListButton.isDisplayed());
    }

    @Then("Gift Card butonu tekrar tiklanir")
    public void giftCardButonuTekrarTiklanir() throws InterruptedException {
        ypages.giftCardButton.click();
        Thread.sleep(1000);
    }

    @And("Gift Card menusunun kapandigi dogrulanir.")
    public void giftCardMenusununKapandigiDogrulanir() {
        Assert.assertFalse(ypages.giftCardListButton.isDisplayed());
    }

    @Then("Finance kategorisinin gorunur oldugu dogrulanir.")
    public void financeKategorisininGorunurOlduguDogrulanir() {
        Assert.assertTrue(ypages.financeText.isDisplayed());
    }

    @Then("Account butonu tiklanir.")
    public void accountButonuTiklanir() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)", "");
        ypages.accountButton.click();
        Thread.sleep(1000);
    }

    @Then("Account menusunun acilarak Income in goruldugu dogrulanir.")
    public void accountMenusununAcilarakIncomeInGorulduguDogrulanir() {
        Assert.assertTrue(ypages.incomeButton.isDisplayed());
    }

    @Then("Account butonu tekrar tiklanir.")
    public void accountButonuTekrarTiklanir() throws InterruptedException {
        ypages.accountButton.click();
        Thread.sleep(1000);
    }

    @Then("Menunun kapandigi Income in gorulmedigi dogrulanir.")
    public void menununKapandigiIncomeInGorulmedigiDogrulanir() {
        Assert.assertFalse(ypages.incomeButton.isDisplayed());
    }

    @Then("Content kategorisinin gorunur oldugu dogrulanir.")
    public void contentKategorisininGorunurOlduguDogrulanir() {
        js.executeScript("window.scrollBy(0,500)", "");
        Assert.assertTrue(ypages.contentText.isDisplayed());
    }

    @Then("Admin Reports butonu tiklanir.")
    public void adminReportsButonuTiklanir() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)", "");
        ypages.adminReportButton.click();
        Thread.sleep(1000);
    }

    @Then("Visitor  butonunun gorulmesi beklenir.")
    public void visitorButonununGorulmesiBeklenir() {
        Assert.assertTrue(ypages.visitorButton.isDisplayed());
    }

    @Then("Admin Reports butonu tekrar tiklanir")
    public void adminReportsButonuTekrarTiklanir() throws InterruptedException {
        ypages.adminReportButton.click();
        Thread.sleep(1000);
    }

    @Then("Admin Reports menunun kapandigi dogrulanir.")
    public void adminReportsMenununKapandigiDogrulanir() {
        Assert.assertFalse(ypages.visitorButton.isDisplayed());
    }

    @Then("Support Ticket butonu tiklanir")
    public void supportTicketButonuTiklanir() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)", "");
        ypages.supportTicketButton.click();
ReusableMethod.bekle(2000);    }

    @Then("Status butonunun goruldugu dogrulanir")
    public void statusButonununGorulduguDogrulanir() {

        Assert.assertTrue(ypages.statusButton.isDisplayed());
    }

    @Then("Support Ticket butonu tekrar tiklanir")
    public void supportTicketButonuTekrarTiklanir() throws InterruptedException {
        ypages.supportTicketButton.click();
        ReusableMethod.bekle(2000);
    }

    @And("Support Ticket menusunun kapandigi dogrulanir.")
    public void supportTicketMenusununKapandigiDogrulanir() {

        Assert.assertFalse(ypages.statusButton.isDisplayed());
    }

    @Then("Gecerli email adresi giriliry.")
    public void gecerliEmailAdresiGiriliry() {
        ypages.yadminEmailTextBox.sendKeys("user129@trendlifebuy.com");
    }

    @Then("Uygulamaya giris yaptigini dogrular.")
    public void uygulamayaGirisYaptiginiDogrular() {
        Assert.assertTrue(ypages.dashboardButton.isDisplayed());
    }

    @And("Track your order butonu tıklanir.")
    public void trackYourOrderButonuTıklanir() {
    ypages.trackYourOrderButton.click();
    }

    @Then("Order Tracking Number textboxa girilir.")
    public void orderTrackingNumberTextboxaGirilir() {
        ypages.orderTrackingNumberTextbox.sendKeys("48230308065436");
    }

    @And("Track Now butonu tiklanir.")
    public void trackNowButonuTiklanir() {
        ypages.trackNowButton.click();

    }

    @Then("Siparis takip sayfasinin açildigi dogrulanir.")
    public void siparisTakipSayfasininAçildigiDogrulanir() {

        Assert.assertTrue(ypages.orderID.isDisplayed());

    }

    @Then("Dashboard butonuna tiklaniry.")
    public void dashboardButonunaTiklaniry() {
        ypages.dashboardButton.click();
    }

    @And("My coupons butonu tiklaniry.")
    public void myCouponsButonuTiklaniry() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        ypages.myCouponsLink.click();
    }



//=======================================================20========================================================

    @Then("My Coupons sayfasinin acildigi dogrulanir")
    public void myCouponsSayfasininAcildigiDogrulanir() {

        Assert.assertTrue(ypages.addCouponsText.isDisplayed());

    }

    @Then("Code textboxina kupon girisi yapilir")
    public void codeTextboxinaKuponGirisiYapilir() {
        ypages.codeTextbox.sendKeys("Coupon129");
    }

    @Then("Add Coupon butonu tıklanir")
    public void addCouponButonuTiklanir() {
        ypages.addCouponButton.click();
    }

    @And("Kuponun listeye eklendigi dogrulanir.")
    public void kuponunListeyeEklendigiDogrulanir() throws InterruptedException {
        Assert.assertTrue(ypages.coupon129Text.isDisplayed());
        Thread.sleep(2000);
        ypages.deleteButton.click();
        ypages.deletePopupButton.click();
    }
}

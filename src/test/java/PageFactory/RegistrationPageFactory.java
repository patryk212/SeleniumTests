package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageFactory {

     private WebDriver driver;


     @FindBy(id = "id_gender1")
     private WebElement selectButtonTitleMr;

    @FindBy(id = "id_gender2")
     private WebElement selectButtonTitleMrs;

    @FindBy(id = "name")
     private WebElement accountName;

    @FindBy(id = "password")
     private WebElement accountPassword;

    @FindBy(id = "days")
     private WebElement selectDayOfBirth;

    @FindBy(id = "months")
     private WebElement selectMonthOfBirth;

    @FindBy(id = "years")
     private WebElement selectYearOfBirth;

    @FindBy(id = "newsletter")
    private WebElement signUpForOurNewsletter;

    @FindBy(id = "optin")
    private WebElement receiveSpecialOffers;

    @FindBy(id = "first_name")
    private WebElement enterFirstName;

    @FindBy(id = "last_name")
    private WebElement enterLastName;

    @FindBy(id = "company")
    private WebElement optionalEnterCompanyName;

    @FindBy(id = "address1")
    private WebElement enterAddress;

    @FindBy(id = "address2")
    private WebElement optionalAddress2;

    @FindBy(id = "country")
    private WebElement selectCountry;

    @FindBy(id = "state")
    private WebElement enterState;

    @FindBy(id = "city")
    private WebElement enterCity;

    @FindBy(id = "zipcode")
    private WebElement enterZipCode;

    @FindBy(id = "mobile_number")
    private WebElement enterMobileNumber;

    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    private WebElement accountCreatedTextVisible;

    @FindBy(css = ".btn.btn-primary")
    private WebElement continueButtonAfterRegister;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    private WebElement accountDeletedVisible;

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    private WebElement enterAccountInformationIsVisible;






    public RegistrationPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void selectButtonTitleMr() {
        selectButtonTitleMr.click();
    }

    public void selectButtonTitleMrs() {
        selectButtonTitleMrs.click();
    }

    public void  accountName(String name) {
       accountName.sendKeys(name);
    }

    public void fieldPassword(String password) {
        accountPassword.sendKeys(password);
    }

    public void selectDayOfBirth(String day) {
        selectDayOfBirth.sendKeys(day);
    }

    public void selectMonthOfBirth(String month) {
        selectMonthOfBirth.sendKeys(month);
    }

    public void  selectYearOfBirth(String year) {
        selectYearOfBirth.sendKeys(year);
    }

    public void signUpForOurNewsletter() {
        signUpForOurNewsletter.click();
    }

    public void receiveSpecialOffers() {
        receiveSpecialOffers.click();
    }

    public void enterFirstName(String firstName) {
        enterFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        enterLastName.sendKeys(lastName);
    }

    public void optionalEnterCompanyName(String company) {
        optionalEnterCompanyName.sendKeys(company);
    }

    public void enterAddress(String address) {
        enterAddress.sendKeys(address);
    }

    public void optionalAddress2(String address) {
        optionalAddress2.sendKeys(address);
    }

    public void selectCountry(String country) {
        selectCountry.sendKeys(country);
    }

    public void enterState(String state) {
        enterState.sendKeys(state);
    }

    public void enterCity(String city) {
        enterCity.sendKeys(city);
    }

    public void enterZipCode(String zipcode) {
        enterZipCode.sendKeys(zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        enterMobileNumber.sendKeys(mobileNumber);
    }

    public void createAccountButton() {
        createAccountButton.click();
    }

    public boolean accountCreatedTextVisible() {
      return accountCreatedTextVisible.isDisplayed();
    }

    public void continueButtonAfterRegister() {
        continueButtonAfterRegister.click();
    }

    public boolean accountDeletedVisible() {
        return accountDeletedVisible.isDisplayed();
    }

    public boolean enterAccountInformationIsVisible(){
        return enterAccountInformationIsVisible.isDisplayed();
    }


}



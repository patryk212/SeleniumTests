package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class RegistrationPage {
    private Properties loc = new Properties();

    private WebDriver driver;
    private WebDriverWait wait;


    public RegistrationPage(WebDriver driver) throws IOException {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        locators();

    }



    public void locators() throws IOException {
        String locatorsFilePath = System.getProperty("user.dir") + "/locators.properties";
        FileInputStream locatorsStream = new FileInputStream(locatorsFilePath);
        loc.load(locatorsStream);
    }

    public boolean enterAccountInformationIsVisible(){
    By enterAccountInformationText = By.xpath("//b[normalize-space()='Enter Account Information']");
    return driver.findElement(enterAccountInformationText).isDisplayed();
    }

    public void radioTitleMr(){
        By titleMr = By.id("id_gender1");
        driver.findElement(titleMr).click();
    }

    public void radioTitleMrs(){
        By titleMrs = By.id("id_gender2");
        driver.findElement(titleMrs).click();
    }

    public void enterName(String name){
        By enterName = By.id(loc.getProperty("name"));
        driver.findElement(enterName).sendKeys(name);
    }

    public void enterPassword(String password){
        By enterPassword = By.id(loc.getProperty("password"));
        driver.findElement(enterPassword).sendKeys(password);
    }

    //day of birth 1-31
    public void selectDayOfBirth(String dayOfBirth){
        By selectDayOfBirth = By.id(loc.getProperty("dayOfBirth"));
        driver.findElement(selectDayOfBirth).sendKeys(dayOfBirth);
    }

    //month of birth January-December
    public void selectMonthOfBirth(String monthOfBirth){
        By selectMonthOfBirth = By.id(loc.getProperty("monthOfBirth"));
        driver.findElement(selectMonthOfBirth).sendKeys(monthOfBirth);
    }

    public void selectYearOfBirth(String yearOfBirth){
        By selectYearOfBirth = By.id(loc.getProperty("yearOfBirth"));
        driver.findElement(selectYearOfBirth).sendKeys(yearOfBirth);
    }

    public void signUpForOurNewsletter(){
        By signUpForOurNewsletter = By.id(loc.getProperty("checkNewsletter"));
        driver.findElement(signUpForOurNewsletter).click();
    }

    public void receiveSpecialOffers(){
        By receiveSpecialOffers = By.id(loc.getProperty("checkSpecialOffers"));
        driver.findElement(receiveSpecialOffers).click();
    }

    public void enterFirstName(String firstName){
        By enterFirstName = By.id(loc.getProperty("firstName"));
        driver.findElement(enterFirstName).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        By enterLastName = By.id(loc.getProperty("lastName"));
        driver.findElement(enterLastName).sendKeys(lastName);
    }

    public void optionalEnterCompanyName(String comapnyName){
        By optionalEnterCompanyName = By.id(loc.getProperty("company"));
        driver.findElement(optionalEnterCompanyName).sendKeys(comapnyName);
    }

    public void enterAddress(String address){
        By enterAddress = By.id(loc.getProperty("address1"));
        driver.findElement(enterAddress).sendKeys(address);
    }

    public void optionalAddress2(String address){
        By optionalAddress2 = By.id(loc.getProperty("address2"));
        driver.findElement(optionalAddress2).sendKeys(address);
    }

    //Availables countries: India, United States, Canada, Australia, Israel, New Zealand, Singapore
    public void selectCountry(String country){
        By selectedCountry = By.id(loc.getProperty("country"));
        driver.findElement(selectedCountry).sendKeys(country);
    }

    public void enterState(String state){
        By enteredState = By.id(loc.getProperty("state"));
        driver.findElement(enteredState).sendKeys(state);
    }

    public void enterCity(String cityName){
        By enteredCity = By.id(loc.getProperty("city"));
        driver.findElement(enteredCity).sendKeys(cityName);
    }

    public void enterZipCode(String zipCode){
        By enteredZipCode = By.id(loc.getProperty("zipCode"));
        driver.findElement(enteredZipCode).sendKeys(zipCode);
    }

    public void enterMobileNumber(String mobileNumber){
        By enterMobileNumber = By.id(loc.getProperty("mobileNumber"));
        driver.findElement(enterMobileNumber).sendKeys(mobileNumber);
    }

    public void createAccountButton(){
        By createAccountButton = By.cssSelector(loc.getProperty("createAccountButton"));
        driver.findElement(createAccountButton).click();
    }

    public boolean accountCreatedTextVisible(){
        By accountCreatedText = By.xpath(("//b[normalize-space()='Account Created!']"));
        return driver.findElement(accountCreatedText).isDisplayed();
    }

    public void continueButtonAfterRegister(){
        By continueButtonAfterRegister = By.cssSelector(loc.getProperty("continueButtonAfterRegister"));
        driver.findElement(continueButtonAfterRegister).click();
    }
    public boolean accountDeletedVisible(){
        By accountDeleteVisible = By.xpath("//b[normalize-space()='Account Deleted!']");
        return driver.findElement(accountDeleteVisible).isDisplayed();
    }
}

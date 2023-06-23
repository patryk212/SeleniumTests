package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ContactUs {

    private Properties loc = new Properties();
    private WebDriver driver;


    public ContactUs(WebDriver driver) throws IOException {
        this.driver = driver;
        locators();
    }

    public void locators() throws IOException {
        String locatorsFilePath = System.getProperty("user.dir") + "/locators.properties";
        FileInputStream locatorsStream = new FileInputStream(locatorsFilePath);
        loc.load(locatorsStream);
    }

    public void contactUsButton(){
        By contactUsButton = By.cssSelector(loc.getProperty("contactUsButton"));
        driver.findElement(contactUsButton).click();
    }
    public boolean getInTouchIsVisible(){
        By getInTouchIsVisible = By.xpath("//h2[normalize-space()='Get In Touch']");
        return driver.findElement(getInTouchIsVisible).isDisplayed();
    }
    public void enterName(String name){
        By enterName = By.cssSelector(loc.getProperty("enterName"));
        driver.findElement(enterName).sendKeys(name);
    }
    public void enterEmail(String email){
        By enterEmail = By.cssSelector(loc.getProperty("enterEmail"));
        driver.findElement(enterEmail).sendKeys(email);
    }
    public void enterSubject(String subject){
        By enterSubject = By.cssSelector(loc.getProperty("enterSubject"));
        driver.findElement(enterSubject).sendKeys(subject);
    }
    public void enterMessage(String message){
        By enterMessage = By.id(loc.getProperty("enterMessage"));
        driver.findElement(enterMessage).sendKeys(message);
    }
    public void submitButton(){
        By submitButton = By.cssSelector(loc.getProperty("submitButton"));
        driver.findElement(submitButton).click();
    }
    public boolean successYourDetailsHaveBeenSubmittedIsVisible(){
        By successYourDetailsHaveBeenSubmittedIsVisible = By.xpath("//div[@class='status alert alert-success']");
        return driver.findElement(successYourDetailsHaveBeenSubmittedIsVisible).isDisplayed();
    }
    public void homeButton(){
        By homeButton = By.cssSelector(loc.getProperty("homeButton"));
        driver.findElement(homeButton).click();
    }
}

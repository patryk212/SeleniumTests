package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageFactory {

    private WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    private WebElement getInTouchIsVisible;

    @FindBy(css = "input[placeholder='Name']")
    private WebElement enterName;

    @FindBy(css = "input[placeholder='Email']")
    private WebElement enterEmail;

    @FindBy(css = "input[placeholder='Subject']")
    private WebElement enterSubject;

    @FindBy(id = "message")
    private WebElement enterMessage;

    //@FindBy()
    //private WebElement uploadFile;

    @FindBy(css = "input[value='Submit']")
    private WebElement submitButton;


    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement successYourDetailsHaveBeenSubmittedIsVisible;

    @FindBy(css = "a[class='btn btn-success'] span")
    private WebElement homeButton;


    public ContactUsPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public boolean getInTouchIsVisible(){
        return getInTouchIsVisible.isDisplayed();
    }

    public void enterName(String name){
        enterName.sendKeys(name);
    }

    public void enterEmail(String email){
        enterEmail.sendKeys(email);
    }
    public void enterSubject(String subject){
        enterSubject.sendKeys(subject);
    }
    public void enterMessage(String message){
        enterMessage.sendKeys(message);
    }
    public void submitButton(){
        submitButton.click();
    }

    public boolean successYourDetailsHaveBeenSubmittedIsVisible(){
        return successYourDetailsHaveBeenSubmittedIsVisible.isDisplayed();
    }
    public void homeButton(){
        homeButton.click();
    }


}

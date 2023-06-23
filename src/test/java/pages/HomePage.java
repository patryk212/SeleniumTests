package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class HomePage {


    private Properties loc = new Properties();

    private WebDriver driver;
    private WebDriverWait wait;


    public void locators() throws IOException {
        String locatorsFilePath = System.getProperty("user.dir") + "/locators.properties";
        FileInputStream locatorsStream = new FileInputStream(locatorsFilePath);
        loc.load(locatorsStream);
    }


    public HomePage(WebDriver driver) throws IOException {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        locators();

    }

    //Checking the page is loaded propertly
    public boolean isLoaded(String title) {
        return driver.getTitle().equals(title);
    }


    //Click sign/login button
    public void clickSignUpLoginButton() {
        By signUpLoginButton = By.cssSelector(loc.getProperty("signLoginButton"));
        driver.findElement(signUpLoginButton).click();

    }

    //Checking New User Signup! is visible
    public boolean newUserSignupTextIsVisible() {
        By newUserSignupText = By.xpath("//h2[contains(text(),'New User Signup!')]");
        return driver.findElement(newUserSignupText).isDisplayed();
    }

    //Enter name and email to signup
    public void enterSignupNameAndEmail(String name, String email) {
        By signupName = By.cssSelector(loc.getProperty("inputSignUpName"));
        driver.findElement(signupName).sendKeys(name);

        By signupEmail = By.cssSelector(loc.getProperty("inputSignUpEmail"));
        driver.findElement(signupEmail).sendKeys(email);
    }

    //Click signUp Button
    public void signUpButton() {
        By signUpButton = By.cssSelector(loc.getProperty("signUpButton"));
        driver.findElement(signUpButton).click();
    }

    public boolean loggedAsVisible() {
        By loggedAsVisible = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
        return driver.findElement(loggedAsVisible).isDisplayed();
    }

    public void deleteAccountButton() {
        By deleteAccountButton = By.cssSelector(loc.getProperty("deleteAccountButton"));
        driver.findElement(deleteAccountButton).click();
    }

    public void continoueButtonAfterDelete() {
        By continueButtonAfterDelete = By.cssSelector(loc.getProperty("continueButtonAfterDelete"));
        driver.findElement(continueButtonAfterDelete).click();
    }

    public boolean loginToYourAccountIsVisible() {
        By loginToYourAccountIsVisible = By.xpath("//h2[normalize-space()='Login to your account']");
        return driver.findElement(loginToYourAccountIsVisible).isDisplayed();
    }

    public void loginEmail(String email) {
        By loginEmail = By.cssSelector(loc.getProperty("loginEmail"));
        driver.findElement(loginEmail).sendKeys(email);
    }

    public void loginPassword(String password) {
        By loginPassword = By.cssSelector(loc.getProperty("loginPassword"));
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void loginButton() {
        By loginButton = By.cssSelector(loc.getProperty("loginButton"));
        driver.findElement(loginButton).click();
    }

    public boolean accountDeletedTextIsVisible() {
        By accountDeletedTextIsVisible = By.xpath("//b[normalize-space()='Account Deleted!']");
        return driver.findElement(accountDeletedTextIsVisible).isDisplayed();
    }

    public boolean yourEmailOrPasswordIsIncorrect() {
        By yourEmailOrPasswordIsIncorrect = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
        return driver.findElement(yourEmailOrPasswordIsIncorrect).isDisplayed();
    }

    public void logoutButton() {
        By logoutButton = By.cssSelector(loc.getProperty("logoutButton"));
        driver.findElement(logoutButton).click();
    }

    public boolean emailAddressAlreadyExistsIsVisible() {
        By emailAddressAlreadyExistsIsVsible = By.xpath("//p[normalize-space()='Email Address already exist!']");
        return driver.findElement(emailAddressAlreadyExistsIsVsible).isDisplayed();
    }

    public void contactUsButton() {
        By contactUsButton = By.cssSelector(loc.getProperty("contactUsButton"));
        driver.findElement(contactUsButton).click();
    }

    public void testCaseButton() {
        By testCaseButton = By.cssSelector(loc.getProperty("testCaseButton"));
        driver.findElement(testCaseButton).click();
    }

    public void productsButton() {
        By productsButton = By.cssSelector(loc.getProperty("productsButton"));
        driver.findElement(productsButton).click();
    }

    public void scrollToTheFooter() {
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.id("footer"));
        actions.scrollToElement(footer);
        actions.perform();
    }

    public boolean textSubscriptionIsVisible() {
        By textSubscriptionIsVisible = By.xpath(loc.getProperty("subscriptionTextIsVisible"));
        return driver.findElement(textSubscriptionIsVisible).isDisplayed();
    }

    public void subscribeEmail(String email) {
        By subscribeEmail = By.id(loc.getProperty("subscribeEmail"));
        driver.findElement(subscribeEmail).sendKeys(email);
    }

    public void subscribeButton() {
        By subscribeButton = By.id(loc.getProperty("subscribeButton"));
        driver.findElement(subscribeButton).click();
    }

    public boolean successfullySubscribedTextIsVisible() {
        By successfullySub = By.xpath(loc.getProperty("successSubscribeTextIsVisible"));
        return driver.findElement(successfullySub).isDisplayed();
    }

    public void cartButton() {
        By cartButton = By.cssSelector(loc.getProperty("cartButton"));
        driver.findElement(cartButton).click();
    }

    public boolean recommendedItemsVisible() {
        By recommenedItems = By.cssSelector(loc.getProperty("recommendedItemsVisible"));
        return driver.findElement(recommenedItems).isDisplayed();
    }

    public void addToCartRecommendedItem() {
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(loc.getProperty("addToCartRecommendedItem"))));
        addToCart.click();
    }

    public void scrollToTheRecommended() {
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.cssSelector(loc.getProperty("recommendedItemsVisible")));
        actions.scrollToElement(footer);
        actions.perform();
    }
    public void scrollDownUsinArrowButton(){
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.id("footer"));
        actions.sendKeys(footer, Keys.ARROW_DOWN);
        actions.perform();
    }

    public void arrowButtonUp(){
        By arrowButton = By.xpath("//body/a[@id='scrollUp']/i[1]");
        driver.findElement(arrowButton).click();
    }
    public void scrollUpUsinArrowButton(){
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.cssSelector(loc.getProperty("cartButton")));
        actions.sendKeys(footer, Keys.ARROW_UP);
        actions.perform();
    }
    public boolean fullFledgedVisible(){
        By fullFledged = By.cssSelector(loc.getProperty("fullFledgedVisible"));
        return driver.findElement(fullFledged).isDisplayed();
    }
}





package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageFactory {
    private WebDriverWait wait;
    private WebDriver driver;


    @FindBy(css = "a[href='/login']")
    private WebElement clickSignUpLoginButton;

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    private WebElement newUserSignupTextIsVisible;

    @FindBy(css = "input[placeholder='Name']")
    private WebElement enterSignupName;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement enterSignupEmail;

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signUpButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    private WebElement loggedAsVisible;

    @FindBy(css = ".fa.fa-trash-o")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    private WebElement accountDeletedTextIsVisible;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement continoueButtonAfterDeleteAccount;

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    private WebElement loginToYourAccountTextIsVisible;

    @FindBy(css = "input[data-qa='login-email']")
    private WebElement loginEmail;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    private WebElement yourEmailOrPasswordIsIncorrect;

    @FindBy(css = ".fa.fa-lock")
    private WebElement logoutButton;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    private WebElement emailAddressAlreadyExistsIsVisible;

    @FindBy(css = "a[href='/contact_us']")
    private WebElement contactUsButton;

    @FindBy(css = "a[href='/test_cases']")
    private WebElement testCaseButton;

    @FindBy(css = ".material-icons.card_travel")
    private WebElement productsButton;

    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    private WebElement textSubscriptionIsVisible;

    @FindBy(id = "footer")
    private WebElement scrollDownToFooter;

    @FindBy(id = "susbscribe_email")
    private WebElement subscribeEmail;

    @FindBy(id = "subscribe")
    private WebElement subscribeButton;

    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    private WebElement successSubscribeTextIsVisible;

    @FindBy(css = "a[href='/view_cart']")
    private WebElement cartButton;

    @FindBy(css = "section:nth-child(3) div.container div.row div.col-sm-9.padding-right > div.recommended_items")
    private WebElement recommendedItemsVisible;

    @FindBy(xpath = "//body/a[@id='scrollUp']/i[1]")
    private WebElement arrowButtonUp;



    public HomePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public boolean isLoaded(String expectedTitle) {
        String actualTitle = driver.getTitle();
        return actualTitle.equals(expectedTitle);
    }

    public void clickSignUpLoginButton() {
        clickSignUpLoginButton.click();
    }

    public boolean newUserSignupTextIsVisible() {
        return newUserSignupTextIsVisible.isDisplayed();
    }

    public void enterSignupName(String name) {
        enterSignupName.sendKeys(name);
    }

    public void enterSignupEmail(String email) {
        enterSignupEmail.sendKeys(email);
    }

    public void signUpButton() {
        signUpButton.click();
    }

    public boolean loggedAsVisible() {
       return loggedAsVisible.isDisplayed();

    }

    public void deleteAccountButton() {
        deleteAccountButton.click();
    }

    public boolean accountDeletedTextIsVisible() {
        return accountDeletedTextIsVisible.isDisplayed();
    }

    public void continoueButtonAfterDeleteAccount() {
        continoueButtonAfterDeleteAccount.click();
    }

    public boolean loginToYourAccountTextIsVisible() {
        return loginToYourAccountTextIsVisible.isDisplayed();
    }

    public void loginEmail(String email) {
        loginEmail.sendKeys(email);
    }

    public void loginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void loginButton() {
        loginButton.click();
    }

    public boolean yourEmailOrPasswordIsIncorrect() {
        return yourEmailOrPasswordIsIncorrect.isDisplayed();
    }

    public void logoutButton() {
        logoutButton.click();
    }

    public boolean emailAddressAlreadyExistsIsVisible() {
        return emailAddressAlreadyExistsIsVisible.isDisplayed();
    }

    public void contactUsButton() {
        contactUsButton.click();
    }

    public void testCaseButton() {
        testCaseButton.click();
    }

    public void productsButton() {
        productsButton.click();
    }

    public void scrollDownToFooter() {
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.id("footer"));
        actions.scrollToElement(footer);
        actions.perform();
    }

    public boolean textSubscriptionIsVisible() {
        return textSubscriptionIsVisible.isDisplayed();
    }
    public void enterSubscribeEmail(String email) {
        subscribeEmail.sendKeys(email);
    }
    public void subscribeButton(){
        subscribeButton.click();
    }
    public boolean successSubscribeTextIsVisible(){
       return successSubscribeTextIsVisible.isDisplayed();
    }
    public void cartButton(){
        cartButton.click();
    }
    public void scrollDownToRecommendedItems() {
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.cssSelector("section:nth-child(3) div.container div.row div.col-sm-9.padding-right > div.recommended_items"));
        actions.scrollToElement(footer);
        actions.perform();
    }
    public void addToCartRecommendedItem() {
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(4) > i:nth-child(1)")));
        addToCart.click();
    }

    public boolean recommendedItemsVisible(){
        return recommendedItemsVisible.isDisplayed();
    }

    public void scrollDownUsingArrowKey(){
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.id("footer"));
        actions.keyDown(footer, Keys.ARROW_DOWN);
        actions.perform();
    }
    public void arrowButtonUp(){
        arrowButtonUp.click();
    }

    public void scrollUpUsingArrowKey(){
        Actions actions = new Actions(driver);
        actions.keyDown(cartButton, Keys.ARROW_DOWN);
        actions.perform();
    }
}


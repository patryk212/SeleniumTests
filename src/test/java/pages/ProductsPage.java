package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ProductsPage {

    private Properties loc = new Properties();

    private WebDriver driver;
    private WebDriverWait wait;



    public void locators() throws IOException {
        String locatorsFilePath = System.getProperty("user.dir") + "/locators.properties";
        FileInputStream locatorsStream = new FileInputStream(locatorsFilePath);
        loc.load(locatorsStream);
    }


    public ProductsPage(WebDriver driver) throws IOException {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        locators();

    }

    public void productListIsVisible(){
        By productListIsVisible = By.xpath(loc.getProperty("productListIsVisible"));
        driver.findElement(productListIsVisible).isDisplayed();
    }
    public void firstProduct(){
        By firstProduct = By.cssSelector(loc.getProperty("firstProduct"));
        driver.findElement(firstProduct).click();
    }
    public void productName(){
        By productName = By.xpath(loc.getProperty("productName"));
        driver.findElement(productName).isDisplayed();
    }
    public void productCategory(){
        By productCategory = By.xpath(loc.getProperty("productCategory"));
        driver.findElement(productCategory).isDisplayed();

    }
    public void productPrice(){
        By productPrice = By.xpath(loc.getProperty("productPrice"));
        driver.findElement(productPrice).isDisplayed();
    }
    public void productAvailabaility(){
        By productAvailability = By.xpath(loc.getProperty("productAvailability"));
        driver.findElement(productAvailability).isDisplayed();
    }
    public void productCondition(){
        By productCondition = By.xpath(loc.getProperty("productCondition"));
        driver.findElement(productCondition).isDisplayed();
    }
    public void productBrand(){
        By productBrand = By.xpath(loc.getProperty("productBrand"));
        driver.findElement(productBrand).isDisplayed();
    }

    public void searchProducts(String productName){
        By searchProducts = By.cssSelector(loc.getProperty("searchProduct"));
        driver.findElement(searchProducts).sendKeys(productName);
    }

    public void searchButton(){
        By searchButton = By.id(loc.getProperty("searchButton"));
        driver.findElement(searchButton).click();
    }
    public boolean searchedProductsTextIsVisible(){
        By searchedProductsTextIsVisible = By.xpath(loc.getProperty("searchedProductsTextVisible"));
        return driver.findElement(searchedProductsTextIsVisible).isDisplayed();
    }
    public boolean searchedProductsVisible(){
        By searchedProductsVisible = By.cssSelector(loc.getProperty("searchedProductsVisible"));
        return driver.findElement(searchedProductsVisible).isDisplayed();
    }

    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement scroll = driver.findElement(By.cssSelector("a[href='/product_details/1']"));
        actions.scrollToElement(scroll).perform();
        WebElement hoveroverFirstProduct = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/h2"));
        actions.moveToElement(hoveroverFirstProduct).perform();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(3)")).click();


    }
    public void continoueShopping(){
        By continoueShopping = By.xpath(loc.getProperty("continoueShopping"));
        driver.findElement(continoueShopping).click();
    }
    public void viewCart(){
        By viewCart = By.xpath(loc.getProperty("viewCart"));
        driver.findElement(viewCart).click();
    }

    public void setQuantity(String quantity){
        By setQuantity = By.id(loc.getProperty("quantityProduct"));
        driver.findElement(setQuantity).clear();
        driver.findElement(setQuantity).sendKeys(quantity);
    }
    public void addToCartButton(){
        By addToCartButton = By.cssSelector(loc.getProperty("addToCartButton"));
        driver.findElement(addToCartButton).click();
    }
    public void proceedToCheckout(){
        By proceedToCheckout = By.xpath(loc.getProperty("proceedToCheckout"));
        driver.findElement(proceedToCheckout).click();
    }
    public void registerLogin(){
        By registerLogin = By.xpath(loc.getProperty("registerLogin"));
        driver.findElement(registerLogin).click();
    }

    public void commentAfterOrder(String message){
        By commentAfterOrder = By.cssSelector(loc.getProperty("commentAboutOrder"));
        driver.findElement(commentAfterOrder).sendKeys(message);
    }
    public void placeOrderButton(){
        By placeOrderButton = By.cssSelector(loc.getProperty("placeOrderButton"));
        driver.findElement(placeOrderButton).click();
    }
    public void nameOnCard(String name){
        By nameOnCard = By.cssSelector(loc.getProperty("nameOnCard"));
        driver.findElement(nameOnCard).sendKeys(name);
    }
    public void cardNumber(String number){
        By cardNumber = By.cssSelector(loc.getProperty("cardNumber"));
        driver.findElement(cardNumber).sendKeys(number);
    }
    public void cvcNumber(String cvc){
        By cvcNumber = By.cssSelector(loc.getProperty("cvc"));
        driver.findElement(cvcNumber).sendKeys(cvc);
    }
    public void expirationMonth(String month){
        By expirationMonth = By.cssSelector(loc.getProperty("expirationMonth"));
        driver.findElement(expirationMonth).sendKeys(month);
    }
    public void expirationYear(String year){
        By expirationYear = By.cssSelector(loc.getProperty("expirationYear"));
        driver.findElement(expirationYear).sendKeys(year);
    }
    public void payAndConfirmButton(){
        By payAndConfirmButton = By.id(loc.getProperty("payAndConfirmButton"));
        driver.findElement(payAndConfirmButton).click();
    }
    public boolean yourOrderHasBeenPlacedSuccessfully(){
        By yourOrderHasBeenPlacedSuccessfully = By.id(loc.getProperty("successMessage"));
        return driver.findElement(yourOrderHasBeenPlacedSuccessfully).isDisplayed();
    }
    public void continoueAfterOrder(){
        By continoureAfterOrder = By.cssSelector(loc.getProperty("continoureAfterOrder"));
        driver.findElement(continoureAfterOrder).click();
    }
    public void deleteProduct(){
        By deleteProduct = By.cssSelector(loc.getProperty("deleteProduct"));
        driver.findElement(deleteProduct).click();
    }
    public boolean cartIsEmptyTextIsVisble(){
        By cartIsEmpty = By.xpath(loc.getProperty("cartIsEmpty"));
        return driver.findElement(cartIsEmpty).isDisplayed();
    }
    public boolean categoriesAreVisibles(){
        By categoriesAreVisibles = By.id(loc.getProperty("categoryProducts"));
        return driver.findElement(categoriesAreVisibles).isDisplayed();
    }
    public void womenCategory(){
        By womenCategory = By.cssSelector(loc.getProperty("womenCategory"));
        driver.findElement(womenCategory).click();
    }
    public void dressCategory(){
        By dressCategory = By.cssSelector(loc.getProperty("dressCategory"));
        driver.findElement(dressCategory).click();
    }
    public boolean womenDressProductsTextIsVisible(){
        By womenDressProductsTextIsVisible = By.xpath(loc.getProperty("womenDressTextisVisible"));
        return driver.findElement(womenDressProductsTextIsVisible).isDisplayed();
    }
    public void manCategory(){
        By manCategory = By.cssSelector(loc.getProperty("manCategory"));
        driver.findElement(manCategory).click();
    }
    public void shirtCategory(){
        By shirtCategory = By.cssSelector(loc.getProperty("shirtCategory"));
        driver.findElement(shirtCategory).click();
    }
    public boolean visibleBrands(){
        By visibleBrands = By.cssSelector(loc.getProperty("visibleBrands"));
        return driver.findElement(visibleBrands).isDisplayed();
    }

    public void poloCategory(){
        By poloCategory = By.cssSelector(loc.getProperty("poloCategory"));
        driver.findElement(poloCategory).click();
    }
    public void hmCategory(){
        By hmCategory = By.cssSelector(loc.getProperty("hmCategory"));
        driver.findElement(hmCategory).click();
    }
    public boolean poloProductsDisplayed(){
        By poloProductsDisplayed = By.cssSelector(loc.getProperty("poloProductsDisplayed"));
        return driver.findElement(poloProductsDisplayed).isDisplayed();
    }
    public boolean hmProductsDisplayed(){
        By hmProductsDisplayed = By.cssSelector(loc.getProperty("hmProductsDisplayed"));
        return driver.findElement(hmProductsDisplayed).isDisplayed();
    }
    public boolean product1InCartIsDisplayed(){
        By product1InCartIsDisplayed = By.id(loc.getProperty("product1InCartIsDisplayed"));
        return driver.findElement(product1InCartIsDisplayed).isDisplayed();
    }
    public boolean writeYourReviewVisible(){
        By writeYourReviewVisible = By.xpath(loc.getProperty("writeYourReviewVisible"));
        return driver.findElement(writeYourReviewVisible).isDisplayed();
    }
    public void nameReview(String name){
        By nameReview = By.cssSelector(loc.getProperty("nameReview"));
        driver.findElement(nameReview).sendKeys(name);
    }
    public void emailReview(String email){
        By emailReview = By.cssSelector(loc.getProperty("emailReview"));
        driver.findElement(emailReview).sendKeys(email);
    }
    public void textReview(String text){
        By textReview = By.cssSelector(loc.getProperty("textReview"));
        driver.findElement(textReview).sendKeys(text);
    }
    public void reviewSubmitButton(){
        By reviewButton = By.cssSelector(loc.getProperty("buttonReview"));
        driver.findElement(reviewButton).click();
    }
    public boolean successMessageAfterAddReview(){
        By successMessage = By.xpath(loc.getProperty("messageSuccessReview"));
        return driver.findElement(successMessage).isDisplayed();
    }
    public boolean productRecommendedInCartIsDisplayed(){
        By productRecommendedInCartIsDisplayed = By.xpath(loc.getProperty("productRecommendedInCartIsDisplayed"));
        return driver.findElement(productRecommendedInCartIsDisplayed).isDisplayed();
    }
}

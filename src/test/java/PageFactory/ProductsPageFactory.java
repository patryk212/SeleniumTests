package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPageFactory {

    private WebDriver driver;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement allProductsTextIsVisible;

    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]")
    private WebElement productListIsVisible;

    @FindBy(css = "body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")
    private WebElement viewProductOfFirstProduct;

    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    private WebElement productName;

    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    private WebElement productCategory;

    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    private WebElement productPrice;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    private WebElement productAvailability;

    @FindBy(xpath = "//b[contains(text(),'Condition:')]")
    private WebElement productCondition;

    @FindBy(xpath = "//b[contains(text(),'Brand:')]")
    private WebElement productBrand;

    @FindBy(css = "#search_product")
    private WebElement searchProduct;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement searchProductTextIsVisible;

    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div.col-sm-4")
    private WebElement visibleSearchedProducts;

    @FindBy(id = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    private WebElement cartView;

    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    private WebElement continoueShopping;

    @FindBy(id = "quantity")
    private WebElement setQuantity;

    @FindBy(css = "button[type='button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    private WebElement registerLogin;

    @FindBy(css = "textarea[name='message']")
    private WebElement commentAboutOrder;

    @FindBy(css = ".btn.btn-default.check_out")
    private WebElement placeOrderButton;

    @FindBy(css = "input[name='name_on_card']")
    private WebElement nameOnCard;

    @FindBy(css = "input[name='card_number']")
    private WebElement cardNumber;

    @FindBy(css = "input[placeholder='ex. 311']")
    private WebElement cvc;

    @FindBy(css = "input[placeholder='MM']")
    private WebElement expirationMonth;

    @FindBy(css = "input[placeholder='YYYY']")
    private WebElement expirationYear;

    @FindBy(id = "submit")
    private WebElement payAndConfirmButton;

    @FindBy(id = "success_message")
    private WebElement successMessage;

    @FindBy(css = ".btn.btn-primary")
    private WebElement continoureAfterOrder;

    @FindBy(css = ".fa.fa-times")
    private WebElement deleteProductFromCart;

    @FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
    private WebElement cartIsEmptyTextIsVisible;

    @FindBy(id = "accordian")
    private WebElement categoryProductsAreVisibles;

    @FindBy(css = "body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private WebElement womenCategory;

    @FindBy(css = "div.container div.row div.col-sm-3 div.left-sidebar div.panel-group.category-products:nth-child(2) div.panel.panel-default:nth-child(1) div.panel-collapse.in div.panel-body ul:nth-child(1) li:nth-child(1) > a:nth-child(1)")
    private WebElement dressCategory;

    @FindBy(xpath = "//h2[contains(text(),'Women - Dress Products')]")
    private WebElement womenDressTextIsVsible;

    @FindBy(css = "body > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private WebElement manCategory;

    @FindBy(css = "div.container div.row div.col-sm-3 div.left-sidebar div.panel-group.category-products:nth-child(2) div.panel.panel-default:nth-child(2) div.panel-collapse.in div.panel-body ul:nth-child(1) li:nth-child(1) > a:nth-child(1)")
    private WebElement shirtCategory;

    @FindBy(css = "div.container div.row div.col-sm-3 div.left-sidebar > div.brands_products:nth-child(3)")
    private WebElement visibleBrands;

    @FindBy(css = "a[href='/brand_products/Polo']")
    private WebElement poloCategory;

    @FindBy(css = "a[href='/brand_products/H&M']")
    private WebElement hmCategory;

    @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div")
    private WebElement poloProductsDisplayed;

    @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div")
    private WebElement hmProductsDisplayed;

    @FindBy(id = "product-1")
    private WebElement product1IsVisible;

    @FindBy(xpath = "//a[contains(text(),'Write Your Review')]")
    private WebElement writeYourReviewVisible;

    @FindBy(css = "#name")
    private WebElement nameReview;

    @FindBy(css = "#email")
    private WebElement emailReview;

    @FindBy(css = "#review")
    private WebElement textReview;

    @FindBy(css = "#button-review")
    private WebElement submitButtonReview;

    @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
    private WebElement successAddReviewMessage;

    @FindBy(xpath = "//a[contains(text(),'Stylish Dress')]")
    private WebElement recommendedItemInCartIsDisplayed;



    public ProductsPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean allProductsTextIsVisible() {
        return allProductsTextIsVisible.isDisplayed();
    }

    public boolean productListIsVisible() {
        return productListIsVisible.isDisplayed();
    }

    public void viewProductOfFirstProduct() {
        viewProductOfFirstProduct.click();
    }

    public boolean productName() {
        return productName.isDisplayed();
    }

    public boolean productCategory() {
        return productCategory.isDisplayed();
    }

    public boolean productPrice() {
        return productPrice.isDisplayed();
    }

    public boolean productAvailability() {
        return productAvailability.isDisplayed();
    }

    public boolean productCondition() {
        return productCondition.isDisplayed();
    }

    public boolean productBrand() {
        return productBrand.isDisplayed();
    }

    public void searchProduct(String productName) {
        searchProduct.sendKeys(productName);
    }

    public boolean searchedProductTextIsVisible() {
        return searchProductTextIsVisible.isDisplayed();
    }

    public boolean visibleSearchedProducts() {
        return visibleSearchedProducts.isDisplayed();
    }

    public void searchButton() {
        searchButton.click();
    }

    public void cartView() {
        cartView.click();
    }

    public void continoueShopping() {
        continoueShopping.click();
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
    public void setQuantity(String quantity){
        setQuantity.clear();
        setQuantity.sendKeys(quantity);
    }
    public void addToCartButton(){
        addToCartButton.click();
    }

    public void proccedToCheckout(){
        proceedToCheckout.click();
    }
    public void commentAboutOrder(String message){
        commentAboutOrder.sendKeys(message);
    }
    public void placeOrderButton(){
        placeOrderButton.click();
    }
    public void nameOnCard(String name){
        nameOnCard.sendKeys(name);
    }
    public void cardNumber(String number){
        cardNumber.sendKeys(number);
    }
    public void cvcNumber(String cvcNumber){
        cvc.sendKeys(cvcNumber);
    }
    public void expirationMonth(String month){
        expirationMonth.sendKeys(month);
    }
    public void expirationYear(String year) {
        expirationYear.sendKeys(year);
    }
    public void payAndConfirmButton(){
        payAndConfirmButton.click();
    }
    public void continoueAfterOrder(){
        continoureAfterOrder.click();
    }
    public void registerLogin(){
        registerLogin.click();
    }
    public void deleteProductFromCart(){
        deleteProductFromCart.click();
    }
    public boolean cartIsEmptyTextIsVisible(){
        return cartIsEmptyTextIsVisible.isDisplayed();
    }
    public boolean categoriesAreVisibles(){
        return categoryProductsAreVisibles.isDisplayed();
    }
    public void womenCategory(){
        womenCategory.click();
    }
    public void dressCategory(){
        dressCategory.click();
    }
    public boolean womenDressTextVisible() {
        return womenDressTextIsVsible.isDisplayed();
    }
    public void manCategory(){
        manCategory.click();
    }
    public void shirtCategory(){
        shirtCategory.click();
    }
    public boolean visibleBrand(){
        return visibleBrands.isDisplayed();
    }
    public void poloCategory(){
        poloCategory.click();
    }
    public void hmCategory(){
        hmCategory.click();
    }
    public boolean poloProductsDisplayed(){
        return poloProductsDisplayed.isDisplayed();
    }
    public boolean hmProductsDisplayed(){
        return hmProductsDisplayed.isDisplayed();
    }
    public boolean product1InCartIsDisplayed(){
        return product1IsVisible.isDisplayed();
    }
    public boolean writeYourReviewVisible(){
        return writeYourReviewVisible.isDisplayed();
    }
    public void nameReview(String name){
        nameReview.sendKeys(name);
    }
    public void emailReview(String email){
        emailReview.sendKeys(email);
    }
    public void textReview(String text){
        textReview.sendKeys(text);
    }
    public void submitButtonReview(){
        submitButtonReview.click();
    }
    public boolean successMessageAddReview(){
        return successAddReviewMessage.isDisplayed();
    }
    public boolean recommendedItemInCartIsDisplayed(){
        return recommendedItemInCartIsDisplayed.isDisplayed();
    }
}

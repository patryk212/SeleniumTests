package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_16_PlaceOrderLoginBeforeCheckout extends BaseTest {

    @Test
    public void placeOrderLoginBeforeCheckout() throws InterruptedException {

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePageFactory.clickSignUpLoginButton();

        //5. Verify 'Login to your account' is visible
        homePageFactory.loginToYourAccountTextIsVisible();

        //6. Enter correct email address and password
        //email: test1@tests.com  //password: 12345
        homePageFactory.loginEmail("test1@tests.com");
        homePageFactory.loginPassword("12345");

        //7. Click 'login' button
        homePageFactory.loginButton();

        //8. Verify that 'Logged in as username' is visible
        homePageFactory.loggedAsVisible();

        //9. Click products button
        homePageFactory.productsButton();

        Thread.sleep(15000);

        homePageFactory.productsButton();

        //10.Hover over first product and click 'Add to cart'
        productsPageFactory.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //11.Click 'View Cart' button
        productsPageFactory.cartView();

        //12. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //13. Click Proceed To Checkout
        productsPageFactory.proccedToCheckout();

        //14. Enter description in comment text area and click 'Place Order'
        productsPageFactory.commentAboutOrder("asdas");
        productsPageFactory.placeOrderButton();

        //15. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        productsPageFactory.nameOnCard("asdasd");
        productsPageFactory.cardNumber("123123");
        productsPageFactory.cvcNumber("123");
        productsPageFactory.expirationMonth("12");
        productsPageFactory.expirationYear("2000");

        //16. Click 'Pay and Confirm Order' button
        productsPageFactory.payAndConfirmButton();
        productsPageFactory.continoueAfterOrder();


    }

}

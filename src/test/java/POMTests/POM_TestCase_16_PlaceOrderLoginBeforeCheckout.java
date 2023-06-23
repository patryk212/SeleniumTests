package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_16_PlaceOrderLoginBeforeCheckout extends BaseTest {

    @Test
    public void placeOrderLoginBeforeCheckout() throws IOException, InterruptedException {


        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'


        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePage.clickSignUpLoginButton();

        //5. Verify 'Login to your account' is visible
        homePage.loginToYourAccountIsVisible();

        //6. Enter correct email address and password
        //email: test1@tests.com  //password: 12345
        homePage.loginEmail("test1@tests.com");
        homePage.loginPassword("12345");

        //7. Click 'login' button
        homePage.loginButton();

        //8. Verify that 'Logged in as username' is visible
        homePage.loggedAsVisible();

        //9. Click products button
        homePage.productsButton();

        Thread.sleep(15000);

        homePage.productsButton();

        //10.Hover over first product and click 'Add to cart'
        productsPage.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);


        //11.Click 'View Cart' button
        productsPage.viewCart();

        //12. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //13. Click Proceed To Checkout
        productsPage.proceedToCheckout();

        //14. Enter description in comment text area and click 'Place Order'
        productsPage.commentAfterOrder("asdas");
        productsPage.placeOrderButton();

        //15. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        productsPage.nameOnCard("asdasd");
        productsPage.cardNumber("123123");

        productsPage.cvcNumber("123");
        productsPage.expirationMonth("12");
        productsPage.expirationYear("2000");

        //16. Click 'Pay and Confirm Order' button
        productsPage.payAndConfirmButton();
        productsPage.continoueAfterOrder();



    }

}


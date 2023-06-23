package POMTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_20_SearchProductsAndVerifyCartAfterLogin extends BaseTest {

    @Test
    public void searchProductsAndVerifyCartAfterLogin() throws IOException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");


        //4. Click products
        homePage.productsButton();

        Thread.sleep(15000);

        homePage.productsButton();

        //5. Verify 'SEARCHED PRODUCTS' is visible
        productsPage.productListIsVisible();


        //6.  Enter product name in search input and click search button
        productsPage.searchProducts("Blue");
        productsPage.searchButton();

        //7. Verify all the products related to search are visible
        productsPage.searchedProductsTextIsVisible();
        productsPage.searchedProductsVisible();

        Thread.sleep(5000);

        //8. Add those products to cart
        productsPage.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //9. Click 'Cart' button and verify that products are visible in cart
        productsPage.viewCart();
        productsPage.product1InCartIsDisplayed();

        //10. Click 'Signup / Login' button and submit login details
        homePage.clickSignUpLoginButton();
        homePage.loginEmail("test1@tests.com");
        homePage.loginPassword("12345");

        homePage.loginButton();

        //11. Again, go to Cart page
        homePage.cartButton();

        //12. Verify that those products are visible in cart after login as well
        productsPage.product1InCartIsDisplayed();

    }
}


package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_20_SearchProductsAndVerifyCartAfterLogin extends BaseTest {

    @Test
    public void searchProductsAndVerifyCartAfterLogin() throws InterruptedException {

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Products' button
        homePageFactory.productsButton();

        Thread.sleep(15000);

        homePageFactory.productsButton();

        //5. Verify 'SEARCHED PRODUCTS' is visible
        productsPageFactory.allProductsTextIsVisible();

        //6.  Enter product name in search input and click search button
        productsPageFactory.searchProduct("Blue");
        productsPageFactory.searchButton();

        //7. Verify all the products related to search are visible
        productsPageFactory.searchedProductTextIsVisible();
        productsPageFactory.visibleSearchedProducts();

        Thread.sleep(5000);

        //8. Add those products to cart
        productsPageFactory.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //9. Click 'Cart' button and verify that products are visible in cart
        productsPageFactory.cartView();
        productsPageFactory.product1InCartIsDisplayed();

         //10. Click 'Signup / Login' button and submit login details
        homePageFactory.clickSignUpLoginButton();

        homePageFactory.loginEmail("test1@tests.com");
        homePageFactory.loginPassword("12345");

        //11. Again, go to Cart page
        homePageFactory.cartButton();

        //12. Verify that those products are visible in cart after login as well
        productsPageFactory.product1InCartIsDisplayed();

    }
}

package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_17_RemoveProductsFromCart extends BaseTest {

    @Test
    public void removeProductsFromCart() throws InterruptedException, IOException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click products button
        homePage.productsButton();

        Thread.sleep(30000);

        homePage.productsButton();


        //5. Add products to cart
        productsPage.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //6. Click 'Cart' button
        productsPage.viewCart();

        //7. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //8.Click 'X' button corresponding to particular product
        productsPage.deleteProduct();

        Thread.sleep(5000);

        //8. Verify that product is removed from the cart
        productsPage.cartIsEmptyTextIsVisble();

    }
}



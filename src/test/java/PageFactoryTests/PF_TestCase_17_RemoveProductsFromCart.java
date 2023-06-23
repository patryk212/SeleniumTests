package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_17_RemoveProductsFromCart extends BaseTest {

    @Test
    public void removeProductsFromCart() throws InterruptedException {

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");

        driver.manage().window().maximize();

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click products button
        homePageFactory.productsButton();

        Thread.sleep(15000);

        homePageFactory.productsButton();

        //5. Add products to cart
        productsPageFactory.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //6. Click 'Cart' button
        productsPageFactory.cartView();

        //7. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");


        //8.Click 'X' button corresponding to particular product
        productsPageFactory.deleteProductFromCart();

        //8. Verify that product is removed from the cart
        productsPageFactory.cartIsEmptyTextIsVisible();

    }
}

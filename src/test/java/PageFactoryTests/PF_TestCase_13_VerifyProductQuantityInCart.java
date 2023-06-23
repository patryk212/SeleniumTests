package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_13_VerifyProductQuantityInCart extends BaseTest {

    @Test
    public void verifyProductQuantityInCart() throws InterruptedException {

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);


        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        Thread.sleep(15000);

        //4.Click products button
        homePageFactory.productsButton();

        //5. Click 'View Product' for any product on home page
        productsPageFactory.viewProductOfFirstProduct();

        //6. Verify product detail is opened
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url,"https://automationexercise.com/product_details/1");

        //7. Increase quantity to 4
        productsPageFactory.setQuantity("4");

        //8. Click 'Add to cart' button
        productsPageFactory.addToCartButton();

        Thread.sleep(5000);

        //9. Click 'View Cart' button
        productsPageFactory.cartView();

    }
}

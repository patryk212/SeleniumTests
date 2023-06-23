package POMTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

import static utils.BaseTest.driver;

public class POM_TestCase_13_VerifyProductQuantityInCart extends BaseTest {

    @Test
    public void verifyProductQuantityInCart() throws IOException, InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        Thread.sleep(15000);

        //4.Click products button
        homePage.productsButton();

        //5.Click 'View Product' for any product on home page
        productsPage.firstProduct();

        //6. Verify product detail is opened
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/product_details/1");

        //7. Increase quantity to 4
        productsPage.setQuantity("4");

        //8. Click 'Add to cart' button
        productsPage.addToCartButton();

        Thread.sleep(5000);

        //9. Click 'View Cart' button
        productsPage.viewCart();

    }
}

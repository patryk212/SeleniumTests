package POMTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_12_AddProductsInCarts extends BaseTest {

    @Test
    public void AddProductsInCarts() throws IOException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click 'Products' button
        homePage.productsButton();

        Thread.sleep(25000);

        homePage.productsButton();

        //Thread.sleep(5000);

        //5. Hover over first product and click 'Add to cart'
        productsPage.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //8. Click 'View Cart' button
        productsPage.viewCart();




    }
}

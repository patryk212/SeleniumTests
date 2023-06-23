package POMTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_22_AddToCartFromRecommendedItems extends BaseTest {

    @Test
    public void addToCartFromRecommendedItems() throws IOException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        homePage.scrollToTheRecommended();

        homePage.recommendedItemsVisible();


        homePage.addToCartRecommendedItem();

        Thread.sleep(5000);

        productsPage.viewCart();

        productsPage.productRecommendedInCartIsDisplayed();

    }
}

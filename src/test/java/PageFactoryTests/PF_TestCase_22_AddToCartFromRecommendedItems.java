package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class PF_TestCase_22_AddToCartFromRecommendedItems extends BaseTest {

    @Test
    public void addToCartFromRecommendedItems() throws IOException,InterruptedException {
        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);
        HomePage homePage = new HomePage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        homePageFactory.scrollDownToRecommendedItems();

        homePageFactory.recommendedItemsVisible();


        homePage.addToCartRecommendedItem();

        Thread.sleep(5000);

        productsPageFactory.cartView();

        productsPageFactory.recommendedItemInCartIsDisplayed();
    }
}

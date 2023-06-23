package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

public class PF_TestCase_12_AddProductsInCarts extends BaseTest {

    @Test
    public void AddProductsInCarts() throws Exception{

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");

        driver.manage().window().maximize();

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        homePageFactory.productsButton();

        Thread.sleep(25000);

        homePageFactory.productsButton();

        //5. Hover over first product and click 'Add to cart'
        productsPageFactory.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //8. Click 'View Cart' button
        productsPageFactory.cartView();

    }
}

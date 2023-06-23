package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_9_SearchProduct extends BaseTest {


    @Test
    public void searchProduct() throws IOException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click on 'Products' button
        homePage.productsButton();

        Thread.sleep(25000);

        homePage.productsButton();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/products");

        //6. Enter product name in search input and click search button
        productsPage.searchProducts("Polo");
        productsPage.searchButton();


        //7. Verify 'SEARCHED PRODUCTS' is visible
        productsPage.searchedProductsTextIsVisible();

        //8. Verify all the products related to search are visible
        productsPage.searchedProductsVisible();


    }
}

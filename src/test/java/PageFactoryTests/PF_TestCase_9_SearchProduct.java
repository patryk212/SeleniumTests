package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_9_SearchProduct extends BaseTest {

    @Test
    public void searchProduct() throws InterruptedException {
        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("https://automationexercise.com/");

        driver.manage().window().maximize();

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Products' button
        homePageFactory.productsButton();

        Thread.sleep(15000);

        homePageFactory.productsButton();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/products");


        //6. Enter product name in search input and click search button
        productsPageFactory.searchProduct("Polo");
        productsPageFactory.searchButton();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        productsPageFactory.searchedProductTextIsVisible();

        //8. Verify all the products related to search are visible
        productsPageFactory.visibleSearchedProducts();
    }
}

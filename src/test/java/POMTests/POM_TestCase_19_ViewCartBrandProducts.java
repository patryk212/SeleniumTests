package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_19_ViewCartBrandProducts extends BaseTest {

    @Test
    public void viewCartBrandProducts() throws InterruptedException, IOException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click products button
        homePage.productsButton();

        Thread.sleep(20000);

        homePage.productsButton();

        //5. Verify that Brands are visible on left side bar
        productsPage.visibleBrands();

        //6. Click on any brand name
        productsPage.poloCategory();

        //7. Verify that user is navigated to brand page and brand products are displayed
        productsPage.poloProductsDisplayed();

        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        Assert.assertEquals(url1, "https://automationexercise.com/brand_products/Polo");

        //8. On left side bar, click on any other brand link
        productsPage.hmCategory();

        //9. Verify that user is navigated to that brand page and can see products
        productsPage.hmProductsDisplayed();

        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        Assert.assertEquals(url2, "https://automationexercise.com/brand_products/H&M");

    }
}


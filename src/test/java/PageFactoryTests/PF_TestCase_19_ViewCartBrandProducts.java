package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_19_ViewCartBrandProducts extends BaseTest {

    @Test
    public void viewCartBrandProducts() throws InterruptedException {

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click products button
        homePageFactory.productsButton();

        Thread.sleep(10000);

        homePageFactory.productsButton();

        //5. Verify that Brands are visible on left side bar
        productsPageFactory.visibleBrand();

        //6. Click on any brand name
        productsPageFactory.poloCategory();

        //7. Verify that user is navigated to brand page and brand products are displayed
        productsPageFactory.poloProductsDisplayed();

        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        Assert.assertEquals(url1, "https://automationexercise.com/brand_products/Polo");

        //8. On left side bar, click on any other brand link
        productsPageFactory.hmCategory();

        //9. Verify that user is navigated to that brand page and can see products
        productsPageFactory.hmProductsDisplayed();

        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        Assert.assertEquals(url2, "https://automationexercise.com/brand_products/H&M");

    }
}

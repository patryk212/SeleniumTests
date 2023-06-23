package POMTests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_18_ViewCategoryProducts extends BaseTest {

    @Test
    public void viewCategoryProducts() throws IOException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click products button
        homePage.productsButton();

        Thread.sleep(20000);

        homePage.productsButton();

        //5. Verify that categories are visible on left side bar
        productsPage.categoriesAreVisibles();

        //6. Click on 'Women' category
        productsPage.womenCategory();

        Thread.sleep(10000);

        //7. Click on any category link under 'Women' category, for example: Dress
        productsPage.dressCategory();

        Thread.sleep(10000);

        //8. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        productsPage.womenDressProductsTextIsVisible();

        //9. On left side bar, click on any sub-category link of 'Men' category
        productsPage.manCategory();
        Thread.sleep(10000);
        productsPage.shirtCategory();


    }
}

package PageFactoryTests;



import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_18_ViewCategoryProducts extends BaseTest {

    @Test
    public void viewCategoryProducts() throws InterruptedException {

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click products button
        homePageFactory.productsButton();

        Thread.sleep(15000);

        homePageFactory.productsButton();

        //5. Verify that categories are visible on left side bar
        productsPageFactory.categoriesAreVisibles();

        //6. Click on 'Women' category
        productsPageFactory.womenCategory();

        Thread.sleep(10000);

        //7. Click on any category link under 'Women' category, for example: Dress
        productsPageFactory.dressCategory();

        Thread.sleep(10000);

        //8. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        productsPageFactory.womenDressTextVisible();

        //9. On left side bar, click on any sub-category link of 'Men' category
        productsPageFactory.manCategory();
        Thread.sleep(10000);
        productsPageFactory.shirtCategory();

    }
}


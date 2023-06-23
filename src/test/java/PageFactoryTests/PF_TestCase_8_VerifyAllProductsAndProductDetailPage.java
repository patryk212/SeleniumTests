package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_8_VerifyAllProductsAndProductDetailPage extends BaseTest {

    @Test
    public void verifyAllProductsAndProductDetailPage() throws InterruptedException {
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


        //5. Verify user is navigated to ALL PRODUCTS page successfully
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        //Assert.assertEquals(url, "https://automationexercise.com/products");

        //6. The products list is visible
        productsPageFactory.productListIsVisible();

        Thread.sleep(10000);

        //7. Click on 'View Product' of first product
        productsPageFactory.viewProductOfFirstProduct();

        //8. User is landed to product detail page
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        Assert.assertEquals(url1, "https://automationexercise.com/product_details/1");

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        productsPageFactory.productName();
        productsPageFactory.productPrice();
        productsPageFactory.productBrand();
        productsPageFactory.productAvailability();
        productsPageFactory.productCondition();
        productsPageFactory.productCategory();


    }
}

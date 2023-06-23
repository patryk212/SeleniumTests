package POMTests;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;
import java.time.Duration;

public class POM_TestCase_8_VerifyAllProductsAndProductDetailPage extends BaseTest {

    private WebDriverWait wait;

    @Test
    public void verifyAllProductsAndProductDetailPage() throws IOException, InterruptedException {

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
            //String url = driver.getCurrentUrl();
            //System.out.println(url);
            //Assert.assertEquals(url, "https://automationexercise.com/products");

            //6. The products list is visible
            productsPage.productListIsVisible();


            //7. Click on 'View Product' of first product
            productsPage.firstProduct();

            //8. User is landed to product detail page
            String url1 = driver.getCurrentUrl();
            System.out.println(url1);
            Assert.assertEquals(url1, "https://automationexercise.com/product_details/1");

            //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
            productsPage.productName();
            productsPage.productCategory();
            productsPage.productPrice();
            productsPage.productBrand();
            productsPage.productAvailabaility();
            productsPage.productCondition();

    }
}

package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_21_AddReviewOnProduct extends BaseTest {

    @Test
    public void addReviewOnProduct() throws InterruptedException {
        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4.Click products button
        homePageFactory.productsButton();

        Thread.sleep(15000);

        homePageFactory.productsButton();

        //5. Click on 'View Product' button
        productsPageFactory.viewProductOfFirstProduct();

        //6. Verify 'Write Your Review' is visible
        productsPageFactory.writeYourReviewVisible();

        //7. Enter name, email and review
        productsPageFactory.nameReview("asdads");
        productsPageFactory.emailReview("asdasd@dassd");
        productsPageFactory.textReview("asdasd");

        //8. Click 'Submit' button
        productsPageFactory.submitButtonReview();

        //9. Verify success message 'Thank you for your review.'
        productsPageFactory.successMessageAddReview();

    }
}

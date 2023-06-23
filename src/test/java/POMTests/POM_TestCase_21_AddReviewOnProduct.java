package POMTests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_21_AddReviewOnProduct extends BaseTest {

    @Test
    public void addReviewOnProduct() throws InterruptedException, IOException {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4.Click products
        homePage.productsButton();

        Thread.sleep(25000);

        homePage.productsButton();

        //5. Click on 'View Product' button
        productsPage.firstProduct();

        //6. Verify 'Write Your Review' is visible
        productsPage.writeYourReviewVisible();

        //7. Enter name, email and review
        productsPage.nameReview("asda");
        productsPage.emailReview("asdsa@sdasd");
        productsPage.textReview("asdasd");

        //8. Click 'Submit' button
        productsPage.reviewSubmitButton();

        //9. Verify success message 'Thank you for your review.'
        productsPage.successMessageAfterAddReview();

    }
}
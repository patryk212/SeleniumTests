package POMTests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_10_VerifySubscriptionInHomePage extends BaseTest {


    @Test
    public void verifySubscriptionInHomePage() throws IOException {

        HomePage homePage = new HomePage(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Scroll down to footer
        homePage.scrollToTheFooter();

        //5. Verify text 'SUBSCRIPTION'
        homePage.subscribeEmail("asdasd@dsada");

        //6. Enter email address in input and click arrow button
        homePage.subscribeButton();

        //7. Verify success message 'You have been successfully subscribed!' is visible
        homePage.successfullySubscribedTextIsVisible();

    }
}

package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_24_VerifyScrollUpUsingArrowButtonAndScrollDownFunctionality extends BaseTest {

    @Test
    public void verifyScrollUp() throws IOException, InterruptedException {
        driver.get("https://automationexercise.com/");

        HomePage homePage = new HomePage(driver);


        //3. Verify that home page is visible successfully
        Assert.assertTrue(homePage.isLoaded("Automation Exercise"));

        //4. Scroll down page to bottom
        homePage.scrollDownUsinArrowButton();

        //5. Verify 'SUBSCRIPTION' is visible
        homePage.textSubscriptionIsVisible();

        Thread.sleep(5000);

        //6. Click on arrow at bottom right side to move upward
        homePage.arrowButtonUp();

        Thread.sleep(5000);
    }
}

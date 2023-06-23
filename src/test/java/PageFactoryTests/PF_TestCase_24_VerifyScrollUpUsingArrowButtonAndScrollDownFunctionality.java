package PageFactoryTests;

import PageFactory.HomePageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_24_VerifyScrollUpUsingArrowButtonAndScrollDownFunctionality extends BaseTest {

    @Test
    public void verifyScrollUp() throws InterruptedException {

        driver.get("https://automationexercise.com/");

        HomePageFactory homePageFactory = new HomePageFactory(driver);

        //3. Verify that home page is visible successfully
        Assert.assertTrue(homePageFactory.isLoaded("Automation Exercise"));

        //4. Scroll down page to bottom
        homePageFactory.scrollDownUsingArrowKey();

        //5. Verify 'SUBSCRIPTION' is visible
        homePageFactory.textSubscriptionIsVisible();

        Thread.sleep(5000);

        //6. Scroll up page to top
        homePageFactory.arrowButtonUp();

    }
}

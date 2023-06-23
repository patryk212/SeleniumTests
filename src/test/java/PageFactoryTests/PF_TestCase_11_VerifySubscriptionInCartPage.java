package PageFactoryTests;

import PageFactory.HomePageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;


public class PF_TestCase_11_VerifySubscriptionInCartPage extends BaseTest {


    @Test
    public void verifySubscriptionInCartPage() throws InterruptedException {
        HomePageFactory homePageFactory = new HomePageFactory(driver);


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("https://automationexercise.com/");

        driver.manage().window().maximize();

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click 'Cart' button
        homePageFactory.cartButton();

        //5. Scroll down to footer
        homePageFactory.scrollDownToFooter();

        //6. Verify text 'SUBSCRIPTION'
        homePageFactory.textSubscriptionIsVisible();


        //7. Enter email address in input and click arrow button
        homePageFactory.enterSubscribeEmail("asdasd@sadasd");

        //8. Verify success message 'You have been successfully subscribed!' is visible
        homePageFactory.subscribeButton();

    }
}


package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_10_VerifySubscriptionInHomePage extends BaseTest {

    @Test
    public void verifySubscriptionInHomePage() throws InterruptedException {
        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("https://automationexercise.com/");

        driver.manage().window().maximize();

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");


        //4. Scroll down to footer
        Actions actions = new Actions(driver);
        WebElement footer = driver.findElement(By.id("footer"));
        actions.scrollToElement(footer);
        actions.perform();


        //5. Verify text 'SUBSCRIPTION'
        homePageFactory.textSubscriptionIsVisible();

        //6. Enter email address in input and click arrow button
        homePageFactory.enterSubscribeEmail("asdasd@sadasd");

        //7. Verify success message 'You have been successfully subscribed!' is visible
        homePageFactory.subscribeButton();

    }
}

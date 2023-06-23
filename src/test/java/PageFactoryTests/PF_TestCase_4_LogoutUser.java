package PageFactoryTests;

import PageFactory.HomePageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_4_LogoutUser extends BaseTest {

    @Test
    public void logoutUser(){

        HomePageFactory homePageFactory = new HomePageFactory(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePageFactory.clickSignUpLoginButton();

        //5. Verify 'Login to your account' is visible
        homePageFactory.loginToYourAccountTextIsVisible();

        //6. Enter correct email address and password
        //test1@tests.com  12345
        homePageFactory.loginEmail("test1@tests.com");
        homePageFactory.loginPassword("12345");

        //7. Click 'login' button
        homePageFactory.loginButton();

        //8. Verify that 'Logged in as username' is visible
        homePageFactory.loggedAsVisible();

        //9. Click 'Logout' button
        homePageFactory.logoutButton();

        //10. Verify that user is navigated to login page
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/login");




    }
}

package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_4_LogoutUser extends BaseTest {

    @Test
    public void logoutUser() throws IOException {

        HomePage homePage = new HomePage(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com");

        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePage.clickSignUpLoginButton();

        //5. Verify 'Login to your account' is visible
        homePage.loginToYourAccountIsVisible();

        //6. Enter correct email address and password
        //test1@tests.com  12345
        homePage.loginEmail("test1@tests.com");
        homePage.loginPassword("12345");

        //7. Click 'login' button
        homePage.loginButton();

        //8. Verify that 'Logged in as username' is visible
        homePage.loggedAsVisible();

        //9. Click 'Logout' button
        homePage.logoutButton();

        //10. Verify that user is navigated to login page
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/login");
    }
}

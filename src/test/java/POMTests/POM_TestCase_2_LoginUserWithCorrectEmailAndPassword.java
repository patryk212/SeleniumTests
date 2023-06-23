package POMTests;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_2_LoginUserWithCorrectEmailAndPassword extends BaseTest {


    @Test
    public void loginUserWithCorrectEmailAndPassword() throws IOException {

            HomePage homePage = new HomePage(driver);

            //1. Launch browser
            //2. Navigate to url 'http://automationexercise.com'


            driver.navigate().to("http://automationexercise.com");

            //3. Verify that home page is visible successfully
            homePage.isLoaded("Automation Exercise");

            //4. Click on 'Signup / Login' button
            homePage.clickSignUpLoginButton();

            //5. Verify 'Login to your account' is visible
            homePage.loginToYourAccountIsVisible();

            //6. Enter correct email address and password
            //email: test1@tests.com  //password: 12345
            homePage.loginEmail("test1@tests.com");
            homePage.loginPassword("12345");

            //7. Click 'login' button
            homePage.loginButton();

            //8. Verify that 'Logged in as username' is visible
            homePage.loggedAsVisible();

            //9. Click 'Delete Account' button
            //homePage.deleteAccountButton();

            //10.Verify that 'ACCOUNT DELETED!' is visible
            //homePage.accountDeletedTextIsVisible();



    }
}

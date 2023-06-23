package POMTests;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_3_LoginUserWithIncorrectEmailAndPassword extends BaseTest {

    @Test
    public void loginUserWithIncorrectEmailAndPassword() throws IOException {

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

        //6. Enter incorrect email address and password
        homePage.loginEmail("incoorectemail@email.com");
        homePage.loginPassword("incorrectpassword");

        //7. Click 'login' button
        homePage.loginButton();

        //8. Verify error 'Your email or password is incorrect!' is visible
        homePage.yourEmailOrPasswordIsIncorrect();




    }
}

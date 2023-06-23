package POMTests;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_5_RegisterUserWithExistingEmail extends BaseTest {

    @Test    public void registerUserWithExistingEmail() throws IOException {
        HomePage homePage = new HomePage(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePage.clickSignUpLoginButton();

        //5. Verify 'New User Signup!' is visible
        homePage.newUserSignupTextIsVisible();

        //6. Enter name and already registered email address
        homePage.enterSignupNameAndEmail("test","test1@tests.com");

        //7. Click 'Signup' button
        homePage.signUpButton();

        //8. Verify error 'Email Address already exist!' is visible
        homePage.emailAddressAlreadyExistsIsVisible();
    }
}

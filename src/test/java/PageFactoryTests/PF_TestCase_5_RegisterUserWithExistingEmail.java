package PageFactoryTests;

import PageFactory.HomePageFactory;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_5_RegisterUserWithExistingEmail extends BaseTest {

    @Test
    public void registerUserWithExistingEmail(){

        HomePageFactory homePageFactory = new HomePageFactory(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePageFactory.clickSignUpLoginButton();

        //5. Verify 'New User Signup!' is visible
        homePageFactory.newUserSignupTextIsVisible();

        //6. Enter name and already registered email address
        homePageFactory.enterSignupName("testname");
        homePageFactory.enterSignupEmail("test1@tests.com");

        //7. Click 'Signup' button
        homePageFactory.signUpButton();

        //8. Verify error 'Email Address already exist!' is visible
        homePageFactory.emailAddressAlreadyExistsIsVisible();








    }
}

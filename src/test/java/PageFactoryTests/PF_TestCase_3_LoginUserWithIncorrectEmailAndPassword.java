package PageFactoryTests;

import PageFactory.HomePageFactory;
import org.testng.annotations.Test;
import utils.BaseTest;

import static utils.BaseTest.driver;

public class PF_TestCase_3_LoginUserWithIncorrectEmailAndPassword extends BaseTest {

    @Test
    public void loginUserWithIncorrectEmailAndPassword(){

        HomePageFactory homePageFactory = new HomePageFactory(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePageFactory.clickSignUpLoginButton();

        //5. Verify 'Login to your account' is visible
        homePageFactory.loginToYourAccountTextIsVisible();

        //6.Enter incorrect email address and password
        homePageFactory.loginEmail("incorrectemail@mail.com");
        homePageFactory.loginPassword("incorrectpassword");

        //7. Click 'login' button
        homePageFactory.loginButton();

        //8. Verify error 'Your email or password is incorrect!' is visible
        homePageFactory.yourEmailOrPasswordIsIncorrect();

    }
}

package PageFactoryTests;

import PageFactory.HomePageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class PF_TestCase_2_LoginUserWithCorrectEmailAndPassword extends BaseTest {

    @Test
    public void testLoginUserWithCorrectEmailAndPassword() throws IOException {



        HomePageFactory homePageFactory = new HomePageFactory(driver);



        driver.navigate().to("http://automationexercise.com");

        homePageFactory.isLoaded("Automation Exercise");

        homePageFactory.clickSignUpLoginButton();

        homePageFactory.loginToYourAccountTextIsVisible();

        //email: test1@tests.com  //password: 12345
        homePageFactory.loginEmail("test1@tests.com");

        homePageFactory.loginPassword("12345");

        homePageFactory.loginButton();

        homePageFactory.loggedAsVisible();

        //homePageFactory.deleteAccountButton();

        //homePageFactory.accountDeletedTextIsVisible();


    }
}

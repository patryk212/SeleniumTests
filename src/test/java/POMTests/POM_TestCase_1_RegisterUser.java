package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utils.BaseTest;

import java.io.IOException;


public class POM_TestCase_1_RegisterUser extends BaseTest {


    @Test
    public static void test() throws IOException, InterruptedException {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'


        driver.get("https://automationexercise.com/");

        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        //3. Verify that home page is visible successfully
        Assert.assertTrue(homePage.isLoaded("Automation Exercise"));

        //4. Click on 'Signup / Login' button
        homePage.clickSignUpLoginButton();

        //5. Verify 'New User Signup!' is visible
        homePage.newUserSignupTextIsVisible();

        //6. Enter name and email address
        homePage.enterSignupNameAndEmail("tegst", "tessts31sssss@test2ssss22s.com");

        //7. Click 'Signup' button
        homePage.signUpButton();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        registrationPage.enterAccountInformationIsVisible();

        //9. Fill details: Title, Name, Email, Password, Date of birth
        registrationPage.radioTitleMr();

        registrationPage.enterPassword("12345");

        registrationPage.selectDayOfBirth("5");

        registrationPage.selectMonthOfBirth("June");

        registrationPage.selectYearOfBirth("2002");

        //10. Select checkbox 'Sign up for our newsletter!'
        registrationPage.signUpForOurNewsletter();

        //11. Select checkbox 'Receive special offers from our partners!'
        registrationPage.receiveSpecialOffers();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        registrationPage.enterFirstName("Jan");

        registrationPage.enterLastName("Pawlak");

        registrationPage.optionalEnterCompanyName("Optional Name");

        registrationPage.enterAddress("testaddress1");

        registrationPage.optionalAddress2("testaddress2");

        registrationPage.selectCountry("India");

        registrationPage.enterState("test1");

        registrationPage.enterCity("testCity");

        registrationPage.enterZipCode("testzipcode");

        registrationPage.enterMobileNumber("213123123");

        //13. Click 'Create Account button'
        registrationPage.createAccountButton();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        registrationPage.accountCreatedTextVisible();

        //15. Click 'Continue' button
        registrationPage.continueButtonAfterRegister();

        //16. Verify that 'Logged in as username' is visible
        homePage.loggedAsVisible();

        //17. Click 'Delete Account' button
        homePage.deleteAccountButton();




    }
}

package PageFactoryTests;

import PageFactory.HomePageFactory;
import PageFactory.RegistrationPageFactory;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_1_RegisterUser extends BaseTest {



    @Test
    public void testPageFactory() throws InterruptedException {

        //1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        BaseTest.driver.get("https://automationexercise.com/");
        BaseTest.driver.manage().window().maximize();

        HomePageFactory homePageFactory = new HomePageFactory(BaseTest.driver);
        RegistrationPageFactory registrationPageFactory = new RegistrationPageFactory(BaseTest.driver);

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Signup / Login' button
        homePageFactory.clickSignUpLoginButton();


        //5. Verify 'New User Signup!' is visible
        homePageFactory.newUserSignupTextIsVisible();

        //6. Enter name and email address
        homePageFactory.enterSignupName("sssdds");
        homePageFactory.enterSignupEmail("sszzdxxjfjsfgg@fsklsssjjssszszkksxllccxx");

        //7. Click 'Signup' button
        homePageFactory.signUpButton();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        registrationPageFactory.enterAccountInformationIsVisible();


        //9. Fill details: Title, Name, Email, Password, Date of birth
        registrationPageFactory.selectButtonTitleMr();

        registrationPageFactory.fieldPassword("1234");

        registrationPageFactory.selectDayOfBirth("5");

        registrationPageFactory.selectMonthOfBirth("May");

        registrationPageFactory.selectYearOfBirth("2002");

        //10. Select checkbox 'Sign up for our newsletter!'
        registrationPageFactory.signUpForOurNewsletter();

        //11. Select checkbox 'Receive special offers from our partners!'
        registrationPageFactory.receiveSpecialOffers();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        registrationPageFactory.enterFirstName("John");

        registrationPageFactory.enterLastName("Pol");

        registrationPageFactory.optionalEnterCompanyName("TestCompany");

        registrationPageFactory.enterAddress("adres1");

        registrationPageFactory.optionalAddress2("adrres2");

        registrationPageFactory.selectCountry("India");

        registrationPageFactory.enterState("testState");

        registrationPageFactory.enterCity("testCity");

        registrationPageFactory.enterZipCode("2222");

        registrationPageFactory.enterMobileNumber("123123123");

        //13. Click 'Create Account button'
        registrationPageFactory.createAccountButton();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        registrationPageFactory.accountCreatedTextVisible();


        //15. Click 'Continue' button
        registrationPageFactory.continueButtonAfterRegister();

        Thread.sleep(25000);

        registrationPageFactory.continueButtonAfterRegister();

        //16. Verify that 'Logged in as username' is visible
        // homePageFactory.loggedAsVisible();

        //17. Click 'Delete Account' button
        homePageFactory.deleteAccountButton();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        //homePageFactory.accountDeletedTextIsVisible();
       // homePageFactory.continoueButtonAfterDeleteAccount();
    }
}

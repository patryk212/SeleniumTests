package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.RegistrationPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_15_PlaceOrderRegisterBeforeCheckout extends BaseTest {

    @Test
    public void placeOrderRegisterBeforeCheckout() throws InterruptedException, IOException {

        driver.get("https://automationexercise.com/");

        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        //3. Verify that home page is visible successfully
        Assert.assertTrue(homePage.isLoaded("Automation Exercise"));

        //4. Click on 'Signup / Login' button
        homePage.clickSignUpLoginButton();

        //5. Verify 'New User Signup!' is visible
        homePage.newUserSignupTextIsVisible();

        //6. Enter name and email address
        homePage.enterSignupNameAndEmail("test", "tessts31snssss@xxsxxssxx.com");

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

        Thread.sleep(25000);
       //homePage.loggedAsVisible();

        //17. Click products button
        homePage.productsButton();

        Thread.sleep(10000);

        //18.Hover over first product and click 'Add to cart'
        productsPage.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //19.Click 'View Cart' button
        productsPage.viewCart();

        //20. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //21. Click Proceed To Checkout
        productsPage.proceedToCheckout();

        //22. Enter description in comment text area and click 'Place Order'
        productsPage.commentAfterOrder("asdas");
        productsPage.placeOrderButton();

        //23. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        productsPage.nameOnCard("asdasd");
        productsPage.cardNumber("123123");

        productsPage.cvcNumber("123");
        productsPage.expirationMonth("12");
        productsPage.expirationYear("2000");

        //24. Click 'Pay and Confirm Order' button
        productsPage.payAndConfirmButton();
        productsPage.continoueAfterOrder();

        //25. Delete account
        homePage.deleteAccountButton();



    }
}

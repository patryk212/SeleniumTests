package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.RegistrationPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_14_PlaceOrderRegisterWhileCheckout extends BaseTest {

    @Test
    public void placeOrderRegisterWhileCheckout() throws IOException, InterruptedException {

        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        Thread.sleep(15000);

        //4.Click products button
        homePage.productsButton();

        Thread.sleep(5000);

        //5. Hover over first product and click 'Add to cart'
        productsPage.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //6. Click 'View Cart' button
        productsPage.viewCart();

        //7. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //8. Click Proceed To Checkout
        productsPage.proceedToCheckout();

        Thread.sleep(5000);

        //9. Click 'Register / Login' button
        productsPage.registerLogin();

        //10. Fill all details in Signup and create account
        homePage.enterSignupNameAndEmail("test", "tessstssas12ddfdsss31sasdssss@test2ssss2s2s.com");

        //11. Click 'Signup' button
        homePage.signUpButton();

        //12. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        registrationPage.enterAccountInformationIsVisible();

        //13. Fill details: Title, Name, Email, Password, Date of birth
        registrationPage.radioTitleMr();

        registrationPage.enterPassword("12345");

        registrationPage.selectDayOfBirth("5");

        registrationPage.selectMonthOfBirth("June");

        registrationPage.selectYearOfBirth("2002");

        //14. Select checkbox 'Sign up for our newsletter!'
        registrationPage.signUpForOurNewsletter();

        //15. Select checkbox 'Receive special offers from our partners!'
        registrationPage.receiveSpecialOffers();

        //16. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
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

        //17. Click 'Create Account button'
        registrationPage.createAccountButton();

        //18. Verify that 'ACCOUNT CREATED!' is visible
        registrationPage.accountCreatedTextVisible();

        //19. Click 'Continue' button
        registrationPage.continueButtonAfterRegister();

        //20. Verify that 'Logged in as username' is visible
        homePage.loggedAsVisible();

        //21.Click 'Cart' button
        homePage.cartButton();

        //22. Click 'Proceed To Checkout' button
        productsPage.proceedToCheckout();

        Thread.sleep(5000);

        //23. Enter description in comment text area and click 'Place Order'
        productsPage.commentAfterOrder("asdasd");
        productsPage.placeOrderButton();

        //24. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        productsPage.nameOnCard("asdasd");
        productsPage.cardNumber("123123");

        productsPage.cvcNumber("123");
        productsPage.expirationMonth("12");
        productsPage.expirationYear("2000");

        //25. Click 'Pay and Confirm Order' button
        productsPage.payAndConfirmButton();

        productsPage.continoueAfterOrder();

        //26. Click 'Delete Account' button
        homePage.deleteAccountButton();

    }
}

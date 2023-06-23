package PageFactoryTests;


import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import PageFactory.RegistrationPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_15_PlaceOrderRegisterBeforeCheckout extends BaseTest {

    @Test
    public void placeOrderRegisterBeforeCheckout() throws InterruptedException {

        driver.get("https://automationexercise.com/");

        HomePageFactory homePageFactory = new HomePageFactory(driver);
        RegistrationPageFactory registrationPageFactory = new RegistrationPageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        //3. Verify that home page is visible successfully
        Assert.assertTrue(homePageFactory.isLoaded("Automation Exercise"));

        //4. Click on 'Signup / Login' button
        homePageFactory.clickSignUpLoginButton();

        //5. Verify 'New User Signup!' is visible
        homePageFactory.newUserSignupTextIsVisible();

        //6. Enter name and email address
        homePageFactory.enterSignupEmail( "tessts31sssss@texxsggas.com");
        homePageFactory.enterSignupName("asdasd");

        //7. Click 'Signup' button
        homePageFactory.signUpButton();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        registrationPageFactory.enterAccountInformationIsVisible();

        //9. Fill details: Title, Name, Email, Password, Date of birth
        registrationPageFactory.selectButtonTitleMr();

        registrationPageFactory.fieldPassword("12345");

        registrationPageFactory.selectDayOfBirth("5");

        registrationPageFactory.selectMonthOfBirth("June");

        registrationPageFactory.selectYearOfBirth("2002");

        //10. Select checkbox 'Sign up for our newsletter!'
        registrationPageFactory.signUpForOurNewsletter();

        //11. Select checkbox 'Receive special offers from our partners!'
        registrationPageFactory.receiveSpecialOffers();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        registrationPageFactory.enterFirstName("Jan");

        registrationPageFactory.enterLastName("Pawlak");

        registrationPageFactory.optionalEnterCompanyName("Optional Name");

        registrationPageFactory.enterAddress("testaddress1");

        registrationPageFactory.optionalAddress2("testaddress2");

        registrationPageFactory.selectCountry("India");

        registrationPageFactory.enterState("test1");

        registrationPageFactory.enterCity("testCity");

        registrationPageFactory.enterZipCode("testzipcode");

        registrationPageFactory.enterMobileNumber("213123123");

        //13. Click 'Create Account button'
        registrationPageFactory.createAccountButton();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        registrationPageFactory.accountCreatedTextVisible();

        //15. Click 'Continue' button
        registrationPageFactory.continueButtonAfterRegister();

        //16. Verify that 'Logged in as username' is visible

        Thread.sleep(10000);
        homePageFactory.loggedAsVisible();

        //17. Click products button
        homePageFactory.productsButton();

        Thread.sleep(10000);

        //18.Hover over first product and click 'Add to cart'
        productsPageFactory.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //19.Click 'View Cart' button
        productsPageFactory.cartView();

        //20. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //21. Click Proceed To Checkout
        productsPageFactory.proccedToCheckout();

        //22. Enter description in comment text area and click 'Place Order'
        productsPageFactory.commentAboutOrder("asdas");
        productsPageFactory.placeOrderButton();

        //23. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        productsPageFactory.nameOnCard("asdasd");
        productsPageFactory.cardNumber("123123");

        productsPageFactory.cvcNumber("123");
        productsPageFactory.expirationMonth("12");
        productsPageFactory.expirationYear("2000");

        //24. Click 'Pay and Confirm Order' button
        productsPageFactory.payAndConfirmButton();
        productsPageFactory.continoueAfterOrder();

        //25. Delete account
        homePageFactory.deleteAccountButton();
    }
}

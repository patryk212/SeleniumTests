package PageFactoryTests;


import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import PageFactory.RegistrationPageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_14_PlaceOrderRegisterWhileCheckout extends BaseTest {

    @Test
    public void placeOrderRegisterWhileCheckout() throws InterruptedException {

        RegistrationPageFactory registrationPageFactory = new RegistrationPageFactory(driver);
        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ProductsPageFactory productsPageFactory = new ProductsPageFactory(driver);

        driver.navigate().to("https://automationexercise.com/");


        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        Thread.sleep(15000);

        //4. Click products button
        homePageFactory.productsButton();


        //5. Hover over first product and click 'Add to cart'
        productsPageFactory.hoverOverFirstProductAndClickAddToCart();

        Thread.sleep(5000);

        //6. Click 'View Cart' button
        productsPageFactory.cartView();

        //7. Verify that cart page is displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://automationexercise.com/view_cart");

        //8. Click Proceed To Checkout
        productsPageFactory.proccedToCheckout();

        Thread.sleep(5000);

        //9. Click 'Register / Login' button
        productsPageFactory.registerLogin();

        //10. Fill all details in Signup and create account
        homePageFactory.enterSignupName("sss");
        homePageFactory.enterSignupEmail("Possasdadasl@s123sasssada");

        //11. Click 'Signup' button
        homePageFactory.signUpButton();

        //12. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        registrationPageFactory.enterAccountInformationIsVisible();


        //13. Fill details: Title, Name, Email, Password, Date of birth
        registrationPageFactory.selectButtonTitleMr();

        registrationPageFactory.fieldPassword("1234");

        registrationPageFactory.selectDayOfBirth("5");

        registrationPageFactory.selectMonthOfBirth("May");

        registrationPageFactory.selectYearOfBirth("2002");

        //14. Select checkbox 'Sign up for our newsletter!'
        registrationPageFactory.signUpForOurNewsletter();

        //15. Select checkbox 'Receive special offers from our partners!'
        registrationPageFactory.receiveSpecialOffers();

        //16. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
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

        //17. Click 'Create Account button'
        registrationPageFactory.createAccountButton();

        //18. Verify that 'ACCOUNT CREATED!' is visible
        registrationPageFactory.accountCreatedTextVisible();

        Thread.sleep(5000);


        //19. Click 'Continue' button
        registrationPageFactory.continueButtonAfterRegister();

        Thread.sleep(5000);

        //20. Verify that 'Logged in as username' is visible
        homePageFactory.loggedAsVisible();

        //21.Click 'Cart' button
        homePageFactory.cartButton();

        //22. Click 'Proceed To Checkout' button
        productsPageFactory.proccedToCheckout();

        Thread.sleep(5000);

        //23. Enter description in comment text area and click 'Place Order'
        productsPageFactory.commentAboutOrder("asdasd");
        productsPageFactory.placeOrderButton();

        //24. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        productsPageFactory.nameOnCard("asdad");
        productsPageFactory.cardNumber("123123");
        productsPageFactory.cvcNumber("123");
        productsPageFactory.expirationMonth("12");
        productsPageFactory.expirationYear("1998");

        //25. Click 'Pay and Confirm Order' button
        productsPageFactory.payAndConfirmButton();
        productsPageFactory.continoueAfterOrder();

        //26. Click 'Delete Account' button
        homePageFactory.deleteAccountButton();
    }
}

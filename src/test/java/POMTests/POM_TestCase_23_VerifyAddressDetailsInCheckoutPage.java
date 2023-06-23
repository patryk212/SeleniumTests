package POMTests;

import PageFactory.HomePageFactory;
import PageFactory.ProductsPageFactory;
import PageFactory.RegistrationPageFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.RegistrationPage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_23_VerifyAddressDetailsInCheckoutPage extends BaseTest {

    @Test
    public void verifyAddressDetailsInCheckoutPage() throws InterruptedException, IOException {
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
        homePage.enterSignupNameAndEmail("txessffft", "tessxts3fsa1kkssxsss@texxss.com");

        //7. Click 'Signup' button
        homePage.signUpButton();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
       // registrationPage.enterAccountInformationIsVisible();

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

        Thread.sleep(20000);
        //homePage.loggedAsVisible();

        //17. Click products button
        homePage.productsButton();

        Thread.sleep(10000);

        homePage.productsButton();

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

        //22.Verify that the delivery address is same address filled at the time registration of account

        String getNameToVerify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_firstname.address_lastname:nth-child(2)")).getText();
        System.out.println(getNameToVerify);
        Assert.assertEquals(getNameToVerify, "Mr. Jan Pawlak");

        String getAddress1Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_address1.address_address2:nth-child(3)")).getText();
        System.out.println(getAddress1Verify);
        Assert.assertEquals(getAddress1Verify, "Optional Name");

        String getAddress2Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_address1.address_address2:nth-child(4)")).getText();
        System.out.println(getAddress2Verify);
        Assert.assertEquals(getAddress2Verify, "testaddress1");

        String getAddress3Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_address1.address_address2:nth-child(5)")).getText();
        System.out.println(getAddress3Verify);
        Assert.assertEquals(getAddress3Verify, "testaddress2");

        String getAddress4Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_city.address_state_name.address_postcode:nth-child(6)")).getText();
        System.out.println(getAddress4Verify);
        Assert.assertEquals(getAddress4Verify, "testCity test1 testzipcode");

        String getCountryNameVerify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_country_name:nth-child(7)")).getText();
        System.out.println(getCountryNameVerify);
        Assert.assertEquals(getCountryNameVerify, "India");

        String getPhoneVerifty = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(1) ul.address.item.box > li.address_phone:nth-child(8)")).getText();
        System.out.println(getPhoneVerifty);
        Assert.assertEquals(getPhoneVerifty, "213123123");


        //23. Verify that the billing address is same address filled at the time registration of account

        String getBillingNameToVerify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_firstname.address_lastname:nth-child(2)")).getText();
        System.out.println(getBillingNameToVerify);
        Assert.assertEquals(getBillingNameToVerify, "Mr. Jan Pawlak");

        String getBillingAddress1Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_address1.address_address2:nth-child(3)")).getText();
        System.out.println(getBillingAddress1Verify);
        Assert.assertEquals(getBillingAddress1Verify, "Optional Name");

        String getBillingAddress2Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_address1.address_address2:nth-child(4)")).getText();
        System.out.println(getBillingAddress2Verify);
        Assert.assertEquals(getBillingAddress2Verify, "testaddress1");

        String getBillingAddress3Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_address1.address_address2:nth-child(5)")).getText();
        System.out.println(getBillingAddress3Verify);
        Assert.assertEquals(getBillingAddress3Verify, "testaddress2");

        String getBillingAddress4Verify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_city.address_state_name.address_postcode:nth-child(6)")).getText();
        System.out.println(getBillingAddress4Verify);
        Assert.assertEquals(getBillingAddress4Verify, "testCity test1 testzipcode");

        String getBillingCountryNameVerify = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_country_name:nth-child(7)")).getText();
        System.out.println(getBillingCountryNameVerify);
        Assert.assertEquals(getBillingCountryNameVerify, "India");

        String getBillingPhoneVerifty = driver.findElement(By.cssSelector("div.container div.checkout-information:nth-child(3) div.row div.col-xs-12.col-sm-6:nth-child(2) ul.address.alternate_item.box > li.address_phone:nth-child(8)")).getText();
        System.out.println(getBillingPhoneVerifty);
        Assert.assertEquals(getBillingPhoneVerifty, "213123123");


        //24. Delete account
        homePage.deleteAccountButton();



    }
}


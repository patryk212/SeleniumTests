package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUs;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_6_ContactUsForm extends BaseTest {



    @Test
    public void contactUsTest() throws IOException {

        HomePage homePage = new HomePage(driver);
        ContactUs contactUs = new ContactUs(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click on 'Contact Us' button
        homePage.contactUsButton();

        //5. Verify 'GET IN TOUCH' is visible
        contactUs.getInTouchIsVisible();

        //6. Enter name, email, subject and message
        contactUs.enterEmail("adsad@dads");
        contactUs.enterName("adasd");
        contactUs.enterSubject("asdasd");
        contactUs.enterMessage("Adsasd");

        //8. Click 'Submit' button
        contactUs.submitButton();

        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        contactUs.successYourDetailsHaveBeenSubmittedIsVisible();

        //11. Click 'Home' button
        contactUs.homeButton();

        //12.And verify that landed to home page successfully
       // String url = driver.getCurrentUrl();
       // System.out.println(url);
       // Assert.assertEquals(url, "https://automationexercise.com/");


    }
}

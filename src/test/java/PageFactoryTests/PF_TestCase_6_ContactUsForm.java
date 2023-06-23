package PageFactoryTests;

import PageFactory.ContactUsPageFactory;
import PageFactory.HomePageFactory;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_6_ContactUsForm extends BaseTest {

    @Test
    public void contactUsForm() throws InterruptedException {
        HomePageFactory homePageFactory = new HomePageFactory(driver);
        ContactUsPageFactory contactUsPageFactory = new ContactUsPageFactory(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Contact Us' button
        homePageFactory.contactUsButton();



        //5. Verify 'GET IN TOUCH' is visible
        contactUsPageFactory.getInTouchIsVisible();

        //6. Enter name, email, subject and message
        contactUsPageFactory.enterName("asdasd");
        contactUsPageFactory.enterEmail("asdad@dad");
        contactUsPageFactory.enterSubject("asdasd");
        contactUsPageFactory.enterMessage("Asdasd");

        //8. Click 'Submit' button
        contactUsPageFactory.submitButton();

        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        contactUsPageFactory.successYourDetailsHaveBeenSubmittedIsVisible();

        //11.Home button
        contactUsPageFactory.homeButton();

        //12.verify that landed to home page successfully
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        //Assert.assertEquals(url, "https://automationexercise.com/");


    }
}

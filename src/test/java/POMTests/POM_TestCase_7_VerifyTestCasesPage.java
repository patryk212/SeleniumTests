package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

import java.io.IOException;

public class POM_TestCase_7_VerifyTestCasesPage extends BaseTest {


    @Test
    public void verifyTestCasePage() throws IOException {
        HomePage homePage = new HomePage(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePage.isLoaded("Automation Exercise");

        //4. Click on 'Test Cases' button
        homePage.testCaseButton();

        //5. Verify user is navigated to test cases page successfully
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        //Assert.assertEquals(url, "https://automationexercise.com/test_cases");

    }
}

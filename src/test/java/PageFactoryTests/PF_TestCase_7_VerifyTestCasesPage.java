package PageFactoryTests;

import PageFactory.HomePageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class PF_TestCase_7_VerifyTestCasesPage extends BaseTest {

    @Test
    public void verfiyTestCasePage(){

        HomePageFactory homePageFactory = new HomePageFactory(driver);

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://automationexercise.com/");

        //3. Verify that home page is visible successfully
        homePageFactory.isLoaded("Automation Exercise");

        //4. Click on 'Test Cases' button
        homePageFactory.testCaseButton();

        //5. Verify user is navigated to test cases page successfully
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        //Assert.assertEquals(url, "https://automationexercise.com/test_cases");

    }
}

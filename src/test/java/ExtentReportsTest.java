import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ExtentReportsTest extends BaseTest {

    @Test
    public static void extendTest(){

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");

        //Create ExtentReports and attach reporters

        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);

        //Creates a toggle for the given test, adds all log events under it

        ExtentTest test1 = extentReports.createTest("First Test", "Testing extent reports");

        test1.log(Status.INFO, "Starting test");
        driver.get("https://www.google.com");
        test1.pass("Navigate to google.com");
        test1.pass("Close the browser");
        test1.info("Test complete!");

        extentReports.flush();



    }



}

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.io.IOException;

public class ExtendReportsWithTestNG extends BaseTest {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extentReports;

    @BeforeSuite
    public void setUp(){
        htmlReporter = new ExtentHtmlReporter("extent-report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
    }
    @Test
    public void test1() throws IOException {
        ExtentTest test = extentReports.createTest("test1","test1 test ng");
        test.log(Status.INFO,"test1 test ng");
        test.info("This step show usage of log");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");


    }

    @AfterSuite
    public void tearDown() {
        extentReports.flush();
    }
}

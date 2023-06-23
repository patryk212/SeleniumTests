package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static Properties loc = new Properties();

    @BeforeMethod
    public void setUp() throws IOException {
        if (driver == null) {
            String configFilePath = System.getProperty("user.dir") + "/config.properties";
            String locatorsFilePath = System.getProperty("user.dir") + "/locators.properties";
            FileInputStream configStream = new FileInputStream(configFilePath);
            FileInputStream locatorsStream = new FileInputStream(locatorsFilePath);
            prop.load(configStream);
            loc.load(locatorsStream);
        }
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addExtensions(new File("block.crx"));
            //options.setCapability("javascriptEnabled", false);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        System.out.println("TearDown Successfull");
    }
}
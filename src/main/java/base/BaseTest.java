package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest {

    protected WebDriver driver;

    // Logger instance for this class
    protected static final Logger logger =
            LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setup() {

        logger.info("Launching Chrome browser");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        logger.info("Navigating to login page");
        driver.get("https://automationexercise.com/login");
    }

    @AfterMethod
    public void teardown() {

        logger.info("Closing browser");

        if (driver != null) {
            driver.quit();   // ✅ better than close()
        }
    }
}

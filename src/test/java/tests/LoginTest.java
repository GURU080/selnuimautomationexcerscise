package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {

        logger.info("Starting valid login test");

        LoginPage loginPage = new LoginPage(driver);

        logger.info("Entering email");
        loginPage.enterEmail("guruprasadm1502@gmail.com");

        logger.info("Entering password");
        loginPage.enterPassword("12345");

        logger.info("Clicking login button");
        loginPage.clickLogin();

        logger.info("Verifying page title after login");
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");

        logger.info("Valid login test completed successfully");
    }
}

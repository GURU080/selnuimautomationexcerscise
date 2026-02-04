package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest  extends BaseTest{
	
	@Test
	public void testvalidlogin(){
		
		LoginPage loginpage =new LoginPage(driver);
		loginpage.enterEmail("guruprasadm1502@gmail.com");
		loginpage.enterPassword("12345");
		loginpage.clickLogin();
		System.out.println("titel of the page is :"+ driver.getTitle() );
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
	
		
	}
}

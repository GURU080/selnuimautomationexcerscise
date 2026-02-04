package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
	   driver =new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void teardown() {
		
		if (driver  != null ) {
			driver.close();
		}
	}
	

}

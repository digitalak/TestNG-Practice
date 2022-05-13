package TestNGProgram;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class TestNG3 extends BaseClass{

	@BeforeClass
	public void setUp() {
		BaseClass.intilizatin();
		System.out.println("Before Class");// 1
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority=1)
	public void validateHomePageTitle() {
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void validateURL() {
		String actualURL=driver.getCurrentUrl();
	   Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	@Test(priority=3)
	public void validateLogo() {
		Boolean logoStatus=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(logoStatus, true);
	}
	
	public void logout() {
		System.out.println("LogOut ");
	}
	
}

package TestNGProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class TestNG4 extends BaseClass{
	
	@BeforeClass
	public void setUpOrangeHRM() {
		
	BaseClass.intilizatin();
	}
	
	@Test(priority=1)
	public void loginFuncationality() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
	
	@Test(priority=2)
	public void validateTitle() {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	@Test(priority=3)
	public void validateUrl() {
		String acutalURL=driver.getCurrentUrl();
		Assert.assertEquals(acutalURL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	@AfterClass
	public void tearDown() {
		
		System.out.println("Close the Application");
	}

}

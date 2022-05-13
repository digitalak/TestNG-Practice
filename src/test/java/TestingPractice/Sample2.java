package TestingPractice;

import java.security.PublicKey;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample2 {
	WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A K S H A Y\\TestingPractice\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

}

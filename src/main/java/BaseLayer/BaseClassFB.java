package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassFB {
	public static WebDriver driver;
	public void inilization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A K S H A Y\\TestingPractice\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com/reg");
	}

	
}

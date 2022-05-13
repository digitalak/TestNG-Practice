package TestNGProgram;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
	}
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login Page");
	}
	@Test(priority=2)
	public void homePage() {
		System.out.println("Home Page");
	}
	@Test(priority=3)
	public void pimPage() {
		System.out.println("PIM Page");
	}
	@AfterMethod
	public void logOut() {
        System.out.println("After Method");
	}

}

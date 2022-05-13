package TestingPractice;

import org.testng.annotations.Test;

public class HRMfunctionalty {
	
	@Test(priority=1)
	public void login() {
		System.out.println("Orange HRM Login");
	}
	
	@Test(priority=2)
	public void search() {
		System.out.println("Orange HRM Search Functionality");
	}	
			
	@Test(priority=3)
	public void logout() {
		System.out.println("Orange HRM Logout");
	}

}

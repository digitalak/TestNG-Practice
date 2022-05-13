package TestNGProgram;

import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test(priority=1)
	public void loginFuncationality() {
		System.out.println("Login the Funcationality");
	} 
	
	@Test(dependsOnMethods= {"loginFuncationality"}, priority=2)
	public void homepagefuncationality() {
		System.out.println("Home page Funcationality");
	}
	
	@Test(priority=3)
	public void pimPageFuncationality() {
		System.out.println("PIM page Funcationality");
	}
	
	@Test(priority=4)
	public void logout() {
		System.out.println("Logout Funcationlity");
	}

}

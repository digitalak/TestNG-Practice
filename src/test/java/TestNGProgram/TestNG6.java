package TestNGProgram;

import org.testng.annotations.Test;

public class TestNG6 {
	@Test(priority=1)
	public void pqr() {
		System.out.println("pqr Method");
	}
	@Test(priority=2)
	public void xyz() {
		System.out.println("xyz Method");
	}
}

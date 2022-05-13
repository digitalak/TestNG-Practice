package TestNGProgram;

import org.testng.annotations.Test;

public class TestNG5 {
	@Test(priority=1)
	public void abc() {
		System.out.println("ABC method is present");
	}
	@Test(priority=2)
	public void def() {
		System.out.println("def method is present");
	}
}

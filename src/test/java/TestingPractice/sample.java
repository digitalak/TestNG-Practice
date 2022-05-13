package TestingPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample {
	
//	@Test
//	public void testa() {
//    	Assert.assertEquals(12,12);
//    }
//
//	@Test
//	public void testb() {
//    	Assert.assertEquals(12,12);
//    }
//	
//	@Test
//	public void testc() {
//		Assert.assertEquals(12, 12);
//	}
//==================================================
//	@Test(priority=1)
//	public void pune() {
//		System.out.println("Pune");
//	}
//	
//	
//	@Test(priority=1)
//	public void mumbai() {
//		System.out.println("mumbai");
//	}
//	
//	
//	@Test(priority=1)
//	public void delhi() {
//		System.out.println("delhi");
//	}
	

	@Test(priority = 1)
	public void testcasesa() {
		System.out.println("Test case a");
	}

	@Test
	public void testcasesz() {
		System.out.println("Test case Z");
	}

	@Test
	public void testcasesp() {
		System.out.println("Test case p");
	}

	@Test(priority = 0)
	public void testcasesm() {
		System.out.println("Test case m");
	}
}

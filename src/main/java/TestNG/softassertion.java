package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {

	String name="poornimadevi";
	
	@Test(priority=1)
	public void test1() {
		SoftAssert sa=new SoftAssert();		
		System.out.println("Test1");
		sa.assertTrue(name.equals("poornimadevi"));
		sa.assertEquals("fita", "FITA1");
		sa.assertTrue(name.equals("Poornimadevi"));
		sa.assertEquals("FITA1", "FITA1");
		sa.assertAll(); 
		
		//if you are not using this statement "sa.assertAll();"  then all the test1, test2, test3 will show Pass only.
		//if you are using this statement "sa.assertAll();" then only it will show which ever tests get failed and which ever test get pass.
	}
	
	@Test(priority=2)
	public void test2() {
		SoftAssert sa1=new SoftAssert();	
		System.out.println("Test2");
		sa1.assertEquals("abc", "ABC");
		sa1.assertAll(); 
	}
	
	
	@Test(priority=3)
	public void test3() {
		SoftAssert sa2=new SoftAssert();	
		System.out.println("Test3");
		sa2.assertEquals("monday", "monday");
		sa2.assertAll(); 
	}
}

/* If u are using multiple test methods in one class then use separate softasserts object references for each test methods so that the pass count and fail count will be correctly shown
 * (or) for 1 test method use 1 soft assert 
 */
